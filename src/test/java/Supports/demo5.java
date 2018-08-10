package Supports;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class demo5 {
    public static void main(String agrv[]) throws IOException
    {
        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader( System.in) );
        // Biến name
        String name = "";
        System.out.println("Please Enter Your Name:");
        // Tiến hành đọc từ bàn phím
        try{
        name = dataIn.readLine();
        }catch( IOException e ){
        System.out.println("Error!");
        }
        // hiển thị tên
        System.out.println("Hello " + name +"!");

    }

    public static String inputCharacter(){
        String s;
//        String s1;
        Scanner inp = new Scanner(System.in); //tao doi tuong inp thuoc lop Scanner
        System.out.print("Insert your name : "); //Lenh in ra man hinh
        s = inp.nextLine(); //nhap chuoi
        if(s.equalsIgnoreCase("a")){
            System.out.println("a");
        }
        inp.close();
        return s;
    }


}
