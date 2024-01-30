package Avi_Training;
import java.util.Scanner;
public class Star_Pattern
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num of rows");
    int num = sc.nextInt();
    for(int i = 0;i< num ; i++)
    {
        for(int k = i ; k< num - 1 ; k ++ )
        {
            System.out.print(" ");
        }
        for(int j = 0 ;j<(i*2) + 1 ;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
//    for(int i = num ; i>=0 ;i--)
//    {
//        for(int k = 0; k<num-i;k++){
//            System.out.print(" ");
//        }
//        for(int j = (i*2)+1 ; j>0;j--)
//        {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
        for(int i = num ; i>= 0; i--)
        {
            for(int k = 0 ; k<5-i ; k++)
            {
                System.out.print(" ");
            }
            for( int j = i*2+1 ;j>0 ; j--){
                System.out.print("*");
            }
            System.out.println( );

        }

    }
}


