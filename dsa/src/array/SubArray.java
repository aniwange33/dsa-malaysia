package array;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

    //maths
    // n*(n+1)/2
    //where n is the length of the array
    //example: [1,2,3,4,5] -> 15
    // definitions:
    // 1. subarray of an array is a contiguous subsequence of the array.
    //brute force
    // 1. check every subarray
    // 2. time complexity O(n^3)
    private static List<List<Integer>> getSubArray(int[] arr){
        // brute force
        List<List<Integer>> subArrays =  new ArrayList<>();

        for(int start=0; start<arr.length; start++){

            for(int end=start; end< arr.length; end++){
                List<Integer> subArray = new ArrayList<>();

                for(int k=start; k<=end; k++){
                    subArray.add(arr[k]);
                }
                subArrays.add(subArray);
            }
        }
        return subArrays;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(getSubArray(arr));
    }

}
