package com.gustavo;

import com.gustavo.utils.Automotive;
import com.gustavo.utils.Split;
import com.gustavo.utils.TimeInterval;

public class Main {
    public static void main(String[] args) {

        // Question 2
        TimeInterval ti = new TimeInterval(62);

        System.out.println(ti.getLocalTime());


        // Question 3
        Automotive Ar1 = new Automotive(1, 7500, false);

        Automotive Ar2 = new Automotive(2, 15000, true);

        Split Ar3 = new Split(3, 5000, false, "Branca", "110", false);

        Split Ar4 = new Split(4, 10000, false, "Preta", "220", false);
    }
}