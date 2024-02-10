package feb_2_3;

public abstract class TV {
	int Channel;
	int volume;
	

	abstract void changeChannel(int Channel);
	abstract void increaseVolume();
	abstract void decVolume();
	
	public void display()
	{
		System.out.println("Tv details displayed");
	}
}
