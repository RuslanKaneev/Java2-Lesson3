import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //1 задание
        String[] arrayName = new String[]{"Александр", "Александр", "Алексей", "Никита", "Александр",
                "Владимир", "Руслан", "Никита", "Алексей", "Семён", "Руслан", "Евгений", "Артём",
                "Никита", "Владимир", "Артём", "Геннадий", "Евгений", "Руслан", "Артём"};

        Map<String, Integer> noDublicat = new HashMap<>();
        for (String arr : arrayName) {
            noDublicat.put(arr, 0);
        }
        System.out.println(noDublicat.keySet());
        for (int i = 0; i < arrayName.length; i++) {
            if (noDublicat.containsKey(arrayName[i])) {
                noDublicat.put(arrayName[i], noDublicat.get(arrayName[i]) + 1);
            }
        }
        Iterator<Map.Entry<String, Integer>> iterator = noDublicat.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //2 задание
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Башев", "89160000000");
        phoneBook.add("Башев", "89150000000");
        phoneBook.add("Авдеев", "89100000000");
        phoneBook.add("Емельянов", "89110000000");
        phoneBook.add("Иванов", "89150000001");
        phoneBook.add("Иванов", "89150000002");
        phoneBook.add("Иванов", "89150000003");
        phoneBook.add("Салихова", "89200000000");

        phoneBook.get("Башев");
        phoneBook.get("Авдеев");
        phoneBook.get("Емельянов");
        phoneBook.get("Иванов");
        phoneBook.get("Салихова");

    }
}