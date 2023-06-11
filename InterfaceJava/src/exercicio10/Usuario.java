package exercicio10;

public class Usuario implements Persistente{
    public void salvar(){
        System.out.println("Usuario: salvando...");
    }
    public void atualizar(){
        System.out.println("Usuario: atualizando...");
    }
    public void deletar(){
        System.out.println("Usuario: deletando...");
    }
    public void buscar(){
        System.out.println("Usuario: buscando...");
    }
}
