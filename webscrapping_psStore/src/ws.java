import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.EOFException;

public class ws {

    public static void main(String [] args) throws EOFException{

        final String url = "https://store.playstation.com/en-hu/category/44d8bb20-653e-431e-8ad0-c0a365f68d2f/1";

        try{

            final Document document = Jsoup.connect(url).get();

            for(Element row : document.select("ul.ems-sdk-product-tile-list.psw-grid-x.psw-grid-margin-x.psw-mobile-p-up-2.psw-tablet-p-up-3.psw-tablet-l-up-6 div")){

                if(row.select(".psw-p-t-2xs.psw-truncate-text-2.psw-body-2").text().equals(""))
                {
                    continue;
                }
                else
                {
                    final String ticker = row.select(".psw-p-t-2xs.psw-truncate-text-2.psw-body-2").text();
                    final String price = row.select(".price__container").text();
                    System.out.println(ticker + "           " + price);

                }

            }

        }

        // catch
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
