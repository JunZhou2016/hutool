
package com.hutool.opration_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.hutool.opration_helper.base.OperationAides;
import com.hutool.opration_helper.base.OperationHelper;


/**
 * 
* Copyright: Copyright (c) 2019 Jun_Zhou
* 
* @ClassName: ComplexOperationHelper.java
* @Description: 复杂操作助手类;
* 
* @version: v1.0.0
* @author: JunZhou
* @Email: 1769676159@qq.com
* @Site: CERNO
* @date: 2019年3月23日 下午1:49:09
 */
public class ComplexOperationHelper<T extends OperationAides> implements OperationHelper<T>
{
	//老数据;
	protected List<T>	oldDataList	= new ArrayList<T>();
	//新数据;
	protected List<T>	newDataList	= new ArrayList<T>();
	
	/**
	 * 构造函数;
	 * @param oldDataList:老数据;
	 * @param newDataList:新数据;
	 */
	public ComplexOperationHelper(List<T> oldDataList, List<T> newDataList)
	{
		this.oldDataList = oldDataList;
		this.newDataList = newDataList;
	}
	
	public List<T> remainAll(List<T> sourceDataList, List<T> targetDataList)
	{
		//执行数据的深度复制;
		List<T> sourceList = new ArrayList<T>(sourceDataList);
		List<T> targetList = new ArrayList<T>(targetDataList);
		//执行逻辑运算;
		List<T> remainedList = sourceList.stream().filter(sourceEle -> {
			boolean isUpdated = false;
			for (T t : targetList)
			{
				if (sourceEle.equals4Updated(t))
				{
					isUpdated = true;
					break;
				}
			}
			return isUpdated;
		}).collect(Collectors.toList());
		return remainedList;
	}
	
	@Override
	public List<T> removeAll(List<T> sourceDataList, List<T> targetDataList)
	{
		//执行数据的深度复制;
		List<T> sourceList = new ArrayList<T>(sourceDataList);
		List<T> targetList = new ArrayList<T>(targetDataList);
		//执行逻辑运算;
		sourceList.removeIf(sourceEle -> {
			for (T t : targetList)
			{
				if (sourceEle.equals4Fixed(t)) { return true; } //equals4OpHelperFakeCD=>定义未发生变化的数据;
			}
			return false;
		});
		List<T> listAfterRemoved = new ArrayList<T>(sourceList);
		return listAfterRemoved;
	}
	
	@Override
	public List<T> removeAllUpdated(List<T> sourceDataList, List<T> targetDataList)
	{
		//执行数据的深度复制;
		List<T> sourceList = new ArrayList<T>(sourceDataList);
		List<T> targetList = new ArrayList<T>(targetDataList);
		//执行逻辑运算;
		sourceList.removeIf(sourceEle -> {
			for (T t : targetList)
			{
				if (sourceEle.equals4Updated(t)) { return true; }
			}
			return false;
		});
		List<T> listAfterRemoved = new ArrayList<T>(sourceList);
		return listAfterRemoved;
	}
	
	@Override
	public List<T> getFakeAddPart()
	{
		//执行数据的深度复制;
		List<T> oldDataListCopy = new ArrayList<T>(this.oldDataList);
		List<T> newDataListCopy = new ArrayList<T>(this.newDataList);
		//获取伪新增的集合;
		List<T> fakeAddPart = this.removeAll(newDataListCopy, oldDataListCopy);
		return fakeAddPart;
	}
	
	@Override
	public List<T> getFakeDelPart()
	{
		//执行数据的深度复制;
		List<T> oldDataListCopy = new ArrayList<T>(this.oldDataList);
		List<T> newDataListCopy = new ArrayList<T>(this.newDataList);
		//获取伪删除的集合;
		List<T> fakeDelPart = this.removeAll(oldDataListCopy, newDataListCopy);
		return fakeDelPart;
	}
	
	@Override
	public List<T> getAddPart()
	{
		//执行数据的深度复制;
		List<T> fakeAddPartCopy = new ArrayList<T>(this.getFakeAddPart());
		List<T> updatePartCopy = new ArrayList<T>(this.getUpdatedPart());
		//获取新增数据的集合;
		List<T> addPart = this.removeAllUpdated(fakeAddPartCopy, updatePartCopy);
		return addPart;
	}
	
	@Override
	public List<T> getDelPart()
	{
		//执行数据的深度复制;
		List<T> fakeDelPartCopy = new ArrayList<T>(this.getFakeDelPart());
		List<T> updatePartCopy = new ArrayList<T>(this.getUpdatedPart());
		//获取被删除的集合数据;
		List<T> delPart = this.removeAllUpdated(fakeDelPartCopy, updatePartCopy);
		return delPart;
	}
	
	@Override
	public List<T> getUpdatedPart()
	{
		//执行数据的深度复制;
		List<T> fakeAddPart = new ArrayList<T>(this.getFakeAddPart());
		List<T> fakeDelPart = new ArrayList<T>(this.getFakeDelPart());
		//获取被更新的数据的集合;
		List<T> remainedList = this.remainAll(fakeAddPart, fakeDelPart);
		return remainedList;
	}
}
