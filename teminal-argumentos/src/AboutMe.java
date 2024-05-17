import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
       /* 
        String name = args [0];                      //necessita da adicao dos args direto no prompt/terminal
        String surname = args [1];                   // respeitando a hierarquia do array
        int age = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);
*/
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Write your name");
        String name = scanner.next();

        System.out.println("Write your surname");
        String surname = scanner.next();

        System.out.println(" How old are you>?");
        int age = scanner.nextInt();

        System.out.println("What is your height?");
        double height = scanner.nextDouble();

        System.out.println("Hi, my name is " + name + " " + surname);
        System.out.println("I'm "+ age + " years old" );
        System.out.println("i'm " + height + " tall");
        System.out.println("hello, world");
    }
}
