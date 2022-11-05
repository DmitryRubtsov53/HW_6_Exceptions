public class Data {
    private static final String CHARS_CHECK = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_0123456789" ;
    private Data() {
    }

 // methods _______________________________________________________________________________________________
    public static boolean validate (String login, String password, String confirmPassword)  {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    return true;
    }
    private static void check (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException  {
        if(!validate(login)) {
                                 throw new WrongLoginException ("Логин введён некорректно!"); }
        if (!validate(password)){
                                 throw new WrongPasswordException ("Пароль введён некорректно!"); }
        if (!password.equals(confirmPassword)) {
                                     throw new WrongPasswordException ("Пароль не подтверждён!"); }
    }
    public static boolean validate(String s) {
        if (!(s.length() >= 1 && s.length() <= 20)) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!CHARS_CHECK.contains(String.valueOf(s.charAt(i)))) return false;
        }
        return true;
    }
}

