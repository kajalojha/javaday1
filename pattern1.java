package Avi_Training;

public class pattern1
{
    public static void main(String[] args)
    {
        //A
        //BC
        //CDE
        //DEFG
       // char ch = 'A';
     //   int k;
//        for(int i = 0 ; i<=4 ;i++)
//        {
//            k=i;
//            for(int j = 1; j<=i ; j++,k++)
//            {
//                System.out.print(  (char)(k+64));
//              //  ch++;
//
//            }
//            System.out.println();
//        }
        char ch = 'A';
        for(int i = 1 ; i<=4 ; i++)
        {
            for(int j = 1 ; j<=i ;j++)
            {
              System.out.print(ch + " ");
            //  System.out.println();
           //  ch++;
            }
            ch++;
            System.out.println();

        }


    }
}
