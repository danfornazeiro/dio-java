package edu.frnz.controleDeFluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.0;
        String resultado = nota > 7 ? "Aprovado" : nota >= 5 && nota <=7 ? "Recuperação" : "Reprovado";
        System.out.println("A situação do aluno é: " + resultado);

    }
}
