package command;

public class SimpleRemoteControl {

	Command slot;
	public SimpleRemoteControl(){}
	//将命令指定到插槽
	public void setCommand(Command command){
		slot=command;
	}
	public void buttonPressed(){
		slot.execute();
	}
}
