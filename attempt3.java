import java.security.DrbgParameters.NextBytes;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.lang.model.util.ElementScanner6;
import javax.xml.transform.stax.StAXResult;
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
        int jobs=-1;
        int arr[] = new int[10] ;
        Stack<String> stack = new Stack<String>();
        while(myreader2.hasNextLine())
        {
            String st = myreader2.nextLine();
            //Stack<String> stack = new Stack<String>();
            if(st.startsWith("for ") || st.startsWith("for("))
            {
                String temp = st;
                temp = temp.trim();
                temp = temp.replaceFirst("for", " ");
                temp = temp.trim();
                temp = temp.replaceFirst("\\(", " ");
                temp = temp.trim();
                char[] bracketremover =temp.toCharArray();
                int ind = temp.lastIndexOf(")");
                bracketremover[ind]=';';
                temp = new String(bracketremover);
                temp = temp.trim();
                //myWriter2.write(temp+"\n");
                //System.out.println(temp);
                StringTokenizer token = new StringTokenizer(temp);
                ind =0;
                while(token.hasMoreTokens())
                {
                    String tok = token.nextToken(";");
                    if(ind==0)
                    {
                        myWriter2.write(tok+";\n");
                     ind++;
                    }
                    else if(ind==1)
                    {
                        myWriter2.write("while("+tok+")\n");
                        ind++;
                    }
                    else if(ind==2)
                    {
                        stack.push(tok);
                        //System.out.println(stack.toString());
                        ind++;
                    }
                }
                jobs++;
                arr[jobs]=0;
            }
            else if(st.contains("{") && jobs>=0)
            {
                myWriter2.write(st+"\n");
                arr[jobs]++;
                
            }
            else if(st.contains("}") && jobs>=0)
            {
                arr[jobs]--;
                char[] datafor = st.toCharArray();
                int ind=st.length();
                int i =0;
               // System.out.print("workinglkjh");
                if(arr[jobs]==0)
                {
                    jobs--;
                    //System.out.print("workinglkjh");
                while(ind>i)
                {
                   if(datafor[i]!='}')
                    {
                        myWriter2.write(datafor[i]);
                    }
                   else if(datafor[i]=='}')
                    {
                        if(stack.empty()!=true)
                        {
                            
                            myWriter2.write(stack.pop()+";\n"+datafor[i]+"\n");
                            
                        }
                        else{
                            myWriter2.write(datafor[i]+"\n");
                        }
                    }
                    i++;
                }
               }
               else{
                   myWriter2.write(st+"\n");
               }
            }
            else{
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
            myWriter3.write("\n");
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
        File obj7 = new File("\\Users\\prakash\\desktop\\file5.txt");
        FileWriter mywriter7 = new FileWriter("\\Users\\prakash\\desktop\\file8.txt");
        int[] arr3=new int[100];
        int lines=0;
        Queue<String> queue= new LinkedList<>();
        Scanner myReader7= new Scanner(obj7);
        String[] arraystring = new String[15];
        int initial=0,finall=0;
        while(myReader7.hasNextLine())
        {
          lines++;
          String st = myReader7.nextLine();
          
          if(st.equals("do"))
          {
            arr3[initial]=lines;
            initial++;
          }
          
        }
        //System.out.println(initial);
        int bracket7=0;
        for(int i=0;arr3[i]!='\0';i++)
        { 
          Scanner scc7 = new Scanner(obj7);
          int pic=1;
          int indic7=0;
          int indic17=0;
          bracket7=0;
          while(scc7.hasNextLine())
          {
            String st = scc7.nextLine();
            char[] data7 = st.toCharArray();
            if(indic7!=0 && indic17==0)
            {
              char[] data17 = st.toCharArray();
              int ind7 = st.lastIndexOf(";");
             data17[ind7]=' ';
              st = new String(data17);
              queue.add(st);
              indic17++; 
            }
            else if(pic>=arr3[i] && indic7==0)
            {
              int pic2=1;
               if(st.equals("{"))
               {
                bracket7++; 
               }
               else if(st.equals("}"))
               {
                 bracket7--;
               }
               if(st.equals("do"))
               {

               }
               else if(indic7==0 && bracket7==0)
               {
                 indic7++;
               }
            }
            pic++;
           }
        }
        Scanner myReader17= new Scanner(obj7);
        while(myReader17.hasNextLine())
        {
         // System.out.println("jsegfiusgfiwugf");
          String st7 = myReader17.nextLine();
          if(st7.equals("do"))
          {
           // System.out.println(queue.poll());
            mywriter7.write(queue.poll()+"\n");
          }
          else if(st7.startsWith("while") && st7.endsWith(";"))
          {

          }
          else{
            mywriter7.write(st7+"\n");
           // System.out.println(st7);
          }
        }
        mywriter7.close();
        File obj5 = new File("\\Users\\prakash\\desktop\\file8.txt");
        FileWriter myWriter5 = new FileWriter("\\Users\\prakash\\desktop\\file6.txt");
        Scanner myReader5 = new Scanner(obj5);
        while(myReader5.hasNextLine())
        {
            String st = myReader5.nextLine();
            st=st.trim();
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
                   bracketremover[ind]=';';
                   temp = new String(bracketremover);
                   temp = temp.trim();
                  if(temp.contains("&&"))
                   {
                     temp = temp.replaceAll("&&", ";");
                       bracketremover = temp.toCharArray();
                       ind=temp.length();
                       int i=0;
                       while(i<ind)
                       {
                           if(bracketremover[i]==';')
                           {
                               myWriter5.write(bracketremover[i]+"\n");
                           }
                           else{
                            myWriter5.write(bracketremover[i]);
                           }
                           i++;
                       }
                   }
                   else if(temp.contains("||"))
                   {
                    temp = temp.replaceAll("||", ";");
                    bracketremover = temp.toCharArray();
                    ind=temp.length();
                    int i=0;
                    while(i<ind)
                    {
                        if(bracketremover[i]==';')
                        {
                            myWriter5.write(bracketremover[i]+"\n");
                        }
                        else{
                         myWriter5.write(bracketremover[i]);
                        }
                        i++;
                    } 
                   }
                   else{
                   myWriter5.write(temp+"\n");
                   }
                }
                else if(st.startsWith("if ") || st.startsWith("if("))
                {
                    myWriter5.write("SELECTION"+"\n");
                   String temp =st;
                   temp = temp.replaceFirst("if", "");
                   temp = temp.replaceFirst("\\(", "");
                   char[] bracketremover = temp.toCharArray();
                   int ind = temp.lastIndexOf(")");
                   bracketremover[ind]=';';
                   temp = new String(bracketremover);
                   temp = temp.trim();
                   if(temp.contains("&&"))
                   {

                    temp = temp.replaceAll("&&", ";");
                    bracketremover = temp.toCharArray();
                    ind=temp.length();
                    int i=0;
                      while(i<ind)
                     { 
                        if(bracketremover[i]==';')
                        {
                            myWriter5.write(bracketremover[i]+"\n");
                        }
                        else{
                         myWriter5.write(bracketremover[i]);
                        }
                        i++;
                      }
                   }
                   else if(temp.contains("||"))
                   {
                    temp = temp.replaceAll("||", ";");
                    bracketremover = temp.toCharArray();
                    ind=temp.length();
                    int i=0;
                      while(i<ind)
                     { 
                        if(bracketremover[i]==';')
                        {
                            myWriter5.write(bracketremover[i]+"\n");
                        }
                        else{
                         myWriter5.write(bracketremover[i]);
                        }
                        i++;
                      }
                   }
                   else
                   {
                   myWriter5.write(temp+"\n"); 
                   }

                }
                else if(st.startsWith("else") || st.endsWith("if"))
                {
                 
                    myWriter5.write("SELECTION"+"\n");
                    String temp =st;
                    temp = temp.replaceFirst("if", "");
                    temp = temp.replaceFirst("else", "");
                    temp = temp.trim();
                    temp = temp.replaceFirst("\\(", "");
                    char[] bracketremover = temp.toCharArray();
                    int ind = temp.lastIndexOf(")");
                    bracketremover[ind]=';';
                    temp = new String(bracketremover);
                    temp = temp.trim();
                    if(temp.contains("&&"))
                    {
 
                     temp = temp.replaceAll("&&", ";");
                     bracketremover = temp.toCharArray();
                     ind=temp.length();
                     int i=0;
                       while(i<ind)
                      { 
                         if(bracketremover[i]==';')
                         {
                             myWriter5.write(bracketremover[i]+"\n");
                         }
                         else{
                          myWriter5.write(bracketremover[i]);
                         }
                         i++;
                       }
                    }
                    else if(temp.contains("||"))
                    {
                     temp = temp.replaceAll("||", ";");
                     bracketremover = temp.toCharArray();
                     ind=temp.length();
                     int i=0;
                       while(i<ind)
                      { 
                         if(bracketremover[i]==';')
                         {
                             myWriter5.write(bracketremover[i]+"\n");
                         }
                         else{
                          myWriter5.write(bracketremover[i]);
                         }
                         i++;
                       }
                    }
                    else
                    {
                    myWriter5.write(temp+"\n"); 
                    }
 

     




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
            char[] datacond = st.toCharArray();
            if(st.contains("=") && st.contains("?") && st.contains(":"))
            {
                int bracket =1;
                int leng = st.length();
                int ind=0;
                int equal=0;
                int start =0,end=0;
             while(datacond[equal]!='=')
             {
                 equal++;
             }
             start = equal;
             while(datacond[start]!='(')
             {
                 start++;
             }
             end = ++start;
             while(end<leng && ind ==0)
             { 
                 if(datacond[end]=='(')
                 {
                        bracket++; 
                        end++;
                 }
                 else if(datacond[end]==')')
                 {
                     bracket--;
                     if(bracket==0)
                     {
                         ind++;
                     }
                     end++;
                 }
                 else
                 {
                    end++; 
                 }
                 
              }
              start--;
              end--;
            String temp ="";
            int remainder = start;
             while(start<=end)
             {
               // System.out.print(datacond[start]);
                 temp = temp + datacond[start];
                start++;
             }
             start = remainder;
             //System.out.print(temp);
             temp = temp.replaceFirst("\\(", "");
             datacond = temp.toCharArray();
             ind = temp.lastIndexOf(")");
             datacond[ind]=';';
             temp = new String(datacond);
            // System.out.print(temp);
             myWriter6.write("SELECTION"+"\n");
             if(temp.contains("&&"))
             {
                temp= temp.replaceAll("&&", ";");
                ind =0;
                int len=temp.length();
                while(ind<len)
                {
                    if(datacond[ind]==';')
                    {
                      myWriter6.write(datacond[ind]+"\n");
                    }
                    else
                    {
                        myWriter6.write(datacond[ind]);  
                    }
                    ind++;
                }
             }
             else if(temp.contains("||"))
             {
                temp= temp.replaceAll("||", ";");
                ind =0;
                int len=temp.length();
                while(ind<len)
                {
                    if(datacond[ind]==';')
                    {
                      myWriter6.write(datacond[ind]+"\n");
                    }
                    else
                    {
                        myWriter6.write(datacond[ind]);  
                    }
                    ind++;
                }
             }
             else
             {
                 myWriter6.write(temp+"\n");
             }
             myWriter6.write("{\n");
             datacond = st.toCharArray();
             ind=0;
             while(ind<start)
             {
                myWriter6.write(datacond[ind]);  
                 System.out.print(datacond[ind]);
                 ind++;
             }
            
             ind=++end;
              while(datacond[ind]!=':' && datacond[ind]!='\0')
              {
                  if(datacond[ind]!='?')
                  {
                    myWriter6.write(datacond[ind]);  
                System.out.print(datacond[ind]); 
                  }
                ind++;
              }
              myWriter6.write(";\n}\n"); 
            }
            else if(st.contains("?") && st.contains(":"))
            {
                
            }
            else
            {
                myWriter6.write(st+"\n");
            }
            myWriter6.write("\n");
           /* Pattern p = Pattern.compile("\\w+(\\s+)?=(\\s+)?\\((\\s+)?\\w+(\\s+)?(>|>=|<|<=|==)(\\s+)?\\w+(\\s+)?\\)(\\s+)?\\?(\\s+)?\\w+(\\s+)?:(\\s+)?\\w+(\\s+)?;?");
            Matcher m = p.matcher(st);
             boolean b = m.matches();
            */
        
        }
        myWriter6.close();
        
    }


}