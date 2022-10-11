package test;

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
public class TestToString {
	
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
		String  comp = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
		boolean ok = false;
		if (alfabeto.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Alfabeto");
    }
	
	@Test
   	public void testFabula(){
		String  comp = "pensamiento\n" +
				"La tortuga y la liebre\n" + 
				"Esopo\n" + 
				"2\n" + 
				"no se debe uno burlar de los demas, ni presumir o ser vanidoso";
		boolean ok = false;
		if (fabula.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Fabula");
    }
	
	@Test
   	public void testLibro(){
		String  comp = "Creacion\n" + 
				"El resplandor\n" + 
				"Stephen King\n" + 
				"599\n" + 
				"N/A\n" + 
				"Doubleday\n" + 
				"Primera";
		boolean ok = false;
		if (libro.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Libro");
    }
	
	@Test
   	public void testPeriodico(){
		String  comp = "Investigacion\n" + 
				"Se encontro la solucion\n" + 
				"Colombiano\n" + 
				"6\n" + 
				"20/12/2020\n" + 
				"Cura del covid";
		boolean ok = false;
		if (periodico.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Periodico");
    }
	
	@Test
   	public void testTesis(){
		String  comp = "Pensamiento expansivo\n" + 
				"Recomendador\n" + 
				"Alejandro\n" + 
				"20\n" + 
				"Recomendar asignaturas\n" + 
				"2\n" + 
				"Se hace trabajo futuro\n" + 
				"[1] Maquinaria";
		boolean ok = false;
		if (tesis.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Tesis");
    }
}
