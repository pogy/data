package cn.com.jtang.po;

import java.io.Serializable;

public class RoleAuthorityKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roleauthority.roleId
     *
     * @mbggenerated Fri Jul 29 11:01:18 CST 2016
     */
    private Integer roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roleauthority.authorityId
     *
     * @mbggenerated Fri Jul 29 11:01:18 CST 2016
     */
    private String authorityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roleauthority
     *
     * @mbggenerated Fri Jul 29 11:01:18 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roleauthority.roleId
     *
     * @return the value of roleauthority.roleId
     *
     * @mbggenerated Fri Jul 29 11:01:18 CST 2016
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roleauthority.roleId
     *
     * @param roleid the value for roleauthority.roleId
     *
     * @mbggenerated Fri Jul 29 11:01:18 CST 2016
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roleauthority.authorityId
     *
     * @return the value of roleauthority.authorityId
     *
     * @mbggenerated Fri Jul 29 11:01:18 CST 2016
     */
    public String getAuthorityid() {
        return authorityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roleauthority.authorityId
     *
     * @param authorityid the value for roleauthority.authorityId
     *
     * @mbggenerated Fri Jul 29 11:01:18 CST 2016
     */
    public void setAuthorityid(String authorityid) {
        this.authorityid = authorityid;
    }
}