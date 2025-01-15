package com.sa;


/**
 * @version1.0
 * @author teacher
 * <br>
 * <h3>學員管理系統</3>
 * 10250115
 */

public class Student
{
	private String name;

	/**
	 * 
	 * @param name新增學生姓名<br>
	 * Ex<br>
	 * new Student("aa");
	 */
	public Student(String name)
	{
		super();
		this.name=name;
	}

	/**
	 * 
	 * @return讀取姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name修改姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return書...
	 */
	public String show()
	{
		return "名:"+name;
	}
}