package edu.frnz.controleDeFluxo.EstruturasExcepcionais;

public class FormatCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatCep("0419426");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("Cep nao corresponde com as regras de negocio.");
        }
    }

    static String formatCep(String cep) throws CepInvalidException {
        if (cep.length() != 8)
            throw new CepInvalidException();

        return "04.194-260";

    }
}

