package com.youjiuye.usual.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNtitleIsNull() {
            addCriterion("ntitle is null");
            return (Criteria) this;
        }

        public Criteria andNtitleIsNotNull() {
            addCriterion("ntitle is not null");
            return (Criteria) this;
        }

        public Criteria andNtitleEqualTo(String value) {
            addCriterion("ntitle =", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotEqualTo(String value) {
            addCriterion("ntitle <>", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleGreaterThan(String value) {
            addCriterion("ntitle >", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ntitle >=", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLessThan(String value) {
            addCriterion("ntitle <", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLessThanOrEqualTo(String value) {
            addCriterion("ntitle <=", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLike(String value) {
            addCriterion("ntitle like", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotLike(String value) {
            addCriterion("ntitle not like", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleIn(List<String> values) {
            addCriterion("ntitle in", values, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotIn(List<String> values) {
            addCriterion("ntitle not in", values, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleBetween(String value1, String value2) {
            addCriterion("ntitle between", value1, value2, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotBetween(String value1, String value2) {
            addCriterion("ntitle not between", value1, value2, "ntitle");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andNdateIsNull() {
            addCriterion("ndate is null");
            return (Criteria) this;
        }

        public Criteria andNdateIsNotNull() {
            addCriterion("ndate is not null");
            return (Criteria) this;
        }

        public Criteria andNdateEqualTo(Date value) {
            addCriterionForJDBCDate("ndate =", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ndate <>", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ndate >", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ndate >=", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateLessThan(Date value) {
            addCriterionForJDBCDate("ndate <", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ndate <=", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateIn(List<Date> values) {
            addCriterionForJDBCDate("ndate in", values, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ndate not in", values, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ndate between", value1, value2, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ndate not between", value1, value2, "ndate");
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