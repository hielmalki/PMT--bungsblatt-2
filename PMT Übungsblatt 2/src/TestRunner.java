import static org.junit.Assert.*;

import org.junit.Test;


public class TestRunner {

	@Test
	public void test() {
		assertEquals("Fehler!", 8, Main.add(5, 3));
	}
	
	@Test
	public void test1() {
		assertEquals("Fehler bei Index {0}", 6, Main.mult(3, 2));
	}
	
	
	// Diese Methode schlägt fehl
	@Test
	public void test2() {
		assertTrue("Fehler bei Index {0}", false);
	}
	
	@Test
	public void test3() {
		assertTrue("Fehler bei Index {0}", true);
	}
	/************************************  CompareTo Test  *****************************************************/
	@Test
	public void test4() {
		assertEquals("Fehler bei Index {0}", true, Main.compareTo("hicham", "hicham"));
	}
	@Test
	public void test5() {
		assertEquals("Fehler bei Index {0}", false, Main.compareTo("hi", "hicham"));
	}
	
	@Test
	public void test6() {
		assertEquals("Fehler bei Index {0}", false, Main.compareTo("hicham", ""));
	}
	
	@Test
	public void test7() {
		assertEquals("Fehler bei Index {0}", false, Main.compareTo("hicham", null));
	}
	
	@Test
	public void test8() {
		assertEquals("Fehler bei Index {0}", true, Main.compareTo("", ""));
	}
	
	/************************************  SubString Test  *****************************************************/

	@Test
	public void test9(){
		
		String str = "Cogito ergo sum";
		final String STR_CONST = "ergo";
		String strErgo = str.substring(7, 11);

		assertEquals("Fehler!", STR_CONST, strErgo);
		//assertSame("Fehler!", STR_CONST, strErgo); funktioniert nicht, angeblich der Compiler vergleicht die beiden Adresse der Strings!
		assertSame("Fehler!", "hic", "hic");
	}
}
