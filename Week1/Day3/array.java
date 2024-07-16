package Week1.Day3;

public class array {
    public static void main(String[] args) {
//         public class ReversePartOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 2;
        int end = 6;
        
        System.out.println("Original array: ");
        printArray(array);
        
        reverse(array, start, end);
        
        System.out.println("Array after reversing from index " + start + " to " + end + ": ");
        printArray(array);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
}