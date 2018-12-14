import java.util.Scanner;

public class HolaMon {
    public static void main(String[] args) {
        Scanner pa = new Scanner(System.in);
        System.out.print("Vols introduir per pantalla una paraula o frase teva? (Y/N):");
        String confirmacio = pa.nextLine();
        String paraula = "";
        if (confirmacio.equals("y") || confirmacio.equals("Y")) {
            System.out.print("Molt bé, quina paraula o frase vols? ");
            paraula = pa.nextLine();
        }
        
        Altreclasse.printHola();
        Altreclasse.printAdeu();
        Altreclasse.printElQueVulguis(paraula);
    }
}