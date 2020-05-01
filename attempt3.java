import java.security.DrbgParameters.NextBytes;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
import java.io.*;
public class attempt3 {
    public static void main(String args[]) throws Exception
    {
        File obj0 = new File("\\Users\\prakash\\desktop\\file0.txt");
        FileWriter myWriter0 = new FileWriter("\\Users\\prakash\\desktop\\file1.txt");
         Scanner reader0 = new Scanner(obj0);
        while(reader0.hasNextLine())
        {
            int quotes=0;
            String st = reader0.nextLine();
            char[] data0 = st.toCharArray();
            int i =0;
            while(i<st.length())
            {
                if(data0[i]=='\"' && data0[i-1]!='\\')
                {
                    quotes++;
                    if(quotes%2==0)
                    {
                        i++;
                    }
                }
                if(quotes == 0|| quotes%2==0)
                {
                  myWriter0.write(data0[i]);
                }
                i++;
            }
            myWriter0.write("\n");
        }
        myWriter0.close();
        File obj = new File("\\Users\\prakash\\desktop\\file1.txt");
        FileWriter myWriter = new FileWriter("\\Users\\prakash\\desktop\\file2.txt");
        Scanner myReader = new Scanner(obj);
        while(myReader.hasNextLine())
        {
            String st = myReader.nextLine();
            st = st.trim();
            char[] data = st.toCharArray();
            int i=0;
            while(i<(st.length()))
            {

                if(data[i]==';')
                {
                    myWriter.write(data[i]+"\n");
                }
                else if(data[i]=='{' || data[i]=='}')
                {
                    myWriter.write("\n"+data[i]+"\n");
                }
                else
                {
                    myWriter.write(data[i]);
                }
                i++;
            }
        }
        myWriter.close();
        File obj2 = new File("\\Users\\prakash\\desktop\\file2.txt");
        FileWriter myWriter2 = new FileWriter("\\Users\\prakash\\desktop\\file3.txt");
        Scanner myReader2 = new Scanner(obj2);
        while(myReader2.hasNextLine())
        {
            String st = myReader2.nextLine();
            st=st.trim();
            int i = st.length();
            if(i!=0)
            {
            myWriter2.write(st+"\n");
            }
        }
        myWriter2.close();
        File obj3 = new File("\\Users\\prakash\\desktop\\file3.txt");
        FileWriter myWriter3 = new FileWriter("\\Users\\prakash\\desktop\\file4.txt");
        Scanner myReader3 = new Scanner(obj3);
        while(myReader3.hasNextLine())
        {
            String st = myReader3.nextLine();
            char[] data = st.toCharArray(); 
            int end =st.length();
            if(data[end-1]==';')
            {
             System.out.println("terminator");
             if(st.startsWith("int "))
             {
                int i =0;
                StringTokenizer reader = new StringTokenizer(st);
                while(reader.hasMoreTokens())
                  {
                       String tok ;
                        tok = reader.nextToken(",;");
                         tok = tok.trim();
                         if(i==0)
                            {
                            myWriter3.write(tok+";"+"\n");
                             i++;
                            }
                           else
                           {
                             myWriter3.write("int "+tok+";"+"\n");
                            }
                  }
             }
             else if(st.startsWith("float "))
             {
                int i =0;
                StringTokenizer reader = new StringTokenizer(st);
                while(reader.hasMoreTokens())
                  {
                       String tok ;
                        tok = reader.nextToken(",;");
                         tok = tok.trim();
                         if(i==0)
                            {
                            myWriter3.write(tok+";"+"\n");
                             i++;
                            }
                           else
                           {
                             myWriter3.write("float "+tok+";"+"\n");
                            }
                  }
             }
             else if(st.startsWith("char "))
             {
                int i =0;
                StringTokenizer reader = new StringTokenizer(st);
                while(reader.hasMoreTokens())
                  {
                       String tok ;
                        tok = reader.nextToken(",;");
                         tok = tok.trim();
                         if(i==0)
                            {
                            myWriter3.write(tok+";"+"\n");
                             i++;
                            }
                           else
                           {
                             myWriter3.write("char "+tok+";"+"\n");
                            }
                  }
             }
            else if(st.startsWith("printf(") || st.startsWith("printf "))
             {
                 int i=0;
                StringTokenizer reader = new StringTokenizer(st);
                while(reader.hasMoreTokens())
                {
                    String tok;
                    tok = reader.nextToken(" ( ) ,;");
                    tok = tok.trim();
                    if(i==0)
                    {
                        //myWriter3.write("print "+tok+";"+"\n");
                         i++;
                    }
                    else if(i==1)
                    {
                        myWriter3.write("print "+tok+";"+"\n");
                    }
                }
             }
             else if(st.startsWith("scanf(") || st.startsWith("scanf "))
             {
                int i=0;
                StringTokenizer reader = new StringTokenizer(st);
                while(reader.hasMoreTokens())
                {
                    String tok;
                    tok = reader.nextToken("( ) & , ; ");
                    tok = tok.trim();
                    if(i==0)
                    {
                        //myWriter3.write("scan "+tok+";"+"\n");
                         i++;
                    }
                    else if(i==1)
                    {
                        myWriter3.write("scan "+tok+";"+"\n");
                    }
        
                } 
             }
             else if(st.startsWith("for(") || st.startsWith("for "))
             {
                 myWriter3.write("ITERATION"+"\n");
                 char[] data2 = st.toCharArray();
                 int size = st.length();
                 int start=0;
                 int i=0;
                 for(;data2[i]!='(';i++)
                 {}
                 start=++i;
                 for(int j=start;j<size;j++)
                 {
                    myWriter3.write(data2[j]); 
                 }
                 myWriter3.write("\n");
             }
             else
             {
                 myWriter3.write(st+"\n");
             }
            }
            else
            {
                if(st.startsWith("while ") || st.startsWith("while("))
                {
                    myWriter3.write("ITERATION"+"\n");
                    char[] data2 = st.toCharArray();
                 int size = st.length();
                 int start=0;
                 int i=0;
                 for(;data2[i]!='(';i++)
                 {}
                 start=++i;
                 for(int j=start;j<size;j++)
                 {
                    myWriter3.write(data2[j]); 
                 }
                 myWriter3.write("\n");
                }
                else if(st.startsWith("if ") || st.startsWith("if("))
                {
                    myWriter3.write("SELECTION"+"\n");
                    char[] data2 = st.toCharArray();
                 int size = st.length();
                 int start=0;
                 int i=0;
                 for(;data2[i]!='(';i++)
                 {}
                 start=++i;
                 for(int j=start;j<size;j++)
                 {
                    myWriter3.write(data2[j]); 
                 }
                 myWriter3.write("\n");

                }
                else if(st.startsWith("do "))
                {
                    myWriter3.write("ITERATION"+"\n");
                }
                else if(st.startsWith("{") || st.startsWith("}"))
                {
                    myWriter3.write(st+"\n");
                }
                else
                {
                   // myWriter3.write("FUNCTION "+"\n");
                   myWriter3.write(st+"\n");
                }
            }
        }
        myWriter3.close();

    }


}