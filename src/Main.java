public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание урока Работа с исключениями Java ***************************************");
//   1-й вариант (Выводятся сообщения Java по цепочке возникновения ошибки ввода данных):
//    SecureEntry entry = new SecureEntry("LOGIN", "PASSWORD","PASSWORD");
//    SecureEntry.checkEntry(entry.getLogin(), entry.getPassword(), entry.getConfirmPassword());

//   2-й вариант (НЕ выводятся сообщения Java по цепочке возникновения ошибки ввода данных):
     boolean entry1 = Data.validate ("LOGIN///", "PASSWORD","PASSWORD");

       if (entry1) { System.out.println("Логин и пароль приняты. Ваши данные верны.");
        } else    System.out.println("Ошибка ввода. Ваши данные некорректны.");
        System.out.println();
     boolean entry2 = Data.validate ("LOGIN", "PASSWORD-","PASSWORD");
        if (entry2) { System.out.println("Логин и пароль приняты. Ваши данные верны.");
        } else    System.out.println("Ошибка ввода. Ваши данные некорректны.");
        System.out.println();
     boolean entry3 = Data.validate ("LOGIN", "PASSWORD","PASSWORD-");
        if (entry3) { System.out.println("Логин и пароль приняты. Ваши данные верны.");
        } else    System.out.println("Ошибка ввода. Ваши данные некорректны.");
    }
} // class Main -----------------------------------------------------------------------------------------------------