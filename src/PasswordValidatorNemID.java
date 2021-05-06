import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidatorNemID {
    private String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*[æøåÆØÅ{}!#\"$’%^&*()_\\+\\-=:;?.@\\s]).{6,40}$";//Made with regex101.com & help from KEA CodeLabs (love them)

    public void main(String args[]) {
        System.out.println("Velkommen. Indtast et password:");
        while (true) {
            Scanner userPasswordInput = new Scanner(System.in);
            String password1 = userPasswordInput.nextLine();
            boolean validPassword = isValidPassword(password1);
            if (!validPassword) {
                System.out.println("Dit password er ikke godkendt. Prøv igen");
                continue;
            }

            else {
                System.out.println("Dit password er godkendt. Tillykke med det.");
                break;
            }
        }
    }

    public boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(this.regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches() && !hasRepeatChars(password);
    }

    public static boolean hasRepeatChars(String password) {
        for (int i = 0; i < password.length(); i += 4) {
            char a = password.charAt(i);
            char data[] = {a, a, a, a};
            String repeat = new String(data);
            if (password.contains(repeat)) {
                return true;
            }
        }
        return false;
    }
}