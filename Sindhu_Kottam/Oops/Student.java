package Oops;

public class Student {
	int id;
	String name;
	String email;
	double phoneno;
	String address;
public Student()
{
	id=101;
	name="Sindhu";
	email="kottamsindhu@gmail.com";
	phoneno=5699905;
	address="1257 E.cherry st";
}
public Student(int id,String name,String email,double phoneno,String address)
{
	this.id=id;
	this.name=name;
	this.email=email;
	this.phoneno=phoneno;
	this.address=address;
}

public void display()
{
	System.out.println("name:"+name);
	System.out.println("id:"+id);
	System.out.println("email:"+email);
	System.out.println("phoneno:"+phoneno);
	System.out.println("address:"+address);
}
}
