public class main {
    public static void main (String args[]) {
        StringBuilder names= new StringBuilder();
        for(int i=0;i<args.length;i++){
           names.append(args[i]);
           if(i<args.length-1){
            names.append(",");
           }  

        }
        String name=names.toString();
        System.out.println("Hello, " + name + "!");
    }
}