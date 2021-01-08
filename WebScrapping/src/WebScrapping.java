import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrapping {

    public static void main(String [] args){

        final String url = "http://books.toscrape.com/";

        try{
            final Document document = Jsoup.connect(url).get();

            for(Element row : document.select("ol.row li")){
                if(row.select("h3").text().equals(""))
                {
                    continue;
                } else {
                    final String ticker = row.select("h3").text();

                    System.out.println(ticker);
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
