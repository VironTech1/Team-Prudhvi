package feb_2_3;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VW v=new VW();
		Honda h=new Honda();
		
		v.color="red";
		v.model="2012";
		v.speed=50;
		v.display();
		v.accelerate(v.speed);
		v.brakes();
		
		h.color="Blue";
		h.model="2020";
		h.speed=70;
		h.display();
		h.accelerate(h.speed);
		h.brakes();
		
		

	}

}
