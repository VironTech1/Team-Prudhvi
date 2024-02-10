package practice;

	
		  
		       public class Address {
			    private String houseNumber;
			    private String district;
			    private String state;
			    private String country;

			   
			    public Address(String houseNumber, String district, String state, String country) {
			        this.houseNumber = houseNumber;
			        this.district = district;
			        this.state = state;
			        this.country = country;
			    }

			   
			    public String getHouseNumber() {
			        return houseNumber;
			    }

			    public void setHouseNumber(String houseNumber) {
			        this.houseNumber = houseNumber;
			    }

			    public String getDistrict() {
			        return district;
			    }

			    public void setDistrict(String district) {
			        this.district = district;
			    }

			    public String getState() {
			        return state;
			    }

			    public void setState(String state) {
			        this.state = state;
			    }

			    public String getCountry() {
			        return country;
			    }

			    public void setCountry(String country) {
			        this.country = country;
			    }
			}
		  public class Student {
			    private String name;
			    private int age;
			    private String email;
			    private Address address;

			    public Student(String name, int age, String email, Address address) {
			        this.name = name;
			        this.age = age;
			        this.email = email;
			        this.address = address;
			    }