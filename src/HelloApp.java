public class main {
    public static void main(String args[]) {
        StringBuilder names = new StringBuilder();
        boolean first = true;

        for (String name : args) {

            if (!first) {
                names.append(",");
            }
            names.append(name);
            first = false;

        }

        String name = names.toString();
        if (args.length !=0) {
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, " + "World" + "!");
        }

    }

}