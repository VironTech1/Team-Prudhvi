package Interface;

public class dogclass {
	String name;
	String breed;
	int age;
	
public dogclass(){
	this.name =name;
	this.breed = breed;
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
public String toString() {
	return "Name=" + name + " " + "Breed=" + breed + " " + "Age="+age  ;
	
}

}
