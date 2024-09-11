package com.javaLevelUp;

import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;

/**
 * Write a Java method to perform RSA encryption and decryption.
 */
public class RSAAlgorithm {
    public static final String ALGORITHM = "RSA";

    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGen = null;
        try {
            keyPairGen = KeyPairGenerator.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        keyPairGen.initialize(2048);
        KeyPair pair = keyPairGen.generateKeyPair();
        System.out.println("pair of keys : " + " " + pair.getPublic() + " " + pair.getPrivate());
        String originalString = "Hello, RSA!";
        String encryptedString = encrypt(originalString, pair.getPublic());
        String decryptedString = decrypt(encryptedString, pair.getPrivate());

        System.out.println("Original: " + originalString);
        System.out.println("Encrypted: " + encryptedString);
        System.out.println("Decrypted: " + decryptedString);
    }

    private static String decrypt(String encryptedString, PrivateKey aPrivate) throws Exception{
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, aPrivate);
        byte[] original = cipher.doFinal(Base64.getDecoder().decode(encryptedString));
        return new String(original);
    }

    private static String encrypt(String originalString, PublicKey aPublic) throws Exception {

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, aPublic);
        byte[] encrypted = cipher.doFinal(originalString.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);

    }
}
