//day 14 in class
//interface
package learning.Day14;

import learning.Day14.Atm;
import learning.Day14.ICIC;
import learning.Day14.SBIAtm;

public class Atmmain {
    public static void main(String[] args) {
        SBIAtm sbi=new SBIAtm();
        sbi.withdraw();
        ICIC icic=new ICIC();
        icic.getbalance();
        Atm atm=new SBIAtm();//dynamic method dispatch
        atm.withdraw();//dynamic method dispatch
        atm=new ICIC();//dynamic method dispatch
        atm.getbalance();//dynamic method dispatch
    }
}
