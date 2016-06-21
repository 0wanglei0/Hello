package ForthChapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println((String)it.next());
        }
    }
}
