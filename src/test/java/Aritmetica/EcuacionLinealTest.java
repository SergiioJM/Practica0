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

        objeto = new EcuacionLineal(2,3);
        assertTrue(objeto.haySolucion());

        objeto = new EcuacionLineal(4,6);
        assertTrue(objeto.haySolucion());

        objeto = new EcuacionLineal(0,0);
        assertFalse(objeto.haySolucion());

        objeto = new EcuacionLineal(5,0);
        assertTrue(objeto.haySolucion());
    }

    @Test
    @DisplayName("Test para saber el resultado")
    void solucion() {

            Ecuacion objeto = new EcuacionLineal(2, 2);
            HashSet<Double> solucion = new HashSet<Double>();
            solucion.add(-1d);
            assertEquals(solucion, objeto.solucion());

            objeto = new EcuacionLineal(2, 3);
            solucion = new HashSet<Double>();
            solucion.add(-1.5);
            assertEquals(solucion, objeto.solucion());

            objeto = new EcuacionLineal(4, 6);
            solucion = new HashSet<Double>();
            solucion.add(-1.5);
            assertEquals(solucion, objeto.solucion());

            objeto = new EcuacionLineal(5, 0);
            solucion = new HashSet<Double>();
            solucion.add(-0d);
            assertEquals(solucion, objeto.solucion());

            objeto = new EcuacionLineal(0, 5);
            solucion = new HashSet<Double>();
            solucion.add(-0d);
            assertEquals(solucion, objeto.solucion());

        }
    }
