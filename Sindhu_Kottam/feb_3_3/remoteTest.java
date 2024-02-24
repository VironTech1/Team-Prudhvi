package feb_3_3;

public class remoteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		projARemote a=new projARemote();
		a.display();
		a.decreasebtness();
		
		projBRemote b=new projBRemote();
		b.display();
		b.on();
		b.increasebtness();
		b.off();
		
		BluestarAcRemote ba=new 	BluestarAcRemote();
		ba.display();
		ba.decreaseTemp();
		ba.increaseTemp();
		ba.off();
		daikinAcRemote d=new daikinAcRemote();
		d.display();
		d.on();
		d.mode();
		LGTvRemote l=new LGTvRemote();
		l.display();
		l.on();
		l.channel(5);
		l.decreaseVolume();
		
		samsungTvRemote s=new samsungTvRemote();
		s.display();
		s.on();
		s.channel(8);
		s.increaseVolume();
		s.decreaseVolume();
		s.off();
		
	}

}
