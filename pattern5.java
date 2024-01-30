package Avi_Training;
import java.util.Scanner;
public class pattern5
{

        //E
        //DE
        //CDE
        //BCDE
        //ABCDE
        public static void main(String abc[])
        {
            int n = 5;
            int i , j ;

            for( i=0;i<=n;i++)
            {
                char ch = (char)('A' + n-i);
                for( j=1;j<=i;j++)
                {
                    System.out.print(ch);
                    ch = (char)(ch+1);

                }
                System.out.println();
            }
        }
        }





