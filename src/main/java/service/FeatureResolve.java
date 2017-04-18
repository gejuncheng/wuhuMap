package service;

import com.csvreader.CsvReader;
import entity.blockFeature.BlockFeatures;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/31.
 */
public class FeatureResolve {

    @Test
    public static List<Object> ReadCSV() throws IOException{
        List<Object> list = new ArrayList<Object>();
        CsvReader csvReader = new CsvReader("F:\\BlockFeatures\\cjyb.csv",',', Charset.forName("GBK"));
        //读取表头
        csvReader.readHeaders();
        while (csvReader.readRecord()){
            BlockFeatures blockFeatures = new BlockFeatures();
            //读取一行记录
            //System.out.println(csvReader.getRawRecord());
            blockFeatures.setName(csvReader.get("名称"));
            System.out.println(csvReader.get("名称"));
            String num = csvReader.get("数量");
            if ("" .equals(num)){
                blockFeatures.setEquNum(0);
            }else {
                blockFeatures.setEquNum(Integer.parseInt(num));
            }
            System.out.println(csvReader.get("数量"));
            list.add(blockFeatures);
        }

        csvReader.close();
        return list;
    }

    public static void main(String[] args) throws IOException{
        List<Object> list = ReadCSV();
    }


}
