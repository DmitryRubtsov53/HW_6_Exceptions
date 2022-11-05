import java.util.Objects;

public class SecureEntry {

// 1-й вариант решения с выводом полоительного и ли отрицательного результата на консоль.
// для корректной работы нужно в сигнатуру классов исключений добавить "extends RuntimeException".

//    private String login;
//    private String password;
//    private String confirmPassword;
//
//    public SecureEntry(String login, String password, String confirmPassword) {
//        this.login = login;
//        this.password = password;
//        this.confirmPassword = confirmPassword;
//    }
//// getters _______________________________________________________________________________________________
//    public String getLogin() { return login;
//    }
//    public String getPassword() { return password;
//    }
//    public String getConfirmPassword() { return confirmPassword;
//    }
//// setters _______________________________________________________________________________________________
//    public void setLogin(String login) {
//        this.login = login;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public void setConfirmPassword(String confirmPassword) {
//        this.confirmPassword = confirmPassword;
//    }
//// methods  _______________________________________________________________________________________________
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SecureEntry entry = (SecureEntry) o;
//        return Objects.equals(password, entry.password) && Objects.equals(confirmPassword, entry.confirmPassword);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(password, confirmPassword);
//    }
//
//    public static void  checkEntry (String login, String password, String confirmPassword)
//            throws WrongLoginException, WrongPasswordException {
//
//        char[] chars = {'A','E','I','O','U','Y','_','0','1','2','3','4','5','6','7','8','9','B','C',
//                        'D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
//// проверка логина ---------------------------------------------------------------------
//        boolean logLengthOk = (login.length() >= 1 && login.length() <= 20) && !login.isBlank();
//
//        for (int i = 0; i < login.length(); i++) {
//            for (int j = 0; j < chars.length ; j++) {
//                if (login.charAt(i) == chars[j]) break;
//                if (login.charAt(i) != chars[j] && j == chars.length - 1)
//                    throw new WrongLoginException("Логин введён некорректно, попробуй еще!");
//            }
//            if (i == login.length() - 1 && logLengthOk) System.out.println("Логин принят!");
//        }
//// проверка пароля ----------------------------------------------------------------------
//        boolean passLengthOk = (password.length() >= 1 && password.length() <= 20) && !password.isBlank();
//
//        for (int i = 0; i < password.length(); i++) {
//            for (int j = 0; j < chars.length ; j++) {
//                if (password.charAt(i) == chars[j]) break;
//                if (password.charAt(i) != chars[j] && j == chars.length - 1)
//                    throw new WrongPasswordException("Пароль введён некорректно, попробуй еще!");
//            }
//            if (i == password.length() - 1 && passLengthOk) System.out.println("Пароль принят!");
//        }
//        if (password.equals(confirmPassword)) {
//                System.out.println("Пароль подтверждён!");
//            } else  throw new WrongPasswordException ("Пароль не подтверждён, попробуй еще!");
//
//    }
} // ---------------------------------------------------------------------------------------
