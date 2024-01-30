package Avi_Training;
 class pattern3HW {
     public static void main(String[] args) {
         int n = 5;
         int i = 1;
         while (i <= n) {
             int space = 1;
             while (space <= n - i) {
                 System.out.print(" ");
                 space = space + 1;
             }

             int k = i;
             int j = 1;
             while (j <= i) {
                 System.out.print(k);
                 k = k + 1;
                 j = j + 1;
             }
             int dcr = k - 2;
             while (dcr >= i) {
                 System.out.print(dcr);
                 dcr = dcr - 1;
             }
             System.out.println();
             i = i + 1;
         }
     }
 }

