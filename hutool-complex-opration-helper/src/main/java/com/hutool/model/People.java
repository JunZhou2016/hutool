
package com.hutool.model;

import com.hutool.opration_helper.base.OperationAides;


/**
 * 
* Copyright: Copyright (c) 2019 Jun_Zhou
* 
* @ClassName: people.java
* @Description: 描述人员的实体类;
* 
* @version: v1.0.0
* @author: JunZhou
* @Email: 1769676159@qq.com
* @Site: CERNO
* @date: 2019年3月23日 下午2:00:23
 */
public class People extends OperationAides
{
	
	private String	uuid;
	private String	name;
	private String	age;
	private String	school;
	private String	sex;
	
	public People(String uuid, String name, String age, String school, String sex)
	{
		this.uuid = uuid;
		this.name = name;
		this.age = age;
		this.school = school;
		this.sex = sex;
	}
	
	public String getUuid()
	{
		return uuid;
	}
	
	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAge()
	{
		return age;
	}
	
	public void setAge(String age)
	{
		this.age = age;
	}
	
	public String getSchool()
	{
		return school;
	}
	
	public void setSchool(String school)
	{
		this.school = school;
	}
	
	public String getSex()
	{
		return sex;
	}
	
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	@Override
	public boolean equals4Fixed(Object obj)
	{
		People object = (People) obj;
		return this.toString().equals(object.toString());
	}
	
	@Override
	public boolean equals4Updated(Object obj)
	{
		People object = (People) obj;
		String objectUuid = object.getUuid();
		String currentUuid = this.uuid;
		if (((!"".equals(objectUuid)) && (objectUuid != null)) && ((!"".equals(currentUuid)) && (currentUuid != null)))
		{
			if (objectUuid.equals(currentUuid)) { return true; }
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return "Person [uuid=" + uuid + ", name=" + name + ", age=" + age + ", school=" + school + ", sex=" + sex + "]";
	}
}
