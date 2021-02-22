package Aritmetica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EcuacionLinealTest {

    @Test
    @DisplayName("Test para saber si hay solución")
    void haySolucion() {
        EcuacionLineal objeto = new EcuacionLineal(0,2);
        assertFalse(objeto.haySolucion());
        EcuacionLineal objeto2 = new EcuacionLineal(2,3);
        assertTrue(objeto2.haySolucion());
    }

    @Test
    @DisplayName("Test para saber el resultado")
    void solucion() {
        EcuacionLineal objeto = new EcuacionLineal(2,2);
        assertEquals(-1, objeto.solucion());
        EcuacionLineal objeto2 = new EcuacionLineal(2,4);
        assertEquals(-2, objeto2.solucion());
    }
}