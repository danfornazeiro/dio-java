public class LutadorMain {
    public static void main (String[] args){
        CinturaoLutador lutador = new CinturaoLutador();
        LutadorAtributes lutador2 = new LutadorAtributes();

        lutador.setNome("Alex poatan pereira");
        lutador.setIdade(38);
        lutador.setPeso(93.0);
        lutador.setAltura(1.93);
        lutador.setCinuturao("UFC - PESO MÉDIO & UFC - PESO MEIO-PESADO");

        System.out.println("Nome: " + lutador.getNome() + "\nIdade: " + lutador.getIdade() + "\nPeso: " + lutador.getPeso() + "\nAltura: " + lutador.getAltura());

        if(lutador.getNome().equalsIgnoreCase("Alex Poatan Pereira")){
            System.out.println("UM MONSTRO, UMA MÁQUINA... Cinturão: " + lutador.getCinturao());
        }
        else if(lutador.getNome().equalsIgnoreCase("Islam Makhachev")){
            System.out.println("UM SAFADO MACACO RUIM ");
        }
        else if(lutador.getNome().equalsIgnoreCase("Charles Oliveira")){
            System.out.println("CHARLEEEESS DOO BROOOOONX");
        }

    }
}
