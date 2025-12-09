public class LutadorMain {
    public static void main (String[] args){
        CinturaoLutador lutador = new CinturaoLutador();

        lutador.setNome("Islam Makhachev");
        System.out.println(lutador.getNome());

        lutador.setCinuturao("UFC - PESO MÉDIO & UFC - PESO MEIO-PESADO");
        if(lutador.getNome().equalsIgnoreCase("Alex Poatan Pereira")){
            System.out.println("UM MONSTRO, UMA MÁQUINA... Cinturão: " + lutador.getCinturao());
        }
        else if(lutador.getNome().equalsIgnoreCase("Islam Makhachev")){
            System.out.println("UM SAFADO MACACO RUIM ");
        }

    }
}
