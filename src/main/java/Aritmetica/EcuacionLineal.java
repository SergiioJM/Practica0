package Aritmetica;

public class EcuacionLineal {
    private final double a;
    private final double b;

    public EcuacionLineal(double a, double b){
        this.a = a;
        this.b = b;
    }
//Prueba
    public boolean haySolucion(){
        return a != 0;

    }
    public double solucion (){
        return -b/a;
    }
}
