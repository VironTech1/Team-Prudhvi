package setFour;

public class Televisison {
	
	    private int channel;
	    private int volume;

	    public Televisison() {
	        this.channel = 1; // Default channel
	        this.volume = 5; // Default volume
	    }

	    public void increaseVolume() {
	        if (volume < 10) {
	            volume++;
	            System.out.println("Volume increased to " + volume);
	        } else {
	            System.out.println("Maximum volume reached");
	        }
	    }

	    public void decreaseVolume() {
	        if (volume > 0) {
	            volume--;
	            System.out.println("Volume decreased to " + volume);
	        } else {
	            System.out.println("Minimum volume reached");
	        }
	    }

	    public void nextChannel() {
	        channel++;
	        System.out.println("Switched to channel " + channel);
	    }

	    public void previousChannel() {
	        if (channel > 1) {
	            channel--;
	            System.out.println("Switched to channel " + channel);
	        } else {
	            System.out.println("Already at the first channel");
	        }
	    }

	    public static void main(String[] args) {
	        Televisison tv = new Televisison();

	        // Simulate changing volume and channels
	        tv.increaseVolume();
	        tv.nextChannel();
	        tv.nextChannel();
	        tv.increaseVolume();
	        tv.decreaseVolume();
	        tv.previousChannel();
	    }
}
