package Week1.Day5;

import java.util.Arrays;
import java.util.Collection;

public class min_array {
    // function to find the min element in an array
    static int minArr(int[]arr){
            int min=0;
            for (int i=0;i<arr.length;i++){
                if (arr[min]> arr[i]){
                    min =i;
                }
            }
                    return min;
                
                }
                public static void main(String[]args){
                    int arr[]={11,23,3,4,5};
                        System.out.println(minArr(arr));
                    }
                }
//  to find the min value in the part of array
public static voidf main( String args[]){
    int arr[]={11,23,3,4,5};
}

