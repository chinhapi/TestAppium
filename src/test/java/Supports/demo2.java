package Supports;

import java.io.IOException;
import java.util.Scanner;

public class demo2 {
    public static void main(String agrv[]) throws IOException
    {
        String s;
        int age;
        Double M;
        Scanner inp = new Scanner(System.in); //tao doi tuong inp thuoc lop Scanner
        System.out.print("Insert your name : "); //Lenh in ra man hinh
        s = inp.nextLine(); //nhap chuoi
        System.out.print("Insert your age: ");
        age = inp.nextInt(); //nhap so nguyen
        System.out.println("Insert your Math: ");
        M = inp.nextDouble();
        System.out.printf("My name is %s , I %d yaers old and I am %.2f math scoren", s, age, M);
        inp.close();
    }
}