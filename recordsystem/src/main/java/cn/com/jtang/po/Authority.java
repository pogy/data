package cn.com.jtang.po;

import java.io.Serializable;

public class Authority implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authority.authorityId
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    private String authorityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authority.code
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authority.name
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authority.description
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authority.authgroupid
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    private String authgroupid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table authority
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authority.authorityId
     *
     * @return the value of authority.authorityId
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public String getAuthorityid() {
        return authorityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authority.authorityId
     *
     * @param authorityid the value for authority.authorityId
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public void setAuthorityid(String authorityid) {
        this.authorityid = authorityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authority.code
     *
     * @return the value of authority.code
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authority.code
     *
     * @param code the value for authority.code
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authority.name
     *
     * @return the value of authority.name
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authority.name
     *
     * @param name the value for authority.name
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authority.description
     *
     * @return the value of authority.description
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authority.description
     *
     * @param description the value for authority.description
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authority.authgroupid
     *
     * @return the value of authority.authgroupid
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public String getAuthgroupid() {
        return authgroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authority.authgroupid
     *
     * @param authgroupid the value for authority.authgroupid
     *
     * @mbggenerated Wed Aug 10 10:43:54 CST 2016
     */
    public void setAuthgroupid(String authgroupid) {
        this.authgroupid = authgroupid;
    }
}