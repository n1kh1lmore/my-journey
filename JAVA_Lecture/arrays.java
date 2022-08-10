import java.util.*;

public class arrays {

    public static void main(String args[]) {
        
        //mathod 1
        Scanner s = new Scanner(System.in);
        // int[] marks = new int[3];
        // marks[0] = 99;
        // marks[1] = 90;
        // marks[2] = 88;
        // System.out.println(marks[1] + marks[2] + marks[0]);

        //method 2
        // int [] marks = {98, 97, 95};
        // System.out.println(marks[2]);

        //priting an array

        // int size = s.nextInt();
        // int n[] = new int[size];


        // for(int i=0;i<size; i++){
        //     n[i] = s.nextInt();
        // }

        // //printing
        // for(int i=0;i<n.length;i++){
        //     System.out.print(n[i]+" ");
        // }

        // array of names and printing

        int size = s.nextInt();
        String names[] = new String[size];

        //input
        for(int i=0; i<size; i++){
            names[i] = s.next();

        }
        //output
        for(int i=0; i<names.length; i++){
            // System.out.println((i+1) + names[i]);
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }

        s.close();
    }
}
