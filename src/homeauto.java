import static org.junit.Assert.*;

import org.junit.Test;

public class homeauto {

	
	
	
	@Test
	
	public void test() {
		
		String on="on";
		String off="off";
		
		
		//watching matchine
		Fan fan1=new Fan();
		fan1.switch_button(on);
		
		//light
		
		Light light1=new Light();
		light1.switch_button(on);
		
		System.out.println("light "+light1.button);
		System.out.println("fan   "+fan1.button);
	}

}
