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

    }

    @Test
    @DisplayName("Test para saber el resultado")
    void solucion() {
        Ecuacion objeto = new EcuacionLineal(2,2);
        HashSet<Double> solucion = new HashSet<Double>();
        solucion.add(-1d);
        assertEquals(solucion, objeto.solucion());

        Ecuacion objeto2 = new EcuacionLineal(2,4);
        solucion = new HashSet<Double>();
        solucion.add(-2d);
        assertEquals(solucion, objeto2.solucion());
    }
}