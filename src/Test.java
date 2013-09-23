


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;




public class Test {

	public static void main(String[] args) throws IOException, JSONException {
		
        Book book = new Book();
        Parse p = new Parse();
        
       ArrayList<Book> books = new ArrayList<Book> ();
        ArrayList<Box> boxes = new ArrayList<Box> ();
        
        
        File dir = new File("./data/");		
      
		for (File child : dir.listFiles()) {
			
			if(child.getName().endsWith("html")){
			book = p.parsebook("./data/"+child.getName());
			books.add(book);
			}
		}
       Packer  packer = new Packer();
       boxes = packer.packbooks(books);
       
     
		Jsonoutput jo = new Jsonoutput();
		jo.oupputjson(boxes);
          
	  
	}
}