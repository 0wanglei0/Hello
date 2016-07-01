package ForthChapter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapText {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Emp emp = new Emp("001", "zhao");
        Emp emp2 = new Emp("002", "qian");
        Emp emp3 = new Emp("004", "sun");
        Emp emp4 = new Emp("003", "li");
        map.put(emp.getE_id(), emp.getE_name());
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp3.getE_id(), emp3.getE_name());
        map.put(emp4.getE_id(), emp4.getE_name());
        Set<String> set = map.keySet();
        Iterator it = set.iterator();
        System.out.println("Class HashMap implements Map, no sequence : ");
        while(it.hasNext()) {
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str + " " + name);
        }
        TreeMap<String, String> treemap = new TreeMap<>();
        treemap.putAll(map);
        Iterator<String> ite = treemap.keySet().iterator();
        System.out.println("Class TreeMap implements Map, order by ASC:");
        while(ite.hasNext()) {
            String str = (String)ite.next();
            String name = (String)treemap.get(str);
            System.out.println(str + " " + name);
        }
    }
}
