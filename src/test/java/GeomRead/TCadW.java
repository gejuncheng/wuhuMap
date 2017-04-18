package GeomRead;

import com.onespatial.dwglib.Reader;
import org.junit.Test;

import java.io.File;

/**
 * Created by qq799 on 2017/3/9.
 */
public class TCadW {

    @Test
    public  void t1() throws Exception{
        Reader reader = new Reader(new File("F:\\WebGis\\qgjyb_95002\\qgjyb.dwg"));
        int size = reader.getCLayer().getReactors().size();
        System.out.println(size);

    }
}
