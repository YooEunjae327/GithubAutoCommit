
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Macro {
    public static void main(String[] args) throws IOException {

        Macro macro = new Macro();
        macro.getQusersionUrl(macro.getMainUrl());

    }

    public String getMainUrl() throws IOException {

            String mainUrl = "https://stackoverflow.com/questions";
            Document doc = Jsoup.connect(mainUrl).get();

            Elements newsHeadlines = doc.select(".s-post-summary--content-title");
            String[] str = String.valueOf(newsHeadlines).split("\n");
            String[] st2 = str[0].split("\"");

            return st2[3];


    }

    public Document getQusersionUrl(String doc) throws IOException {

            String questionUrl = "https://stackoverflow.com";
            Document url = Jsoup.connect(questionUrl + doc).get();
            System.out.println(url.text());

            return url;
    }
}


