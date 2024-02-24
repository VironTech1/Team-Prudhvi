package collections;

	import java.io.*;

	class Person implements Serializable {
	    private static final long serialVersionUID = 1L;
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String toString() {
	        return "Person [name=" + name + ", age=" + age + "]";
	    }
	}

	public class SerializationExample {
	    public static void main(String[] args) {
	        // Serialization
	        try {
	            Person person = new Person("John", 30);
	            FileOutputStream fileOut = new FileOutputStream("person.ser");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(person);
	            out.close();
	            fileOut.close();
	            System.out.println("Object serialized successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialization
	        try {
	            FileInputStream fileIn = new FileInputStream("person.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            Person person = (Person) in.readObject();
	            in.close();
	            fileIn.close();
	            System.out.println("Object deserialized successfully.");
	            System.out.println("Deserialized object: " + person);
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}


