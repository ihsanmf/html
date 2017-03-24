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

String url = "http://www.caghaber.com/egitim/yazim-yanlisi-yapilan-kelimelerin-dogrulari-tdk-yuregir-haber-merkezi-h3442.html";

Response response = Jsoup.connect(url).timeout(30000).execute();

Document doc = response.parse();



Elements elements = doc.select("p");

		


PrintWriter outputfile = new PrintWriter("words");
outputfile.print(elements.text());
outputfile.close();


} catch (IOException e) {

e.printStackTrace();

}

}

}