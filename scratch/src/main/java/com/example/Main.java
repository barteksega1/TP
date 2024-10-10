package com.example;

public class Main 
{
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.sayHello(args.length>0?args[0]:null));
        }
    
}