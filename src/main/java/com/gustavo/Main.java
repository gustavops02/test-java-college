package com.gustavo;
import com.gustavo.utils.*;
import com.gustavo.utils.exceptions.IOInputException;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import static com.gustavo.utils.PalindromeChecker.isPalindrome;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("O que você deseja fazer?\n");
        System.out.print("[1] Primeira Questão \t [2] Segunda Questão \t [3] Terceira Questão \t [4] Quarta Questão\n");
        int choiceNumber = sc.nextInt();
        switch (choiceNumber){
            case 1:
                List<Integer> list = PrimeNumber.addPrimesInArray(12);
                System.out.println(list);
                sc.close();
                break;
            case 2:
                System.out.println("Escolha um valor em segundos: ");
                int sec = sc.nextInt();
                TimeInterval ti = new TimeInterval(sec);
                TimeInterval ti2 = new TimeInterval(3600);
                ti.plusSecondUsingTimeIntervalObj(ti2);
                System.out.println(ti.getLocalTime());
                sc.close();
                break;
            case 3:
                int number = 12321; // Número a ser testado
                boolean isPalindromic = isPalindrome(number);
                if (isPalindromic) {
                    System.out.println("É UM PALÍNDROMO");
                } else {
                    System.out.println("NÃO É UM PALÍNDROMO");
                }
                break;
            case 4:

                ArConditioner Ar1 = new Automotive(1, 7500, false);
                ArConditioner Ar2 = new Automotive(2, 15000, true);
                ArConditioner Ar3 = new Split(3, 5000, false, "Branca", "110", false);
                ArConditioner Ar4 = new Split(4, 10000, false, "Preta", "220", false);
                sc.close();
                break;
            default:
                throw new IOInputException("O número" + choiceNumber + " é diferente dos números pedidos", sc);
        }

    }
}