package com.gustavo.utils.exceptions;


import java.util.Scanner;

public class IOInputException extends RuntimeException {

    public IOInputException (String msg, Scanner sc) {
        super(msg);
        sc.close();
    }
}
