package Poliformismo.Parametrico;

class ProgramaParametrico{

    public static void main (String args []){

        Parametrico Obj = new Parametrico();
        double resultado;
        Obj.demo(10);
        Obj.demo(10, 20);
        resultado = Obj.demo(5.5);
        System.out.println("Tercer método: " + resultado);

    }

}
