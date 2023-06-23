public class Zoo {
    Animal [] animals;
    Funcionario [] funcionarios;
    int numeroAnimais;
    int numeroFuncionarios;

// construtor ->
    public Zoo(int capacidadeAnimai, int capacidadeFuncionarios){
        animals = new Animal[capacidadeAnimai];
        funcionarios = new Funcionario[capacidadeFuncionarios];
        numeroAnimais = 0;
        numeroFuncionarios = 0;
    }

    public void addAnimal(Animal animal){
        if (numeroAnimais < animals.length) {
            animals [numeroAnimais] = animal;
            numeroAnimais++;
            System.out.println("Animal adicionado com sucesso!!");
        }
        else {
            System.out.println("Zoologico cheio!!!");
        }
    }
    public void addFuncionario(Funcionario funcionario){
        if (numeroFuncionarios < funcionarios.length) {
            funcionarios [numeroFuncionarios] = funcionario;
            numeroFuncionarios++;
            System.out.println("Funcionario adicionado com sucesso!!!");
        }
        else {
            System.out.println("Não há mais espaços para funcionarios.");
        }
    }


}