// 1.Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex_01TelephoneBook {
    public static void main(String[] args) {
        TelephoneBook tBook = new TelephoneBook();
        tBook.add("1234567", "Петров");
        tBook.add("1034567", "Комаров");
        tBook.add("1834567", "Семёнов");
        tBook.add("2234567", "Петров");
        tBook.add("2034567", "Петров");
        tBook.add("3234567", "Фадеев");
        tBook.add("4234567", "Волков");
        tBook.add("5234567", "Фадеев");
        tBook.add("6234567", "Комаров");
        tBook.add("7234567", "Андреев");
        tBook.add("8234567", "Петров");
        tBook.add("9234567", "Кириллов");
        tBook.add("9234569", "Фадеев");

        tBook.print("Петров");
        tBook.print("Фадеев");
        tBook.print("Кириллов");
    }


}
