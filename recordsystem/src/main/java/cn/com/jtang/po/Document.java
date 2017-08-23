package cn.com.jtang.po;

import java.io.Serializable;
import java.util.Date;

public class Document implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.id
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.path
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.recordid
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    private String recordid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.uploadtime
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    private Date uploadtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table document
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.id
     *
     * @return the value of document.id
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.id
     *
     * @param id the value for document.id
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.path
     *
     * @return the value of document.path
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.path
     *
     * @param path the value for document.path
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.recordid
     *
     * @return the value of document.recordid
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    public String getRecordid() {
        return recordid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.recordid
     *
     * @param recordid the value for document.recordid
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.uploadtime
     *
     * @return the value of document.uploadtime
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    public Date getUploadtime() {
        return uploadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.uploadtime
     *
     * @param uploadtime the value for document.uploadtime
     *
     * @mbggenerated Tue Jun 21 11:29:25 CST 2016
     */
    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}