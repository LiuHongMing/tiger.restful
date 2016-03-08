package junit;

import com.google.common.collect.Maps;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class DoubleCipher {
    String jsonData;

    @Before
    public void setUp() throws Exception {
        Map<String, String> params = Maps.newHashMap();
        params.put("merchantaccount", "YB01000000258");
        params.put("orderid", "12345623752811655627752");
    }

    @Test
    void testSender() {

    }

    @Test
    void testReceiver() {

    }

}
