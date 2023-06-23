public class Veterinario extends Funcionario{
    private String especialidade;

    // construtor ->
    public Veterinario (String nome, String cargo, double salario, String especialidade) {
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
        setEspecialidade(especialidade);
    }

    public void setEspecialidade (String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade () {
        return especialidade;
    }

    public void realizarExame(Animal animal){
        System.out.println("Veterinario realizando exame...");
    }
}
