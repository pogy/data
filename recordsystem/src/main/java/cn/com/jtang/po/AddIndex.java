package cn.com.jtang.po;

import java.io.Serializable;

public class AddIndex implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column description.id
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column description.name
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column description.status
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    private String status;

    public String getNo () {
        return no;
    }

    public void setNo (String no) {
        this.no = no;
    }

    private String no;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table description
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column description.id
     *
     * @return the value of description.id
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column description.id
     *
     * @param id the value for description.id
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column description.name
     *
     * @return the value of description.name
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column description.name
     *
     * @param name the value for description.name
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column description.status
     *
     * @return the value of description.status
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column description.status
     *
     * @param status the value for description.status
     *
     * @mbggenerated Thu Aug 11 10:21:34 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }
}