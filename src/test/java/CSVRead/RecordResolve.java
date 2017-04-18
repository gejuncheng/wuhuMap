package CSVRead;

import com.csvreader.CsvReader;
import org.junit.Test;

import java.nio.charset.Charset;

/**
 * Created by Administrator on 2017/4/7.
 */
public class RecordResolve {

    private CsvReader csvReader;

    @Test
    public void CSVRead(){
        try {
            csvReader = new CsvReader("F:\\BlockFeatures\\Att.csv",',', Charset.forName("GBK"));
            //读取表头
            csvReader.readHeaders();
            //逐条读取记录，直至读完
            while(csvReader.readRecord()){
                //读取一条记录
//                System.out.println(csvReader.getRawRecord());
                System.out.println("private String "+csvReader.get("code")+";");
            }
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }finally {
            csvReader.close();
        }
    }
}
