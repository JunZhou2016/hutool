
package com.hutool.opration_helper.base;

import java.util.List;


public interface OperationHelper<T>
{
	/**
	 * 获取两个list中的公共部分;
	 */
	List<T> remainAll(List<T> sourceDataList, List<T> targetDataList);
	
	/**
	 * 从源集合中移除指定的集合;
	 * @param sourceDataList:源集合;
	 * @param targetDataList:目标集合[被移除的集合];
	 * @return
	 */
	List<T> removeAll(List<T> sourceDataList, List<T> targetDataList);
	
	/**
	 *   从源集合中移除所有被更新的集合;
	 * @param sourceDataList:源集合;
	 * @param targetDataList:目标集合[被移除的集合];
	 * @return
	 */
	List<T> removeAllUpdated(List<T> sourceDataList, List<T> targetDataList);
	
	/**
	 * 获取伪新增数据,包含修改部分;
	 * @return
	 */
	List<T> getFakeAddPart();
	
	/**
	 * 获取伪删除部分数据，包含修改部分;
	 * @return
	 */
	List<T> getFakeDelPart();
	
	/**
	  * 获取发生修改的数据集合;
	 * @return
	 */
	List<T> getUpdatedPart();
	
	/**
	 * 获取新数据中的新增部分;
	 * @param oldList:老数据;
	 * @param newList:最新数据;
	 * @return :数据中的新增部分;
	 *                       新增部分 = 新数据 - (新数据∩老数据)            
	 */
	List<T> getAddPart();
	
	/**
	 * 获取老数据中的删除部分;
	 * @param oldList:老数据;
	 * @param newList:最新数据;
	 * @return :数据中的新增部分;
	 *                      删除部分 = 新数据 - (新数据∩老数据)
	 */
	List<T> getDelPart();
}
