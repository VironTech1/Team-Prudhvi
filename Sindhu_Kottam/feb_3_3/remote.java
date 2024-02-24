package feb_3_3;

public interface remote {
public abstract void on();
public abstract void off();
}

abstract class tvRemote implements remote{
	public void on()
	{
		System.out.println("tv is now on");
	}
	public void off()
	{	
		System.out.println("tv-off");
		
	}
	public abstract void increaseVolume();
	
	public abstract void decreaseVolume();
	
	public void channel(int n)
	{
		System.out.println("Channel chaned to "+n);
	}
}
abstract class acRemote implements remote{
	public void on()
	{
		System.out.println("ac is now on");
	}
	public void off()
	{	
		System.out.println("ac-off");
		
	}
	public abstract void increaseTemp();
	
	public abstract void decreaseTemp();
	
	public void mode()
	{
		System.out.println("change mode");
	}
	
}

abstract class  projectorRemote implements remote{
    
	public void on() {
        System.out.println("projector is now on");
    }

    public void off() {
        System.out.println("projector-off");
    }
    public abstract void increasebtness();

    public abstract  void decreasebtness() ;
	
}



class LGTvRemote extends tvRemote{
	void display()
	{
		System.out.println("LGTV remote");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("volume increased by  2");
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("volume decreased by 2");
		
	}
}
class samsungTvRemote extends tvRemote{
	void display()
	{
		System.out.println("Samsung Tv remote");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("volume increased by  1");
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("volume decreased by 1");
	}
}
class BluestarAcRemote extends acRemote{
	void display()
	{
		System.out.println("Bluestar Ac remote");
	}

	@Override
	public void increaseTemp() {
		// TODO Auto-generated method stub
		System.out.println("temp increased by 2 degrees");
		
	}

	@Override
	public void decreaseTemp() {
		// TODO Auto-generated method stub
		System.out.println("temp decreased by 2 degrees");
		
	}
}
class daikinAcRemote extends acRemote{
	void display()
	{
		System.out.println("daikin AC remote");
	}

	@Override
	public void increaseTemp() {
		// TODO Auto-generated method stub
		System.out.println("temp increased by 1 degree");
		
	}

	@Override
	public void decreaseTemp() {
		// TODO Auto-generated method stub
		System.out.println("temp decresed by 1 degree");
		
	}
}
class projARemote extends projectorRemote {
	void display()
	{
		System.out.println("proj A remote");
		
	}
	public void increasebtness()
	{
		System.out.println("brightness increased by 5%");
	}
	public void decreasebtness()
	{
		System.out.println("brightness decreased by 5%");
	}
	
	
}
class projBRemote extends projectorRemote {
	void display()
	{
		System.out.println("proj B remote");
	}
	public void increasebtness()
	{
		System.out.println("brightness increased by 10%");
	}
	public void decreasebtness()
	{
		System.out.println("brightness decreased by 10%");
	}
	
	
}

