package ex08;

public class Main {
    public static void main(String[] args) {
        ImpressoraJatoTinta imp1 = new ImpressoraJatoTinta();
        imp1.imprimir();
        imp1.escanear();

        ImpressoraLaser imp2 = new ImpressoraLaser();
        imp2.escanear();
        imp2.imprimir();

        ImpressoraMatricial imp3 = new ImpressoraMatricial();
        imp3.escanear();
        imp3.imprimir();
    }
}
