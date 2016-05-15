import com.lhl.exp1.CxfImpl;
import org.junit.Test;

import javax.xml.ws.Endpoint;

/**
 * Created by lunhengle on 2016/2/17.
 */
public class TestCxf {
    @Test
    public void test() {
        CxfImpl cxf = new CxfImpl();
        String address = "http://localhost:8080/cxf";
        Endpoint.publish(address, cxf);
        System.out.println("webservice started cxf");
    }
}
