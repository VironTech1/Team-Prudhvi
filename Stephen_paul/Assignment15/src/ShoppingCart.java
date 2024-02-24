
		import java.util.ArrayList;

		public class ShoppingCart {
		    private ArrayList<Product> products;

		    public ShoppingCart() {
		        this.products = new ArrayList<>();
		    }

		    public void addProduct(Product product) {
		        this.products.add(product);
		    }

		    public double calculateTotalBill() {
		        double totalBill = 0;
		        for (Product product : products) {
		            totalBill += product.getPrice();
		        }
		        return totalBill;
		    }

		    public static void main(String[] args) {
		        Product product1 = new Product("Product1", 10.0);
		        Product product2 = new Product("Product2", 20.0);

		        ShoppingCart cart = new ShoppingCart();
		        cart.addProduct(product1);
		        cart.addProduct(product2);

		        double totalBill = cart.calculateTotalBill();
		        System.out.println("Total Bill: $" + totalBill);
		    }

		    public static class Product {
		        private String name;
		        private double price;

		        public Product(String name, double price) {
		            this.name = name;
		            this.price = price;
		        }

		        public String getName() {
		            return name;
		        }

		        public double getPrice() {
		            return price;
		        }
		    }
		}

