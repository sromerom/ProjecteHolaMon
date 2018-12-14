import java.util.Scanner;

public class HolaMon {
    public static void main(String[] args) {
        Scanner pa = new Scanner(System.in);
        System.out.println("Introduiex una paraula");
        String paraula = pa.nextLine();


        Altreclasse.printHola();
        Altreclasse.printAdeu();
        Altreclasse.printElQueVulguis(paraula);
    }
}