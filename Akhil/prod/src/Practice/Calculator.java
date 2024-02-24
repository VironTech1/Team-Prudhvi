//day 13
//5. Calculator can perform various calculations ex add, sub,start, and all other calculations for conversions like weight, distance etc..
// Create a program with all operations and return values
package learning.Assignments;

public class Calculator {
    double a;
    double b;
    double weight;
    double distance;

    double add(double q,double w){
        double k=q+w;
        return k;

    }
    double sub(double i, double j){
        double g=i-j;
        return g;
    }

    double weightconverstion(double weight1){
        double e=weight1*1000;//weight in grams
        return e;

    }
    double  distanceconverstion(double distance1){
        double d=distance1*1000;//distance in meters
        return d;
    }




}
