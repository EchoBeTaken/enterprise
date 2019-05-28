/**
 * 
 */
package com.jack.enterprise.dao;

import java.util.Date;

/**
*发票
*
* @author sunjian
*
* @creation 2019年5月28日 下午9:01:30
*/
public class Invoice {
	//发票相关信息
	private String id; //主键id
	private String number;//发票的编号
	private String type;//类型，棉花，吊牌，拉链。。
	private String lian;  //发票的第几联
	private Date operatingTime; //出库时间
	private String outPerson;   //出库人
	private String signPerson;  //签字人
	private String accountant1;  //会计1
	private String accountant2;  //会计2
	
	//商品相关信息
	private String name;  //名称
	private String unit;  //单位
	private int count;  //数量
	private int unitPrice; //单价
	private int privce;  //总价
	private String remarks;  //备注
	
	//其他信息
	private String createPersonId;  //创建者id
	private Date createTime;  //创建时间，自动生成

}
