package CSVRead;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import org.junit.Test;

import java.nio.charset.Charset;

/**
 * Created by Administrator on 2017/3/31.
 */
public class CSVResolve {

    private CsvReader csvReader;
    private CsvWriter csvWriter;

    /**
     * 读取csv文件
     */
    @Test
    public void CSVRead(){
        try {
            csvReader = new CsvReader("F:\\BlockFeatures\\test.csv",',',Charset.forName("GBK"));
            //读取表头
            csvReader.readHeaders();
            //逐条读取记录，直至读完
            while(csvReader.readRecord()){
                //读取一条记录
//                System.out.println(csvReader.getRawRecord());
                System.out.println(csvReader.get("name"));
                System.out.println(csvReader.get("class"));
                System.out.println(csvReader.get("age"));
                System.out.println(csvReader.get("sex"));
            }
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }finally {
            csvReader.close();
        }
    }

    @Test
    public void CSVWrite(){
        try {
            csvWriter = new CsvWriter("F:\\BlockFeatures\\test.csv",',',Charset.forName("UTF-8"));
            String content[] = {"李丽","五一","90","女"};
            csvWriter.writeRecord(content);
        }catch (Exception e){
            System.out.println(e.getStackTrace()+"\n"+e.getMessage());
        }finally {
            System.out.println("Writing successful");
            csvWriter.close();
        }
    }
}
