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
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the lian
	 */
	public String getLian() {
		return lian;
	}
	/**
	 * @param lian the lian to set
	 */
	public void setLian(String lian) {
		this.lian = lian;
	}
	/**
	 * @return the operatingTime
	 */
	public Date getOperatingTime() {
		return operatingTime;
	}
	/**
	 * @param operatingTime the operatingTime to set
	 */
	public void setOperatingTime(Date operatingTime) {
		this.operatingTime = operatingTime;
	}
	/**
	 * @return the outPerson
	 */
	public String getOutPerson() {
		return outPerson;
	}
	/**
	 * @param outPerson the outPerson to set
	 */
	public void setOutPerson(String outPerson) {
		this.outPerson = outPerson;
	}
	/**
	 * @return the signPerson
	 */
	public String getSignPerson() {
		return signPerson;
	}
	/**
	 * @param signPerson the signPerson to set
	 */
	public void setSignPerson(String signPerson) {
		this.signPerson = signPerson;
	}
	/**
	 * @return the accountant1
	 */
	public String getAccountant1() {
		return accountant1;
	}
	/**
	 * @param accountant1 the accountant1 to set
	 */
	public void setAccountant1(String accountant1) {
		this.accountant1 = accountant1;
	}
	/**
	 * @return the accountant2
	 */
	public String getAccountant2() {
		return accountant2;
	}
	/**
	 * @param accountant2 the accountant2 to set
	 */
	public void setAccountant2(String accountant2) {
		this.accountant2 = accountant2;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the unitPrice
	 */
	public int getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the privce
	 */
	public int getPrivce() {
		return privce;
	}
	/**
	 * @param privce the privce to set
	 */
	public void setPrivce(int privce) {
		this.privce = privce;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the createPersonId
	 */
	public String getCreatePersonId() {
		return createPersonId;
	}
	/**
	 * @param createPersonId the createPersonId to set
	 */
	public void setCreatePersonId(String createPersonId) {
		this.createPersonId = createPersonId;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	

}
