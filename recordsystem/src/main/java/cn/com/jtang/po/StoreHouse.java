package cn.com.jtang.po;

import java.io.Serializable;
import java.util.Date;

public class StoreHouse implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storehouse.id
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storehouse.no
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    private String no;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storehouse.name
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storehouse.location
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storehouse.totalcabinet
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    private Integer totalcabinet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storehouse.floorpercab
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    private Integer floorpercab;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storehouse.createtime
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table storehouse
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storehouse.id
     *
     * @return the value of storehouse.id
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storehouse.id
     *
     * @param id the value for storehouse.id
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storehouse.no
     *
     * @return the value of storehouse.no
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public String getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storehouse.no
     *
     * @param no the value for storehouse.no
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storehouse.name
     *
     * @return the value of storehouse.name
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storehouse.name
     *
     * @param name the value for storehouse.name
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storehouse.location
     *
     * @return the value of storehouse.location
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storehouse.location
     *
     * @param location the value for storehouse.location
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storehouse.totalcabinet
     *
     * @return the value of storehouse.totalcabinet
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public Integer getTotalcabinet() {
        return totalcabinet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storehouse.totalcabinet
     *
     * @param totalcabinet the value for storehouse.totalcabinet
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public void setTotalcabinet(Integer totalcabinet) {
        this.totalcabinet = totalcabinet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storehouse.floorpercab
     *
     * @return the value of storehouse.floorpercab
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public Integer getFloorpercab() {
        return floorpercab;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storehouse.floorpercab
     *
     * @param floorpercab the value for storehouse.floorpercab
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public void setFloorpercab(Integer floorpercab) {
        this.floorpercab = floorpercab;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storehouse.createtime
     *
     * @return the value of storehouse.createtime
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storehouse.createtime
     *
     * @param createtime the value for storehouse.createtime
     *
     * @mbggenerated Fri Jul 15 10:34:38 CST 2016
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}