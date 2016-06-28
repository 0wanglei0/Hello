package ForthChapter;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object> {

    String name;
    long id;
    public UpdateStu(String name, long id) {
        this.id = id;
        this.name = name;
    }
    
    public int compareTo(Object o) {
        UpdateStu upstu = (UpdateStu) o;
        int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
        return result;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        UpdateStu stu1 = new UpdateStu("li", 01011);
        UpdateStu stu2 = new UpdateStu("wang", 01021);
        UpdateStu stu3 = new UpdateStu("zhang", 01051);
        UpdateStu stu4 = new UpdateStu("zhao", 01012);
        TreeSet<UpdateStu> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator<UpdateStu> it = tree.iterator();
        System.out.println("all in set");
        while(it.hasNext()) {
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        it = tree.headSet(stu2).iterator();
        System.out.println("get head set: ");
        while(it.hasNext()) {
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        it = tree.subSet(stu2, stu3).iterator();
        System.out.println("get center set : ");
        while(it.hasNext()) {
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
    }
}
