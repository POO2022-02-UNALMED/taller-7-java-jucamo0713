package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import comunicacion.Alfabeto;
import comunicacion.Fabula;
import comunicacion.Libro;
import comunicacion.Periodico;
import comunicacion.Tesis;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestAbstracto {
	
	public static Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
			new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
			"Alfabeto latino");
	public static Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, 
			"no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");
	
	public static Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, "N/A", "Doubleday", "Primera", "Escrito largo");
	
	public static Periodico periodico = new Periodico("Investigacion", "Se encontro la solucion", "Colombiano", 6, "20/12/2020", "Cura del covid", "Escrito informativo");
	
	public static Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"},
			"Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
	
	@Test
   	public void testAlfabeto(){
		String  comp = "Alfabeto latino";
		boolean ok = false;
		if (alfabeto.interpretacion().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en los metodos de Alfabeto");
    }
	
	@Test
   	public void testFabula(){
		String  comp = "Cuento corto";
		boolean ok = false;
		if (fabula.interpretacion().equals(comp) && fabula.palabrasTotales(140) == 280) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en los metodos de Fabula");
    }
	
	@Test
   	public void testLibro(){
		String  comp = "Escrito largo";
		boolean ok = false;
		if (libro.interpretacion().equals(comp) && libro.palabrasTotales(140) == 167720) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en los metodos de Libro");
    }
	
	@Test
   	public void testPeriodico(){
		String  comp = "Escrito informativo";
		boolean ok = false;
		if (periodico.interpretacion().equals(comp) && periodico.palabrasTotales(140) == 8400) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en los metodos de Periodico");
    }
	
	@Test
   	public void testTesis(){
		String  comp = "Escrito investigativo";
		boolean ok = false;
		if (tesis.interpretacion().equals(comp) && tesis.palabrasTotales(140) == 14000) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en los metodos de Tesis");
    }
	
}
