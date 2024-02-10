package Assignment4.TV;

import Assignment4.TV.TV;

public class TVMain{
    public static void main(String[] args) {

        TV tv = new TV();
        tv.channel = "Star Sports";
        tv.volume = 20;
        System.out.println(tv.channel);
        System.out.println(tv.volume);

        Channel channel1 = new Channel();
        channel1.changeChannel();

        Volume volume = new Volume();
        volume.changeVolume();
    }


}
