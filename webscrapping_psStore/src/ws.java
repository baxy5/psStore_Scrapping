import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ws {

    public static void main(String [] args){

        final String url = "https://www.youtube.com/";

        try{
            final Document document = Jsoup.connect(url).get();

            for(Element row : document.select("div.style-scope.ytd-rich-grid-renderer div")){
                if(row.select("#meta").text().equals(""))
                {
                    continue;
                } else {
                    final String ticker = row.select("#meta").text();

                    System.out.println(ticker);
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}