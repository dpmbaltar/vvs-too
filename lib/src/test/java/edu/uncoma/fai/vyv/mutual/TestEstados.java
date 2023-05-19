package edu.uncoma.fai.vyv.mutual;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestEstados {

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
        m.addBeneficiario(2);
        assertTrue(400 == m.getCredito());
		assertTrue(400 == m.getConsumo());
		assertTrue(2 == m.getBeneficiarios());
		assertTrue(0 == m.getTitulares());
		assertTrue(Mutual.ESTADO_BALANCEADO == m.getEstado());

        // paso 3
        m.addTitular(1);
        assertTrue(800 == m.getCredito());
		assertTrue(400 == m.getConsumo());
		assertTrue(2 == m.getBeneficiarios());
		assertTrue(1 == m.getTitulares());
		assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 4
        m.addBeneficiario(3);
        assertTrue(800 == m.getCredito());
		assertTrue(1000 == m.getConsumo());
		assertTrue(5 == m.getBeneficiarios());
		assertTrue(1 == m.getTitulares());
		assertTrue(Mutual.ESTADO_PERDIDA == m.getEstado());

        // paso 5
        m.addTitular(1);
        assertTrue(1200 == m.getCredito());
		assertTrue(1000 == m.getConsumo());
		assertTrue(5 == m.getBeneficiarios());
		assertTrue(2 == m.getTitulares());
        assertTrue(Mutual.ESTADO_BALANCEADO == m.getEstado());

        // paso 6
        m.addTitular(0);
        assertTrue(1400 == m.getCredito());
		assertTrue(1000 == m.getConsumo());
		assertTrue(5 == m.getBeneficiarios());
		assertTrue(3 == m.getTitulares());
        assertTrue(Mutual.ESTADO_GANANCIA == m.getEstado());

        // paso 7
        m.addBeneficiario(3);
        assertTrue(1400 == m.getCredito());
		assertTrue(1600 == m.getConsumo());
		assertTrue(8 == m.getBeneficiarios());
		assertTrue(3 == m.getTitulares());
		assertTrue(Mutual.ESTADO_PASIVO == m.getEstado());
    }

}
