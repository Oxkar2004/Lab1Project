package lab1;
public class Main {
    public static void main(String[] args) {
        NumeroNatural numero1 = new NumeroNatural();
        NumeroNatural numero2 = new NumeroNatural();
        numero1.setNumero(0);
        numero2.setNumero(6);
        System.out.println(numero1.getNumero());
        numero1.incrementar();
        System.out.println(numero1.getNumero());
        numero1.decrementar();
        System.out.println(numero1.getNumero());
        System.out.println(numero1.esPar());
        System.out.println(numero1.esPrimo());
        System.out.println(numero1.esPerfecto());
        System.out.println(numero1.pow(3));
        System.out.println(numero1.half());
        System.out.println(numero1.distancia(numero2));
        numero1.syncToMinor(numero2);
        System.out.println(numero1.getNumero());
        System.out.println(numero2.getNumero());
    }
}
