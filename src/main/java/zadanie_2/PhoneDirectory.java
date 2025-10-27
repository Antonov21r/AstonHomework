package zadanie_2;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {

        if (!directory.containsKey(lastName)) {
            directory.put(lastName, new ArrayList<>());
        }

        directory.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, Collections.emptyList());
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : directory.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", Phone Numbers: " + entry.getValue());
        }
    }
}
