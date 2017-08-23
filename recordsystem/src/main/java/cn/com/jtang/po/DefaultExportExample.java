package cn.com.jtang.po;

import java.util.ArrayList;
import java.util.List;

public class DefaultExportExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    protected int start = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    protected int limit = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public DefaultExportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
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
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public void setStart(int start) {
        this.start=start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public int getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public void setLimit(int limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
     */
    public int getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(String value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(String value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(String value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(String value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(String value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(String value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLike(String value) {
            addCriterion("eid like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotLike(String value) {
            addCriterion("eid not like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<String> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<String> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(String value1, String value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(String value1, String value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andFontsizeIsNull() {
            addCriterion("fontsize is null");
            return (Criteria) this;
        }

        public Criteria andFontsizeIsNotNull() {
            addCriterion("fontsize is not null");
            return (Criteria) this;
        }

        public Criteria andFontsizeEqualTo(Short value) {
            addCriterion("fontsize =", value, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeNotEqualTo(Short value) {
            addCriterion("fontsize <>", value, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeGreaterThan(Short value) {
            addCriterion("fontsize >", value, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeGreaterThanOrEqualTo(Short value) {
            addCriterion("fontsize >=", value, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeLessThan(Short value) {
            addCriterion("fontsize <", value, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeLessThanOrEqualTo(Short value) {
            addCriterion("fontsize <=", value, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeIn(List<Short> values) {
            addCriterion("fontsize in", values, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeNotIn(List<Short> values) {
            addCriterion("fontsize not in", values, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeBetween(Short value1, Short value2) {
            addCriterion("fontsize between", value1, value2, "fontsize");
            return (Criteria) this;
        }

        public Criteria andFontsizeNotBetween(Short value1, Short value2) {
            addCriterion("fontsize not between", value1, value2, "fontsize");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLineheightIsNull() {
            addCriterion("lineheight is null");
            return (Criteria) this;
        }

        public Criteria andLineheightIsNotNull() {
            addCriterion("lineheight is not null");
            return (Criteria) this;
        }

        public Criteria andLineheightEqualTo(Float value) {
            addCriterion("lineheight =", value, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightNotEqualTo(Float value) {
            addCriterion("lineheight <>", value, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightGreaterThan(Float value) {
            addCriterion("lineheight >", value, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightGreaterThanOrEqualTo(Float value) {
            addCriterion("lineheight >=", value, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightLessThan(Float value) {
            addCriterion("lineheight <", value, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightLessThanOrEqualTo(Float value) {
            addCriterion("lineheight <=", value, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightIn(List<Float> values) {
            addCriterion("lineheight in", values, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightNotIn(List<Float> values) {
            addCriterion("lineheight not in", values, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightBetween(Float value1, Float value2) {
            addCriterion("lineheight between", value1, value2, "lineheight");
            return (Criteria) this;
        }

        public Criteria andLineheightNotBetween(Float value1, Float value2) {
            addCriterion("lineheight not between", value1, value2, "lineheight");
            return (Criteria) this;
        }

        public Criteria andPagesizeIsNull() {
            addCriterion("pagesize is null");
            return (Criteria) this;
        }

        public Criteria andPagesizeIsNotNull() {
            addCriterion("pagesize is not null");
            return (Criteria) this;
        }

        public Criteria andPagesizeEqualTo(Short value) {
            addCriterion("pagesize =", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeNotEqualTo(Short value) {
            addCriterion("pagesize <>", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeGreaterThan(Short value) {
            addCriterion("pagesize >", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeGreaterThanOrEqualTo(Short value) {
            addCriterion("pagesize >=", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeLessThan(Short value) {
            addCriterion("pagesize <", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeLessThanOrEqualTo(Short value) {
            addCriterion("pagesize <=", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeIn(List<Short> values) {
            addCriterion("pagesize in", values, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeNotIn(List<Short> values) {
            addCriterion("pagesize not in", values, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeBetween(Short value1, Short value2) {
            addCriterion("pagesize between", value1, value2, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeNotBetween(Short value1, Short value2) {
            addCriterion("pagesize not between", value1, value2, "pagesize");
            return (Criteria) this;
        }

        public Criteria andColwidthIsNull() {
            addCriterion("colWidth is null");
            return (Criteria) this;
        }

        public Criteria andColwidthIsNotNull() {
            addCriterion("colWidth is not null");
            return (Criteria) this;
        }

        public Criteria andColwidthEqualTo(String value) {
            addCriterion("colWidth =", value, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthNotEqualTo(String value) {
            addCriterion("colWidth <>", value, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthGreaterThan(String value) {
            addCriterion("colWidth >", value, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthGreaterThanOrEqualTo(String value) {
            addCriterion("colWidth >=", value, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthLessThan(String value) {
            addCriterion("colWidth <", value, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthLessThanOrEqualTo(String value) {
            addCriterion("colWidth <=", value, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthLike(String value) {
            addCriterion("colWidth like", value, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthNotLike(String value) {
            addCriterion("colWidth not like", value, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthIn(List<String> values) {
            addCriterion("colWidth in", values, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthNotIn(List<String> values) {
            addCriterion("colWidth not in", values, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthBetween(String value1, String value2) {
            addCriterion("colWidth between", value1, value2, "colwidth");
            return (Criteria) this;
        }

        public Criteria andColwidthNotBetween(String value1, String value2) {
            addCriterion("colWidth not between", value1, value2, "colwidth");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Boolean value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Boolean value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Boolean value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Boolean value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Boolean value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Boolean> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Boolean> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Boolean value1, Boolean value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andLeftmarginIsNull() {
            addCriterion("leftmargin is null");
            return (Criteria) this;
        }

        public Criteria andLeftmarginIsNotNull() {
            addCriterion("leftmargin is not null");
            return (Criteria) this;
        }

        public Criteria andLeftmarginEqualTo(Float value) {
            addCriterion("leftmargin =", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginNotEqualTo(Float value) {
            addCriterion("leftmargin <>", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginGreaterThan(Float value) {
            addCriterion("leftmargin >", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginGreaterThanOrEqualTo(Float value) {
            addCriterion("leftmargin >=", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginLessThan(Float value) {
            addCriterion("leftmargin <", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginLessThanOrEqualTo(Float value) {
            addCriterion("leftmargin <=", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginIn(List<Float> values) {
            addCriterion("leftmargin in", values, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginNotIn(List<Float> values) {
            addCriterion("leftmargin not in", values, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginBetween(Float value1, Float value2) {
            addCriterion("leftmargin between", value1, value2, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginNotBetween(Float value1, Float value2) {
            addCriterion("leftmargin not between", value1, value2, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginIsNull() {
            addCriterion("bottommargin is null");
            return (Criteria) this;
        }

        public Criteria andBottommarginIsNotNull() {
            addCriterion("bottommargin is not null");
            return (Criteria) this;
        }

        public Criteria andBottommarginEqualTo(Float value) {
            addCriterion("bottommargin =", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginNotEqualTo(Float value) {
            addCriterion("bottommargin <>", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginGreaterThan(Float value) {
            addCriterion("bottommargin >", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginGreaterThanOrEqualTo(Float value) {
            addCriterion("bottommargin >=", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginLessThan(Float value) {
            addCriterion("bottommargin <", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginLessThanOrEqualTo(Float value) {
            addCriterion("bottommargin <=", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginIn(List<Float> values) {
            addCriterion("bottommargin in", values, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginNotIn(List<Float> values) {
            addCriterion("bottommargin not in", values, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginBetween(Float value1, Float value2) {
            addCriterion("bottommargin between", value1, value2, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginNotBetween(Float value1, Float value2) {
            addCriterion("bottommargin not between", value1, value2, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginIsNull() {
            addCriterion("topmargin is null");
            return (Criteria) this;
        }

        public Criteria andTopmarginIsNotNull() {
            addCriterion("topmargin is not null");
            return (Criteria) this;
        }

        public Criteria andTopmarginEqualTo(Float value) {
            addCriterion("topmargin =", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginNotEqualTo(Float value) {
            addCriterion("topmargin <>", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginGreaterThan(Float value) {
            addCriterion("topmargin >", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginGreaterThanOrEqualTo(Float value) {
            addCriterion("topmargin >=", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginLessThan(Float value) {
            addCriterion("topmargin <", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginLessThanOrEqualTo(Float value) {
            addCriterion("topmargin <=", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginIn(List<Float> values) {
            addCriterion("topmargin in", values, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginNotIn(List<Float> values) {
            addCriterion("topmargin not in", values, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginBetween(Float value1, Float value2) {
            addCriterion("topmargin between", value1, value2, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginNotBetween(Float value1, Float value2) {
            addCriterion("topmargin not between", value1, value2, "topmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginIsNull() {
            addCriterion("rightmargin is null");
            return (Criteria) this;
        }

        public Criteria andRightmarginIsNotNull() {
            addCriterion("rightmargin is not null");
            return (Criteria) this;
        }

        public Criteria andRightmarginEqualTo(Float value) {
            addCriterion("rightmargin =", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginNotEqualTo(Float value) {
            addCriterion("rightmargin <>", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginGreaterThan(Float value) {
            addCriterion("rightmargin >", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginGreaterThanOrEqualTo(Float value) {
            addCriterion("rightmargin >=", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginLessThan(Float value) {
            addCriterion("rightmargin <", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginLessThanOrEqualTo(Float value) {
            addCriterion("rightmargin <=", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginIn(List<Float> values) {
            addCriterion("rightmargin in", values, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginNotIn(List<Float> values) {
            addCriterion("rightmargin not in", values, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginBetween(Float value1, Float value2) {
            addCriterion("rightmargin between", value1, value2, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginNotBetween(Float value1, Float value2) {
            addCriterion("rightmargin not between", value1, value2, "rightmargin");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table defaultexport
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 08 16:14:50 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table defaultexport
     *
     * @mbggenerated Thu Dec 08 16:14:50 CST 2016
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