package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import App.metodoprimero;

public class TDDtest {

    @Test
	@DisplayName("Probamos el  primer metodo")
	void test1() {
		// preparacion
		metodoprimero cal = new metodoprimero();
		// ejecucion
		String resultado = cal.ejerUno(3);
		// asercion/Confirmacion 
		assertEquals("Face", resultado, "0=Face"); 
    }

    @Test
	@DisplayName("Probamos el  primer metodo")
	void test2() {
		// preparacion
		metodoprimero cal = new metodoprimero();
		// ejecucion
		int resultado = cal.ejerUno(5);
		// asercion/Confirmacion 
		assertEquals("Book", resultado, "0=Book"); 
    }

    @Test
	@DisplayName("Probamos el  primer metodo")
	void test3() {
		// preparacion
		metodoprimero cal = new metodoprimero();
		// ejecucion
		int resultado = cal.ejerUno(15);
		// asercion/Confirmacion 
        assertEquals("Facebook", resultado, "0=Facebook"); 
	}
	

    @Test
	@DisplayName("Probamos el  segundo metodo")
	void test4() {
		// preparacion
		metodoprimero cal = new metodoprimero();
		// ejecucion
		int[] prueba = {1, 2, 3};
        String resultado = cal.ejerdos(prueba);
		// asercion/Confirmacion 
		assertEquals("1 2 Face", resultado, "1 2 3"); 
	}
	
	@Test
	@DisplayName("Probamos el  segundo metodo")
	void test5() {
		// preparacion
		metodoprimero cal = new metodoprimero();
		// ejecucion
		int[] prueba = {6, 10, 30};
        String resultado = cal.ejerdos(prueba);
		// asercion/Confirmacion 
		assertEquals("Face Book Facebook", resultado, "6 10 30"); 
	}
	

	
	@Test
	@DisplayName("Probamos el  segundo metodo")
	void test6() {
		// preparacion
		metodoprimero cal = new metodoprimero();
		// ejecucion
		int[] prueba = {4, 6, 8};
        String resultado = cal.ejerdos(prueba);
		// asercion/Confirmacion 
		assertEquals("4 6 8", resultado, "4 6 8"); 
    }



}