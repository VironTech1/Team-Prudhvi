package Inheritance.threelevels;

public class PlayerMain {
    public static void main(String[] args) {

        Player player = new Player();
        player.plays();
        player.fields();

        Batsman batsman = new Batsman();
        batsman.plays();
        batsman.fields();
        batsman.bats();
        batsman.score();

        BattingStyle battingStyle = new BattingStyle();
        battingStyle.plays();
        battingStyle.fields();
        battingStyle.bats();
        battingStyle.rightHand();
        battingStyle.leftHand();

        BattingRole battingRole = new BattingRole();
        battingRole.plays();
        battingRole.fields();
        battingRole.bats();
        battingRole.rightHand();
        battingRole.opener();
        battingRole.middleOrder();
        battingRole.finisher();
    }
}
