import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WindosController {

    public static void main(String[] args) {
        String urlLink = "https://github.com/YooEunjae327/GithubCommit";

        try {
            Desktop.getDesktop().browse(new URI(urlLink));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}