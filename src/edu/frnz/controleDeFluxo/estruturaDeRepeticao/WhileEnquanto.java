package edu.frnz.controleDeFluxo.estruturaDeRepeticao;
import  java.util.concurrent.ThreadLocalRandom;

public class WhileEnquanto {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0){
            double valorDoce = ValorAleatorio();
           /* if(valorDoce > mesada)
                valorDoce = mesada; */
                System.out.println("Doce no valor: " + valorDoce + " Adicionado ao carrinho");
                mesada = mesada - valorDoce;

            System.out.println("Mesada atual: " + mesada);
            System.out.println("Joaozinho gastou toda sua mesada em doces!");
        }

    }

    private static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
