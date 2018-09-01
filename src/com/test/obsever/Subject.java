package com.test.obsever;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	public List<Obsever> lists = new ArrayList<Obsever>();
	
	/*添加观察者*/
	public void addObsever(Obsever obsever) {
		lists.add(obsever);
	}
	
	/*删除观察者*/
	public void delObsever(Obsever obsever) {
		lists.remove(obsever);
	}
	
	public abstract void notifyObsever();
	
	
	
	
	
	
	
	
	
	
}
