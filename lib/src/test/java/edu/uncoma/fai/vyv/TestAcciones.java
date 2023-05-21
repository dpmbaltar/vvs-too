package edu.uncoma.fai.vyv;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.uncoma.fai.vyv.mutual.Mutual;

public class TestAcciones {

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
        m.addBeneficiario(0);
        assertTrue(400 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 3
        m.addBeneficiario(1);
        assertTrue(400 == m.getCredito());
        assertTrue(200 == m.getConsumo());
        assertTrue(1 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 4
        m.addBeneficiario(2);
        assertTrue(400 == m.getCredito());
        assertTrue(600 == m.getConsumo());
        assertTrue(3 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_PERDIDA == m.getEstado());

        // paso 5
        // no cambia el consumo ni beneficiarios por estar en perdida
        m.addBeneficiario(3);
        assertTrue(400 == m.getCredito());
        assertTrue(600 == m.getConsumo());
        assertTrue(3 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_PERDIDA == m.getEstado());

        // paso 6
        m.addBeneficiario(4);
        assertTrue(400 == m.getCredito());
        assertTrue(600 == m.getConsumo());
        assertTrue(3 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_PERDIDA == m.getEstado());

        // paso 7
        m.deleteBeneficiario(0);
        assertTrue(400 == m.getCredito());
        assertTrue(600 == m.getConsumo());
        assertTrue(3 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_PERDIDA == m.getEstado());

        // paso 8
        m.deleteBeneficiario(1);
        assertTrue(400 == m.getCredito());
        assertTrue(400 == m.getConsumo());
        assertTrue(2 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_BALANCEADO == m.getEstado());

        // paso 9
        m.deleteBeneficiario(2);
        assertTrue(400 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 10
        m.deleteBeneficiario(3);
        assertTrue(400 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 11
        m.deleteBeneficiario(4);
        assertTrue(400 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 12
        m.addTitular(0);
        assertTrue(600 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(1 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 13
        m.addTitular(1);
        assertTrue(1000 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(2 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 14
        m.addTitular(2);
        assertTrue(1500 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        assertTrue(3 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 15
        m.addTitular(3);
        assertTrue(1500 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        //assertTrue(3 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 16
        m.deleteTitular(0);
        assertTrue(1300 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        //assertTrue(2 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 17
        m.deleteTitular(1);
        assertTrue(900 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        //assertTrue(1 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 18
        m.deleteTitular(2);
        assertTrue(400 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        //assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 19
        m.deleteTitular(3);
        assertTrue(400 == m.getCredito());
        assertTrue(0 == m.getConsumo());
        assertTrue(0 == m.getBeneficiarios());
        //assertTrue(0 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());
    }

}
