import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Declaration
        // String name = "Nikhil";

        // Taking inpute
        // String name = s.next();

        // concatenation
        String name = "Nikhil";
        // String name2 = "Nikhil";
        // String fullname = name1 + " " + name2;
        // System.out.println(fullname);

        // //print length of string
        // System.out.println(fullname.length());

        // access characters of string

        // for(int i = 0; i<fullname.length(); i++){
        // System.out.println(fullname.charAt(i));
        // }

        // comapare two strings
        // this is the correct method to compare the strings
        // if (name1.equals(name2)) {
        //     System.out.println("same string");
        // } else {
        //     System.out.println("different string");
        // }

        // // do not use fails in some cases
        // if(name1 == name2) {
        //     System.out.println("They are the same string");
        // } else {
        //     System.out.println("They are different strings");
        // }
  
        // //Gives incorrect answer here
        // if(new String("Tony") == new String("Tony")) {
        //     System.out.println("They are the same string");
        // } else {
        //     System.out.println("They are different strings");
        // }

        //substring
        System.out.println(name.substring(0, 4));

        //ParseInt Method of Integer class
        // String str = "123";
        // int n = Integer.parseInt(str);
        // System.out.println(n);

        //toString method of sting class
        int n = 123;
        String str = Integer.toString(n);
        System.out.println(str);
            


        s.close();
    }
}
