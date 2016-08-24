package Enumeration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise02<T extends List> {

    public static void main(String[] args) {
        Exercise02<ArrayList> al = new Exercise02<ArrayList>();
        Exercise02<LinkedList> ll = new Exercise02<LinkedList>();
    }
}
