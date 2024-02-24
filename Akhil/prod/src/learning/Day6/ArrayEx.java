//day 6 in calss lecture
//arrays
package learning.Day6;

public class ArrayEx {
    public static void main(String[] args) {
        System.out.println("this is an array example");
        int[] i = new int[5];
        System.out.println(i[3]);
        i[3]=22;
        System.out.println(i[3]);
        int j=i[4];
        System.out.println("the value of variable j which copied the value of one of the variables in array a ");
        System.out.println(j);
        //for loop
        for(int index=0;index<=4;index++){
            i[index]=10;
        }
        //printing the array
        System.out.println("printing the value of hashcode stored in array i");
        System.out.println(i);

        for (int index=0;index<5;index++){

            i[index]=10;


        }

        //printing
        System.out.println("the values in the array are");
        for(int index=0;index<5;index++){

            System.out.println(i[index]);

        }
        int[] a={11,22,33,44,55,66};
        System.out.println("the values in array a are :");
        for(int index=0;index<a.length;index++){

            System.out.println(a[index]);
        }
        //value in 'a'
        System.out.println("printing the hashcode value in a");
        System.out.println(a);
        //multidimensional arrays
        //int[][] - 2 dimensional
        //int[][][] - 3 dimensional

        //instantiation of  the '2' dimensional array
        int[][] t=new int[2][2];
        System.out.println("printing the default values stored in 2 dimensional array");
        System.out.println(t[0][0]+" "+t[0][1]+" "+t[1][0]+" "+t[1][1]);

        //initialisation of 2-dimensional array
        t[0][0]=5;
        t[0][1]=10;
        t[1][0]=15;
        t[1][1]=20;
        System.out.println("printing the values in 2D array after initialization :");
        System.out.println(t[0][0]+" "+t[0][1]+" "+t[1][0]+ " "+t[1][1]);

        //using for loop


        for(int rowid=0;rowid<2;rowid++){
            for(int colid=0;colid<2;colid++){
                 t[rowid][colid]=10;
            }
        }
        System.out.println("printing the values of 2D array that we created using for loop");
        System.out.println(t[0][0]+" "+t[0][1]+" "+t[1][0]+" "+t[1][1]);
        double[] d={10.20,11.1,12.2,2,3,4.4};
        System.out.println(d[0]+" "+d[1]+" "+d[2]+" "+d[3]+" "+d[4]+" "+d[5]);
        System.out.println("printing the array which copied the values of the array double d :");
        double[] b= d;
        System.out.println(b[0]+" "+b[1]+ " "+b[2]+" "+b[3]+ " "+ b[4]+" "+b[5]);

        //arrays are objects in java

        d[0]=10000;
        System.out.println("printing the values of double array d AFTER CHANGING THE VALUE OF INDEX 0 :");
        System.out.println("array d"+ d[0]+" "+ d[1]+" "+d[2]+" "+d[3]+" "+d[4]+ " "+ d[5]);
        System.out.println("printing the values of the array which copied the values of double array d");
        System.out.println("array b"+ b[0]+ " "+ b[1]+ " "+b[2]+ " "+b[3]+ " "+ b[4]+ " "+b[5]);
        System.out.println(d);
        System.out.println(b);;





    }
}
