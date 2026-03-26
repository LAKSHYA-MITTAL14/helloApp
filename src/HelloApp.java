public class HelloApp {
    public static void main(String[] args) {
        
        String name = "World";

        
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        System.out.println("Hello, " + name + "!");
    }
}