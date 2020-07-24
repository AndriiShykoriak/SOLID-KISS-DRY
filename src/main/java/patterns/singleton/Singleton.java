package patterns.singleton;

public class Singleton {
private static Singleton instance = new Singleton();

    public Singleton() {
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
