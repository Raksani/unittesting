import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ListUtilTest {

    /**
     * Test methods in the ListUtil class.
     * @author Raksani Khunamas.
     */

    @Test
    public void testNullValue(){
        int expected = 1;
        List<String> a = new ArrayList<String>();
        a.add(null);
        assertEquals(expected,ListUtil.countUnique(a));
    }

    @Test
    public void testNoElement(){
        //No element.
        int expected = 0;
        List<String> a = new ArrayList<String>();
        assertEquals(expected,ListUtil.countUnique(a));
    }

    @Test
    public void testOneElement(){
        //One element.
        int expected = 1;
        List<String> a = new ArrayList<String>();
        a.add("a");
        assertEquals(expected,ListUtil.countUnique(a));
    }

    @Test
    public void testAFewElement(){
        //A few duplicate elements.
        int expected = 4;
        List<?> a = makeList("a","b","a","b","c","d","a");
        assertEquals(expected,ListUtil.countUnique(a));
    }

    @Test
    public void testHugeList(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        List<Character> a = new ArrayList<>();
        int count  = 1000000;
        while (count>0) {
            a.add(alphabet.charAt(random.nextInt(26)));
            count--;
        }
        assertEquals(26,ListUtil.countUnique(a));
    }

    //impossible case.
    @Test(expected = java.lang.AssertionError.class)
    public void testDifferentDataType(){
        List<?> a = makeList("0",0);
        assertEquals(1,ListUtil.countUnique(a));
    }

    @Test(expected = java.lang.NullPointerException.class)
    public void testNullList(){
        ListUtil.countUnique(null);
    }
    /**
     * Shorten method for adding elements in the list instead of list.add().
     * @param element to be added in list.
     * @return list which contains all elements.
     */
    private List<?> makeList(Object ... element){
        return java.util.Arrays.asList(element);
    }


}
