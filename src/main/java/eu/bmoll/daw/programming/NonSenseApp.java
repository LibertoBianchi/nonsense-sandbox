package eu.bmoll.daw.programming;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class NonSenseApp {
    public static void main(String[] args) {
        boolean aux = StringUtils.equals("a","A");
        System.out.println("HOLA MUNDO"+aux);

        Scanner in = new Scanner (System.in);
        boolean isExit= false;
        while (!isExit) {
            String s = in.nextLine();
            System.out.println("You entered string" + s);
            isExit= StringUtils.equals(s, EXIT_KEY);
        }
        System.out.println("-END-");
    }

}
