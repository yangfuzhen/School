package com.sb;

import com.sa.Student;
import com.sa.Student2;

public class A extends Student implements Student2{
	private int chi;
	public A(String name,int chi) {
				super(name);
				this.chi=chi;
			}
	
	public int getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return super.show()+"\t國文:"+chi;
	}
	public void skill() {
		System.out.println("A skill");
	}

}
