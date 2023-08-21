import java.util.Random;

public class Main {
        public static void main(String[] args) {
            String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowercase = "abcdefghijklmnopqrstuvwxyz";
            String number = "1234567890";
            String kombinasi = uppercase+lowercase+number;
            Random random = new Random();
            char[] password = new char[8];

            for (int i=0; i< password.length;i++)
            {
                password[i] = kombinasi.charAt(random.nextInt(kombinasi.length()));
            }

            String generatedpassword = new String(password);

            System.out.println(generatedpassword);






        }


    }