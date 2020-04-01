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
    int report=0;
    int start=0;
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
       //System.out.print("working da 1");
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
          i=k;
        }
       else if( bk[i]=='\"' && bk[i-1]!='\\')
        {
          //System.out.print("working");
          start=i;
          indic=0;
          end=i;
          quotes=0;
          int k=i;
          for(;k<(st.length()) && indic==0;k++)
          {
            if(bk[k]=='\"' && bk[k-1]!='\\')
            {
              quotes++;
              end=k;
            }
            if(quotes==2)
            {
              indic=1;
              for(;start<=end;start++)
              {
                System.out.print(bk[start]);
              }

              start--;
             
            }
          }
          i=end;
          //System.out.print(i);
          indic=0;
          quotes=0;
          start=0;
          end=0;
        }
        else if(bk[i]==';')
        {
          //System.out.print("working da 3");
           System.out.println(";");
        }
      else if(bk[i]=='i' && bk[i+1]=='m' && bk[i+2]=='p' && bk[i+3]=='o'&& bk[i+4]=='r'&& bk[i+5]=='t' && bk[i+6]==' ')
      {
        //System.out.print("working da 4");
        int k =i;
        indic=0;
        for(j=i+6;j<(st.length());j++)
        {
          
          if(bk[j]==';')
             {
               int p = j;
               for(;k<=p && bk[k]!=';';k++)
               {
                 System.out.print(bk[k]);
               }
               if(indic==0)
               {
              System.out.print(";");
              System.out.println();
              indic=1;
               }
             }
        }
        i=k;
        indic=0;
       // System.out.print(i);
      }
     /* else if(bk[i]=='S' && bk[i+1]=='t' && bk[i+2]=='r' && bk[i+3]=='i'&& bk[i+4]=='n'&& bk[i+5]=='g' && bk[i+6]==' ')
      {// System.out.print("working da 5");
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
      }*
       else if(bk[i] =='i' && bk[i+1] =='n' && bk[i+2] =='t' && bk[i+3]==' ')
        { //System.out.print("working da 6");
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
        }*/
        else if(bk[i]=='S' && bk[i+1]=='y' && bk[i+2]=='s' && bk[i+3]=='t' && bk[i+4]=='e' && bk[i+5]=='m' && bk[i+6]=='.' 
        && bk[i+7]=='o' && bk[i+8]=='u' && bk[i+9]=='t' && bk[i+10]=='.' && bk[i+11]=='p' && bk[i+12]=='r' && bk[i+13]=='i'
         && bk[i+14]=='n' && bk[i+15]=='t' && bk[i+16]=='l' && bk[i+17]=='n' )
        {
             if(bk[i+18]==' ')
             {
             i=i+18;
             for(;bk[i]==' ' && i<(st.length());i++);
             if(bk[i]=='(')
             {
             // System.out.print("working da 1");
               start= i++;
              terminater=0;
                bracket++;
                for(j=i;j<(st.length()) && report==0;j++)
                { 
                    if(bk[j]=='\"' && bk[j-1]!='\\')
                    {
                     // System.out.print("working da 2");
                        quotes++;
                    }
                    else if(bk[j]==')' || bk[j]=='(')
                    {
                      if(quotes % 2==0)
                      {
                        if(bk[j]==')')
                        {
                        //  System.out.print("working da 3");
                          bracket--;
                        }
                        else{
                          //System.out.print("working da 4");
                          bracket++;
                        }
                      }
                    }
                    else if(bk[j]==';')
                    {
                      if(quotes % 2==0)
                      {
                        //System.out.print("working da 5");
                        indic=0;
                        if(bk[j]==';')
                        {
                          terminater=1;
                          end=j;
                        }
                      }
                    }
                    if(bracket==0 && indic==0 && terminater==1 )
                    {
                      //System.out.print("working da 6");
                      report=1;
                      for(;start<=end;start++)
                      {if (indic==0)
                        {
                        System.out.print("System.out.println"+bk[start]);
                        indic=1;
                        }
                        else{
                          System.out.print(bk[start]);
                        }
                      }
                      System.out.println();
                    }
                    

                }
              }
                report=0;
                i=start-1;
                bracket=0;
                indic=0;
                terminater=0;
                quotes=0;
                start=0;
                end=0;
                //System.out.print(i);
            
             }
              else if(bk[i+18]=='(')
            {
              start=i;
              //System.out.print(i);
              terminater=0;
                bracket++;
                for(j=i+19;j<(st.length()) && report==0;j++)
                { 
                    if(bk[j]=='\"' && bk[j-1]!='\\')
                    {
                        quotes++;
                    }
                    else if(bk[j]==')' || bk[j]=='(')
                    {
                      if(quotes % 2==0)
                      {
                        if(bk[j]==')')
                        {
                          bracket--;
                        }
                        else{
                          bracket++;
                        }
                      }
                    }
                    else if(bk[j]==';')
                    {
                      if(quotes % 2==0)
                      {
                        indic=0;
                        if(bk[j]==';')
                        {
                          terminater=1;
                          end=j;
                        }
                      }
                    }
                    if(bracket==0 && indic==0 && terminater==1 )
                    {
                      report=1;
                      for(;start<=end;start++)
                      {
                        System.out.print(bk[start]);
                      }
                      System.out.println();
                    }
                    

                }
                report=0;
                i=start-1;
                bracket=0;
                indic=0;
                terminater=0;
                quotes=0;
                start=0;
                end=0;
               // System.out.print(i);
            }

        }
        else if(bk[i]=='S' && bk[i+1]=='y' && bk[i+2]=='s' && bk[i+3]=='t' && bk[i+4]=='e' && bk[i+5]=='m' && bk[i+6]=='.' 
        && bk[i+7]=='o' && bk[i+8]=='u' && bk[i+9]=='t' && bk[i+10]=='.' && bk[i+11]=='p' && bk[i+12]=='r' && bk[i+13]=='i'
         && bk[i+14]=='n' && bk[i+15]=='t' && bk[i+16]!='l' )
         {
          if(bk[i+16]==' ')
          {
          i=i+16;
          for(;bk[i]==' ' && i<(st.length());i++);
          if(bk[i]=='(')
          {
           //System.out.print("working da 1");
            start= i++;
           terminater=0;
             bracket++;
             for(j=i;j<(st.length()) && report==0;j++)
             { 
                 if(bk[j]=='\"' && bk[j-1]!='\\')
                 {
                   //System.out.print("working da 2");
                     quotes++;
                 }
                 else if(bk[j]==')' || bk[j]=='(')
                 {
                   if(quotes % 2==0)
                   {
                     if(bk[j]==')')
                     {
                      // System.out.print("working da 3");
                       bracket--;
                     }
                     else{
                       //System.out.print("working da 4");
                       bracket++;
                     }
                   }
                 }
                 else if(bk[j]==';')
                 {
                   if(quotes % 2==0)
                   {
                     //System.out.print("working da 5");
                     indic=0;
                     if(bk[j]==';')
                     {
                       terminater=1;
                       end=j;
                     }
                   }
                 }
                 if(bracket==0 && indic==0 && terminater==1 )
                 {
                   //System.out.print("working da 6");
                   report=1;
                   for(;start<=end;start++)
                   {if (indic==0)
                     {
                     System.out.print("System.out.print"+bk[start]);
                     indic=1;
                     }
                     else{
                       System.out.print(bk[start]);
                     }
                   }
                   System.out.println();
                 }
                 else if(bk[i+16]=='(')
                 {
                   start=i;
                   //System.out.print(i);
                   terminater=0;
                     bracket++;
                     for(j=i+17;j<(st.length()) && report==0;j++)
                     { 
                         if(bk[j]=='\"' && bk[j-1]!='\\')
                         {
                             quotes++;
                         }
                         else if(bk[j]==')' || bk[j]=='(')
                         {
                           if(quotes % 2==0)
                           {
                             if(bk[j]==')')
                             {
                               bracket--;
                             }
                             else{
                               bracket++;
                             }
                           }
                         }
                         else if(bk[j]==';')
                         {
                           if(quotes % 2==0)
                           {
                             indic=0;
                             if(bk[j]==';')
                             {
                               terminater=1;
                               end=j;
                             }
                           }
                         }
                         if(bracket==0 && indic==0 && terminater==1 )
                         {
                           report=1;
                           for(;start<=end;start++)
                           {
                             System.out.print(bk[start]);
                           }
                           System.out.println();
                         }
                         
     
                     }
                     report=0;
                     i=start-1;
                     bracket=0;
                     indic=0;
                     terminater=0;
                     quotes=0;
                     start=0;
                     end=0;
                    // System.out.print(i);
                 }

             }
           }
             report=0;
             i=start-1;
             bracket=0;
             indic=0;
             terminater=0;
             quotes=0;
             start=0;
             end=0;
            // System.out.print(i);
         
          }
         }
        else if(bk[i]=='f' && bk[i+1]=='o' && bk[i+2]=='r')
        { //System.out.print("working da 7");
            if(bk[i+3]==' ' || bk[i+3]=='(')
            {
               
              if(bk[i+3]==' ')
              {
                int k=i+3;
                indic=0;
                for(;k<(st.length()) && indic==0;k++)
                {
                  if(bk[k]=='(')
                  {
                    indic=1;
                    start=k;
                  }
                }
                if(indic==1)
                {
                  k=start+1;
                  indic=0;
                  bracket=0;
                  bracket++;
                  for(;k<(st.length()) && indic==0;k++)
                  {
                    if(bk[k]=='(')
                      {
                       // System.out.print("working da 7 brackopen");
                        bracket++;
                      }
                      else if(bk[k]==')')
                      {
                       // System.out.print("working da 7 brackclose");
                        bracket--;
                        end=k;
                      }
                      else if(bk[k]==';')
                      {
                        //System.out.print("working da 7 termi");
                        terminater++;
                      }
                      if(bracket==0 && terminater==2)
                      {
                        indic=1;
                        System.out.print("for");
                        for(;start<=end;start++)
                        {
                          System.out.print(bk[start]);
                        }
                        System.out.println();
                      }
                  }
                  i=start-1;
                  terminater=0;
                  bracket=0;
                  start=0;
                  end =0;
                  indic=0;
                }
              }
              else if(bk[i+3]=='(')
              {
                //System.out.print("working da 70");
                start=i;
                bracket++;
                indic=0;
                j=i+4;
                for(;j<(st.length()) && indic==0 ;j++)
                {
                  if(bk[j]=='(')
                  {
                    bracket++;
                  }
                  else if(bk[j]==')')
                  {
                    bracket--;
                    end=j;
                  }
                  else if(bk[j]==';')
                  {
                    terminater++;
                  }
                  if(terminater==2 && bracket==0)
                  {
                    
                    for(;start<=end;start++)
                    {
                      System.out.print(bk[start]);
                    }
                    System.out.println();
                    indic=1;
                  }
                }
                i=start-1;
                end=0;
                terminater=0;
                start=0;
                indic=0;
              }
          
            }
        }
       else if(bk[i]=='i' && bk[i+1]=='f')
        {
          if(bk[i+2]=='(' || bk[i+2]==' ')
          {
              if(bk[i+2]=='(')
              {
                //System.out.print("working");
              bracket=0;
              bracket++;
              indic=0;
              start=i+2;
              int k = i+3;
              for(;k<(st.length()) && indic==0;k++)
              {
                if(bk[k]=='(')
                {
                  bracket++;
                }
                else if(bk[k]==')')
                {
                  bracket--;
                  end=k;
                }
                if(bracket==0)
                {
                  indic=1;
                  System.out.print("if");
                  for(;start<=end;start++)
                  {
                    System.out.print(bk[start]);
                  }
                  System.out.println();
                }
               }
               i=start-1;
               bracket=0;
               indic=0;
               start=0;
               end=0;
               //System.out.print("working");
            }
            else if(bk[i+2]==' ')
            {
             // System.out.print("working");
              int k=i+3;
              bracket=0;
               for(;k<(st.length()) && indic==0;k++)
               {
                 if(bk[k]=='(')
                 {
                   bracket=1;
                   indic=1;
                   start=k;
                 }
               }
               if(indic==1)
               {
                 indic=0;
                 for(;k<(st.length()) && indic==0;k++)
                 {
                   if(bk[k]=='(')
                   {
                     bracket++;
                   }
                   else if(bk[k]==')')
                   {
                     bracket--;
                     end=k;
                   }
                   if(bracket==0)
                   {
                      indic=1;
                      System.out.print("if");
                      for(;start<=end;start++)
                      {
                        System.out.print(bk[start]);
                      }
                      System.out.println();
                   }
                 }
               }
               i=start-1;
               start=0;
               end=0;
               indic=0;
               bracket=0;
               terminater=0;
            }

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
       /* else if(bk[i] =='v' && bk[i+1] =='o' && bk[i+2] =='i' && bk[i+3]=='i' && bk[i+4]=='d' && bk[i+5]==' ')
        {
          //System.out.print("working da 8");
          int k =i;
          for(j=i+5;j<(st.length());j++)
          {
            if(bk[j]=='{')
               {
                 //System.out.print("working da 8");
                  int p = j;
                  for(;k<=p;k++)
                  {
                    System.out.print(bk[k]);
                  }
                 System.out.println();
                 
               }
          }
          i=j--; 
        }*/
        else if(bk[i]=='(')
        {
          //System.out.println("working da");
          start =i;
          end=i;
          int k=i+1;
          bracket=0;
          bracket++;
          for(;k<(st.length()) && report==0;k++)
          {
            if(bk[k]=='(')
            {
              bracket++;
            }
            else if(bk[k]==')')
            {
              bracket--;
              end=k;
              //System.out.println("sorry da");
            }
            if(bracket==0)
            {
              //System.out.println("sorry da");
              report=1;
              for(;start<=end;start++)
              {
                System.out.print(bk[start]);
              }
            }
          }
          /*if(start==i)
          {
            for(;start<st.length();start++)
            {
              System.out.print(bk[start]);
            }
            start=start-1;
          }*/
          i=end;
          bracket=0;
          report=0;
          start=0;
          end =0;
          
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
        { //System.out.print("working da 10");
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
       /* else if(bk[i]=='p' && bk[i+1]=='r'&& bk[i+2]=='i' && bk[i+3]=='v' && bk[i+4]=='a' && bk[i+5]=='t' && bk[i+6]=='e' && bk[i+7]==' ')
        { System.out.print("working da 12");
          int k =i+7;
          int p=i;
          for(;p<=k;p++)
          {
            System.out.print(bk[p]);
          }
          i=p--;
        }*/
        else
        {
          //System.out.print("working da 13");
          System.out.print(bk[i]);
        }
     }
     
  }
 }
}