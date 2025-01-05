import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class FileEncryptorDecryptor {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";

    public static void encrypt(String inputFilePath, String outputFilePath, String key) throws Exception {
        // ... (rest of the encrypt() method)
    }

    public static void decrypt(String inputFilePath, String outputFilePath, String key) throws Exception {
        Key secretKey = generateKey(key);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // ... (rest of the decrypt() method)
    }

    private static Key generateKey(String key) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), ALGORITHM);
        return secretKeySpec;
    }

    public static void main(String[] args) throws Exception {
        // ... (rest of the main() method)
    }
}