package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Company implements UserRegestration{
Scanner scanner = new Scanner(in);
    ArrayList<User> arrayList = new ArrayList<>();
    ArrayList<Payment> payments = new ArrayList<>();
    Random random = new Random();
    @Override
    public void regestration() {

            System.out.println("Sign up !!!");
            System.out.println();
            System.out.println("input name: ");
            String name = scanner.next();
            System.out.println("input age: ");
            int age = scanner.nextInt();
            System.out.println("input your address: ");
            String address = scanner.next();

            System.out.println();
            System.out.println("your data are successful added");
            int password = random.nextInt(10000, 99999);
            System.out.println("your password for sign in " + password);
            arrayList.add(new User(name, age, address, password));
        }



    @Override
    public void sign() {
        arrayList.forEach(user -> {
            System.out.println("Sign in");
            System.out.println("Enter your password ");
            int password = scanner.nextInt();
            if (password==user.getPassword()){

                System.out.println("1: pay the month electricity bill ");
                System.out.println("2: payment history ");
                int a = scanner.nextInt();
                if (a==1){
                    System.out.println("Enter your card type");
                    String type = scanner.next();
                    System.out.println("enter your card number ");
                    int number = scanner.nextInt();
                    System.out.println("enter the amount of money ");
                    int money  = scanner.nextInt();
                    payments.add(new Payment(money,type,number));
                    System.out.println("bill for month 100");
                    if (money>=100){
                        System.out.println("payment successful completed ");
                    }
                    else{
                        System.out.println("no enough money ");
                    }

                }
                else if (a==2){
                    arrayList.forEach(user1 -> {
                        System.out.println("name: "+user1.getName());
                    });
                    payments.forEach(payment -> {
                        System.out.println("amount of money: "+payment.getMoney());
                    });
                }


            }else {
                System.out.println("login or password error");
            }
        });


    }
    public void Admin(){
        System.out.println("Welcome to admin pannel !!!");
        System.out.println("enter your login: ");
        String login =scanner.next();
        System.out.println("enter your password ");
        int password = scanner.nextInt();
        if (login.contains("user")&&password==1234){
            System.out.println("Welcome !!!");
            System.out.println();
            System.out.println("1: users");
            System.out.println("2: payments ");
            int b = scanner.nextInt();
            if (b==1){
                arrayList.forEach(user -> {
                    System.out.println("name: "+user.getName());
                    System.out.println("age: "+user.getAge());
                    System.out.println("address: "+user.getAddress());
                    System.out.println("password: "+user.getPassword());
                });
            }
            else if (b==2){
                payments.forEach(payment -> {
                    System.out.println("card name: "+payment.getCard());
                    System.out.println("card number: "+payment.getCardnum());
                    System.out.println("amount of money "+payment.getMoney());
                });

            }
        }

    }

}
