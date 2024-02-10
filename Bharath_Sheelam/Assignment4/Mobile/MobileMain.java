package Assignment4.Mobile;

public class MobileMain {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.balance = 20.50;
        System.out.println(mobile.balance);

        Recharge recharge = new Recharge();
        recharge.rechargeBalance();

        Calls calls = new Calls();
        calls.makeCall();
    }
}
