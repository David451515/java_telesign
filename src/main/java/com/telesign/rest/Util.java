package com.telesign.rest;

import java.security.SecureRandom;

public class Util {

    private static SecureRandom random = new SecureRandom();

    public static String randomWithNDigits(int n){

        n = Math.abs(n);

        return String.format("%s", ((int)(Math.pow(10, (n-1))) + random.nextInt((9*(int)(Math.pow(10, (n-1)))))));
    }
}

