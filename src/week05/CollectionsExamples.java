package week05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionsExamples {

    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("akila");
        names.add("akila1");
        names.add("akila2");
        names.add("akila3");
        names.add("akila4");
        System.out.println(names);

        Set<String> names1 =new HashSet<>();
        names1.add("akila");
        names1.add("akila1");
        names1.add("akila2");
        names1.add("akila3");
        names1.add("akila4");
        System.out.println(names1);
    }


}
