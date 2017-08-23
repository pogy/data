package cn.com.jtang.po;

import java.io.Serializable;
import java.util.Date;

public class StationMail implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column station_mail.mailid
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	private String mailid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column station_mail.form_user
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	private String formUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column station_mail.to_user
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	private String toUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column station_mail.title
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column station_mail.create_time
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column station_mail.is_read
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	private Boolean isRead;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column station_mail.content
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table station_mail
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column station_mail.mailid
	 * @return  the value of station_mail.mailid
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public String getMailid() {
		return mailid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column station_mail.mailid
	 * @param mailid  the value for station_mail.mailid
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column station_mail.form_user
	 * @return  the value of station_mail.form_user
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public String getFormUser() {
		return formUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column station_mail.form_user
	 * @param formUser  the value for station_mail.form_user
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public void setFormUser(String formUser) {
		this.formUser = formUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column station_mail.to_user
	 * @return  the value of station_mail.to_user
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public String getToUser() {
		return toUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column station_mail.to_user
	 * @param toUser  the value for station_mail.to_user
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column station_mail.title
	 * @return  the value of station_mail.title
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column station_mail.title
	 * @param title  the value for station_mail.title
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column station_mail.create_time
	 * @return  the value of station_mail.create_time
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column station_mail.create_time
	 * @param createTime  the value for station_mail.create_time
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column station_mail.is_read
	 * @return  the value of station_mail.is_read
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public Boolean getIsRead() {
		return isRead;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column station_mail.is_read
	 * @param isRead  the value for station_mail.is_read
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column station_mail.content
	 * @return  the value of station_mail.content
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column station_mail.content
	 * @param content  the value for station_mail.content
	 * @mbggenerated  Mon Sep 19 14:03:22 CST 2016
	 */
	public void setContent(String content) {
		this.content = content;
	}
}