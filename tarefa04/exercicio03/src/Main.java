public class Main {
    public static void main(String[] args) {
        //construtor padrão
        var cachorro1 = new Cachorro();
        cachorro1.nome = "Alfredo";
        cachorro1.raca = "Collie";
        cachorro1.idade = 3;

        var cachorro2 = new Cachorro("Rex", "Linguiça", 5);

        var cachorro3 = new Cachorro("Cristal", "Vira-lata");
        
    }
}