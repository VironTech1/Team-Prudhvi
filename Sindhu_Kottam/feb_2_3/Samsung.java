package feb_2_3;

public class Samsung extends TV{
	
	void changeChannel(int Channel)
	{
		System.out.println("Channel changed in 5ms");
	}
	void increaseVolume()
	{
		System.out.println("Volume Increased by 10db");
	}
	void decVolume()
	{
		System.out.println("Volume decreased by 10 db");
	}

}


class LG extends TV{
	void changeChannel(int Channel)
	{
		System.out.println("Channel changed in 7ms");
	}
	void increaseVolume()
	{
		System.out.println("Volume Increased by 6db");
	}
	void decVolume()
	{
		System.out.println("Volume decreased by 6db");
	}
}
