import java.util.*;

public class TelephoneBook {
    private Map<String, String> telBook = new HashMap<>();
    void add(String telephone, String name) {
        telBook.put(telephone, name);
    }

    void print(String name) {
        for (Map.Entry<String, String> entry: telBook.entrySet()) {
            List<String> tel = new LinkedList<>();
            if (entry.getValue().equals(name)) {
                System.out.println(entry);
            }
        }
    }
}
