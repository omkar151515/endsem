
public class television {

	public String button;
	public int channel=0;
	public int volume;
	public television()
	{
		button="off";
	}
	public television(String str)
	{
		button=str;
	}
	public void switch_button(String str)
	{
		button=str;
	}
	public void channel(int str)
	{
		channel=channel;
	}
	public void channelup()
	{
		channel=channel+1;
	}
	public void channeldown()
	{
		channel=channel-1;
	}
	public void volumeup()
	{
		volume=volume+1;
	}
	public void volumedown()
	{
		volume=volume+1;
	}
}
