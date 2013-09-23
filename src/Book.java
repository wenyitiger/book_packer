

public class Book {
	String Title;
	String Author;
	String Price;
	Double ShippingWeight;
	String isbn10;
	String ListPrice = "Sorry But it doesn't have a promotion";
	String isbn13;
	
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getListPrice() {
		return ListPrice;
	}
	public void setListPrice(String listPrice) {
		ListPrice = listPrice;
	}
	public String getIsbn13() {
		return isbn13;
	}
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
	public Double getShippingWeight() {
		return ShippingWeight;
	}
	public void setShippingWeight(Double shippingWeight) {
		ShippingWeight = shippingWeight;
	}
	public String getIsbn10() {
		return isbn10;
	}
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}
	
	
	
}

