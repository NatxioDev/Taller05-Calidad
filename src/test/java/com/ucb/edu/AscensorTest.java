package com.ucb.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class AscensorTest {

    @Test
    public void VerificarPisosNegativos() {

        // 1. Preparacion de la prueba

        Ascensor asc = new Ascensor();
        Persona per = new Persona(-1, 2);
        // 2. Logica de la prueba

        String resultado = asc.movimiento(per);

        // 3. Verificacion o Assert
        assertEquals("No se puede ingresar pisos negativos", resultado);

    }

    @Test
    public void VerificarPisosMayoresA3() {

        // 1. Preparacion de la prueba

        Ascensor asc = new Ascensor();
        Persona per = new Persona(1, 4);
        // 2. Logica de la prueba

        String resultado = asc.movimiento(per);

        // 3. Verificacion o Assert
        assertEquals("No se puede ingresar pisos mayores a 3", resultado);


    }

    @Test
    public void VerificarPisosIguales() {

        // 1. Preparacion de la prueba

        Ascensor asc = new Ascensor();
        Persona per = new Persona(1, 1);
        // 2. Logica de la prueba

        String resultado = asc.movimiento(per);

        // 3. Verificacion o Assert
        assertEquals("No se puede ingresar pisos iguales", resultado);

    }
    //crear test para verificar que el ascensor se mueva hacia arriba
    @Test
    public void VerificarAscensorSube() {

        // 1. Preparacion de la prueba

        Ascensor asc = new Ascensor();
        Persona per = new Persona(1, 2);
        // 2. Logica de la prueba

        String resultado = asc.movimiento(per);

        // 3. Verificacion o Assert
        assertEquals("El ascensor se movio hacia arriba 1 pisos", resultado);

    }
    //crear test para verificar que el ascensor se mueva hacia abajo
    @Test
    public void VerificarAscensorBaja() {

        // 1. Preparacion de la prueba

        Ascensor asc = new Ascensor();
        Persona per = new Persona(2, 1);
        // 2. Logica de la prueba

        String resultado = asc.movimiento(per);

        // 3. Verificacion o Assert
        assertEquals("El ascensor se movio hacia abajo 1 pisos", resultado);

    }
    
}
