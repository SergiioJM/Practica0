package Aritmetica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class EcuacionCuadraticaTest {

    @Test
    @DisplayName("Test para saber si hay solución")
    void haySolucion() {
        Ecuacion objeto2 = new EcuacionCuadratica(1,-5,6);
        assertTrue(objeto2.haySolucion());

        objeto2 = new EcuacionCuadratica(2,-7,3);
        assertTrue(objeto2.haySolucion());

        objeto2 = new EcuacionCuadratica(0,2,2);
        assertTrue(objeto2.haySolucion());

        objeto2 = new EcuacionCuadratica(0,2,4);
        assertTrue(objeto2.haySolucion());

        objeto2 = new EcuacionCuadratica(-2,0,50);
        assertTrue(objeto2.haySolucion());

        objeto2 = new EcuacionCuadratica(3,3,0);
        assertTrue(objeto2.haySolucion());

        objeto2 = new EcuacionCuadratica(1,2,2);
        assertFalse(objeto2.haySolucion());

        objeto2 = new EcuacionCuadratica(0,0,2);
        assertFalse(objeto2.haySolucion());

        objeto2 = new EcuacionCuadratica(0,2,0);
        assertTrue(objeto2.haySolucion());
    }

    @Test
    @DisplayName("Test para saber la solución")
    void solucion() {

        //Prueba 1  Sin 0s
        Ecuacion objeto = new EcuacionCuadratica(1,-5,6);
        HashSet<Double> solucion = new HashSet<Double>();
        solucion.add(3d);
        solucion.add(2d);
        assertEquals(solucion, objeto.solucion());

        //Prueba 2  Sin 0s
        objeto = new EcuacionCuadratica(2,-7,3);
        solucion = new HashSet<>();
        solucion.add(1/2d);
        solucion.add(3d);
        assertEquals(solucion, objeto.solucion());

        //Prueba 3     A = 0
        objeto = new EcuacionCuadratica(0,2,2);
        solucion = new HashSet<>();
        solucion.add(-1d);
        assertEquals(solucion, objeto.solucion());

        //Prueba 4      A = 0
        objeto = new EcuacionCuadratica(0,2,4);
        solucion = new HashSet<>();
        solucion.add(-2d);
        assertEquals(solucion, objeto.solucion());

        //Prueba 5      B = 0
        objeto = new EcuacionCuadratica(-2,0,50);
        solucion = new HashSet<>();
        solucion.add(5d);
        solucion.add(-5d);
        assertEquals(solucion, objeto.solucion());

        //Prueba 6      C = 0
        objeto = new EcuacionCuadratica(3,3,0);
        solucion = new HashSet<>();
        solucion.add(0d);
        solucion.add(-1d);
        assertEquals(solucion, objeto.solucion());

    }
}