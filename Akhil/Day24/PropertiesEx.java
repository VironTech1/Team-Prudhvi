package learning.Day24;

import javafx.beans.property.Property;

import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) {
       // Property p=new Property() {IT IS AN INTERFACE WE ACNNOT CREATE AN OBJECT
       // }
        Properties p=new Properties();
        p.setProperty("student","akhil");
        p.setProperty("student1","kittu");
        System.out.println(p);
    }
}
