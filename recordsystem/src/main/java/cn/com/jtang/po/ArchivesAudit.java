package cn.com.jtang.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class ArchivesAudit implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.operator
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String id;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.operator
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String userId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.operator
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String userName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.operator
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.event
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.event
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deadline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.event
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.createtime
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.createtime
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.createtime
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String status;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.createtime
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String isread;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.createtime
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String recordtypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.createtime
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String recordid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.createtime
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private String accesspermission;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.operator
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table log
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
    private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public Date getApplytime() {
		return applytime;
	}

	public void setApplytime(Date applytime) {
		this.applytime = applytime;
	}

	public String getIsread() {
		return isread;
	}

	public void setIsread(String isread) {
		this.isread = isread;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRecordtypeid() {
		return recordtypeid;
	}

	public void setRecordtypeid(String recordtypeid) {
		this.recordtypeid = recordtypeid;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getRecordid() {
		return recordid;
	}

	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}

	public String getAccesspermission() {
		return accesspermission;
	}

	public void setAccesspermission(String accesspermission) {
		this.accesspermission = accesspermission;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.operator
     *
     * @return the value of log.operator
     *
     * @mbggenerated Mon Aug 01 17:07:12 CST 2016
     */
}