public class Splitstring {

    public static String[] splitFullName(String fullName) {
        return fullName.split("\\s+");
    }

    public static void main(String[] args) {
        String fullName = "John Doe";
        String[] names = splitFullName(fullName);
        System.out.println("First Name: " + names[0]);
        System.out.println("Last Name: " + names[1]);
    }
}
