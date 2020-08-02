import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class firstCase {

    public static void main(String[] args) {
        File toCheck = null;
        /** FIX 1 **/
//        try {
            System.out.println(checkNameEquals(toCheck,"test.txt"));
                /** FIX 3 **/
//            System.out.println(testFile(toCheck,"test.txt"));
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
    }
                                                                    /** FIX 1 - try & catch **/
    private static boolean checkNameEquals(File file, String name) /**throws IOException**/ {
        /** FIX 2 **/
        //if (file == null) return false;
        return file.getName().equals(name);
    }

        /** FIX 3 **/
//    public static boolean testFile(File s, String n) {
//        if (s == null) return false;
//        else return checkNameEquals(s,n);
//    }
}
