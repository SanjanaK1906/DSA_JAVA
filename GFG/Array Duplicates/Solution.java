
// Examples:

// Input: arr[] = [2, 3, 1, 2, 3]
// Output: [2, 3] 
// Explanation: 2 and 3 occur more than once in the given array.
// Input: arr[] = [0, 3, 1, 2] 
// Output: [] 
// Explanation: There is no repeating element in the array, so the output is empty.
// Input: arr[] = [2]
// Output: [] 
// Explanation: There is single element in the array. Therefore output is empty.

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> li = new ArrayList<>();
        HashSet<Integer> h= new HashSet();
        
        //int flag =0;
        for(int x:arr){
            if(h.contains(x)){
                //flag=1;
                li.add(x);
                continue;
            }
            h.add(x);
        }
        return li;
    }
}
