package StepDefPkg;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	private static Base base;
	
	@Before
	public void InitSetUp() {
		System.out.println(base.empName);
		System.out.println("Enviroment is ready...");
		base.empName="John";
		System.out.println(base.empName);
	}
	
	@After
	public void close() {
		System.out.println("Environmet is closed....");
	}
}
