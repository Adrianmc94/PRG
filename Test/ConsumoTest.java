package Ejercicio2Bol9;

import org.junit.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

class ConsumoTest {

    @TestFactory
    @Test
    public void testConstrutorPorDefecto() {
        Consumo consumo = new Consumo();
        assertEquals(0, consumo.getKilometros(), "Os km deben ser 0 por defecto");
        assertEquals(0, consumo.getLitros(), "Os litros deben ser 0 por defecto");
        assertEquals(0, consumo.getVelocidadMedia(), "A velocidade media debe ser 0 por defecto");
        assertEquals(0, consumo.getPrezGasolina(), "O prezo da gasolina debe ser 0 por defecto");
    }

@Test
    public void testConstrutorConParametros() {
        Consumo consumo = new Consumo(300, 20, 100, 1.57);
        assertEquals(300, consumo.getKilometros(), "Os km deben ser 300");
        assertEquals(20, consumo.getLitros(), "Os litros deben ser 20");
        assertEquals(100, consumo.getVelocidadMedia(), "A velocidade media debe ser 100");
        assertEquals(1.57, consumo.getPrezGasolina(), "O prezo da gasolina debe ser 1.57");
    }

@Test
    public void testSetters() {
        Consumo consumo = new Consumo();
        consumo.setKilometros(150);
        consumo.setLitros(10);
        consumo.setVelocidadMedia(75);
        consumo.setPrezGasolina(1.60);

        assertEquals(150, consumo.getKilometros(), "Os km deben ser 150");
        assertEquals(10, consumo.getLitros(), "Os litros deben ser 10");
        assertEquals(75, consumo.getVelocidadMedia(), "A velocidade media debe ser 75");
        assertEquals(1.60, consumo.getPrezGasolina(), "O prezo da gasolina debe ser 1.60");
    }
@Test
    public void testGetTempo() {
        Consumo consumo = new Consumo(300, 20, 100, 1.57);
        assertEquals(3.0, consumo.getTempo(), "O tempo debe ser 3 horas");
    }

}