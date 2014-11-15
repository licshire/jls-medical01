package com.medical.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestSsnExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    public TestSsnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    protected TestSsnExample(TestSsnExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table YLJZN.TEST_SSN
     *
     * @ibatorgenerated Thu Oct 23 20:48:13 CST 2014
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("T_ID =", value, "tId");
            return this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("T_ID <>", value, "tId");
            return this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("T_ID >", value, "tId");
            return this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_ID >=", value, "tId");
            return this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("T_ID <", value, "tId");
            return this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("T_ID <=", value, "tId");
            return this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("T_ID like", value, "tId");
            return this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("T_ID not like", value, "tId");
            return this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("T_ID in", values, "tId");
            return this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("T_ID not in", values, "tId");
            return this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return this;
        }

        public Criteria andSsn1IsNull() {
            addCriterion("SSN1 is null");
            return this;
        }

        public Criteria andSsn1IsNotNull() {
            addCriterion("SSN1 is not null");
            return this;
        }

        public Criteria andSsn1EqualTo(String value) {
            addCriterion("SSN1 =", value, "ssn1");
            return this;
        }

        public Criteria andSsn1NotEqualTo(String value) {
            addCriterion("SSN1 <>", value, "ssn1");
            return this;
        }

        public Criteria andSsn1GreaterThan(String value) {
            addCriterion("SSN1 >", value, "ssn1");
            return this;
        }

        public Criteria andSsn1GreaterThanOrEqualTo(String value) {
            addCriterion("SSN1 >=", value, "ssn1");
            return this;
        }

        public Criteria andSsn1LessThan(String value) {
            addCriterion("SSN1 <", value, "ssn1");
            return this;
        }

        public Criteria andSsn1LessThanOrEqualTo(String value) {
            addCriterion("SSN1 <=", value, "ssn1");
            return this;
        }

        public Criteria andSsn1Like(String value) {
            addCriterion("SSN1 like", value, "ssn1");
            return this;
        }

        public Criteria andSsn1NotLike(String value) {
            addCriterion("SSN1 not like", value, "ssn1");
            return this;
        }

        public Criteria andSsn1In(List<String> values) {
            addCriterion("SSN1 in", values, "ssn1");
            return this;
        }

        public Criteria andSsn1NotIn(List<String> values) {
            addCriterion("SSN1 not in", values, "ssn1");
            return this;
        }

        public Criteria andSsn1Between(String value1, String value2) {
            addCriterion("SSN1 between", value1, value2, "ssn1");
            return this;
        }

        public Criteria andSsn1NotBetween(String value1, String value2) {
            addCriterion("SSN1 not between", value1, value2, "ssn1");
            return this;
        }

        public Criteria andSsn2IsNull() {
            addCriterion("SSN2 is null");
            return this;
        }

        public Criteria andSsn2IsNotNull() {
            addCriterion("SSN2 is not null");
            return this;
        }

        public Criteria andSsn2EqualTo(String value) {
            addCriterion("SSN2 =", value, "ssn2");
            return this;
        }

        public Criteria andSsn2NotEqualTo(String value) {
            addCriterion("SSN2 <>", value, "ssn2");
            return this;
        }

        public Criteria andSsn2GreaterThan(String value) {
            addCriterion("SSN2 >", value, "ssn2");
            return this;
        }

        public Criteria andSsn2GreaterThanOrEqualTo(String value) {
            addCriterion("SSN2 >=", value, "ssn2");
            return this;
        }

        public Criteria andSsn2LessThan(String value) {
            addCriterion("SSN2 <", value, "ssn2");
            return this;
        }

        public Criteria andSsn2LessThanOrEqualTo(String value) {
            addCriterion("SSN2 <=", value, "ssn2");
            return this;
        }

        public Criteria andSsn2Like(String value) {
            addCriterion("SSN2 like", value, "ssn2");
            return this;
        }

        public Criteria andSsn2NotLike(String value) {
            addCriterion("SSN2 not like", value, "ssn2");
            return this;
        }

        public Criteria andSsn2In(List<String> values) {
            addCriterion("SSN2 in", values, "ssn2");
            return this;
        }

        public Criteria andSsn2NotIn(List<String> values) {
            addCriterion("SSN2 not in", values, "ssn2");
            return this;
        }

        public Criteria andSsn2Between(String value1, String value2) {
            addCriterion("SSN2 between", value1, value2, "ssn2");
            return this;
        }

        public Criteria andSsn2NotBetween(String value1, String value2) {
            addCriterion("SSN2 not between", value1, value2, "ssn2");
            return this;
        }

        public Criteria andSsn3IsNull() {
            addCriterion("SSN3 is null");
            return this;
        }

        public Criteria andSsn3IsNotNull() {
            addCriterion("SSN3 is not null");
            return this;
        }

        public Criteria andSsn3EqualTo(String value) {
            addCriterion("SSN3 =", value, "ssn3");
            return this;
        }

        public Criteria andSsn3NotEqualTo(String value) {
            addCriterion("SSN3 <>", value, "ssn3");
            return this;
        }

        public Criteria andSsn3GreaterThan(String value) {
            addCriterion("SSN3 >", value, "ssn3");
            return this;
        }

        public Criteria andSsn3GreaterThanOrEqualTo(String value) {
            addCriterion("SSN3 >=", value, "ssn3");
            return this;
        }

        public Criteria andSsn3LessThan(String value) {
            addCriterion("SSN3 <", value, "ssn3");
            return this;
        }

        public Criteria andSsn3LessThanOrEqualTo(String value) {
            addCriterion("SSN3 <=", value, "ssn3");
            return this;
        }

        public Criteria andSsn3Like(String value) {
            addCriterion("SSN3 like", value, "ssn3");
            return this;
        }

        public Criteria andSsn3NotLike(String value) {
            addCriterion("SSN3 not like", value, "ssn3");
            return this;
        }

        public Criteria andSsn3In(List<String> values) {
            addCriterion("SSN3 in", values, "ssn3");
            return this;
        }

        public Criteria andSsn3NotIn(List<String> values) {
            addCriterion("SSN3 not in", values, "ssn3");
            return this;
        }

        public Criteria andSsn3Between(String value1, String value2) {
            addCriterion("SSN3 between", value1, value2, "ssn3");
            return this;
        }

        public Criteria andSsn3NotBetween(String value1, String value2) {
            addCriterion("SSN3 not between", value1, value2, "ssn3");
            return this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("CTIME is null");
            return this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("CTIME is not null");
            return this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("CTIME =", value, "ctime");
            return this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("CTIME <>", value, "ctime");
            return this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("CTIME >", value, "ctime");
            return this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CTIME >=", value, "ctime");
            return this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("CTIME <", value, "ctime");
            return this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("CTIME <=", value, "ctime");
            return this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("CTIME in", values, "ctime");
            return this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("CTIME not in", values, "ctime");
            return this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("CTIME between", value1, value2, "ctime");
            return this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("CTIME not between", value1, value2, "ctime");
            return this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("UTIME is null");
            return this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("UTIME is not null");
            return this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("UTIME =", value, "utime");
            return this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("UTIME <>", value, "utime");
            return this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("UTIME >", value, "utime");
            return this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UTIME >=", value, "utime");
            return this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("UTIME <", value, "utime");
            return this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("UTIME <=", value, "utime");
            return this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("UTIME in", values, "utime");
            return this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("UTIME not in", values, "utime");
            return this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("UTIME between", value1, value2, "utime");
            return this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("UTIME not between", value1, value2, "utime");
            return this;
        }

        public Criteria andDsIsNull() {
            addCriterion("DS is null");
            return this;
        }

        public Criteria andDsIsNotNull() {
            addCriterion("DS is not null");
            return this;
        }

        public Criteria andDsEqualTo(String value) {
            addCriterion("DS =", value, "ds");
            return this;
        }

        public Criteria andDsNotEqualTo(String value) {
            addCriterion("DS <>", value, "ds");
            return this;
        }

        public Criteria andDsGreaterThan(String value) {
            addCriterion("DS >", value, "ds");
            return this;
        }

        public Criteria andDsGreaterThanOrEqualTo(String value) {
            addCriterion("DS >=", value, "ds");
            return this;
        }

        public Criteria andDsLessThan(String value) {
            addCriterion("DS <", value, "ds");
            return this;
        }

        public Criteria andDsLessThanOrEqualTo(String value) {
            addCriterion("DS <=", value, "ds");
            return this;
        }

        public Criteria andDsLike(String value) {
            addCriterion("DS like", value, "ds");
            return this;
        }

        public Criteria andDsNotLike(String value) {
            addCriterion("DS not like", value, "ds");
            return this;
        }

        public Criteria andDsIn(List<String> values) {
            addCriterion("DS in", values, "ds");
            return this;
        }

        public Criteria andDsNotIn(List<String> values) {
            addCriterion("DS not in", values, "ds");
            return this;
        }

        public Criteria andDsBetween(String value1, String value2) {
            addCriterion("DS between", value1, value2, "ds");
            return this;
        }

        public Criteria andDsNotBetween(String value1, String value2) {
            addCriterion("DS not between", value1, value2, "ds");
            return this;
        }
    }
}