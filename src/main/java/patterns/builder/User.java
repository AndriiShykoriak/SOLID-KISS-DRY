package patterns.builder;

public class User {
    private String name;
    private int age;
    private String city;

    public static class Builder {
        private final User newUser;

        public Builder() {
            newUser = new User();
        }

        public Builder withName(String name) {
            newUser.name = name;
            return this;
        }

        public Builder withAge(int age) {
            newUser.age = age;
            return this;
        }

        public Builder withCity(String city) {
            newUser.city = city;
            return this;
        }

        public User build() {
            return newUser;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
