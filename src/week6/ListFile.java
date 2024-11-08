package week6;

import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileReader;

public class ListFile {
    public static void main(String[] args) {
        File currentDirectly = new File("./src/");

        String[] content = currentDirectly.list();
        try{

            FileReader reader;
            for (String items : content) {
                System.out.println(items);
            }
        }
        catch(NullPointerException e){
            System.out.println("the path is worng");
        }

    }
}
