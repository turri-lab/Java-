package houserent.utils;

import java.util.Scanner;

public class Utility {
    //构造静态成员函数readChar()用于输入1-6的一个固定数字
    public static int readChar()
    {
        int cin=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您选择的号码");
        cin= scanner.nextInt();
        return cin;
    }

    //构造静态成员函数readYes()读取用户输入的是或否
    public static int readYes()
    {
        int cin=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("是或否:是输入1，否输入0");
        cin=scanner.nextInt();
        return cin;
    }

    //返回用户输入的字符串
    public static String readString()
    {
        String cin="";
        Scanner scanner = new Scanner(System.in);
        cin=scanner.next();
        return cin;
    }
    public static int readInt()
    {
        int cin=0;
        Scanner scanner = new Scanner(System.in);
        cin=scanner.nextInt();
        return cin;
    }
}
