class Student {
    private String name;
    private int id;
}

public class SearchStudent {

    public Student searchStudent(String name) {
        System.out.println("Searching by name: " + name);
        return null;
    }

    public Student searchStudent(int id) {
        System.out.println("Searching by id: " + id);
        return null;
    }

    public Student searchStudent(String name, int id) //Method Overloading with different data types//
    {
        System.out.println("Searching by name: " + name + ", Searching by id: " + id);
        return null;
    }

    public Student searchStudent(int id, String name) //Method Overloading with different order of Arguments//
    {
        System.out.println("Searching by id: " + id + ", Searching by name: " + name);
        return null;
    }

    public Student searchStudent(String name, String additionalInfo)//Different number of arguments//
    {
        System.out.println("Searching by name: " + name + ", Searching by additional info: " + additionalInfo);
        return null;
    }

    public static void main(String[] args) {
        SearchStudent search = new SearchStudent();
        search.searchStudent("Stephen");
        search.searchStudent(670700692);
        search.searchStudent("Stephen", 670700692);
        search.searchStudent(670700692, "Stephen");
        search.searchStudent("Stephen", "Java Developer");
    }
}

