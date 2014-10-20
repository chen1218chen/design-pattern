package command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		//封装请求的接收者
		LightOnCommand lighton = new LightOnCommand(light);
		LightOffCommand lightoff = new LightOffCommand(light);
		//将命令指定到插槽
		remote.setCommand(lighton);
		remote.buttonPressed();
		remote.setCommand(lightoff);
		remote.buttonPressed();
	}
}
