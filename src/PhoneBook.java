import java.util.*;

public class PhoneBook {
    private Map<String, List> phone = new TreeMap<>();

    public void add(String name, String phoneNumber){
        if(!phone.containsKey(name)){
            List phoneList = new ArrayList<>();
            phoneList.add(phoneNumber);
            phone.put(name,phoneList);
        }else {
            phone.get(name).add(phoneNumber);
            phone.put(name,phone.get(name));
        }
    }

    public void get(String name){
        if (phone.containsKey(name)){
            System.out.println(name + " : " + phone.get(name));
        }
    }
    @Override
    public String toString(){
        return "Телефонная запись: " + phone.keySet()
                + phone.values();
    }

}
