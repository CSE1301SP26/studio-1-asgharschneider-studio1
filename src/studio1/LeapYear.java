package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Year: ");
        int n1 = in.nextInt();
        boolean n1isdivisible = n1%4==0;
        boolean n1isnotdivisible = n1%100!=0;
        boolean leap= n1isdivisible && (n1isnotdivisible || n1%400==0);
        System.out.println(leap);    }
}
