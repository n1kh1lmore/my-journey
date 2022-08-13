import java.util.Scanner;


public class strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Java Strings are Immutable.

        // Declaration
        // String name = "Nikhil";

        // Taking inpute
        // String name = s.next();

        // concatenation
        // String name = "Nikhil";
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
        // System.out.println("same string");
        // } else {
        // System.out.println("different string");
        // }

        // // do not use fails in some cases
        // if(name1 == name2) {
        // System.out.println("They are the same string");
        // } else {
        // System.out.println("They are different strings");
        // }

        // //Gives incorrect answer here
        // if(new String("Tony") == new String("Tony")) {
        // System.out.println("They are the same string");
        // } else {
        // System.out.println("They are different strings");
        // }

        // substring
        // System.out.println(name.substring(0, 4));

        // ParseInt Method of Integer class
        // String str = "123";
        // int n = Integer.parseInt(str);
        // System.out.println(n);

        // toString method of sting class
        // int n = 123;
        // String str = Integer.toString(n);
        // System.out.println(str);

        // finding total length from input text

        // int size = s.nextInt();
        // String array[] = new String[size];
        // int totLength = 0;

        // for (int i = 0; i < size; i++) {
        // array[i] = s.next();
        // totLength += array[i].length();
        // }

        // System.out.println(totLength);

        // String str = s.next();
        // String result = "";

        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == 'e') {
        // result += 'i';
        // } else {
        // result += str.charAt(i);
        // }
        // }

        // System.out.println(result);

        // String email = s.next();
        // String userName = "";

        // for (int i = 0; i < email.length(); i++) {
        // if (email.charAt(i) == '@') {
        // break;
        // } else {
        // userName += email.charAt(i);
        // }
        // }

        // System.out.println(userName);

        // String builder

        // declaration
        StringBuilder sb = new StringBuilder("nikhil");
        // System.out.println(sb);

        // get a character from index
        // System.out.println(sb.charAt(0));

        // set a character at index
        // sb.setCharAt(0, 'j');
        // System.out.println(sb);

        // insert character at some index
        // sb.insert(0, 's');
        // System.out.println(sb);

        // delete char
        // sb.delete(0, 1);
        // System.out.println(sb);

        // append a char
        // sb.append(" Stark");
        // System.out.println(sb);

        // System.out.println(sb.length());

        //reverse a string
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;
      
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
      
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
          }
          System.out.println(sb);
      
     


        s.close();
    }
}
