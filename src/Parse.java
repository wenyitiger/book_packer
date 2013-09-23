
import java.io.BufferedReader;
import java.io.IOException;






public class Parse extends CrawlerBase{
	public Book parsebook(String filename) throws IOException{
	{
		BufferedReader br =   filecrawler(filename);
	Book book = new Book();		
	String s;
	while((s = br.readLine())!=null)
	{
		if(s.startsWith("<title>"))
		{
	             if(s.endsWith("</title>"))
	             {	            	 
	            	 int index1 = s.indexOf("<title>"); 
	    			    int index2 = s.indexOf("</title>");
	    			    String info = s.substring(index1+7, index2);
	    			    int index3  = info.lastIndexOf(":");		            	 
	    			    int index4 = s.substring(index1, index3).lastIndexOf(":");
	    			    int index5 = s.substring(index1, index4).lastIndexOf(":");
	    			    int index6 = s.substring(index1, index5).lastIndexOf(":");
	    			   book.setIsbn13(s.substring(index5+2,index4));
	            	   book.setTitle(s.substring(index1+7, index6));
	            	   book.setAuthor(s.substring(index6+2,index5));
	             }		
			
		}
		if(s.startsWith("<li><b>ISBN-10:</b>"))
		{
			book.setIsbn10(s.substring(s.indexOf("</b>")+5,s.indexOf("</li>")));			
			
		}
		if(s.trim().startsWith("<td><span id=\"listPriceValue\"  class=\"listprice\">"))
		{		
			book.setListPrice(s.substring(54,s.indexOf("</span>")));;		
		}
		if(s.trim().startsWith("<span class=\"bb_price\">"))
		{
	       s = br.readLine();	  
	       String price = s.trim().substring(1,s.trim().indexOf("</span"));	       
		book.setPrice(price);		
		}
		if(s.trim().startsWith("<li><b>Shipping Weight:</b>"))
		{	  
	    Double  shippingweight = Double.parseDouble(s.trim().substring(s.trim().indexOf("</b>")+4,s.trim().indexOf("(")-7));
		book.setShippingWeight(shippingweight);	
		}	
	}
	br.close();	
	return book;
	}
	}
}

