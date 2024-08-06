public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 1){
                continue; // não imprime o valor da condição
            
            }
            System.out.println(i);
        }
    }
}
