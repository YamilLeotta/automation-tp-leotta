package automation.tp.leotta;

public class App {
    public String getGreeting() {
        return "Hola Mundo!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
