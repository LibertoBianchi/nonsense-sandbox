package eu.bmoll.daw.programming;

import com.sun.tools.javac.util.StringUtils;

public class NonSenseApp {
    public static void main(String[] args) {
        boolean aux = StringUtils.equals("a","A");
        System.out.println("HOLA MUNDO"+aux);
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        System.out.println("You entered string"+s);
        System.out.println("-END-");
    }
}
