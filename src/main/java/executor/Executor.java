package executor;

import patterns.builder.User;
import patterns.singleton.Singleton;

public class Executor {
    public static void start() {
        printBuilder();
        printSingleton();
    }

    private static void printBuilder() {
        User user = new User.Builder()
                .withName("Andrii")
                .withAge(23)
                .withCity("Lviv")
                .build();
        System.out.println(user.toString());
    }

    private static void printSingleton() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getClass());
    }
}
