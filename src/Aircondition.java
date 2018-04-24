
public class Aircondition {

	public AirconditionData data = new AirconditionData();
	public Aircondition()
	{
		data.button="off";
	}
	public Aircondition(String str)
	{
		data.button=str;
	}
	public void switch_button(String str)
	{
		data.button=str;
	}
}
