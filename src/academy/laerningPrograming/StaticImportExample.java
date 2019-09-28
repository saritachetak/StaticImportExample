package academy.laerningPrograming;

import static academy.laerningPrograming.Config.*;
import static java.lang.Math.PI;

public class StaticImportExample {


    public static void main(String[] args) {
        int min= Math.min(5,7);
        System.out.println("min="+min);
        System.out.println(PI);
        System.out.println(NAME);
        System.out.println(MAX_COLUMN_COUNT);

        printConfig();

    }




}
