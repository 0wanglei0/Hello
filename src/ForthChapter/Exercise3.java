package ForthChapter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Emp1 emp = new Emp1("001", "zhao");
        Emp1 emp2 = new Emp1("002", "qian");
        Emp1 emp3 = new Emp1("015", "sun");
        Emp1 emp4 = new Emp1("004", "li");
        map.put(emp.getId(), emp.getName());
        map.put(emp2.getId(), emp.getName());
        map.put(emp3.getId(), emp3.getName());
        map.put(emp4.getId(), emp4.getName());
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str + " " + name);
        }

        System.out.println("After remove Map is :");
        map.remove("015");
        set = map.keySet();
        it = set.iterator();
        while(it.hasNext()) {
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str + " " + name);
        }
        System.out.println("END");
    }

}

class Emp1 {
    String id;
    String name;
    public Emp1(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
