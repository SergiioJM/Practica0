package Aritmetica;

import java.util.HashSet;

public class EcuacionCuadratica {
    private final double a;
    private final double b;
    private final double c;

    public EcuacionCuadratica(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean haySolucion(){
        if ((-4 * a * c) < 0)
            return false;
        else
            return true;
    }


    public HashSet<Double> solucion(){
        HashSet<Double> resultado = new HashSet<Double>();
        if (a == 0) {
            EcuacionLineal objeto = new EcuacionLineal(b ,c);
            if (objeto.haySolucion()) {
                resultado.add(objeto.solucion());
            }
        }
        else if (b == 0){
            resultado.add(+(Math.sqrt(-c/a)));
            resultado.add(-(Math.sqrt(-c/a)));
        }
        else if (c == 0) {
            resultado.add((double) 0);
            resultado.add(-b / a);
        }
        else {
            resultado.add((-b + Math.sqrt((b*b) - 4 * a * c)/ 2 * a));
            resultado.add((-b - Math.sqrt((b*b) - 4 * a * c)/ 2 * a));
        }
        return resultado;
    }
}
