package week4DesignPatten;

public class Singleton {
    private static Singleton instance;
    private String name;
    private String age;


    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
