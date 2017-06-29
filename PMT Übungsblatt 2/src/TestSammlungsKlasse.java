import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSammlungsKlasse {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("the method" + new Object(){}.getClass().getEnclosingClass().getName() + "has been called" );
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("the method" + new Object(){}.getClass().getEnclosingClass().getName() + "has been called" );
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("the method" + new Object(){}.getClass().getEnclosingClass().getName() + "has been called" );
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("the method" + new Object(){}.getClass().getEnclosingClass().getName() + "has been called" );
	}

	@Test
	public void test() {
		System.out.println("the method" + new Object(){}.getClass().getEnclosingClass().getName() + "has been called" );
	}

}
