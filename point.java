import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;
import java.io.*;
import java.io.FileWriter;   
import java.io.IOException;
class point
{
  public static void main(String args[]) throws Exception
 {
   File obj = new File("\\Users\\prakash\\desktop\\file1.txt");
   Scanner myReader = new Scanner(obj);
   while(myReader.hasNextLine())
  {
    int terminater =0;
    int quotes=0;
    int end=0;
    int i =0;
    int indic=0;
    int bracket=0;
    String st;
    int j;
    st= myReader.nextLine();
    char[] bk = null;
    bk = st.toCharArray();
     for( ;i<(st.length());i++)
     {
       if(bk[i]=='{')
        {
         System.out.println(bk[i]);
       //  System.out.print("working da 1");
        }
        else if(bk[i]=='c' && bk[i+1]=='l' && bk[i+2]=='a' && bk[i+3]=='s' && bk[i+4]=='s' && bk[i+5]==' ')
        {
         // System.out.print("working da 2");
          int k =i;
          for(j=i+5;j<(st.length());j++)
          {
            if(bk[j]=='{')
               {
                  int p = j;
                  for(;k<=p;k++)
                  {
                    System.out.print(bk[k]);
                  }
                 System.out.println();
                 
               }
          }
          i=j--;
        }
        else if(bk[i]==';')
        {
       //   System.out.print("working da 3");
           System.out.println(";");
        }
      else if(bk[i]=='i' && bk[i+1]=='m' && bk[i+2]=='p' && bk[i+3]=='o'&& bk[i+4]=='r'&& bk[i+5]=='t' && bk[i+6]==' ')
      {
     //   System.out.print("working da 4");
        int k =i;
        for(j=i+6;j<(st.length());j++)
        {
          if(bk[j]==';')
             {
               int p = j;
               for(;k<=p;k++)
               {
                 System.out.print(bk[k]);
               }
               System.out.println();
               
             }
        }
        i=j--;
      }
      else if(bk[i]=='S' && bk[i+1]=='t' && bk[i+2]=='r' && bk[i+3]=='i'&& bk[i+4]=='n'&& bk[i+5]=='g' && bk[i+6]==' ')
      { //System.out.print("working da 5");
        int k =i;
        for(j=i+6;j<(st.length());j++)
        {
          if(bk[j]==';')
             {
               int p = j;
               for(;k<=p;k++)
               {
                 System.out.print(bk[k]);
               }
               System.out.println();
               
             }
        }
        i=j--;
      }
       else if(bk[i] =='i' && bk[i+1] =='n' && bk[i+2] =='t' && bk[i+3]==' ')
        {// System.out.print("working da 6");
          int k =i;
           for(j = i+3;j<(st.length());j++)
           {
              if(bk[j]==';')
              {
               int p = j;
               for(;k<=p;k++)
               {
                 System.out.print(bk[k]);
               }
               System.out.println();
               
             }
             else if(bk[j]=='{')
             {
              int p = j;
              for(;k<=p ;k++)
              {
                System.out.print(bk[k]);
              }
              System.out.println();
              
             }
             else if(bk[j]=='}')
             {
               System.out.println("}");
             }
           }
           i = j--;
        }
       /* else if(bk[i]=='S' && bk[i+1]=='y' && bk[i+2]=='s' && bk[i+3]=='t' && bk[i+4]=='e' && bk[i+5]=='m' && bk[i+6]=='.' 
        && bk[i+7]=='o' && bk[i+8]=='u' && bk[i+9]=='t' && bk[i+10]=='.' && bk[i+11]=='p' && bk[i+12]=='r' && bk[i+13]=='i'
         && bk[i+14]=='n' && bk[i+15]=='t' && bk[i+16]=='l' && bk[i+17]=='n' )
        {
            if(bk[i+18]=='(')
            {
              int k=i;
                bracket++;
                for(j=i+19;j<(st.length());j++)
                { 
                  if(bk[j]=='\"')
                  {
                    quotes++;
                    
                  }
                  if(bk[j]!='\"')
                  {
                    if(bk[j]==')')
                    {
                      bracket--;
                    }
                    else if(bk[j]=='(')
                    {
                      bracket++;
                    }
                    if(bracket==0 && bk[j]==';')
                    {
                          for(;k<=j;k++)
                          {
                            System.out.print(bk[k]);
                          }
                          System.out.println();
                    }
                  }

                }
            }
            else if(bk[i+18]==' ')
            {
              
            }
        }*/
        else if(bk[i]=='f' && bk[i+1]=='o' && bk[i+2]=='r')
        { //System.out.print("working da 7");
            if(bk[i+3]==' ' || bk[i+3]=='(')
            {
               
              if(bk[i+3]==' ')
              {
                int k=i;
                  for(;end==0 && k <(st.length());k++)
                  {
                    //System.out.print("working da 7");
                    if(bk[k]=='(')
                    {
                     j=i+4;
                     for(;j<(st.length()) && end==0;j++)
                     {
                      if(bk[j]=='(')
                      {
                        //System.out.print("working da 7 brackopen");
                        bracket++;
                      }
                      else if(bk[j]==')')
                      {
                       // System.out.print("working da 7 brackclose");
                        bracket--;
                      }
                      else if(bk[j]==';')
                      {
                       // System.out.print("working da 7 termi");
                        terminater++;
                      }
                      if(terminater==2 && bracket==0)
                      {
                        //System.out.print("working da 7");
                        terminater=0;
                        for(;k<=j;k++)
                        {
                          if(indic==0)
                          {
                            System.out.print("for"+bk[k]);
                            indic=1;
                          }
                          else{
                          System.out.print(bk[k]);
                          }
                        }
                        end=1;
                        indic=0;
                      }
                     }
                     i=j--;
                    }
                  }
                  end=0;
              }
              else if(bk[i+3]=='(')
              {
                System.out.print("working da 70");
                int k =i;
                bracket++;
                j=i+4;
                for(;j<(st.length()) && end==0;j++)
                {
                  if(bk[j]=='(')
                  {
                    bracket++;
                  }
                  else if(bk[j]==')')
                  {
                    bracket--;
                  }
                  else if(bk[j]==';')
                  {
                    terminater++;
                  }
                  if(terminater==2 && bracket==0)
                  {
                    terminater=0;
                    for(;k<=j;k++)
                    {
                      System.out.print(bk[k]);
                    }
                    end=1;
                  }
                }
                i=j--;
                end=0;
              }
              /*int k=i;
              for(j = i+4;j<(st.length());j++)
             {
             if(bk[j]=='(')
             {
              
              bracket++;
              for(;j<(st.length());j++)
              {
               if(terminater!=2 && bracket!=0)
               {
                 if(bk[j]=='(')
                 {

                   bracket++;
                 }
                 else if(bk[j]==')')
                 {     
                   bracket--;
                 }
                 else if(bk[j]==';')
                 {
                     terminater++;
                 }
               }
               else
               {
                 
                   terminater=0;
                   bracket=0;
                     int p = j--;
                     for(;k<=p;k++)
                     {  
                       System.out.print(bk[k]);
                     }
                     System.out.println(); 
                 }
               
              }
              i=j
             }
             }
            }*/
            }
        }
       /* else if(bk[i]=='d' && bk[i+1]=='o' )
        {
            if(bk[i+2]==' ')
            {
              i=i+2;
            }
            else if(bk[i+2]=='{')
            {
              System.out.println(bk[i+2]);
              i=i+2;
            }
           else
           {
            i=i+2;
           }
        }*/
       /*else if(bk[i]=='w' && bk[i+1]=='h' && bk[i+2]=='i' && bk[i+3]=='l' && bk[i+4]=='e' && bk[i+5]=='(')
        {
          int k =i;
          for(j=i+5;j<(st.length());j++)
          {
            if(bk[j]=='{')
               {
                  int p = j;
                  for(;k<=p;k++)
                  {
                    System.out.print(bk[k]);
                  }
                 System.out.println();
                 
               }
          }
          i=j;
        }*/
        else if(bk[i] =='v' && bk[i+1] =='o' && bk[i+2] =='i' && bk[i+3]=='i' && bk[i+4]=='d' && bk[i+5]==' ')
        {
          //System.out.print("working da 8");
          int k =i;
          for(j=i+5;j<(st.length());j++)
          {
            if(bk[j]=='{')
               {
                  int p = j;
                  for(;k<=p;k++)
                  {
                    System.out.print(bk[k]);
                  }
                 System.out.print("\n");
                 
               }
          }
          i=j--; 
        }
        else if(bk[i] =='f' && bk[i+1] =='l' && bk[i+2] =='o' && bk[i+3]=='a' && bk[i+4]=='t' && bk[i+5]==' ')
        { //System.out.print("working da 9");
          int k =i;
           for(j = i+5;j<(st.length());j++)
           {
             if(bk[j]==';')
             {
               int p = j;
               for(;k<=p;k++)
               {
                 System.out.print(bk[k]);
               }
               System.out.println();
               
             }
             else if(bk[j]=='{')
             {
              int p = j;
              for(;k<=p ;k++)
              {
                System.out.print(bk[k]);
              }
              System.out.println();
              
             }
             else if(bk[j]=='}')
             {
               System.out.println("}");
             }
           }
           i = j--;
        }
        else if(bk[i]=='}')
        {// System.out.print("working da 10");
          System.out.println(bk[i]);  
        }
        else if(bk[i]=='@' && bk[i+1]=='O' && bk[i+2]=='v' && bk[i+3]=='e' && bk[i+4]=='r' && bk[i+5]=='r'  && bk[i+6]=='i' &&  bk[i+7]=='d' && bk[i+8]=='e')
        { //System.out.print("working da 11");
          int k =i+8;
          int p=i;
          for(;p<=k;p++)
          {
            System.out.print(bk[p]);
          }
          System.out.println();
          i=p--;
        }
        else if(bk[i]=='p' && bk[i+1]=='r'&& bk[i+2]=='i' && bk[i+3]=='v' && bk[i+4]=='a' && bk[i+5]=='t' && bk[i+6]=='e' && bk[i+7]==' ')
        { //System.out.print("working da 12");
          int k =i+7;
          int p=i;
          for(;p<=k;p++)
          {
            System.out.print(bk[p]);
          }
          i=p--;
        }
        else
        { //System.out.print("working da 13");
          System.out.print(bk[i]);
        }
     }
     
  }
 }
}