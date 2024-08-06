import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 30.0;
        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                break;
            }
            System.out.println("Doce do valor: R$ " + valorDoce + " adicionado ao carrinho!");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: R$ " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
