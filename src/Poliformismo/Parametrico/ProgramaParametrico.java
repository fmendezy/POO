package Poliformismo.Parametrico;

import Poliformismo.Parametrico.Sobrecarga;

class ProgramaParametrico{

    public static void main (String args []){

        Sobrecarga Obj = new Sobrecarga();
        double resultado;
        Obj.demo(10);
        Obj.demo(10, 20);
        resultado = Obj.demo(5.5);
        System.out.println("Tercer método: " + resultado);

    }

}
