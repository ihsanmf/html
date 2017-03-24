package ödev;



import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class htmlwords {

/**
* @param args
*/

public static void main(String[] args) {

try {

String url = "http://siirlopedi.blogcu.com/yanlis-dogru-kelimeler/4383920";

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