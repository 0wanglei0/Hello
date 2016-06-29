package ForthChapter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpdateStuMapExample {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "zhao");
        map.put("02", "qian");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("key set :");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("value :");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
