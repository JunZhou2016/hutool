package com.hutool.data;

import java.util.ArrayList;
import java.util.List;

import com.hutool.model.People;

/**
 * 
* Copyright: Copyright (c) 2019 Jun_Zhou
* 
* @ClassName: Simulation.java
* @Description: 模拟数据;
* 
* @version: v1.0.0
* @author: JunZhou
* @Email: 1769676159@qq.com
* @Site: CERNO
* @date: 2019年3月20日 下午9:56:13
 */
public class Simulation
{  
	/**
	 * 获取新的模拟数据;
	 * @return
	 */
	public static List<People> getNewSimulationDatas() {
		List<People> PeopleList = new ArrayList<People>();
		
		People People1 = new People("1", "People12", "1", "tinghua1", "man1");
		People People2 = new People("2", "People2", "2", "tinghua2", "man2");
		People People3 = new People("3", "People3", "3", "tinghua3", "man3");
		People People4 = new People("4", "People4", "4", "tinghua4", "man4");
		People People5 = new People("5", "People5", "5", "tinghua65", "man5");
		
		//People People6 = new People("6", "People6", "6", "tinghua6", "man6");
		//People People7 = new People("7", "People7", "7", "tinghua7", "man7");
		//People People8 = new People("8", "People8", "8", "tinghua8", "man8");
		People People9 = new People("9", "People9", "9", "tinghua9", "man9");
		People People10 = new People("10", "People10", "10", "tinghua10", "man10");
		
		
		People People11 = new People("11", "People11", "11", "tinghua11", "man11");
		People People12 = new People("", "People12", "12", "tinghua12", "man12");
		People People13 = new People("", "People13", "13", "tinghua13", "man13");
		People People14 = new People("", "People14", "14", "tinghua14", "man14");
		
		PeopleList.add(People10);
		PeopleList.add(People9);
		//PeopleList.add(People8);
		//PeopleList.add(People7);
		//PeopleList.add(People6);
		
		PeopleList.add(People5);
		PeopleList.add(People4);
		PeopleList.add(People3);
		PeopleList.add(People2);
		PeopleList.add(People1);
		
		PeopleList.add(People11);
		PeopleList.add(People12);
		PeopleList.add(People13);
		PeopleList.add(People14);
		
		return PeopleList;
	}
	
	/**
	 * 获取老的模拟数据;
	 * @return
	 */
	public static List<People> getOldSimulationDatas() {
		List<People> PeopleList = new ArrayList<People>();
		
		People People1 = new People("1", "People1", "1", "tinghua1", "man1");
		People People2 = new People("2", "People2", "2", "tinghua2", "man2");
		People People3 = new People("3", "People3", "3", "tinghua3", "man3");
		People People4 = new People("4", "People4", "4", "tinghua4", "man4");
		People People5 = new People("5", "People5", "5", "tinghua5", "man5");
		
		People People6 = new People("6", "People6", "6", "tinghua6", "man6");
		People People7 = new People("7", "People7", "7", "tinghua7", "man7");
		People People8 = new People("8", "People8", "8", "tinghua8", "man8");
		People People9 = new People("9", "People9", "9", "tinghua9", "man9");
		People People10 = new People("10", "People10", "10", "tinghua10", "man10");
		
		PeopleList.add(People10);
		PeopleList.add(People9);
		PeopleList.add(People8);
		PeopleList.add(People7);
		PeopleList.add(People6);
		
		PeopleList.add(People5);
		PeopleList.add(People4);
		PeopleList.add(People3);
		PeopleList.add(People2);
		PeopleList.add(People1);
		
		return PeopleList;
	}
}
