package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Random numbert = new Random();

int number = numbert.nextInt(100)+200;

        System.out.println(number);

int remainder= number %2;
boolean prime = true;
for (int i=2; i<number; i++) if ( number%i==0) {
    prime=false;}

if (prime) {
    System.out.println("number is prime");
}

else System.out.println( " not prime");


    }}