package observer2;

import java.util.ArrayList;
/**
 * 
 * @author cc
 * 2016-6-7
 * 
 *
 */
public class Subject implements ISubject{

	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	private String str;//更新的消息
	private Observer observer;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public Observer getObserver() {
		return observer;
	}

	public void setObserver(Observer observer) {
		this.observer = observer;
	}
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observerList.add(o);
	}

	@Override
	public void remove(Observer o) {
		// TODO Auto-generated method stub
		observerList.remove(o);
	}

	@Override
	public void nodifyAll() {
		// TODO Auto-generated method stub
//		for(Observer observer :observerList){
		for(int i=0;i<observerList.size();i++){
			ConObserver observer = (ConObserver) observerList.get(i);
			observer.update("第"+(i+1)+"个==="+str);
		}
	}
	
	@Override
	public void nodify(String str) {
		// TODO Auto-generated method stub
		observer.update(str);
	}

}
