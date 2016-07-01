package ForthChapter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("A");
        set.add("b");
        set.add("c");
        set.add("b");
        System.out.println(set);
        
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        System.out.println(list);
    }
}
