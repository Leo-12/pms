package com.youjiuye.usual.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BaoXiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaoXiaoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBxidIsNull() {
            addCriterion("bxid is null");
            return (Criteria) this;
        }

        public Criteria andBxidIsNotNull() {
            addCriterion("bxid is not null");
            return (Criteria) this;
        }

        public Criteria andBxidEqualTo(String value) {
            addCriterion("bxid =", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidNotEqualTo(String value) {
            addCriterion("bxid <>", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidGreaterThan(String value) {
            addCriterion("bxid >", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidGreaterThanOrEqualTo(String value) {
            addCriterion("bxid >=", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidLessThan(String value) {
            addCriterion("bxid <", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidLessThanOrEqualTo(String value) {
            addCriterion("bxid <=", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidLike(String value) {
            addCriterion("bxid like", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidNotLike(String value) {
            addCriterion("bxid not like", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidIn(List<String> values) {
            addCriterion("bxid in", values, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidNotIn(List<String> values) {
            addCriterion("bxid not in", values, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidBetween(String value1, String value2) {
            addCriterion("bxid between", value1, value2, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidNotBetween(String value1, String value2) {
            addCriterion("bxid not between", value1, value2, "bxid");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNull() {
            addCriterion("paymode is null");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNotNull() {
            addCriterion("paymode is not null");
            return (Criteria) this;
        }

        public Criteria andPaymodeEqualTo(String value) {
            addCriterion("paymode =", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotEqualTo(String value) {
            addCriterion("paymode <>", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThan(String value) {
            addCriterion("paymode >", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThanOrEqualTo(String value) {
            addCriterion("paymode >=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThan(String value) {
            addCriterion("paymode <", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThanOrEqualTo(String value) {
            addCriterion("paymode <=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLike(String value) {
            addCriterion("paymode like", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotLike(String value) {
            addCriterion("paymode not like", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeIn(List<String> values) {
            addCriterion("paymode in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotIn(List<String> values) {
            addCriterion("paymode not in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeBetween(String value1, String value2) {
            addCriterion("paymode between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotBetween(String value1, String value2) {
            addCriterion("paymode not between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(Double value) {
            addCriterion("totalmoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(Double value) {
            addCriterion("totalmoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(Double value) {
            addCriterion("totalmoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("totalmoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(Double value) {
            addCriterion("totalmoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("totalmoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<Double> values) {
            addCriterion("totalmoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<Double> values) {
            addCriterion("totalmoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("totalmoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("totalmoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andBxtimeIsNull() {
            addCriterion("bxtime is null");
            return (Criteria) this;
        }

        public Criteria andBxtimeIsNotNull() {
            addCriterion("bxtime is not null");
            return (Criteria) this;
        }

        public Criteria andBxtimeEqualTo(Date value) {
            addCriterionForJDBCDate("bxtime =", value, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bxtime <>", value, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bxtime >", value, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bxtime >=", value, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeLessThan(Date value) {
            addCriterionForJDBCDate("bxtime <", value, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bxtime <=", value, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeIn(List<Date> values) {
            addCriterionForJDBCDate("bxtime in", values, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bxtime not in", values, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bxtime between", value1, value2, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bxtime not between", value1, value2, "bxtime");
            return (Criteria) this;
        }

        public Criteria andBxremarkIsNull() {
            addCriterion("bxremark is null");
            return (Criteria) this;
        }

        public Criteria andBxremarkIsNotNull() {
            addCriterion("bxremark is not null");
            return (Criteria) this;
        }

        public Criteria andBxremarkEqualTo(String value) {
            addCriterion("bxremark =", value, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkNotEqualTo(String value) {
            addCriterion("bxremark <>", value, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkGreaterThan(String value) {
            addCriterion("bxremark >", value, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkGreaterThanOrEqualTo(String value) {
            addCriterion("bxremark >=", value, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkLessThan(String value) {
            addCriterion("bxremark <", value, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkLessThanOrEqualTo(String value) {
            addCriterion("bxremark <=", value, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkLike(String value) {
            addCriterion("bxremark like", value, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkNotLike(String value) {
            addCriterion("bxremark not like", value, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkIn(List<String> values) {
            addCriterion("bxremark in", values, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkNotIn(List<String> values) {
            addCriterion("bxremark not in", values, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkBetween(String value1, String value2) {
            addCriterion("bxremark between", value1, value2, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxremarkNotBetween(String value1, String value2) {
            addCriterion("bxremark not between", value1, value2, "bxremark");
            return (Criteria) this;
        }

        public Criteria andBxstatusIsNull() {
            addCriterion("bxstatus is null");
            return (Criteria) this;
        }

        public Criteria andBxstatusIsNotNull() {
            addCriterion("bxstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBxstatusEqualTo(Integer value) {
            addCriterion("bxstatus =", value, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusNotEqualTo(Integer value) {
            addCriterion("bxstatus <>", value, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusGreaterThan(Integer value) {
            addCriterion("bxstatus >", value, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bxstatus >=", value, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusLessThan(Integer value) {
            addCriterion("bxstatus <", value, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusLessThanOrEqualTo(Integer value) {
            addCriterion("bxstatus <=", value, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusIn(List<Integer> values) {
            addCriterion("bxstatus in", values, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusNotIn(List<Integer> values) {
            addCriterion("bxstatus not in", values, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusBetween(Integer value1, Integer value2) {
            addCriterion("bxstatus between", value1, value2, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andBxstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bxstatus not between", value1, value2, "bxstatus");
            return (Criteria) this;
        }

        public Criteria andEmpFkIsNull() {
            addCriterion("emp_fk is null");
            return (Criteria) this;
        }

        public Criteria andEmpFkIsNotNull() {
            addCriterion("emp_fk is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFkEqualTo(Integer value) {
            addCriterion("emp_fk =", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkNotEqualTo(Integer value) {
            addCriterion("emp_fk <>", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkGreaterThan(Integer value) {
            addCriterion("emp_fk >", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_fk >=", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkLessThan(Integer value) {
            addCriterion("emp_fk <", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkLessThanOrEqualTo(Integer value) {
            addCriterion("emp_fk <=", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkIn(List<Integer> values) {
            addCriterion("emp_fk in", values, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkNotIn(List<Integer> values) {
            addCriterion("emp_fk not in", values, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkBetween(Integer value1, Integer value2) {
            addCriterion("emp_fk between", value1, value2, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_fk not between", value1, value2, "empFk");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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