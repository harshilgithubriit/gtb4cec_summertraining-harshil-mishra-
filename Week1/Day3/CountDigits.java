// package Week1.Day3;

// import java.util.*;

//public class Arrays 

//     // Create a function to reverse an Array
//     /**
//      * @param arr
//      * @param key
//      * @return
//      */
//     public static int searchArr(int[] arr, int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 System.out.print("Key found at location ");
//                 return i;
//             }
//         }

//         System.out.print("Key not found");
//         return -1;
//     }

//     public static void main(String args[]) {
//         int[] arr = new int[10];
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter key ");
//         int key = sc.nextInt();
//         sc.close();
//         System.out.println(searchArr(arr, key));

//     }
// }
//  package Week1.Day3;
//  public class Arrays {
//      public static void main(String[]args){
//          int a[] = new int [4];
//          a[0]=1;
//          a[1]=2;
//          for(i=0; i<3;i++){
//              System.out.println(a[i]);

//          }

//      } 
//  }
// package Week1.Day3;

// public class Arrays {
//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5};
//         for (int i : array) {
//             System.out.println(i);
//         }
//     }
// }

// package Week1.Day3;

// public class Arrays {
//     public static void main(String[] args) {
//         // Initialize an array with 30 values
//         int[] array = new int[30];
//         for (int i = 0; i < array.length; i++) {
//             array[i] = i + 1; // Assign values from 1 to 30
//         }

//         // Print all the values in the array
//         for (int i : array) {
//             System.out.println(i);
//         }
//     }
// }
// package Week1.Day3;
// public class Arrays {

// public static void main(String[] args) {
//     // Example array with 30 elements
//     int[] exampleArray = new int[30];
//     for (int i = 0; i < exampleArray.length; i++) {
//         exampleArray[i] = i + 1; // Fill array with values 1 to 30
//     }

//     // Call the displayArray method
//     System.out.println(exampleArray);
// }
// }
// [to display array] 
// package Week1.Day3;
// import java.util.Scanner;

// public class CountDigits {
    // public static void displayArray(int[] array) {
    // for (int i = 0; i < array.length; i++) {
    // System.out.print(array[i] + " ");

    // }
    // System.out.println();
    // }

    // public static void main(String[] args) {
    // int[] exampleArray = new int[30];
    // for (int i = 0; i < exampleArray.length; i++) {
    // exampleArray[i] = i + 1;
    // }
    // displayArray(exampleArray);
    // }

    // [to check if a no is prime or not]
    // public static void displayArray(int[] array) {
    // for (int i = 0; i < array.length; i++) {
    // System.out.print(array[i] + " ");
    // }
    // System.out.println();
    // }

    // public static boolean isprime(int n) {
    // if (n <= 1) {
    // return false;
    // }
    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;

    // }

    // public static void main(String[] args) {
    // int[] exampleArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    // displayArray(exampleArray);
    // for (int i : exampleArray) {
    // if (isprime(i)) {
    // System.out.println(i + " is prime");
    // } else {
    // System.out.println(i + " is not prime");
    // }
    // }
    // }
    // Method to reverse an array
    // public static void displayArray(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    //     System.out.println();
    // }

    // public static void reverseArray(int[] array) {
    //     int start = 0;
    //     int end = array.length - 1;
    //     while (start < end) {
    //         int temp = array[start];
    //         array[start] = array[end];
    //         array[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] exampleArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    //     System.out.print("Original array:");
    //     displayArray(exampleArray);

    //     reverseArray(exampleArray);
    //     System.out.print("Reversed array:");
    //     displayArray(exampleArray);

    // }
    //(Display an array to count digits)
    package Week1.Day3;
    import java.util.Scanner;
    public class CountDigits {
     public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            }
            System.out.println();
            }
            public static void countDigits(int[]array) {
                int count = 0;

}
