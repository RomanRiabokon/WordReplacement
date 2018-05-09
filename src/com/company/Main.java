package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        word s1=new word();
        string s2=new string();
        System.out.println(s2.strochka);
        System.out.println("Введите слово для замены");
        Scanner scanner1=new Scanner(System.in);
        String podstroka=scanner1.next();
        System.out.println("Введите количество символов в заменяемом слове строки");
        Scanner scanner2=new Scanner(System.in);
        int count = Integer.parseInt(scanner2.next());
        s1.zamena(s2.strochka,podstroka,count);
    }
}
