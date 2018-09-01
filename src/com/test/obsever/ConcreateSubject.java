package com.test.obsever;

public class ConcreateSubject extends Subject {
	
	private String status;
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		notifyObsever();
		
	}





	@Override
	public void notifyObsever() {
		for(Obsever obj :this.lists) {
			obj.update(this);
		};
		
	}

}
