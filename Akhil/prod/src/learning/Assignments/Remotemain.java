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

public class Remotemain {
    public static void main(String[] args) {
        Remote R;
        Tvremote TV=new Tvremote();//2nd layer of inheritance
        TV.dec_channel();
        TV.inc_cahnnel();
        TV.on();
        TV.off();
        ACRemote AC=new ACRemote();
        AC.cahngemode();
        AC.dec_temp();
        AC.off();
        AC.inc_temp();
        projector p=new projector();
        p.dec_brightness();
        p.off();
        p.inc_brightness();
        p.on();
        Sony Stv=new Sony();//3rd layer of inheritance
        Stv.info();
        Stv.off();
        Stv.on();
        Stv.dec_channel();
        Stv.inc_cahnnel();
        Samsung sa=new Samsung();
        sa.info();//accessing its own methods
        sa.off();//accessing the superclass methods
        sa.dec_channel();//accessing the subclass 2nd layer methods which is the superclass for samsung
        sa.inc_cahnnel();//accessing the subclass 2nd layer methods which is the superclass for samsung
        sa.on();//accessing the superclass methods
        LG lg=new LG();
        lg.info();//accessing its own methods//i have used same method name for all the calsses in the third layer
        // i can make the 2nd layer class as abstract
        lg.dec_channel();//accessing the subclass 2nd layer methods which is the superclass for LG
        lg.off();//accessing the superclass methods
        mrcool mc=new mrcool();
        mc.name();//accessing its own methods//i have used same method name for all the calsses in the third layer
        // i can make the 2nd layer class as abstract
        mc.on();///accessing the superclass methods
        mc.cahngemode();//accessing the 2nd layer subclass methods which is a superclass for mrcool
        chill ch=new chill();
        ch.name();
        ch.on();
        ch.cahngemode();
        ch.dec_temp();
        freeze fr=new freeze();
        fr.name();
        fr.on();
        fr.inc_temp();
        amazon am=new amazon();
        am.brand();//accesesing its own meyhods
        am.off();//accessing the super class methods
        am.inc_brightness();//accessing the 2nd layer subclass methods which is a superclass for amazon
        apple ap=new apple();
        ap.brand();
        ap.off();
        ap.inc_brightness();
        tesla tl=new tesla();
        tl.brand();
        tl.off();
        tl.dec_brightness();
    }
}
