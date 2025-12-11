package edu.frnz.controleDeFluxo.estruturaDeRepeticao;

public class ForArrays {
    public static void main (String[] args){
        String alunos[] = {"Felipe" ,"Jonas", "Julia", "Marcos"};
        for(int x = 0; x < alunos.length; x++){
            System.out.println("Aluno no indice x= " + x + ": " + alunos[x]);
        }
    }
}
