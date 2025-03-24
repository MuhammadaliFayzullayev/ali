import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {

//        File file = new File("readme.txt");
//        System.out.println("File exists "+file.exists());
//        boolean newFile = file.createNewFile();
//        System.out.println("File created "+newFile);
//        System.out.println("File exists "+file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());


//        File file = new File("io","child");
//        System.out.println("File exists "+file.exists());
//        System.out.println(file.mkdir());

//        File file2 = new File("io","child/child2/child3");
//        System.out.println("File exists "+ file2.exists());
//        System.out.println(file2.mkdir());


        File file = new File("io","child4");
        System.out.println("File exists "+file.exists());
        System.out.println(file.mkdir());
//        System.out.println(file.canExecute());
//        file.deleteOnExit();
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParentFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(new Date(file.lastModified()));



    }
}