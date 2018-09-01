package com.test.obsever;

public class ConcreateObsever implements Obsever {
	
	private String name ;
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public void update(Object content) {
		ConcreateSubject subject = (ConcreateSubject) content;
		System.out.println(name+"收到了消息：" + subject.getStatus());
		
	}
	
	
	
}
