package Avi_Training;

public class Pattern
{
    public static void main(String[] args)
    {
        //1234
        //1234
        //1234
        //1234
 System.out.println("first pattern");
        int i, j ;
        for(i = 1 ; i<=4 ; i++){
            for(j =1 ;j<=i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Second pattern");
        for(i = 1 ;i <= 4 ;i++){
            for(j = 1 ; j<=4 ;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Third pattern");
        for(i = 1 ;i<=4 ;i++)
        {
            for(j=1 ; j <=i ;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
