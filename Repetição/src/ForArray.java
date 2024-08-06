public class ForArray {
    public static void main(String[] args) throws Exception {
        
        String alunos[] = {"Fran", "Francisco", "FGR", "Francisco Rigon"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + (x+1) + " é o aluno " + alunos[x]);
        }

        for (String aluno : alunos)
            System.out.println("Nome do aluno é " + aluno);
        
    }
}
