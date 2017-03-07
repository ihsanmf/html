# html
package ödev;

import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class html {

/**

* @param args

*/

public static void main(String[] args) {

try {

String url = "http://tdk.gov.tr/index.php?option=com_yanlis&arama=kelime&guid=TDK.GTS.58befea46dbf82.65658662";

Response response = Jsoup.connect(url).timeout(30000).execute();

Document doc = response.parse();



Elements elements = doc.select("span[class=dogru]");
Elements elements1 = doc.select("span[class=yanlis]");
		



PrintWriter outputfile = new PrintWriter("words");
outputfile.print(elements.text());
outputfile.print(elements1.text());
outputfile.close(); 


} catch (IOException e) {

e.printStackTrace();

}

}

}
