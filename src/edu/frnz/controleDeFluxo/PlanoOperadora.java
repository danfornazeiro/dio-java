package edu.frnz.controleDeFluxo;

public class PlanoOperadora {
    public static void main(String[] args){
        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5gb YouTube");
                break;
            }
            case "M" : {
                System.out.println("Whats e Instagram ilimitados");
                break;
            }
            case "G" : {
                System.out.println("100 minutos de ligação gruatuítas.");
                break;
            }
            default: {
                System.out.println("Plano Indefinido");
            }

        }
    }

}
