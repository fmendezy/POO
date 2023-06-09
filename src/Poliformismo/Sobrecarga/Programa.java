package Poliformismo.Sobrecarga;

public class Programa

{

    public static void main (String[] args) {

        Animal pelusa = new Perro();

        Animal benito = new Gato();

        System.out.print("El gato hace: ");

        benito.generarSonido();

        System.out.print("El perro hace: ");

        pelusa.generarSonido();

    }

}