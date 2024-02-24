package feb_2_3;
public class waterBottleTest{

    public static void main(String[] args) {
        brother b = new brother(10, 20);
        b.sip();
        b.fill_bottle();
        b.empty();
       

        sister s = new sister(5, 10);
        s.sip();
        s.fill_bottle();
        s.empty();
    }
}

abstract class WaterBottle {
    int capacity;
    int water_level;

    abstract void fill_bottle();

    abstract void sip();

    abstract void empty();
}

class sister extends WaterBottle {
    sister(int water_level, int capacity) {
        this.water_level = water_level;
        this.capacity = capacity;
    }

    void fill_bottle() {
        if (capacity <= 20) {
            System.out.println("filling bottle");
            capacity = 20;
        } else {
            System.out.println("Bottle is already full");
        }
    }

    void sip() {
        System.out.println("sipping");
        capacity = capacity - 5;
    }

    void empty() {
        System.out.println("emptying");
        capacity = 0;
    }
}

class brother extends WaterBottle {
    brother(int water_level, int capacity) {
        this.water_level = water_level;
        this.capacity = capacity;
    }

    void fill_bottle() {
        if (capacity <= 20) {
            System.out.println("filling bottle");
            capacity = 20;
        } else {
            System.out.println("Bottle is already full");
        }
    }

    void sip() {
        System.out.println("sipping");
        capacity = capacity - 10;
    }

    void empty() {
        System.out.println("emptying");
        capacity = 0;
    }
}
