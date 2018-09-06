import java.util.*;

public class ListUtil {
    /**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * The list can contain null values. Null value is counted as a unique one.
     *
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list){
        Set<String> uniqueSet = new HashSet<String>((Collection<? extends String>) list);
        return uniqueSet.size();
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add(null);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("a");

        System.out.println(countUnique(list));
    }
}