import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.*;
public class Jsonoutput {
	
	
	public String oupputjson(ArrayList<Box> boxes) throws IOException, JSONException
	{
	    String x= "";	
	    JSONObject jbox1 = new JSONObject();
		for(Box box:boxes){
			
			JSONObject jbox = new JSONObject();
			jbox.put("id", box.id);
			
			JSONArray jbooks = new JSONArray();
			ArrayList<Book> books = box.getBooks();
			
			for(Book b:books){
				JSONObject jbook = new JSONObject();
				jbook.put("title",b.getTitle());
				jbook.put("author",b.getAuthor());
				
				jbook.put("price", "$"+b.getPrice().trim()+" USD");
				if(b.getListPrice().trim().startsWith("Sorry")){
					
					
				}else{
				jbook.put("list price", "$"+b.getListPrice().trim()+" USD");
				}
				jbook.put("shipping_weight", b.getShippingWeight()+" pounds");
				jbook.put("isbn-10", b.getIsbn10());
				jbook.put("isbn-13",b.getIsbn13());
			    jbooks.put(jbook);
				jbox.put("contents", jbooks);
			}
			jbox.put("totalWeight", box.currentweight+" pounds");
			jbox1.put("box", jbox);
			  x+=jbox1.toString();
		 
		}
		
		FileWriter fw = new FileWriter("./result.json");
		fw.write(x);
		fw.close();
		return x;
	}

}
