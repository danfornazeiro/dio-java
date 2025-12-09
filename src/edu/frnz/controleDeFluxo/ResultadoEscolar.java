package edu.frnz.controleDeFluxo;

public class ResultadoEscolar {
    public static void main (String[] args){
        double nota = 6.0;
        if(nota >= 7.0)
            System.out.println("Aluno Aprovado");
        else if(nota > 5.0 && nota < 7.0) {
            System.out.println("Prova de recuperção");
        }
        else
            System.out.println("Aluno reprovado");
    }

}
