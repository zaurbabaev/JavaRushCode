package az.babayev.javarush.javasyntax_repetition.lection4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Пишем валидацию пароля 3 способами (требования к паролю: длина более 10 символов, должна содержать
! или . или -, не должен быть пустым (состоять из пробелов)

- сначала if-ы и в них проставление isValid
- потом один большой иф
- Потом записываем значение в переменну
 */
public class PasswordValid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password = reader.readLine();
        boolean isValid = true;
        //if-ы и в них проставление isValid
        if (password.length() <= 10) {
            isValid = false;
        }
        if (password.isBlank()) {
            isValid = false;
        }
        if (password.contains("!") || password.contains(".") || password.contains("-")) {
            isValid = false;
        }
        if (isValid) {
            System.out.println("Password is OK");
        } else {
            System.out.println("Password is not OK");
        }

        // один большой иф

        if (password.length() <= 10
                || password.isBlank()
                || !(password.contains("!") || password.contains("-") || password.contains("."))) {
            isValid = false;
        }
        //записываем значение в переменну

        boolean isValid2 = password.length() > 10
                && !password.isBlank()
                && (password.contains("!") || password.contains("-") || password.contains("."));

    }
}
