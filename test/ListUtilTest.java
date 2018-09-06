import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ListUtilTest {

    /**
     * Test methods in the ListUtil class.
     * @author Raksani Khunamas.
     */

    @Test
    public void TestNullValue(){
        int expected = 1;
        List<String> a = new ArrayList<String>();
        a.add(null);
        assertEquals(expected,ListUtil.countUnique(a));
    }

}
