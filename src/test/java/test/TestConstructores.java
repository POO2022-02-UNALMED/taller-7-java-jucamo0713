package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import comunicacion.Alfabeto;
import comunicacion.Fabula;
import comunicacion.Libro;
import comunicacion.Periodico;
import comunicacion.Tesis;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestConstructores {
	
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
		boolean ok = false;
		if(alfabeto.getOrigen().equals("alfabeto griego, occidente") && alfabeto.cantidadLetras() == 26) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Alfabeto");
    }
	
	@Test
   	public void testFabula(){
		boolean ok = false;
		if(fabula.getOrigen().equals("pensamiento") && fabula.getTitulo().equals("La tortuga y la liebre") && 
				fabula.getAutor().equals("Esopo") && fabula.getPaginas() == 2 && 
				fabula.getEnsenanza().equals("no se debe uno burlar de los demas, ni presumir o ser vanidoso")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Fabula");
    }
	
	@Test
   	public void testLibro(){
		boolean ok = false;
		if(libro.getOrigen().equals("Creacion") && libro.getTitulo().equals("El resplandor") && 
				libro.getAutor().equals("Stephen King") && libro.getPaginas() == 599 && 
				libro.getCo_autor().equals("N/A") && libro.getEditorial().equals("Doubleday") && libro.getEdicion().equals("Primera")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Libro");
    }
	
	@Test
   	public void testPeriodico(){
		boolean ok = false;
		if(periodico.getOrigen().equals("Investigacion") && periodico.getTitulo().equals("Se encontro la solucion") && 
				periodico.getAutor().equals("Colombiano") && periodico.getPaginas() == 6 && 
				periodico.getFecha().equals("20/12/2020") && periodico.getPrimicia().equals("Cura del covid")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Periodico");
    }
	
	@Test
   	public void testTesis(){
		boolean ok = false;
		if(tesis.getOrigen().equals("Pensamiento expansivo") && tesis.getTitulo().equals("Recomendador") && 
				tesis.getAutor().equals("Alejandro") && tesis.getPaginas() == 20 && 
				tesis.getIdea().equals("Recomendar asignaturas") && tesis.getArgumentos().length == 2 && 
				tesis.getConclusion().equals("Se hace trabajo futuro") && tesis.getReferencias().equals("[1] Maquinaria")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Tesis");
    }

}
