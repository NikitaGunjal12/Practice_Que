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

/*
 Example 3:find valid matrix given row and column sums.
Input: rowSum = [3,8], colSum = [4,7]
Output: [[3,0],
         [1,7]]

    class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int r=0;
        int c=0;
        int resMatrix[][] = new int [rows][cols];
        while(r<rows && c<cols){
            int minVal = Math.min(rowSum[r],colSum[c]);
            resMatrix[r][c] = minVal;
            rowSum[r]-=minVal;
            colSum[c]-=minVal;
            if(rowSum[r]==0){
                r++;

            }else{
                c++;
            }
        }
        return resMatrix;
        
    }
}
*/

/*Example 4: Delete Node and Return Forest
 Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
Output: [[1,2,null,4],[6],[7]]
Example 2:

Input: root = [1,2,4,null,3], to_delete = [3]
Output: [[1,2,4]]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 
class Solution {
    public TreeNode dfs(TreeNode root, HashSet<Integer> to_delete, List<TreeNode> forest){
        if(root==null){
            return root;
        }
        root.left = dfs(root.left, to_delete,forest);
        root.right = dfs(root.right, to_delete,forest);
        //process the root /node
        if(!to_delete.contains(root.val)){
            return root;
        }
        //delete this node
        if(root.left!=null){
            forest.add(root.left);
        }
        if(root.right!=null){
            forest.add(root.right);
        }
        root.left=null;
        root.right=null;
        return null;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for(int to_be_del : to_delete){
            set.add(to_be_del);
        }
        List<TreeNode> forest = new ArrayList<>();
        root = dfs(root,set,forest);
        if(root!=null){
            forest.add(root);
        }
        return forest;
     }
}
 */
    


