
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileJar
 */
public class FileJar {
    public static void main(String[] args) throws IOException {
        File f1 = new File("webapp/WEB-INF/lib");

        // System.out.println(f1.getAbsolutePath());
        // System.out.println(Arrays.toString(f1.list()));

        StringBuffer sb = new StringBuffer();
        for (String s1 : f1.list()) {
            String jar_str = "<classpathentry kind=\"lib\" path=\"webapp/WEB-INF/lib/" + s1 + "\"/>\r\n";
            sb.append(jar_str);
        }
        FileOutputStream os = new FileOutputStream("jar_test.txt");

        os.write(sb.toString().getBytes());
        os.close();
    }
}