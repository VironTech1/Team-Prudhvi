package learning.Day25;

import java.io.*;

public class FileEx_A {
    public static void main(String[] args) throws IOException {

        InputStream ins=System.in;
        int i=ins.read();
        OutputStream out=new FileOutputStream("viron.txt");
        String s="";
        while(i!='q'){
            s=s+(char)i;
            out.write((char)i);
            out.flush();
            i=ins.read();
        }
        File file=new File("viron.txt");
        System.out.println("the length of the file is "+file.length());
        InputStream  ins1=new FileInputStream(file);

        //String s=file.toString();
        //finding wether we have the strinf or not
        System.out.println(s);
        //System.out.println(s.contains("akhil"));

        String[] str=s.split(" ");
        int l=str.length;
        System.out.println(l);
        int counter=0;



        for(int j=0;j<l;j++){
            if("akhil".equals(str[j])){
                System.out.println(str[j]);
                counter++;
                System.out.println(counter);
            }


           // System.out.println(str[j]);
        }
        if(counter>0){
            System.out.println("yes it contains the given string "+counter + " times");
        }
        else {
            System.out.println("no it doesn't contain the given sytring");
        }



        //opening a folder and counting no of files in it
        File directory = new File("C:\\Users\\Akhil Reddy\\Documents\\VIRON\\JAVA\\codebase\\Team-Prudhvi\\Akhil");

        File[] files = directory.listFiles();

        if (files != null) {
            int fileCount = files.length;
            System.out.println("Number of files in the directory: " + fileCount);

            System.out.println("File names in the directory:");
            for (File file1 : files) {
                System.out.println(file1.getName());
            }
        } else {
            System.out.println("The directory is empty.");
        }















    }
}
