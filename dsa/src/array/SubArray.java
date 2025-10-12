package array;

import java.util.*;

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

    private static List<List<Integer>> getSubArray2(int[] arr) {
        List<List<Integer>> subArrays = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            List<Integer> subArray = new ArrayList<>();

            for (int end = start; end < arr.length; end++) {
                subArray.add(arr[end]);
                // Add a *copy* of the current subarray to the list
                subArrays.add(new ArrayList<>(subArray));
            }
        }

        return subArrays;
    }
    // brute force
    private static int longestSubArraySum(int[] arr , int k) {
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int curSum  = 0;
            List<Integer> subArray = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                curSum += arr[j];
                subArray.add(arr[j]);
                System.out.print(new ArrayList<>(subArray));
                if (curSum <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }else {
                    break;
                }
            }
            System.out.println();
        }
        return maxLen;
    }


    private static  int getSubStringWithoutRepeatingChar(String word){
        //abcaddcdjk

       int ans = 0; //--3, 3->4,3,2,1,0, 1,2,3,4
       Set<Character> set = new HashSet<>();
       int l = 0;
       for(int i = 0; i < word.length(); i++){
           char c = word.charAt(i);
           //when the condition is violated
           while(set.contains(c)){
               set.remove(word.charAt(l));
               l++;
           }
           ans = Math.max(ans, (i-l)+1);
           set.add(c);
       }


       return ans;
    }


    private static int getLongSubStrWithAtmostOneZero(String s){
        int ans = 0;
        int  l = 0;
        int zeroCount = 0;

        for(int r = 0; r < s.length(); r++){
            if(s.charAt(r) == '0'){
                zeroCount++;
            }
            while(zeroCount > 1) {
                if (s.charAt(l) == '0') {
                    zeroCount--;
                }
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }

        return ans;
    }


    private static  boolean[] getQuery (int nums[], int query[][], int k){
         boolean[] ans = new boolean[query.length];
         int [] pfSum = new int[nums.length];
         pfSum[0] = nums[0];
         for(int i = 1; i < nums.length; i++){
             pfSum[i] = pfSum[i-1] + nums[i];
         }
         int i = 0;
         for(int [] q : query){
             int start = q[0];
             int end = q[1];
             int curSum =  pfSum[end] - pfSum[start] + nums[start];
             if(curSum < k) {
                 ans[i] = true;
             }
             i++;

         }
         return ans;
    }


//    private static int  getMaxPoint(int [] arr, int k){
//
//        int lSum = 0;
//        int rSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//
//        int l = 0;
//
//        int r = arr.length-1;
//
//
//
//
//
//
//    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String word = "abcaddcdjk";
        int [] nums = {1, 6, 3, 2, 7, 2};
        int [][] queries = {{0, 3}, {2, 5}, {2, 4}};


        //System.out.println(getSubArray2(arr));
       // System.out.println(longestSubArraySum(arr, 10));
       // System.out.println(getSubStringWithoutRepeatingChar(word));
       // System.out.println(getLongSubStrWithAtmostOneZero("111010011") );
        System.out.println(Arrays.toString(getQuery(nums, queries, 13)));
    }

}
