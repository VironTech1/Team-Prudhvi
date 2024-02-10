
		abstract class Television {
		    int channel;
		    int volume;

		    abstract void changeChannel(int newChannel);
		    abstract void adjustVolume(int change);
		}

		public class channel {
		    public static void main(String[] args) {
		        Television myTV = new Television() {
		            @Override
		            void changeChannel(int newChannel) {
		                channel = newChannel;
		            }

		            @Override
		            void adjustVolume(int change) {
		                volume += change;
		            }
		        };

		        myTV.changeChannel(5);
		        myTV.adjustVolume(3);

		        System.out.println("Channel: " + myTV.channel + ", Volume: " + myTV.volume);
		    }
		}
