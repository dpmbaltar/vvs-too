package edu.uncoma.fai.vyv.mutual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestEventos {

    Mutual m = new Mutual();

    @Test
    public void test() {

        // paso 1
        assertTrue(400 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 2
        m.addBeneficiario(1);
        assertTrue(400 == m.getCredito());
        assertTrue(200 == m.getConsumo());
        assertTrue(1 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 3
        m.addTitular(0);
        assertTrue(600 == m.getCredito());
        assertTrue(200 == m.getConsumo());
        assertTrue(1 == m.getBeneficiarios());
        assertTrue(1 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 4
        m.deleteBeneficiario(1);
        assertTrue(600 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(1 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 5
        m.deleteTitular(0);
        assertTrue(400 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());
    }

}
