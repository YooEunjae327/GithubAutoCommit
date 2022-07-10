import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        File file = new File("/Users/tomato/Documents/IntelliJ/GithubAutoCommit/src/test.html");

        try {
            if(file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test() {

    }
}
