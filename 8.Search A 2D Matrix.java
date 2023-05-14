class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int low=0,high=(n*m)-1;
        
        while(low<=high)
        {
            int mid=(low+(high-low)/2);
            if(matrix[mid/m][mid%m]==target)
                return true;
            if(matrix[mid/m][mid%m]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
}

/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */