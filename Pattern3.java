package Avi_Training;

public class Pattern3
{
    public static void main(String [] args){
        int n = 5;

    for(int i = 0 ; i<=5;i++)
    {
        char ch = (char)('A'+1);

        for(int j = 1 ;j<=i ;j++)
        {
            System.out.print(ch+ " ");
             ch = (char) (ch+1);

        }
        System.out.println();
 }
}
}

