package Poliformismo.Parametrico;

class Parametrico {

    void demo (int a){
        System.out.println ("a: " + a);
    }

    void demo (int a, int b){
        System.out.println ("a y b: " + a + "," + b);
    }

    double demo(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }

}