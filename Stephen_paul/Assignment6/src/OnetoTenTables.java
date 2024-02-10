
public class OnetoTenTables {

    public static void main(String[] args) {
        for (int table = 1; table <= 10; table++) {
            // Header for the current table
            System.out.println("Table " + table + ":");

            for (int i = 1; i <= 10; i++) {
                int result = table * i;
                System.out.println(table + " * " + i + " = " + result);
            }

            // Separate each table with an empty line
            System.out.println();
        }
    }
}

	
