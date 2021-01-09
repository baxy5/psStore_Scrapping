import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebScrapping {

    public static void main(String [] args) throws IOException {

        final String url = "https://scrapethissite.com/pages/advanced/?gotcha=login";
        // FileWriter out = new FileWriter(new File("orszagok.txt"));



        try{
            final Document document = Jsoup.connect(url).get();

            for(Element row : document.select("div.col-md-4.col-md-offset-4 form")){

                if(row.select("input.form-control:nth-of-type(1)").text().equals(""))
                {

                    continue;

                } else {

                    final String ticker = row.select("input.form-control:nth-of-type(1)").text();
                    // out.write(ticker);
                    // out.write("\n");
                    System.out.println(ticker);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
           // out.close();
    }
}
