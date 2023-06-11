package exercicio03;

public class Main {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        superMan.decolar();
        superMan.voar();
        superMan.aterrar();
        System.out.println(); //apenas para deixar um espaco

        Aviao aviao = new Aviao();
        aviao.decolar();
        aviao.voar();
        aviao.aterrar();
        System.out.println(); //apenas para deixar um espaco

        Passaro passaro = new Passaro();
        passaro.decolar();
        passaro.voar();
        passaro.aterrar();
    }
}
