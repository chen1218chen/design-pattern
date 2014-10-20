package builder;

import java.util.ArrayList;

public abstract class Builder {
	
	private ArrayList<String> sq = new ArrayList<String>();
	
	protected abstract void start(); 
	protected abstract void add(); 
	protected abstract void stop();
	
	final public void run(){
		for(int i=0;i<sq.size();i++){
			String action = sq.get(i);
			if("start".equals(action))
				this.start();
			else if("add".equals(action)){
				this.add();
			}
			else if("stop".equals(action)){
				this.stop();
			}
		}
	}
	
	public void setSq(ArrayList<String> sq){
		this.sq = sq;
	}
}
