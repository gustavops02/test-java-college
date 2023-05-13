package com.gustavo.utils;
import java.util.ArrayList;
import java.util.List;
public final class PrimeNumber {
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static List<Integer> addPrimesInArray(int number) {
        List<Integer> list = new ArrayList<>();
        int i = number + 1;
        while(list.size() < 2) {
            if(isPrime(i)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}

