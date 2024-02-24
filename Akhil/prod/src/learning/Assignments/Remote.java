//day 14 assignment
//1. Every Remote has on/off functionality
//2. There are different types of remotes
//   a. Tv remote
//   b. AC remote
//   c. Projector remote
//Apart of common remote functionalities tv Remote has inc/dec channel and inc/dec volume
//There different types of tv remotes produced by differ ent companies and they have difference too.
//
//Apart of common remote functionalities Ac Remote has inc/dec temp and change mode
//There different types of AC remotes produced by differ ent companies and they have difference too.
//
//Apart of common remote functionalities projector Remote has inc/dec bright Ness and
//There different types of projector remotes produced by differ ent companies and they have difference too.
package learning.Assignments;

public interface Remote {
    void on();
    void off();
}
class Tvremote implements Remote{

    public void on(){
        System.out.println("tvremote oned");
    }
    public void off(){
        System.out.println("tvremotre off");
    }
    void inc_cahnnel(){
        System.out.println("channel is increased");
    }
    void dec_channel(){
        System.out.println("channel is decreased");
    }
}
class ACRemote implements Remote{

    public void on(){
        System.out.println("acremote on");
    }
    public void off(){
        System.out.println("acremote off");
    }

    void inc_temp(){
        System.out.println("temperature is increased");
    }
    void dec_temp(){
        System.out.println("temperature is decreased");
    }
    void cahngemode(){
        System.out.println("the mode is changed");
    }
}
class projector implements Remote{

    public void on(){
        System.out.println("projector on");
    }
    public void off(){
        System.out.println("projector off");
    }
    void inc_brightness(){
        System.out.println("brightness is increased");
    }
    void dec_brightness(){
        System.out.println("brightness is decreased");
    }
}
class Sony extends Tvremote{
    void info(){
        System.out.println("this is a sony TVtremote");
    }
}
class Samsung extends Tvremote{
    void info(){
        System.out.println("this is a samsung TVremote");
    }
}
class LG extends Tvremote{
    void info(){
        System.out.println("this is a LG tvremote");
    }

}
class mrcool extends ACRemote{
    void name(){
        System.out.println("this is mrcool ac remote");
    }
}
class chill extends ACRemote{
    void name(){
        System.out.println("this is chill ac remote");
    }
}
class freeze extends ACRemote{
    void name(){
        System.out.println("this is freeze ac remote");
    }

}
class amazon extends projector{
    void brand(){
        System.out.println("this is a amazon projector remote");
    }
}
class apple extends projector{
    void brand(){
        System.out.println("this is a apple projector remote");
    }
}
class tesla extends projector{
    void brand(){
        System.out.println("this is a tesla projector remote");
    }
}
