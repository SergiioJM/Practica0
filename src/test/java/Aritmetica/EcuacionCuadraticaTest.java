package Aritmetica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.logging.Handler;

import static org.junit.jupiter.api.Assertions.*;

class EcuacionCuadraticaTest {

    @Test
    @DisplayName("Test para saber si hay solución")
    void haySolucion() {
    }

    @Test
    @DisplayName("Test para saber la solución")
    void solucion() {
        EcuacionCuadratica objeto = new EcuacionCuadratica(1,2,1);
    }
}