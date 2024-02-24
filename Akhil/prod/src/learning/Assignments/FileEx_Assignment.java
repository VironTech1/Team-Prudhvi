package learning.Assignments;

import java.io.*;
import java.util.Scanner;

public class FileEx_Assignment {
    public static void main(String[] args) throws IOException {

        Reader reader=new FileReader("viron.txt");
        BufferedReader br=new BufferedReader(reader);

        int counter=0;
        int counter1=0;
        Scanner sc=new Scanner(System.in);
        String searching_word=sc.nextLine();

        String s=br.readLine();
        while(s!=null) {
            if(s.length()!=0){
                String[] str=s.trim().split("\\s+");
                counter=counter+str.length;
                for(String i:str){
                    if(searching_word.equalsIgnoreCase(i)){
                        counter1++;
                    }
                }
            }

            s= br.readLine();
        }
        System.out.println("total number of words : "+counter);
        System.out.println("the number of times the given word was repeated was "+counter1);

        //
        File path=new File("C:\\Users\\Akhil Reddy\\Documents\\VIRON\\JAVA\\codebase\\Team-Prudhvi\\Akhil");
        File[] files=path.listFiles();
        if(files!=null){
            int no_of_files= files.length;
            System.out.println("number of files in the given path "+no_of_files);
            for (File file:files){
                System.out.println(file.getName());
            }

        }




    }
}
