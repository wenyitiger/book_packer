
import java.util.ArrayList;






public class Box {
	
		  int id =1;
		  ArrayList<Book> books = new ArrayList<Book> () ;
		  Double currentweight = 0.0;
		  
		  
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public ArrayList<Book> getBooks() {
			return books;
		}
		public void setBooks(ArrayList<Book> books) {
			this.books = books;
		}
		public Double getCurrentweight() {
			return currentweight;
		}
		public void setCurrentweight(Double currentweight) {
			this.currentweight = currentweight;
		}
		
		public Box newBox(){
			Box box = new Box();
			 box.id = this.id+1;
			
			return box;
			
		}

		  
		  
	
}