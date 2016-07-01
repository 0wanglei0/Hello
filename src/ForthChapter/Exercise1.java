package ForthChapter;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while(i < 10) {
            list.add(i);
            i++;
        }
        
        System.out.println("output list :" + list.size());
        for(int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        list.remove(3);
        System.out.println("output after list :");
        for(int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
