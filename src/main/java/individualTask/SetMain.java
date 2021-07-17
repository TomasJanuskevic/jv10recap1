package individualTask;

import java.util.*;

public class SetMain {

    public static void main(String[] args) {
        //Set<String> set = new HashSet<>();
        //Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();

        set.add("John");
        set.add("Bill");
        set.add("Rob");
        set.add("Bob");

        for (String s : set) {
            if(s.equals("Rob")){
                System.out.println(s);
            }
        }


        System.out.println(set);

    }
}
