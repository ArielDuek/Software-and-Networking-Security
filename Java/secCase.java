import java.io.File;
import java.util.Optional;

public class secCase {

    public static void main(String[] args) {
        File toCheck = null;
        /** option 1 **/
        System.out.println(checkExist(toCheck));
        /** option 2 **/
//        System.out.println(checkExistWithNull(toCheck));
        /** option 3 **/
//        System.out.println(checkExist(Optional.ofNullable(toCheck)));
    }

    private static boolean checkExist(File file) {
        /** FIX 1 **/
//        if (file == null) return false;
        return file.exists();
    }

        /** FIX 2 **/
//    private static boolean checkExistWithNull(File file) {
//        if (file == null) return false;
//        return checkExist(file);
//    }

        /** FIX 3 **/
//    private static boolean checkExist(Optional<File> file) {
//        return file.orElse(new File("file.txt")).exists();
//    }





}
