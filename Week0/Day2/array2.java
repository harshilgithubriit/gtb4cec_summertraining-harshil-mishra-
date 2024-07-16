//  package Week0.Day1;

// public class pattern {

//     public static void main(String[] args) {
//         /*
//          * int n;
        //  * Scanner sc = new Scanner (System.in);
        //  * System.out.println("enter the number of elements:");
        //  * n = sc.nextInt();
        //  * 
        //  * for( int i=0; i<n;i++){
        //  * System.out.print(" *" + " ");
        //  */
        /*
         * /int n =5;
         * for(int i= 1; i <n; i++){
         * for (int j= 1; j <n; j++){
         * System.out.print("*");
         * }
         * System.out. println("*");
         */
        // int n = 5;
        /*
         * for(int i=0; i<n;i++){
         * System.out .print( "*" +"");
         * for (int j=1; j<=i; j++);{
         * System.out.println("*");
         */
        // for (int i = 1; i < n; i++) {
        // for (int k= 1; k<=(n-i); k++){
        // System.out.print(" ");
        // }
        // for (int j = 1; j<=i; j++){
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // }
        // double triangle q9
        // for (int i = 1; i <= n; i++) {
        // for (int k = 0; k < (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j1 = 1; j1 < i; j1++) {
        // System.out.print("* ");
        // }
        // for (int j2 = 1; j2 < i - 1; j2++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int k= 0; k< (n-i); k++) {
        // System.out.print("*");
        // }
        // for (int j= 1; j< i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }//
        // }

        // SQUARE STAR PATTERN

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("*");
        // }
        // // System.out.println();
        // }
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }
        // For both right FACING TRIANGLE AND INVERTED
        // TRIANGLE
        // for(int i=1;i<=4;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for( int i=1;i<=4;i++){
        // for(int j=4;j>=i;j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }
        // FOR LEFT FACING TRIANGLE
        // for (int i = 1; i <= n; i++) {
        // for (int k = 0; k < (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // System.out.println();
        // }

        // FOR INVERTED LEFT FACING TRIANGLE
        // for (int i = 1; i <=5; i++) {
        // for (int k = 1; k <= i; k++) {
        // System.out.print(" ");

        // }
        // for (int j = 5; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }
        // Q5
        //
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {

        // if (i >= 2 && j >= 2 && i <= 4 && j <= 4) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }

        // }
        // System.out.println();

        // }
        // }
        // Q6 Hollow Square printing
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if (i == 1 || j == 1 || i == 4 || j == 4)
        // System.out.print("x");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
        // }
        // Q8 X printing
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == j || (i + j) == (n + 1)) {
        // System.out.print("*");

        // } else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
        // }
        // 888// Q9 pyramid
        // int px = n;
        // int py = n;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j < n * 2; j++) {
        // if (j >= px && j <= py) {
        // System.out.print("*");
        // } else
        // System.out.print(" ");
        // }
        // px--;
        // py++;
        // System.out.println();
        // }

        // }
        // int px = 1;
        // int py = n * 2 - 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j < n * 2; j++) {
        // if (j >= px && j <= py) {
        // System.out.print("*");
        // } else
        // System.out.print(" ");
        // }
        // px++;
        // py--;
        // System.out.println();
        // }
        // }
        // Q10
//         for (int i = n; i >= 1; i--) {
//             for (int k = 0; k < (n - i); k++) {
//                 System.out.print(" ! ");
//             }
//             for (int j1 = 1; j1 < i; j1++) {
//                 System.out.print(" * ");
//             }
//             for (int j2 = 1; j2 < i-1; j2++)
//                 System.out.print(" * ");
//             System.out.println();
//         }

//         System.out.println();
// }
        


// array day 2 qstns 
package Week0.Day1;
import java.util.scanner;
public class array2{
    public static int sum(int arr[]){
        int sum = 0;
        for (sum i=0; i,arr.length;i++){
            sum = sum + arr[i]{
                sum+=arr[i];
                }
                return sum;
            }
        } public static void main(String[]args){

        }
    }
}
        

    

}