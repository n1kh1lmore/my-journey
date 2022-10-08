import java.util.HashSet;
public class recursion2 {
    // Tower of hanoi
    // public static void towerOfHanoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    // return;
    // }
    // // transfer top n-1 from src to helper using dest as 'helper'
    // towerOfHanoi(n - 1, src, dest, helper);
    // // transfer nth from src to dest
    // System.out.println("transfer disk " + n + " from " + src + " to " + helper);
    // // transfer n-1 from helper to dest using src as 'helper'
    // towerOfHanoi(n - 1, helper, src, dest);
    // }

    // String in reverse

    // public static String revString(String str) {
    // if (str.length() == 1) {
    // return str;
    // }
    // char currChar = str.charAt(0);
    // String nextString = revString(str.substring(1));
    // return nextString + currChar;
    // }

    // first and last occurrence of an element
    // public static int first = -1;
    // public static int last = -1;

    // public static void getIndices(String str, char el, int idx) {
    // if (idx == str.length()) {
    // return;
    // }
    // if (str.charAt(idx) == el) {
    // if (first == -1) {
    // first = idx;
    // } else {
    // last = idx;
    // }
    // }
    // getIndices(str, el, idx + 1);
    // }

    // sorted array
    // public static boolean checkIfIncreasing(int arr[], int idx) {

    // if (idx == arr.length - 1) {
    // return true;
    // }
    // if (!checkIfIncreasing(arr, idx + 1)) {
    // return false;
    // }
    // return arr[idx] < arr[idx + 1];
    // }

    // Move all ‘x’ to the end of the string.
    // to add all 'x' to the end of the string
    // public static String addX(int count) {
    // String newStr = "x";
    // for (int i = 1; i < count; i++) {
    // newStr += 'x';
    // }
    // return newStr;
    // }

    //
    // public static String moveAllX(String str, int idx, int count) {
    // if (idx == str.length()) {
    // return addX(count);
    // }
    // if (str.charAt(idx) == 'x') {

    // return moveAllX(str, idx + 1, count + 1);
    // } else {
    // String nextStr = moveAllX(str, idx + 1, count);
    // return str.charAt(idx) + nextStr;
    // }
    // }

    // Remove duplicates in a string.
    // public static String removeDuplicates(String str, int idx, boolean present[])
    // {
    // if(idx == str.length()){
    // return "";

    // }
    // char curr = str.charAt(idx);
    // if(present[curr-'a']) {
    // return removeDuplicates(str, idx+1, present);
    // } else {
    // present[curr-'a'] = true;
    // return curr + removeDuplicates(str, idx+1, present);
    // }
    // }

    // Print all subsequences of string
    // public static void printSubseq(String str, int idx, String res) {
    // if (idx == str.length()) {
    // System.out.println(res);
    // return;
    // }
    // // choose
    // printSubseq(str, idx + 1, res + str.charAt(idx));
    // // don't choose
    // printSubseq(str, idx + 1, res);
    // }

    // Print all unique subsequences of a string

    public static void unikSubseq(String str, int idx, String res, HashSet<String> allSubseq) {
        if (idx == str.length()) {
            if (allSubseq.contains(res)) {
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        // choose
        unikSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
        //don't choose
        unikSubseq(str, idx+1, res, allSubseq);
    }

    public static void main(String[] args) {
        // Tower og Hanoi
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

        // String in reverse
        // String str = "abcd";
        // String reversed = revString(str);
        // System.out.println(reversed);

        // first and last occurrence of an element

        // String str = "tabcdfghijakkk";
        // char el = 'a';
        // getIndices(str, el, 0);
        // System.out.println("First occurence : " + first);
        // System.out.println("Last occurence : " + last);

        // sorted array
        // int arr1[] = { 1, 2, 3, 4, 5 };
        // int arr2[] = { 1, 6, 3, 4, 5 };
        // if (checkIfIncreasing(arr1, 0)) {
        // System.out.println("Strictly Increasing");
        // } else {
        // System.out.println("NOT Strictly Increasing");
        // }

        // Move all ‘x’ to the end of the string.
        // String str = "abcdefxghxixjxxxk";
        // int count = 0;
        // String newStr = moveAllX(str, 0, count);
        // System.out.println(newStr);

        // Remove duplicates in a string.
        // String str = "abcadbcefghabi";
        // boolean present[] = new boolean[str.length()];
        // System.out.println(removeDuplicates(str, 0, present));

        // Print all subsequences of string
        // String str1 = "abc";
        // // String str2 = "aaa";
        // printSubseq(str1, 0, "");

            //print all unique subsequences
            String str1 = "abc";
            String str2 = "aaa";
            HashSet<String> allSubSet = new HashSet<>();
            unikSubseq(str2, 0, "", allSubSet);
    }
    
}
