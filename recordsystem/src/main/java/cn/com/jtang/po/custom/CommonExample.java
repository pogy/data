package cn.com.jtang.po.custom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonExample {

    protected String tableName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    protected List<Criteria> oredCriteria;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    protected int start = -1;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    protected int limit = -1;


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public CommonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public int getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public int getLimit() {
        return limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andRecordnoIsNull() {
            addCriterion("recordNo is null");
            return (Criteria) this;
        }

        public Criteria andRecordnoIsNotNull() {
            addCriterion("recordNo is not null");
            return (Criteria) this;
        }

        public Criteria andRecordnoEqualTo(String value) {
            addCriterion("recordNo =", value, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoNotEqualTo(String value) {
            addCriterion("recordNo <>", value, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoGreaterThan(String value) {
            addCriterion("recordNo >", value, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoGreaterThanOrEqualTo(String value) {
            addCriterion("recordNo >=", value, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoLessThan(String value) {
            addCriterion("recordNo <", value, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoLessThanOrEqualTo(String value) {
            addCriterion("recordNo <=", value, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoLike(String value) {
            addCriterion("recordNo like", value, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoNotLike(String value) {
            addCriterion("recordNo not like", value, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoIn(List<String> values) {
            addCriterion("recordNo in", values, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoNotIn(List<String> values) {
            addCriterion("recordNo not in", values, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoBetween(String value1, String value2) {
            addCriterion("recordNo between", value1, value2, "recordno");
            return (Criteria) this;
        }

        public Criteria andRecordnoNotBetween(String value1, String value2) {
            addCriterion("recordNo not between", value1, value2, "recordno");
            return (Criteria) this;
        }

        public Criteria andSequencnoIsNull() {
            addCriterion("sequencNo is null");
            return (Criteria) this;
        }

        public Criteria andSequencnoIsNotNull() {
            addCriterion("sequencNo is not null");
            return (Criteria) this;
        }

        public Criteria andSequencnoEqualTo(String value) {
            addCriterion("sequencNo =", value, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoNotEqualTo(String value) {
            addCriterion("sequencNo <>", value, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoGreaterThan(String value) {
            addCriterion("sequencNo >", value, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoGreaterThanOrEqualTo(String value) {
            addCriterion("sequencNo >=", value, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoLessThan(String value) {
            addCriterion("sequencNo <", value, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoLessThanOrEqualTo(String value) {
            addCriterion("sequencNo <=", value, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoLike(String value) {
            addCriterion("sequencNo like", value, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoNotLike(String value) {
            addCriterion("sequencNo not like", value, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoIn(List<String> values) {
            addCriterion("sequencNo in", values, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoNotIn(List<String> values) {
            addCriterion("sequencNo not in", values, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoBetween(String value1, String value2) {
            addCriterion("sequencNo between", value1, value2, "sequencno");
            return (Criteria) this;
        }

        public Criteria andSequencnoNotBetween(String value1, String value2) {
            addCriterion("sequencNo not between", value1, value2, "sequencno");
            return (Criteria) this;
        }

        public Criteria andVolumeidIsNull() {
            addCriterion("volumeid is null");
            return (Criteria) this;
        }

        public Criteria andVolumeidIsNotNull() {
            addCriterion("volumeid is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeidEqualTo(String value) {
            addCriterion("volumeid =", value, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidNotEqualTo(String value) {
            addCriterion("volumeid <>", value, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidGreaterThan(String value) {
            addCriterion("volumeid >", value, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidGreaterThanOrEqualTo(String value) {
            addCriterion("volumeid >=", value, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidLessThan(String value) {
            addCriterion("volumeid <", value, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidLessThanOrEqualTo(String value) {
            addCriterion("volumeid <=", value, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidLike(String value) {
            addCriterion("volumeid like", value, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidNotLike(String value) {
            addCriterion("volumeid not like", value, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidIn(List<String> values) {
            addCriterion("volumeid in", values, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidNotIn(List<String> values) {
            addCriterion("volumeid not in", values, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidBetween(String value1, String value2) {
            addCriterion("volumeid between", value1, value2, "volumeid");
            return (Criteria) this;
        }

        public Criteria andVolumeidNotBetween(String value1, String value2) {
            addCriterion("volumeid not between", value1, value2, "volumeid");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(String value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(String value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(String value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(String value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(String value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLike(String value) {
            addCriterion("deadline like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotLike(String value) {
            addCriterion("deadline not like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<String> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<String> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(String value1, String value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(String value1, String value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("people like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("people not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table f1_w1_record
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 30 14:06:51 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table f1_w1_record
     *
     * @mbggenerated Thu Jun 30 14:06:51 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }
    }
}