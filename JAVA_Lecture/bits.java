import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // bit manupulation or bit masking
        // get bit
        // 1) bitmask = 1<<pos
        // 2) and

        // int n = 5; //0101
        // int pos =1;
        // int bitMask = 1<<pos;
        // System.out.print("get ");
        // if((bitMask &n) == 0){
        // System.out.println("bit was zero");
        // } else {
        // System.out.println("bit was one");
        // }

        // //set bit
        // //1) bm
        // //2) or
        // System.out.print("set ");
        // int newn = bitMask | n;
        // System.out.println(newn);

        // clear bit
        // 1)bm
        // 2) ~ not
        // 3) and
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int newbm = ~(bitMask);
        // int newn = newbm & n;
        // System.out.println(newn);

        // update bit
        // int oper = s.nextInt();
        // // oper=1 -> set; oper=0 -> clear
        // int n = 5;
        // int pos = 2;

        // int bitMask = 1<<pos;
        // if(oper == 1) {
        // //set
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);
        // } else {
        // //clear
        // int newBitMask = ~(bitMask);
        // int newNumber = newBitMask & n;
        // System.out.println(newNumber);
        // }

        s.close();
    }

}
