package appTest;

import static org.junit.Assert.*;

import org.junit.Test;
import App.Calculator;
public class CalculatorTest {

	@Test
	public void testtestAdd() {
		int exp = 30;
		Calculator cal = new Calculator();
		int act = cal.add(10, 20);
		assertEquals(exp, act);
		}
	}

