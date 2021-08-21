package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int age;
        int temp;
        System.out.println("Enter age");
        age = num.nextInt();
        System.out.println("Enter temp");
        temp = num.nextInt();

        if (age <=45 && temp <=30){
            System.out.println("Можно идти гулять");
        }else if (age >45 && temp <=30){
            System.out.println("Оставайтесь дома");
        }else if (age <20 && temp <28){
            System.out.println("Можно идти гулять");
        }else if (age <20 && temp >28){
            System.out.println("Оставайтесь дома");
        }else if (age >45 && temp <25) {
            System.out.println("Можно идти гулять");
        }else{
            System.out.println("Оставайтесь дома");
        }
    }
}

