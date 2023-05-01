package com.gustavo;

import com.gustavo.utils.PrimeNumber;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number: ");

        int num = sc.nextInt();
        List<Integer> list = PrimeNumber.addPrimesInArray(num);

        System.out.println(list);

    }
}