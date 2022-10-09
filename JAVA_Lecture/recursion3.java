
public class recursion3 {
    // Advanced

    // print all the permutation of a string
    // public static void printPermutation(String str, int idx, String perm) {
    // if(str.length() == 0){
    // System.out.println(perm);
    // return;
    // }

    // for(int i = 0; i<str.length(); i++){
    // char currChar = str.charAt(i);
    // String newStr = str.substring(0, i) + str.substring(i+1);
    // printPermutation(newStr, idx+1, perm+currChar);
    // }

    // }

    // count path maze

    // public static int coutnPath(int i, int j, int m, int n){
    // if(i == m-1 || j == n-1) {
    // return 1;
    // }

    // return coutnPath(i +1, j, m, n) + coutnPath(i, j+1, m, n);
    // }



    // tiling problem

    // public static int placeTiles(int n, int m) {
    //     if(n<m){
    //         return 1;

    //     }else if(n == m){
    //         return 2;
    //     }
    //     return placeTiles(n-1, m) + placeTiles(n-m, m);      
    // }


    //Friends pairing problem
    public static int  pairFriends(int n) {
    if(n <= 1){
        return 1;

    }   
    return pairFriends(n-1) + (n-1) * pairFriends(n-2); 
    }

    public static void main(String[] args) {

        // print all permutations
        // String str = "abc";
        // printPermutation(str, 0, "");

        // count path maze
        // int m = 4;
        // int n = 5;
        // System.out.println(coutnPath(0, 0, m, n));


        //tiling problem
        // int n = 4, m = 4;
        // System.out.println(placeTiles(n, m));



        //friends pairing problem
        int n = 3;
        System.out.println(pairFriends(n));
    }
}
