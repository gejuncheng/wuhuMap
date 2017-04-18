package GeomRead;

import com.iver.cit.jdwglib.dwg.DwgFile;
import entity.basicFeature.CircleEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.GeomResolve;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

/**
 * Created by qq799 on 2017/3/9.
 */
public class THB {

    private SessionFactory sessionFactory;
    @Before
    public void before(){
        //打印进程信息
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        System.out.println(runtimeMXBean.getName());
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }

    }


    @Test
    public void tw() throws Exception{
        Session session = sessionFactory.openSession();
        Query<CircleEntity> query = session.createQuery("from CircleEntity", CircleEntity.class);
        List<CircleEntity> list =  query.list();
        System.out.println(list.size());

        DwgFile dwgFile = new DwgFile("F:\\qgjyb.dwg");
    }
    @Test
    public void t1()throws Exception{
        Session session = sessionFactory.openSession();
        List<Object> list = GeomResolve.query();
        try {
            Transaction transaction  = session.beginTransaction();
            for (int i = 0;i < list.size();i ++){
                Object obj = list.get(i);
                session.save(obj);
                if (i != 0 && i % 20 == 0){
                    session.flush();
                    session.clear();
                    //提交事务
                    transaction.commit();
                    //重新开启事务
                    transaction = session.beginTransaction();
                }
            }
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    @After
    public void after(){
        sessionFactory.close();
    }

}
