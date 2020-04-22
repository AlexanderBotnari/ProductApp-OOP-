
public class ProductApp {

	public static void main(String[] args) {
		Product p1 = new Product("iPhone XII", 10000.00, 1);
		Product p2 = new Product("iPhone XII Swarovsky Edition", 30000.00, 2);		
        
		System.out.println("Product name : "+ p1.getName());
		System.out.println("Price : "+ p1.getPrice());
		System.out.println("Quantity : "+  p1.getQuantity());
		System.out.println("Product name : "+ p2.getName());
		System.out.println("Price : "+ p2.getPrice());
		System.out.println("Quantity : "+ p2.getQuantity());
	}

}

class Product{
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, Double price, Integer quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() >= 6 && name.length() <= 70) {
			this.name = name;
		}else {
			System.err.println("Invalid name for product !");
		}
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		if(price >= 1 && price <= 1000000) {
			this.price = price;
		}else {
			System.err.println("Wrong price value !");
		}
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		if(quantity >= 1 && quantity <= 500000) {
			this.quantity = quantity;
		}else {
			System.err.println("Wrong quantity value !");
		}
	}
}