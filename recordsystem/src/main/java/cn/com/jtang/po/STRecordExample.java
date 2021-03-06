package cn.com.jtang.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class STRecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    protected int start = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    protected int limit = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public STRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
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
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public void setStart(int start) {
        this.start=start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public int getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public void setLimit(int limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
     */
    public int getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
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

        public Criteria andStidIsNull() {
            addCriterion("stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(String value) {
            addCriterion("stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(String value) {
            addCriterion("stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(String value) {
            addCriterion("stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(String value) {
            addCriterion("stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(String value) {
            addCriterion("stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(String value) {
            addCriterion("stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLike(String value) {
            addCriterion("stid like", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotLike(String value) {
            addCriterion("stid not like", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<String> values) {
            addCriterion("stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<String> values) {
            addCriterion("stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(String value1, String value2) {
            addCriterion("stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(String value1, String value2) {
            addCriterion("stid not between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andMoistureIsNull() {
            addCriterion("moisture is null");
            return (Criteria) this;
        }

        public Criteria andMoistureIsNotNull() {
            addCriterion("moisture is not null");
            return (Criteria) this;
        }

        public Criteria andMoistureEqualTo(String value) {
            addCriterion("moisture =", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureNotEqualTo(String value) {
            addCriterion("moisture <>", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureGreaterThan(String value) {
            addCriterion("moisture >", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureGreaterThanOrEqualTo(String value) {
            addCriterion("moisture >=", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureLessThan(String value) {
            addCriterion("moisture <", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureLessThanOrEqualTo(String value) {
            addCriterion("moisture <=", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureLike(String value) {
            addCriterion("moisture like", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureNotLike(String value) {
            addCriterion("moisture not like", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureIn(List<String> values) {
            addCriterion("moisture in", values, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureNotIn(List<String> values) {
            addCriterion("moisture not in", values, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureBetween(String value1, String value2) {
            addCriterion("moisture between", value1, value2, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureNotBetween(String value1, String value2) {
            addCriterion("moisture not between", value1, value2, "moisture");
            return (Criteria) this;
        }

        public Criteria andRecordtimeIsNull() {
            addCriterion("recordtime is null");
            return (Criteria) this;
        }

        public Criteria andRecordtimeIsNotNull() {
            addCriterion("recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andRecordtimeEqualTo(Date value) {
            addCriterion("recordtime =", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotEqualTo(Date value) {
            addCriterion("recordtime <>", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeGreaterThan(Date value) {
            addCriterion("recordtime >", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recordtime >=", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeLessThan(Date value) {
            addCriterion("recordtime <", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeLessThanOrEqualTo(Date value) {
            addCriterion("recordtime <=", value, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeIn(List<Date> values) {
            addCriterion("recordtime in", values, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotIn(List<Date> values) {
            addCriterion("recordtime not in", values, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeBetween(Date value1, Date value2) {
            addCriterion("recordtime between", value1, value2, "recordtime");
            return (Criteria) this;
        }

        public Criteria andRecordtimeNotBetween(Date value1, Date value2) {
            addCriterion("recordtime not between", value1, value2, "recordtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table strecord
     *
     * @mbggenerated do_not_delete_during_merge Sun Oct 09 10:46:52 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table strecord
     *
     * @mbggenerated Sun Oct 09 10:46:52 CST 2016
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
    }
}