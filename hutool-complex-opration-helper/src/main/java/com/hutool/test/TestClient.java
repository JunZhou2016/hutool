
package com.hutool.test;

import java.util.List;

import com.hutool.data.Simulation;
import com.hutool.model.People;
import com.hutool.opration_helper.ComplexOperationHelper;


/**
 * 
* Copyright: Copyright (c) 2019 Jun_Zhou
* 
* @ClassName: TestClient.java
* @Description: 测试客户端;
* 
* @version: v1.0.0
* @author: JunZhou
* @Email: 1769676159@qq.com
* @Site: CERNO
* @date: 2019年3月20日 下午9:48:04
 */
public class TestClient
{
	public static void main(String[] args)
	{
		//原始数据的集合;
		List<People> oldPeopleList = Simulation.getOldSimulationDatas();
		//最新数据的集合;
		List<People> newPeopleList = Simulation.getNewSimulationDatas();
		
		ComplexOperationHelper<People> complexOperationHelper = new ComplexOperationHelper<People>(oldPeopleList, newPeopleList);
		
		//获取新增部分【修改+真新增】;
		List<People> addPart = complexOperationHelper.getAddPart();
		//获取删除部分【修改+真删除】;
		List<People> delPart = complexOperationHelper.getDelPart();
		//获取更新部分;
		List<People> updatedPart = complexOperationHelper.getUpdatedPart();
		
		System.out.println("---------------Add-Part--------------");
		
		addPart.forEach(oldEle -> {
			System.out.println(oldEle.getUuid() + "------>" + oldEle.getName());
		});
		
		System.out.println("---------------Del-Part--------------");
		delPart.forEach(oldEle -> {
			System.out.println(oldEle.getUuid() + "------>" + oldEle.getName());
		});
		
		System.out.println("---------------Update-Part--------------");
		updatedPart.forEach(oldEle -> {
			System.out.println(oldEle.getUuid() + "------>" + oldEle.getName());
		});
	}
}
