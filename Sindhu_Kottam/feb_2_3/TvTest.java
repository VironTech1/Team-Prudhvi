package feb_2_3;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LG l=new LG();
		l.display();
		l.changeChannel(10);
		l.increaseVolume();
		l.decVolume();
		
		Samsung s=new Samsung();
		s.display();
		s.changeChannel(4);
		s.increaseVolume();
		s.decVolume();

	}

}
