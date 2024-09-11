package com.javaLevelUp;

/**
 * Write a Java method to validate an IPv4 address format.
 */
public class IPAddressValidator {
    public static boolean isValidIPv4(String ip) {
        String[] parts = ip.split("\\.");
        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidIPv4("192.168.1.1")); // true
        System.out.println(isValidIPv4("256.256.256.256")); // false
    }
}

