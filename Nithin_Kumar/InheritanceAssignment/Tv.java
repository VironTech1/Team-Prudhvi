package InheritanceAssignment;

import java.util.Scanner;

public class Tv {
     int channel;
     int volume;

    public Tv() {
        this.channel = 1;
        this.volume = 50;
    }

    public void increaseChannel() {
        channel++;
        System.out.println("Channel increased to " + channel);
    }

    public void decreaseChannel() {
        if (channel > 1) {
            channel--;
            System.out.println("Channel decreased to " + channel);
        } else {
            System.out.println("Cannot decrease channel below 1.");
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume increased to " + volume);
        } else {
            System.out.println("Volume is already at maximum.");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume decreased to " + volume);
        } else {
            System.out.println("Volume is already at minimum.");
        }
    }

    public void displayStatus() {
        System.out.println("Current Status - Channel: " + channel + ", Volume: " + volume);
    }
}

