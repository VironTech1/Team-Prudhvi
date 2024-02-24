package Latest_Assignemnts;
import java.io.*;
import java.util.Scanner;
public class File_Ex {
    public static void main(String[] args) throws IOException {

        InputStream ins=System.in;
        int a=ins.read();
        OutputStream out=new FileOutputStream("bharath.txt");
        while((char)a!='&'){
            out.write(a);
            out.flush();
            a=ins.read();
        }
        Reader reader=new FileReader("bharath.txt");
        BufferedReader br=new BufferedReader(reader);
        String s=br.readLine();
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        int counter=0;
        int sameword_count=0;
        while (s!=null){
            String[] str=s.trim().split("\\s");
            counter=counter+str.length;
            for(String sa:str){
                if(sa.equalsIgnoreCase(word1)){
                    sameword_count++;
                }
            }
            s=br.readLine();


        }
        System.out.println("the number of words : "+counter);
        System.out.println("number of times the word repeated : "+sameword_count);
        //opening a folder and printing the files

        File fi=new File("S:\\Java_Codes\\Latest_Assignemnts");
        File[] r=fi.listFiles();
        System.out.println("the number of files in this doirectory : "+r.length);
        System.out.println("the files in the path are");
        for(File file:r){
            System.out.println(file.getName());
        }


    }
}
