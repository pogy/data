package cn.com.jtang.po;

import java.io.Serializable;

public class Department implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.id
     *
     * @mbggenerated Wed Jul 06 19:05:07 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.name
     *
     * @mbggenerated Wed Jul 06 19:05:07 CST 2016
     */
    private String no;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.name
     *
     * @mbggenerated Wed Jul 06 19:05:07 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table department
     *
     * @mbggenerated Wed Jul 06 19:05:07 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.id
     *
     * @return the value of department.id
     *
     * @mbggenerated Wed Jul 06 19:05:07 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.id
     *
     * @param id the value for department.id
     *
     * @mbggenerated Wed Jul 06 19:05:07 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.name
     *
     * @return the value of department.name
     *
     * @mbggenerated Wed Jul 06 19:05:07 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.name
     *
     * @param name the value for department.name
     *
     * @mbggenerated Wed Jul 06 19:05:07 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
}