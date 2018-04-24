
public class HomeAutomationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String on="on";
		String off="off";
		
		
		//watching matchine
		Fan fan1=new Fan();
		fan1.switch_button(on);
		Fan fan2=new Fan();
		fan2.switch_button(off);
		
		//light
		
		Light light1=new Light();
		light1.switch_button(on);
		Light light2=new Light();
		light2.switch_button(off);
		
		//television
		television tv1=new television();
		tv1.switch_button(on);
		television tv2= new television();
		tv2.channel(69);
		television tv3= new television();
		tv3.channel(10);
		television tv4=new television();
		tv4.switch_button(off);
		
		//watchingmachine
		Washing_machine m1=new Washing_machine();
		m1.switch_button(on);
		Washing_machine m2=new Washing_machine();
		m2.switch_button(off);
		
		
		System.out.println("light "+light1.button);
		System.out.println("fan "+fan1.button);
		System.out.println("television  "+tv1.button);
		System.out.println("televisionchannel  "+tv2.channel);
		System.out.println("televisionvolumn  "+tv3.volume);
		System.out.println("television  "+tv4.button);
		System.out.println("waching machine  "+m1.button);
		System.out.println("waching machine  "+m2.button);
		System.out.println("fan "+fan2.button);
		System.out.println("light "+light2.button);
		
	}

}
