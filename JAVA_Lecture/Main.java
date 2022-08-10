import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        // First lecture (hello world)
        // System.out.println("Hello World!");



        // second lecture (variables)
        // String name = "nikhil";
        // int age = 21;
        // System.out.println(name + " " + age);

        // Data types
        // String name = new String("Nikhil");
        // int[] marks = new int[3];
        // marks[0] = 90;
        // marks[1] = 80;
        // marks[2] = 70;

        // System.out.println(name);
        // System.out.println(marks[0]);

        //constants
        // final float num = 1.0f;
        // System.out.println(num);

        // Home work problem
        // Try to declare meaningful variables of each type. 
        // boolean one = false;
        // System.out.println(one);
        // byte a = 1;
        // System.out.println(a);
        // short s = 1000;
        // System.out.println(s);
        // int b = 100000;
        // System.out.println(b);
        // long c = 10000000L;
        // System.out.println(c);
        // float d = 2.4f;
        // System.out.println(d);
        // double e = 12.3d;
        // System.out.println(e);
        // char A = 'a';
        // System.out.println(A);


        //takes the radius of a circle as input, calculates its radius and area
        Scanner s = new Scanner(System.in);

        // int z;
        // do{

        
        

        System.out.println("enter a number");
        int n = s.nextInt();
        System.out.println("you entered" + " " + n);

        // System.out.println("enter radius");
        // int r = sc.nextInt();
        // double sum = (2*3.14*r);
        // System.out.println(sum);

        //Make a program that prints the table of a number that is input by the user
        
        // System.out.println("entr a number");
        // int x = sc.nextInt();
        // for (int i = 1; i <= 10; i++){
        //     System.out.println(x + "*" + i + "=" + x*i);
        
        // }


        // third lecture ()

        // if else
        // int age = sc.nextInt();
        // if (age > 18){
        //     System.out.println("you are adult");
        // }else {
        //         System.out.println("you are under age");
        //     }


        // switch
        // int x = sc.nextInt();
        // switch (x) {
        //     case 1:System.out.println("Monday");break;
        //     case 2:System.out.println("Tuesday");break;
        //     case 3:System.out.println("Wednesday");break;
        //     case 4:System.out.println("Thursday");break;
        //     case 5:System.out.println("Friday");break;
        //     case 6:System.out.println("Saturday");break;
        //     case 7:System.out.println("Sunday");
        // }
            
        
        //homework : calculator

            // char operator;
            
            
            

            // System.out.println("choose an operator: +, -, * , /");
            // operator = sc.next().charAt(0);

            // System.out.println("enter first number: ");
            // int a = sc.nextInt();

            // System.out.println("enter second number: ");
            // int b = sc.nextInt();

            // switch (operator) {
            //     case '+':  System.out.println(a+b); break;
            //     case '-':  System.out.println(a-b); break;
            //     case '*':  System.out.println(a*b); break;
            //     case '/':  System.out.println(a/b); break;
            //     case '%':  System.out.println(a%b); break;
            // }

            // to print the days of the week

            // int x = sc.nextInt();
            // switch(x) {
            //     case 1: System.out.println("january"); break;
            //     case 2: System.out.println("february"); break;
            //     case 3: System.out.println("march"); break;
            //     case 4: System.out.println("april"); break;
            //     case 5: System.out.println("may"); break;
            //     case 6: System.out.println("june"); break;
            //     case 7: System.out.println("july"); break;
            //     case 8: System.out.println("august"); break;
            //     case 9: System.out.println("september"); break;
            //     case 10: System.out.println("october"); break;
            //     case 11: System.out.println("november"); break;
            //     case 12: System.out.println("december"); break;
            //     default: System.out.println("error");
                
            // }



            // forth lecture : LOOPS

            //for loop 
        //Print all even numbers till n.

            
            
            // int i = sc.nextInt();
            //     for(int j=1; j<=i; j++){
            //         if (j%2 == 0){
            //             System.out.println(j);
            //         }
            //     }
               

            // for (; ;){
            //     System.out.println("hey");
            // }

                
           
            // int a;
            
            // do{
            //     System.out.println("Enter your marks");
            //     int marks = s.nextInt();
            //     if(marks >=90 && marks <= 100){
            //         System.out.println("This is good");
            //     }else if(marks >=60 && marks <= 89){
            //         System.out.println("This is also good");
            //     }else if(marks >= 0 && marks <= 59){
            //         System.out.println("This is good as well");

            //     }else{
            //         System.out.println("invalid");
            //     }
            //     System.out.println("want to continue? enter 1 for yes and 0 for no");
            //     a = s.nextInt();
            //     if(a!=1 && a!=0){
            //         System.out.println("enter only 0 or 1");
            //     }
            // }while(a == 1);

            //prime number or not

    //             int re;

    //             do{
    //             System.out.println("enter a number to check whether number is prime or not");
    //         int n=s.nextInt();
    //         boolean flag = true;

    //         for (int i =2; i<=n/2; i++){
    //             if (n % 1 == 0){
    //                 flag = false;
    //                 break;
    //             }
    //         }

    //         if (flag){
    //             if (n == 1){
    //                 System.out.println("This is neither prime not composite");
    //             } else  {
    //                 System.out.println("this is prime number");
    //             } 
    //         }else {
    //             System.out.println("this not prime number");
    //     }
    //     System.out.println("enter 1 for continue or 0 for stop");
    //     re = s.nextInt();
    // }while(re==1);




        //lecture 5 patterns

        // patterns part 1
        // *****
        // *****
        // *****
        // *****
        // *****
        
        
        // System.out.println("enter rows and column");
        // int a =s.nextInt();
        // int b= s.nextInt();

        // for (int i = 0; i<a; i++){
        //     for (int j= 0; j<b; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        //hollow rectangle
        // int a = s.nextInt();
        // int b = s.nextInt();
        // for (int i =0; i<a; i++){
        //     for (int j=0; j<b; j++){
        //         if (i == 0 || i == a-1 || j == 0 || j== b-1){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //3.right angle triangle

        // int a = s.nextInt();

        // for (int i = 1; i<=a; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4. right angle triangle opposite

        // int a = s.nextInt();

        // for (int i = a; i >= 1; i--){
        //     for (int j = 1; j <=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int a = s.nextInt();

        // for (int i = a; i>=1;i--){
        //     for (int j = 1; j<i; j++ ){
        //         System.out.print(" ");
        //     }

        //     for(int j = 0; j<=a-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //triangle numbers

        // int a = s.nextInt();
        //  for (int i =1; i<=a; i++){
        //     for (int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();     
        // }
        

        // reverse


        // int a = s.nextInt();
        // for (int i =a; i>=1; i--){
        //    for (int j=1; j<=i; j++){
        //        System.out.print(j);
        //    }
        //    System.out.println();
        // }

            // 8.
        // int a = s.nextInt();
        // int num = 1;

        // for (int i = 1; i <= a; i++) {
        //     for(int j =1; j<=i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        
        //9. 
            // int a = s.nextInt();

            // for (int i = 1; i <= a; i++){
            //     for (int j = 1; j<=i;j++){
            //         if((i+j)%2 == 0){
            //             System.out.print(1+" ");

            //         }else{
            //             System.out.print(0+" ");
            //         }
            //     }
            //     System.out.println();
            // }


            //homework

            // 1 rombus
            // for ( int i = 1; i <= n; i++){
            //     for (int j = 1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }
            //     for (int j = 1; j<=n; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }


            // number trianglement

            // for (int i = 1; i<=n; i++){
            //     for (int j = 1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }
            //     for (int j = 1; j <= i; j++){
            //         System.out.print(i+" ");
            //     }
            //     System.out.println();
            // }
            

            // 3. number

            // for (int i = 1; i<=n; i++){

            //     for (int j = 1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }

            //     for (int j = i; j>=1; j--){
            //         System.out.print(j);
            //     }

            //     for (int j = 2; j<=i; j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }
            

            // patterns part 2

            //1. 
            
                // for (int i = 1; i<=n; i++){
                //     for (int j = 1; j<=i; j++){
                //         System.out.print("*");
                //     }

                //     int spaces = 2 * (n-i);
                //     for (int j = 1; j<=spaces; j++){
                //         System.out.print(" ");
                //     }

                //     for (int j = 1; j<=i; j++){
                //         System.out.print("*");

                //     }
                //     System.out.println();
                // }


                // for (int i = n; i>=1; i--){
                //     for (int j = 1; j<=i; j++){
                //         System.out.print("*");
                //     }

                //     int spaces = 2 * (n-i);
                //     for (int j = 1; j<=spaces; j++){
                //         System.out.print(" ");
                //     }

                //     for (int j = 1; j<=i; j++){
                //         System.out.print("*");

                //     }
                //     System.out.println();
                // }




                // kite
                
                // for (int i = 1; i<=n; i++){
                //     for (int j = 1; j<=n-i; j++){
                //         System.out.print(" ");
                //     }

                //     for (int j = 1; j<=2*i-1; j++){
                //         System.out.print("*");

                //     }

                //     System.out.println();
                // }


                // for (int i = n; i>=1; i--){
                //     for (int j = 1; j<=n-i; j++){
                //         System.out.print(" ");
                //     }

                //     for (int j = 1; j<=2*i-1; j++){
                //         System.out.print("*");

                //     }

                //     System.out.println();
                // }


                





        //     System.out.println("want to continue? enter 1 for yes and 0 for no");
        //     z = s.nextInt();
        //     if(z!=1 && z!=0){
        //         System.out.println("enter only 0 or 1");
        //     }
        // }while(z == 1);



        // functions 


        


            s.close();
        }

        

    }
    
