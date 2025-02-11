// Examples:

// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.
// Input: arr[] = [10, 5, 10]
// Output: 5
// Explanation: The largest element of the array is 10 and the second largest element is 5.
// Input: arr[] = [10, 10, 10]
// Output: -1
// Explanation: The largest element of the array is 10 and the second largest element does not exist.


class Solution {
    public int getSecondLargest(int[] arr) {
        int n=-1;
        Arrays.sort(arr);
        int len= arr.length;
        if(len>1){
            for(int i=len-1;i>0;i--){
                if(arr[i] > arr[i-1]){
                    n=arr[i-1];
                    break;
                } else{
                    n=-1;
                }
            }
        }
        return n;
    }
}
