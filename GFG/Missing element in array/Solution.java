//You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

//Examples:

//Input: arr[] = [1, 2, 3, 5]
//Output: 4
//Explanation: All the numbers from 1 to 5 are present except 4.
//Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//Output: 6
//Explanation: All the numbers from 1 to 8 are present except 6.
//Input: arr[] = [1]
//Output: 2
//Explanation: Only 1 is present so the missing element is 2

// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        int len= arr.length;
        Arrays.sort(arr);
        int n=0;
            for(int i=1; i<=len;i++){
            if(i!=arr[i-1]){
                n= i;
                break;
            }else{
                n=len+1;
            }
        }
        
        return n;
    }
}
