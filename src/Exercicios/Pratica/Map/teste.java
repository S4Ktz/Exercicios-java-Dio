package Exercicios.Pratica.Map;

import java.util.HashMap;
import java.util.Map;

public class teste {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("Joao@lalalala.com", new User("joao", 22));
        users.put("victor@victor.com", new User("victor", 18));
        users.put("Maria@Maria.com", new User("Maria", 32));
//        System.out.println(users);
//        System.out.println("===================");
//        users.keySet().forEach(System.out::println);
//        System.out.println("==================");
//        users.values().forEach(System.out::println);
    }
}

