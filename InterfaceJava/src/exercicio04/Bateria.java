package exercicio04;

public class Bateria implements Carregavel, Descarregavel{
    @Override
    public void carga(){
        System.out.println("Carga");
    }
}
