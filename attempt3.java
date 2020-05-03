import java.security.DrbgParameters.NextBytes;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        File obj1 = new File("\\Users\\prakash\\desktop\\file1.txt");
        FileWriter myWriter1 = new FileWriter("\\Users\\prakash\\desktop\\file2.txt");
        Scanner myReader1 = new Scanner(obj1);
        while(myReader1.hasNextLine())
        {
            String st = myReader1.nextLine();
            st=st.trim();
            int i = st.length();
            if(i!=0)
            {
            myWriter1.write(st+"\n");
            }
        }
        myWriter1.close();
        File obj2 = new File("\\Users\\prakash\\desktop\\file2.txt");
        FileWriter myWriter2 = new FileWriter("\\Users\\prakash\\desktop\\file3.txt");
        Scanner myreader2 = new Scanner(obj2);
        while(myreader2.hasNextLine())
        {
            String st = myreader2.nextLine();
            if(st.startsWith("for ") || st.startsWith("for("))
            {
                myWriter2.write("ITERATION;"+"\n");
                String temp = st;
                temp = temp.trim();
                temp = temp.replaceFirst("for", " ");
                temp = temp.trim();
                temp = temp.replaceFirst("\\(", " ");
                temp = temp.trim();
                char[] bracket =temp.toCharArray();
                int ind = temp.lastIndexOf(")");
                bracket[ind]=';';
                temp = new String(bracket);
                temp = temp.trim();
                myWriter2.write(temp+"\n");
                System.out.println(temp);
            }
            else{
                myWriter2.write(st+"\n");
               // System.out.println(st);
            }
        }
        myWriter2.close();
        File obj3 = new File("\\Users\\prakash\\desktop\\file3.txt");
        FileWriter myWriter3 = new FileWriter("\\Users\\prakash\\desktop\\file4.txt");
        Scanner myReader3 = new Scanner(obj3);
        while(myReader3.hasNextLine())
        {
            String st = myReader3.nextLine();
            st = st.trim();
            char[] data = st.toCharArray();
            int i=0;
            while(i<(st.length()))
            {

                if(data[i]==';')
                {
                    myWriter3.write(data[i]+"\n");
                }
                else if(data[i]=='{' || data[i]=='}')
                {
                    myWriter3.write("\n"+data[i]+"\n");
                }
                else
                {
                    myWriter3.write(data[i]);
                }
                i++;
            }
        }
        myWriter3.close();
        File obj4 = new File("\\Users\\prakash\\desktop\\file4.txt");
        FileWriter myWriter4 = new FileWriter("\\Users\\prakash\\desktop\\file5.txt");
        Scanner myReader4 = new Scanner(obj4);
        while(myReader4.hasNextLine())
        {
            String st = myReader4.nextLine();
            st=st.trim();
            int i = st.length();
            if(i!=0)
            {
            myWriter4.write(st+"\n");
            }
        }
        myWriter4.close();
        File obj5 = new File("\\Users\\prakash\\desktop\\file5.txt");
        FileWriter myWriter5 = new FileWriter("\\Users\\prakash\\desktop\\file6.txt");
        Scanner myReader5 = new Scanner(obj5);
        while(myReader5.hasNextLine())
        {
            String st = myReader5.nextLine();
            char[] data = st.toCharArray(); 
            int end =st.length();
            if(data[end-1]==';')
            {
             System.out.println("terminator");
             if(st.startsWith("int "))
             {
                String temp =st;
                temp = temp.replaceFirst("int ","");
                StringTokenizer reader = new StringTokenizer(temp);
                while(reader.hasMoreTokens())
                  {
                       String tok ;
                        tok = reader.nextToken(",;");
                         tok = tok.trim();

                        if(tok.contains("="))
                         {
                             char[] tempdata =tok.toCharArray();
                            myWriter5.write("int ");
                            for(int k=0;tempdata[k]!='=';k++)
                            {
                                myWriter5.write(tempdata[k]);
                            }
                            myWriter5.write(";"+"\n"+tok+";"+"\n");
                         }
                        else
                        {
                        myWriter5.write("int "+tok+";"+"\n");
                        }
                        
                  }
             }
             else if(st.startsWith("float "))
             {
                String temp = st;
                temp = temp.replaceFirst("float ","");
                StringTokenizer reader = new StringTokenizer(temp);
                while(reader.hasMoreTokens())
                  {
                       String tok ;
                        tok = reader.nextToken(",;");
                         tok = tok.trim();
                         if(tok.contains("="))
                         {
                             char[] tempdata =tok.toCharArray();
                            myWriter5.write("float ");
                            for(int k=0;tempdata[k]!='=';k++)
                            {
                                myWriter5.write(tempdata[k]);
                            }
                            myWriter5.write(";"+"\n"+tok+";"+"\n");
                         }
                        else
                        {
                            myWriter5.write("float "+tok+";"+"\n");
                        }

                  }
             }
             else if(st.startsWith("char "))
             {
                String temp = st;
                temp = temp.replaceFirst("char ","");
                StringTokenizer reader = new StringTokenizer(temp);
                while(reader.hasMoreTokens())
                  {
                       String tok ;
                        tok = reader.nextToken(",;");
                         tok = tok.trim();
                         if(tok.contains("="))
                         {
                             char[] tempdata =tok.toCharArray();
                            myWriter5.write("char ");
                            for(int k=0;tempdata[k]!='=';k++)
                            {
                                myWriter5.write(tempdata[k]);
                            }
                            myWriter5.write(";"+"\n"+tok+";"+"\n");
                         }
                        else
                        {
                            myWriter5.write("char "+tok+";"+"\n");
                        }
                  }
             }
            else if(st.startsWith("printf(") || st.startsWith("printf "))
             {
                String temp = st;
                temp=temp.replaceFirst("printf", "");
                temp = temp.trim();
                temp=temp.replaceFirst("\\(", "");
                temp = temp.trim();
                int ind = temp.lastIndexOf(")");
                char[] bracketremover = temp.toCharArray();
                bracketremover[ind]=' ';
                temp = new String(bracketremover);
                StringTokenizer reader = new StringTokenizer(temp);
                while(reader.hasMoreTokens())
                {
                    String tok;
                    tok = reader.nextToken(",;");
                    tok = tok.trim();
                    if(tok.contains("="))
                    {
                        char[] tempdata =tok.toCharArray();
                            myWriter5.write("print ");
                            for(int k=0;tempdata[k]!='=';k++)
                            {
                                myWriter5.write(tempdata[k]);
                            }
                            myWriter5.write(";"+"\n"+tok+";"+"\n");
                    }
                    else
                    {
                        myWriter5.write("print "+tok+";"+"\n");
                    }
                }
             }
             else if(st.startsWith("scanf(") || st.startsWith("scanf "))
             {
               
                String temp = st;
                temp=temp.replaceFirst("scanf", "");
                temp = temp.trim();
                temp=temp.replaceFirst("\\(", "");
                temp = temp.trim();
                int ind = temp.lastIndexOf(")");
                char[] bracketremover = temp.toCharArray();
                bracketremover[ind]=' ';
                temp = new String(bracketremover);
                StringTokenizer reader = new StringTokenizer(temp);
                while(reader.hasMoreTokens())
                {
                    String tok;
                    tok = reader.nextToken(",&;");
                    tok = tok.trim();
                    if(tok.contains("="))
                    {
                        char[] tempdata =tok.toCharArray();
                            myWriter5.write("scan ");
                            for(int k=0;tempdata[k]!='=';k++)
                            {
                                myWriter5.write(tempdata[k]);
                            }
                            myWriter5.write(";"+"\n"+tok+";"+"\n");
                    }
                    else
                    {
                        myWriter5.write("scan "+tok+";"+"\n");
                    }
                } 
             }
             else
             {
                 myWriter5.write(st+"\n");
             }
            }
            else
            {
                if(st.startsWith("while ") || st.startsWith("while("))
                {
                   myWriter5.write("ITERATION"+"\n");
                   String temp =st;
                   temp = temp.replaceFirst("while", "");
                   temp = temp.replaceFirst("\\(", "");
                   char[] bracketremover = temp.toCharArray();
                   int ind = temp.lastIndexOf(")");
                   bracketremover[ind]=' ';
                   temp = new String(bracketremover);
                   myWriter5.write(temp+"\n");
                }
                else if(st.startsWith("if ") || st.startsWith("if("))
                {
                    myWriter5.write("SELECTION"+"\n");
                   String temp =st;
                   temp = temp.replaceFirst("if", "");
                   temp = temp.replaceFirst("\\(", "");
                   char[] bracketremover = temp.toCharArray();
                   int ind = temp.lastIndexOf(")");
                   bracketremover[ind]=' ';
                   temp = new String(bracketremover);
                   myWriter5.write(temp+"\n"); 

                }
                else if(st.startsWith("do "))
                {
                    myWriter5.write("DO ITERATION"+"\n");
                }
                else if(st.startsWith("{") || st.startsWith("}"))
                {
                    myWriter5.write(st+"\n");
                }
                else
                {
                   // myWriter5.write("FUNCTION "+"\n");
                   myWriter5.write(st+"\n");
                }
            }
        }
        myWriter5.close();
        File obj6 = new File("\\Users\\prakash\\desktop\\file6.txt");
        FileWriter myWriter6 = new FileWriter("\\Users\\prakash\\desktop\\file7.txt");
        Scanner myReader6 = new Scanner(obj6);
        while(myReader6.hasNextLine())
        {
            String st = myReader6.nextLine();
            Pattern p = Pattern.compile("\\w+(\\s+)?=(\\s+)?\\((\\s+)?\\w+(\\s+)?(>|>=|<|<=|==)(\\s+)?\\w+(\\s+)?\\)(\\s+)?\\?(\\s+)?\\w+(\\s+)?:(\\s+)?\\w+(\\s+)?;");
            Matcher m = p.matcher(st);
             boolean b = m.matches();
             if(b==true)
             {
                System.out.println("wroking da");
             }
             else
             {
                 myWriter6.write(st+"\n");
             }
        }
        myWriter6.close();
    }


}