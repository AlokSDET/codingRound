package junit_mockito;

import static org.testng.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

public class CalculatorTest {

	Calculator cal;

	/*
	 * //stub or fake object or u can create this object by using mockito framework
	 * CaclculatorService service = new CaclculatorService() {
	 * 
	 * @Override public int add(int i, int j) {
	 * 
	 * return 0; } };
	 */

	// CaclculatorService service = Mockito.mock(CaclculatorService.class);//mocking
	// the calculatorService class.

	@Mock
	CaclculatorService service;// it wisll give null pointer if we use alone.we have to use rule that will
	// say we are using mockito with junit.

	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	// if we know cloud service is working perfectly , then we wont test that
	// service, and our service is dependent on cloud
	// service, we just mock and use.

	@Before
	public void setUp() {
		cal = new Calculator(service);
	}

	@Test
	public void testAdd() {

		assertEquals(5, cal.add(2, 3));
	}

	@Test
	public void testPerform() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(25, cal.perform(2, 3));
		verify(service).add(2, 3);// verify whether you are calling this service.
	}
}
