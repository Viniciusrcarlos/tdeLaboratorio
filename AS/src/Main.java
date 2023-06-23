public class Main {
    public static void main(String[] args) {
        // criar Zoologico ->
        Zoo zoo = new Zoo(5, 5);
        // criar animais ->
        Mamifero mamifero1 = new Mamifero("Vaca", 2, 200, "Neloi", "Malhada");
        Mamifero mamifero2 = new Mamifero("Vaca1", 3, 201, "Neloi", "Malhada");
        Mamifero mamifero3 = new Mamifero("Vaca2", 4, 202, "Neloi", "Malhada");
        Ave ave1 = new Ave("Papagaio", 2, 3, "Arara", 4);
        Ave ave2 = new Ave("Arara", 2, 3, "Arara", 4);
        Ave ave3 = new Ave("Tucano", 2, 3, "Arara", 4);

        // adicionando animais ->
        zoo.addAnimal(mamifero1);
        zoo.addAnimal(mamifero2);
        zoo.addAnimal(mamifero3);
        zoo.addAnimal(ave1);
        zoo.addAnimal(ave2);
        zoo.addAnimal(ave3);

        // criando funcionarios ->
        Veterinario veterinario1 = new Veterinario("Jailson", "Veterinario", 3500, "Mamiferos");
        Veterinario veterinario2 = new Veterinario("Jailson", "Veterinario", 3500, "Mamiferos");
        Veterinario veterinario3 = new Veterinario("Jailson", "Veterinario", 3500, "Mamiferos");
        Veterinario veterinario4 = new Veterinario("Jailson", "Veterinario", 3500, "Mamiferos");
        Veterinario veterinario5 = new Veterinario("Jailson", "Veterinario", 3500, "Mamiferos");
        Veterinario veterinario6 = new Veterinario("Jailson", "Veterinario", 3500, "Mamiferos");

        // adicionando funcionarios ->
        zoo.addFuncionario(veterinario1);
        zoo.addFuncionario(veterinario2);
        zoo.addFuncionario(veterinario3);
        zoo.addFuncionario(veterinario4);
        zoo.addFuncionario(veterinario5);
        zoo.addFuncionario(veterinario6);

        // metodos
        mamifero1.amamentar();
        mamifero1.movimentar();
        mamifero1.movimentar("pulando");

        ave1.voar();
        ave1.realizarTruque();
        ave1.movimentar();
        ave1.movimentar("pulando");




    }
}