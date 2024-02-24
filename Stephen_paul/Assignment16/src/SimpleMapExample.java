		import java.util.HashMap;
		import java.util.Map;

		public class SimpleMapExample {
		    public static void main(String[] args) {
		        // Create a HashMap
		        Map<Integer, String> map = new HashMap<>();

		        // Add some key-value pairs
		        map.put(1, "Alice");
		        map.put(2, "Bob");
		        map.put(3, "Charlie");

		        // Retrieve and print the value for key 2
		        System.out.println("Value for key 2: " + map.get(2));

		        // Print all key-value pairs
		        System.out.println("All key-value pairs:");
		        for (Map.Entry<Integer, String> entry : map.entrySet()) {
		            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		        }
		    }
		}




