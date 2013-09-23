
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class CrawlerBase {

	public BufferedReader webcrawler(String url1) throws IOException{
	URL url = new URL(url1);
	System.out.println(url);
	HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
	InputStream inputStream = httpURLConnection.getInputStream();
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	
	
	
	return bufferedReader;
}

	
	
	public BufferedReader filecrawler(String filename) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
		return bufferedReader;
	}
	
}