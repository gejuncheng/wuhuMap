package FeatureRead;

import entity.blockFeature.BlockFeatures;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.FeatureResolve;

import java.util.List;

/**
 * Created by Administrator on 2017/4/1.
 */
public class BlockFeatureResolve {

    private SessionFactory sessionFactory;
    @Before
    public void before(){
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
        Query<BlockFeatures> query = session.createQuery("from BlockFeatures ", BlockFeatures.class);
        List<BlockFeatures> list = query.list();
        System.out.println(list.size());

//        DwgFile dwgFile = new DwgFile("F:\\qgjyb.dwg");
    }

    @Test
    public void t1()throws Exception{
        Session session = sessionFactory.openSession();
        List<Object> list = FeatureResolve.ReadCSV();
        try {
            session.getTransaction().begin();
            for (Object o : list) {
                session.save(o);
            }
            session.getTransaction().commit();
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            session.getTransaction().rollback();
        }finally{
            if (session.isOpen()){
                session.close();
            }
        }
    }


    @After
    public void after(){
        sessionFactory.close();
    }
}
