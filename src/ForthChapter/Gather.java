package ForthChapter;

import java.util.ArrayList;
import java.util.List;

public class Gather {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random()*(list.size()-1));
        System.out.println("get random num: " + list.get(i));
        list.remove(2);
        System.out.println("remove the num = 2 and now the list is: ");
        for(int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        for(int k : index) {
            System.out.println(k);
            tel += arr[k];
        }
        System.out.println(tel);
    }
}
