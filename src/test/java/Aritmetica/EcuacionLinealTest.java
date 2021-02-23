package Aritmetica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EcuacionLinealTest {

    @Test
    @DisplayName("Test para saber si hay solución")
    void haySolucion() {
        Ecuacion objeto = new EcuacionLineal(0,2);
        assertFalse(objeto.haySolucion());

        Ecuacion objeto2 = new EcuacionLineal(2,3);
        assertTrue(objeto2.haySolucion());

        Ecuacion objeto3 = new EcuacionLineal(4,6);
        assertTrue(objeto3.haySolucion());

        Ecuacion objeto4 = new EcuacionLineal(0,0);
        assertFalse(objeto4.haySolucion());

        Ecuacion objeto5 = new EcuacionLineal(5,0);
        assertTrue(objeto5.haySolucion());
    }

    @Test
    @DisplayName("Test para saber el resultado")
    void solucion() {
        Ecuacion objeto = new EcuacionLineal(2,2);
        HashSet<Double> solucion = new HashSet<Double>();
        solucion.add(-1d);
        assertEquals(solucion, objeto.solucion());

        Ecuacion objeto2 = new EcuacionLineal(2,3);
        solucion = new HashSet<Double>();
        solucion.add(-1.5);
        assertEquals(solucion, objeto2.solucion());

        Ecuacion objeto3 = new EcuacionLineal(4,6);
        solucion = new HashSet<Double>();
        solucion.add(-1.5);
        assertEquals(solucion,objeto3.solucion());

        Ecuacion objeto4 = new EcuacionLineal(5,0);
        solucion = new HashSet<Double>();
        solucion.add(-0d);
        assertEquals(solucion,objeto4.solucion());


    }
}