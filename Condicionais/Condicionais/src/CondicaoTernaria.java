public class CondicaoTernaria {
    public static void main(String[] args){
        
        int nota = 10;
        String resultado = nota >=7 ? "Aprovado" : nota < 7 && nota >= 5.5 ? "Recuperação": "Reprovado";

        System.out.println(resultado);
    }
}
