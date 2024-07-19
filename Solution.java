/* Minimum Difference Between Largest and Smallest value in Three Move.
You are given an integer array nums.
In one move, you can choose one element of nums and change it to any value.
Return the minimum difference between the largest and smallest value of nums after performing at most three moves.
Example 1:
Input: nums = [5,3,2,4]
Output: 0
Explanation: We can make at most 3 moves.
In the first move, change 2 to 3. nums becomes [5,3,3,4].
In the second move, change 4 to 3. nums becomes [5,3,3,3].
In the third move, change 5 to 3. nums becomes [3,3,3,3].
After performing 3 moves, the difference between the minimum and maximum is 3 - 3 = 0 */

package Practice_Que;

import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length, min =Integer.MAX_VALUE;
        if(n <= 3)
        return 0;
        for(int i=1; i<=4; i++){
            min = Math.min(min, Math.abs(nums[n-i] - nums[4-i]));
        }
        return min;
    }
}

//BINARY SEARCH
/*public class BinarySearch {
    public static int BinarySearch(int arr[], int key){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
        
            if(arr[mid]==key){
                return mid;
            }if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key =7;
        System.out.println(BinarySearch(arr, key));
    }
}*/




/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
Example 1:
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> minRows = new HashSet<>();
        HashSet<Integer> maxCols = new HashSet<>();

        // Find the minimum value in each row
        for (int i = 0; i < rows; i++) {
            int minVal = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            // Store the minimum in set
            minRows.add(minVal);
        }

        // Find the maximum value in each column
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < cols; i++) {
            int maxVal = matrix[0][i];
            for (int j = 0; j < rows; j++) {
                maxVal = Math.max(maxVal, matrix[j][i]);
            }
            if (minRows.contains(maxVal)) {
                res.add(maxVal);
            }
            // Store the maximum in set
            maxCols.add(maxVal);
        }

        return res;
    }
}

 */
    


