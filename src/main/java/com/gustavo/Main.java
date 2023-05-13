package com.gustavo;

import com.gustavo.utils.Automotive;
import com.gustavo.utils.PrimeNumber;
import com.gustavo.utils.Split;
import com.gustavo.utils.TimeInterval;
import com.gustavo.utils.exceptions.IOInputException;
import java.util.List;
import java.util.Scanner;

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

                TimeInterval ti = new TimeInterval(62);
                System.out.println(ti.getLocalTime());
                sc.close();
                break;
            case 4:

                Automotive Ar1 = new Automotive(1, 7500, false);
                Automotive Ar2 = new Automotive(2, 15000, true);
                Split Ar3 = new Split(3, 5000, false, "Branca", "110", false);
                Split Ar4 = new Split(4, 10000, false, "Preta", "220", false);
                sc.close();
                break;
            default:
                throw new IOInputException("O número" + choiceNumber + " é diferente dos números pedidos");
        }

    }
}