

public class recursion3 {
    // Advanced 

    //print all the permutation of a string 
    // public static void printPermutation(String str, int idx, String perm) {
    //     if(str.length() == 0){
    //         System.out.println(perm);
    //         return;
    //     }

    //     for(int i = 0; i<str.length(); i++){
    //         char currChar = str.charAt(i);
    //         String newStr = str.substring(0, i) + str.substring(i+1);
    //         printPermutation(newStr, idx+1, perm+currChar);
    //     }
        
    // }


    // count path maze

    public static int coutnPath(int i, int j, int m, int n){
        if(i == m-1 || j == n-1) {
            return 1;
        }

        return coutnPath(i +1, j, m, n) + coutnPath(i, j+1, m, n);
    }


    public static void main(String[] args) {

        //print all permutations
        // String str = "abc";
        // printPermutation(str, 0, "");


        // count path maze
        int m = 4;
        int n = 5;
        System.out.println(coutnPath(0, 0, m, n));

    }
}
