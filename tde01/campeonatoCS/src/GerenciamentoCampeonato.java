public class GerenciamentoCampeonato {
    public static void main(String[] args) {
        var equipe1 = new Equipe("SK Gaming");
        //registrar 4 vitórias
        equipe1.registrarVitoria();
        equipe1.registrarVitoria();
        equipe1.registrarVitoria();
        equipe1.registrarVitoria();
        //registrar 10 vitorias
        equipe1.registrarVitoria(10);

        //registrar 2 empates
        equipe1.registrarEmpate();
        equipe1.registrarEmpate();
        //registrar 5 empates
        equipe1.registrarEmpate(5);

        //registrar 1 derrota
        equipe1.registrarDerrota();
        //registrar 2 derrotas
        equipe1.registrarDerrota(2);


        //resumo da equipe
        equipe1.resumo();
    }
}
