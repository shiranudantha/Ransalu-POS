package pos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class PasswordUtil {

    private PasswordUtil() {
    }

    /**
     * Returns the SHA-256 hash of the given text as a lowercase hex string.
     */
    public static String hash(String plainText) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(plainText.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException | java.io.UnsupportedEncodingException ex) {
            // SHA-256 / UTF-8 are always available on a standard JVM
            throw new RuntimeException("Unable to hash password", ex);
        }
    }

    /**
     * Convenience check: hashes plainText and compares it to a stored hash.
     */
    public static boolean matches(String plainText, String storedHash) {
        if (storedHash == null) {
            return false;
        }
        return hash(plainText).equalsIgnoreCase(storedHash);
    }
}
