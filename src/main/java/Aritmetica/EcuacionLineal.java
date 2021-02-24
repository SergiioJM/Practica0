package Aritmetica;

import java.io.NotActiveException;
import java.util.HashSet;

public class EcuacionLineal implements Ecuacion{
    private final double a;
    private final double b;

    public EcuacionLineal(double a, double b){
        this.a = a;
        this.b = b;
    }

    public boolean haySolucion(){
        return a != 0;
    }

    public HashSet<Double> solucion (){
        HashSet<Double> resultado = new HashSet<>();
        if (a == 0 && b == 0){
            resultado.add(Double.POSITIVE_INFINITY);
        }
        else {
            resultado.add(-b / a);
        }
        return resultado;
    }
}
