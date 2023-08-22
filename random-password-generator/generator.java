import java.security.SecureRandom;
import java.util.Random;

public class generator {
    private String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowercase = "abcdefghijklmnopqrstuvwxyz";
    private String number = "1234567890";
    private String symbol = "!@#$%^&*()";

    public String passwordGenerator()
    {
        SecureRandom random = new SecureRandom();
        char[] password = new char[12];
        String kombinasi = uppercase+lowercase+number+symbol;
        for (int i=0; i< password.length;i++)
        {
            password[i] = kombinasi.charAt(random.nextInt(kombinasi.length()));
        }
        String generatedpassword = new String(password);
        return generatedpassword;
    }

}
