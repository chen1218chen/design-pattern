package observer2;

public interface ISubject {
	public void register(Observer o);//注册
	public void remove(Observer o);//移除
	public void nodify(String str);//通知
	public void nodifyAll();
}
