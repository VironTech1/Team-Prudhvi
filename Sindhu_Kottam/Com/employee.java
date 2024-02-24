package Com;

public class employee {
String name;
int id;
int salary;
project p=new project();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public void details()
{
	System.out.println("Name of employee :"+name);
	System.out.println("id of employee :"+id);
	System.out.println("salary is :"+salary);
	System.out.println("project id :"+p.id);
	System.out.println("client_name :"+p.client);
}
}
