package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        Company company  = new Company();
        System.out.println("Welcome");
        while (true){
            System.out.println("1: Sign up");
            System.out.println("2: Sign in");
            System.out.println("3: Admin panel ");
            int a= scanner.nextInt();
            switch (a){
                case 1-> {

                    company.regestration();

                }
                case 2->{
                    company.sign();
                }
                case 3->{
                    company.Admin();
                }

            }

















        }

    }
}
