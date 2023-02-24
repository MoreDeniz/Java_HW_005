import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {
    private Map<String, String> telBook = new HashMap<>();
    void add(String telephone, String name) {
        telBook.put(telephone, name);
    }

    void print(String name) {
        for (Map.Entry<String, String> entry: telBook.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(entry);
            }
        }
    }
}
