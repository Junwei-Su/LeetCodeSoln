// Write a function that takes a string as input and returns the string reversed.
// 
// Example:
// Given s = "hello", return "olleh".
// 
// Subscribe to see which companies asked this question


public class Solution {
    public String reverseString(String s) {
        int length = s.length();
        char[] toReturn = new char[length];
        if(length==0 || length==1) return s;
        for(int index=0; index<length; index++){
            toReturn[index] = s.charAt(length-index-1);
        }
        return new String(toReturn);
    }
}