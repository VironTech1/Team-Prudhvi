package PackageMeeting;
public class Mobile {
    public static void main(String[] args) {
        class Battery {
            public void printInfo() {
                System.out.println("Battery information");
            }
        }

        class SIM {
            public void printInfo() {
                System.out.println("SIM information");
            }
        }

        class Screen {
            public void printInfo() {
                System.out.println("Screen information");
            }
        }

        class Mobile1 {
            Battery battery;
            SIM sim;
            Screen screen;

            public Mobile1(Battery battery, SIM sim, Screen screen) {
                this.battery = battery;
                this.sim = sim;
                this.screen = screen;
            }

            public void printMobileInfo() {
                System.out.println("Mobile information:");
                battery.printInfo();
                sim.printInfo();
                screen.printInfo();
            }
        }

        // Create instances of Battery, SIM, Screen
        Battery battery = new Battery();
        SIM sim = new SIM();
        Screen screen = new Screen();

        // Create an instance of Mobile1 and call printMobileInfo
        Mobile1 mobile1 = new Mobile1(battery, sim, screen);
        mobile1.printMobileInfo();
    }
}

