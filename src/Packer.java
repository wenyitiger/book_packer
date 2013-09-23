
import java.util.ArrayList;




public class Packer {

	static Box box = new Box();
	
	public ArrayList<Box> packbooks (ArrayList<Book> books)
	{
		ArrayList<Box>  boxes = new ArrayList<Box>();
		
		for(Book b:books){
			if(box.getCurrentweight()+b.getShippingWeight()<10){
				
			
			box.getBooks().add(b);
			box.currentweight+=b.getShippingWeight();
			}
			else{
				boxes.add(box);
			box = box.newBox();
			box.getBooks().add(b);
			box.currentweight+=b.getShippingWeight();
				
				
			}
			
			
			
		}
			
		
		return boxes;
	}
	
	
	

	
}
