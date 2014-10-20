package command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		//��װ����Ľ�����
		LightOnCommand lighton = new LightOnCommand(light);
		LightOffCommand lightoff = new LightOffCommand(light);
		//������ָ�������
		remote.setCommand(lighton);
		remote.buttonPressed();
		remote.setCommand(lightoff);
		remote.buttonPressed();
	}
}
