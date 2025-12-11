package edu.frnz.controleDeFluxo.EstruturasExcepcionais;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
public static void main (String[] args){

    try {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Seu nome completo é: " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é: " + altura + "cm");
        scanner.close();
    }catch (java.util.InputMismatchException e){
        System.err.println("O campos idade e altura devem ser numéricos!");
    }
}

}
