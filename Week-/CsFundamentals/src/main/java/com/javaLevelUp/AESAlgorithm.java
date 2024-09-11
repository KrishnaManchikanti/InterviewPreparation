package com.javaLevelUp;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

/**
 * Write a Java method to encrypt and decrypt a string using AES (symmetric encryption).
 */
public class AESAlgorithm {
    private static final String ALGORITHM = "AES";

    public static void main(String[] args) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();

            String originalString = "Hello, world!";
            String encryptedString = encrypt(originalString, secretKey);
            String decryptedString = decrypt(encryptedString, secretKey);

            System.out.println("Original: " + originalString);
            System.out.println("Encrypted: " + encryptedString);
            System.out.println("Decrypted: " + decryptedString);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String decrypt(String encryptedString, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] original = cipher.doFinal(Base64.getDecoder().decode(encryptedString));
        return new String(original);
    }
    private static String encrypt(String orginalString, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(orginalString.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }
}
