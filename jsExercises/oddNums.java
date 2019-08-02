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

//return list of odd nums b/t two numbers

public class Solution {

    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> odds = new ArrayList<>(r-l);
        for(int i = l; i<=r; i++){
            if(i%2==1){
                odds.add(i);
            }
        }
        return odds;
    }