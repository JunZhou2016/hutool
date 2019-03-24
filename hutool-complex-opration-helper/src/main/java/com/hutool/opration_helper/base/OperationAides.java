package com.hutool.opration_helper.base;
/**
 * 
* Copyright: Copyright (c) 2019 Jun_Zhou
* 
* @ClassName: OperationAides.java
* @Description: 描述操作助手的抽象类,当对象需要实现操作辨别帮助的时候需要集成该类;
* 
* @version: v1.0.0
* @author: JunZhou
* @Email: 1769676159@qq.com
* @Site: CERNO
* @date: 2019年3月23日 下午1:57:31
 */
public abstract class OperationAides
{    
	/**
	   * 定义未发生变更的数据;
	 * @param obj
	 * @return
	 */
	public abstract boolean equals4Fixed(Object obj);
	
	/**
	   * 定义发生修改的数据;
	 * @param obj
	 * @return
	 */
	public abstract boolean equals4Updated(Object obj);
}
