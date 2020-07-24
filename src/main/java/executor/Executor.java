package executor;

import patterns.builder.User;
import patterns.singleton.Singleton;

public class Executor {
    public static void start() {
        printBuilder();
        printEqualsSingleton();
    }

    private static void printBuilder() {
        User user = new User.Builder()
                .withName("Andrii")
                .withAge(23)
                .withCity("Lviv")
                .build();
        System.out.println(user.toString());
    }

    private static void printEqualsSingleton() {
        Singleton singleton = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();
        System.out.println(singleton.equals(singletonTwo));
    }
}
