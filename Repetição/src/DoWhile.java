import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Telefone tocando...");
        } while (tocando());

        System.out.println("Alô....");
        
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(8) == 1;
        // if (atendeu)
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
    } 
}
