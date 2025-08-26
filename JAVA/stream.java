// import java.io.*;
// public class stream {
//     public static void main(String args[]) throws IOException{
//         int i;
//         FileOutputStream fout=new FileOutputStream("./myfile.txt",true);
//         String s="helloeveryone";
//         char ch[]=s.toCharArray();
//         for(i=0;i<s.length();i++){
//             fout.write(ch[i]);
//         }
//         fout.close();
//     }
// }


import java.io.*;
public class stream {
    public static void main(String args[]) throws IOException{
        int i;
        FileInputStream 
        fis=newFileInputStream("./MYfile.txt",true);
       do{
        i=fis.read();
        if(i!=1){
            System.out.println((char)i);
        }while(i!=1){

        }
    }
    fout.close();
}
}
