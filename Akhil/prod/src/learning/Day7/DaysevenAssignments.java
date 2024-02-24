//second list of assignments
//part 1 first 10 questions
//day 7
package learning.Day7;

public class DaysevenAssignments {

    public static void main(String[] args) {
        //q1(Write a Java program to create a single dimension array and initialise the values?)
        //2. Write a Java program to print the values from an array?

        System.out.println(" printing a single dimensional array with it default values");
        int[] a = new int[3];
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        System.out.println("printing the values of array after initializing");
        for (int index = 0; index < a.length; index++) {
            a[index] = 10;
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        //3. Write a Java program to fina a given number in an array and if it found print it's index
        //lets say the given number is 5
        a[1] = 5;//i changed the value of index '1' to 5
        //now we will be finding the given value using for loop
        /*for(int index=0;index<a.length;index++){
            if(a[index]==5){
                System.out.println("i found the given number in the array and that is : "+index);
            }
            else{
                System.out.println("not found");
        }*/  //this logic checks for every index and print not found if the element is not present at the particular index
        //so this isn't the perfect logic
        //lets try it this way
        System.out.println(" have written a java program to check it a given element is present in ythe array or not");
        int counter = 0;
        int x = 0;//if i left it as "int x;" it is showing me that the variable x has not been initialized
        //only after i give it as "int x = 0" it removes the error
        for (int index = 0; index < a.length; index++) {
            if (a[index] == 5) {
                counter++;
                x = index;

            }


        }
        if (counter == 0) {
            System.out.println("the given element is not found");
        } else {
            System.out.println("the given elemnt is found and its index is : " + x);
        }
        //4. Write a Java program to sum the elements of an array
        System.out.println("have written a Java program to sum the elements of an array ");
        int sum = 0;
        for (int index = 0; index < a.length; index++) {
            sum = sum + a[index];
        }
        System.out.println("printing the sum of all the elements in the array" + sum);
        //5.Write a Java program to print even numbers from an array
        System.out.println("i have written  a Java program to print even or odd numbers from an array ");
        for (int index = 0; index < a.length; index++) {
            if (a[index] % 2 == 0) {
                System.out.println("the element " + a[index] + " which is present at the index " + index + " is even");
            } else if (a[index] % 2 != 0) {
                System.out.println("the element " + a[index] + "which is at the index " + index + " is odd");
            }
        }

        //8. Write a Java program to copy from one array into another
        int[] b = a;
        System.out.println("copying an array from array to another");
        System.out.println("array b " + b[0] + " " + b[1] + " " + b[2]);
        //10. Write a Java program to swap two numbers in an given indexes
        //lets say the given indexes are 1,2
        int s = a[2];
        a[2] = a[1];
        a[1] = s;
        System.out.println("printing the values of the array after swaping the given indexes");
        System.out.println(a[0] + " " + a[1] + " " + a[2]);

        //7. Write a Java program to find max and min number from an array
        int k = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[k] < a[index]) {
                k = index;
            }


        }
        System.out.println("the maximum of the array is :" + a[k]);

        int m = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[m] > a[index]) {
                m = index;
            }
        }
        System.out.println("the minimum of the array is :" + a[m]);

        int sa = 0;
        int co = 0;
        int da = 0;
        for (int index = 1; index < a.length; index++) {
            if (a[sa] == a[index]) {
                co = index;
                da++;
            }
        }
        if (da == 0) {
            System.out.println("there is no duplicate");
        } else {
            System.out.println("there is a duplicate at index :" + co);
        }


    }
}