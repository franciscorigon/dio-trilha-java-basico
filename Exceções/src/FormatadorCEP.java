public class FormatadorCEP {
    public static void main(String[] args) {
        
        try{
            String cepFormatado = formatarCep("1234567");
            System.out.println(cepFormatado);
        } catch (CriandoExcecao e){
            System.out.println("O CEP não contém 8 numerais");;
        }
    }

    static String formatarCep(String cep) throws CriandoExcecao{
        if(cep.length() != 8)
            throw new CriandoExcecao();

            return "23.765-064";
    }
}
