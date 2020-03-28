import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;
import java.io.*;
import java.io.FileWriter;   
import java.io.IOException;
class space
{
    public static void main(String args[]) throws Exception
    {
        File obj = new File("\\Users\\prakash\\desktop\\file1.txt");
        Scanner myReader = new Scanner(obj);
        while(myReader.hasNextLine())
       {
         int i =0;
         int indic=0;
         String st;
         st= myReader.nextLine();
         char[] bk = null;
         bk = st.toCharArray();
         for(;i<(st.length());i++)
         {
            if(bk[i]!=' ' && indic==0)
            {
                System.out.print(bk[i]);
                indic=1;
            }
            else if(indic ==1)
            {
                System.out.print(bk[i]);
            }
         }
         System.out.println();
         indic=0;
       }
    }
}