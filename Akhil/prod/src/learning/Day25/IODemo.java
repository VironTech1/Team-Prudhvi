package learning.Day25;

import java.io.*;

public class IODemo {
    public static void main(String[] args) throws IOException {
        //PrintStream ps=new PrintStream();//why does it show an error
        //because the preintstream constructor has the arguments so it works only when we pass the required arguments
        /*//topic 1

        PrintStream ps=System.out;//creating an object

        ps.println("hello");
        ps.write(97);
        ps.flush();
        System.out.write(97);
        System.out.flush();//without the 'flush' the write doesn't work
        InputStream ins=System.in;
        int i=ins.read();//this gives an IOException so we handled it using throws keyword
        System.out.println((char)i);//we are doing the explicit downcasting because the 'read' will return int type
        //so we are converting it back to char

         *///topic 1 end

        //read from keyboard and write to console till 'q'.
        /*

        InputStream ins =System.in;
        char c=(char)ins.read();
        OutputStream out=System.out;
        while(c!='q'){
            out.write(c);
            out.flush();//here even without the flush i am getting the same output ?
            //why is that ?//got it try entering 'akhilq' with flush and without flush

            c=(char)ins.read();
        }

         */


        //read from kb and write to file
        /*
       InputStream ins=System.in;
        char c=(char)ins.read();
        OutputStream out=new FileOutputStream("viron.txt",true);
        while (c!='q'){
            out.write(c);
            out.flush();
            c=(char)ins.read();
        }

         */



        //read from a file aand write to a console
        /*
        InputStream ins=new FileInputStream("viron.txt");
        int i=ins.read();
        OutputStream out=System.out;
        while (i!=-1){
            out.write((char)i);
            out.flush();
            i=ins.read();
        }

         */


        //read from a file and write to a file
        /*

        InputStream ins=new FileInputStream("viron.txt");
        int i=ins.read();
        OutputStream out=new FileOutputStream("viron1.txt",true);
        while (i!=-1){
            out.write((char)i);
            out.flush();
            i=ins.read();
        }

         */




        //buffered reader
        /*

        Reader reader =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(reader);
        String str=br.readLine();
        System.out.println(str);

         */




        //not for performing read and write it is for file level
        /*
        File file =new File("viron3.txt");
        System.out.println(file.length());
        if(!file.exists()){
            file.createNewFile();
        }
        File file1=new File("test");
        file1.mkdir();
        file1.delete();

         */












    }
}
