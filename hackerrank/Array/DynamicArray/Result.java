// Declare a 2-dimensional array, arr, of n empty arrays. All arrays are zero indexed.
// Declare an integer, lastAnswer, and initialize it to 0.
// There are 2 types of queries, given as an array of strings for you to parse:
// Query: 1 x y
// Let idx=((x^lastAnswer)%n) .
// Append the integer y to arr[idx].
// Query: 2 x y
// Let idx=((x^lastAnswer)%n) .
// Assign the value arr[idx][y%size(arr[idx])]to lastAnswer.
//     3.Store the new value of lastAnswer to an answers array.
// Note:^  is the bitwise XOR operation. Finally, size(arr[idx]) is the number of elements in arr[idx] 
// Function Description

// Complete the dynamicArray function below.
// dynamicArray has the following parameters:
// - int n: the number of empty arrays to initialize in 
// - string queries[q]: query strings that contain 3 space-separated integers
// Returns

// int[]: the results of each type 2 query in the order they are presented
// Input Format
// The first line contains two space-separated integers,n , the size of arr  to create, and q, the number of queries, respectively.
// Each of the q  subsequent lines contains a query string,queries[i] .

// Constraints
// 1<n, q<105
// 0<x, y<109
// It is guaranteed that query type 2 will never query an empty array or index.

// SAMPLE INPUT
// 2 5
// 1 0 5
// 1 1 7
// 1 0 3
// 2 1 0
// 2 1 1
// SAMPLE OUTPUT
// 7
// 3



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
         List<List<Integer>> li = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        int lastAnswer=0, idx=0;
        
         for (int i = 0; i < n; i++) {
            li.add(new ArrayList<>());
        }
        for(List<Integer>q:queries){
            int type=q.get(0);
            int x= q.get(1);
            int y= q.get(2);
            idx=(x^lastAnswer) % n;;
            if(type==1){
                li.get(idx).add(y);
            }else if(type==2){
                if(!li.get(idx).isEmpty()){
                lastAnswer= li.get(idx).get(y % li.get(idx).size());
                res.add(lastAnswer);
            }
            } 
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
