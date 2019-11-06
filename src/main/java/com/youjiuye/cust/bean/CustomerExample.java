package com.youjiuye.cust.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andComnameIsNull() {
            addCriterion("comname is null");
            return (Criteria) this;
        }

        public Criteria andComnameIsNotNull() {
            addCriterion("comname is not null");
            return (Criteria) this;
        }

        public Criteria andComnameEqualTo(String value) {
            addCriterion("comname =", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotEqualTo(String value) {
            addCriterion("comname <>", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThan(String value) {
            addCriterion("comname >", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThanOrEqualTo(String value) {
            addCriterion("comname >=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThan(String value) {
            addCriterion("comname <", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThanOrEqualTo(String value) {
            addCriterion("comname <=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLike(String value) {
            addCriterion("comname like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotLike(String value) {
            addCriterion("comname not like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameIn(List<String> values) {
            addCriterion("comname in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotIn(List<String> values) {
            addCriterion("comname not in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameBetween(String value1, String value2) {
            addCriterion("comname between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotBetween(String value1, String value2) {
            addCriterion("comname not between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andCompanypersonIsNull() {
            addCriterion("companyperson is null");
            return (Criteria) this;
        }

        public Criteria andCompanypersonIsNotNull() {
            addCriterion("companyperson is not null");
            return (Criteria) this;
        }

        public Criteria andCompanypersonEqualTo(String value) {
            addCriterion("companyperson =", value, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonNotEqualTo(String value) {
            addCriterion("companyperson <>", value, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonGreaterThan(String value) {
            addCriterion("companyperson >", value, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonGreaterThanOrEqualTo(String value) {
            addCriterion("companyperson >=", value, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonLessThan(String value) {
            addCriterion("companyperson <", value, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonLessThanOrEqualTo(String value) {
            addCriterion("companyperson <=", value, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonLike(String value) {
            addCriterion("companyperson like", value, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonNotLike(String value) {
            addCriterion("companyperson not like", value, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonIn(List<String> values) {
            addCriterion("companyperson in", values, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonNotIn(List<String> values) {
            addCriterion("companyperson not in", values, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonBetween(String value1, String value2) {
            addCriterion("companyperson between", value1, value2, "companyperson");
            return (Criteria) this;
        }

        public Criteria andCompanypersonNotBetween(String value1, String value2) {
            addCriterion("companyperson not between", value1, value2, "companyperson");
            return (Criteria) this;
        }

        public Criteria andComaddressIsNull() {
            addCriterion("comaddress is null");
            return (Criteria) this;
        }

        public Criteria andComaddressIsNotNull() {
            addCriterion("comaddress is not null");
            return (Criteria) this;
        }

        public Criteria andComaddressEqualTo(String value) {
            addCriterion("comaddress =", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotEqualTo(String value) {
            addCriterion("comaddress <>", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressGreaterThan(String value) {
            addCriterion("comaddress >", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressGreaterThanOrEqualTo(String value) {
            addCriterion("comaddress >=", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLessThan(String value) {
            addCriterion("comaddress <", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLessThanOrEqualTo(String value) {
            addCriterion("comaddress <=", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLike(String value) {
            addCriterion("comaddress like", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotLike(String value) {
            addCriterion("comaddress not like", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressIn(List<String> values) {
            addCriterion("comaddress in", values, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotIn(List<String> values) {
            addCriterion("comaddress not in", values, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressBetween(String value1, String value2) {
            addCriterion("comaddress between", value1, value2, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotBetween(String value1, String value2) {
            addCriterion("comaddress not between", value1, value2, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComphoneIsNull() {
            addCriterion("comphone is null");
            return (Criteria) this;
        }

        public Criteria andComphoneIsNotNull() {
            addCriterion("comphone is not null");
            return (Criteria) this;
        }

        public Criteria andComphoneEqualTo(String value) {
            addCriterion("comphone =", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneNotEqualTo(String value) {
            addCriterion("comphone <>", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneGreaterThan(String value) {
            addCriterion("comphone >", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneGreaterThanOrEqualTo(String value) {
            addCriterion("comphone >=", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneLessThan(String value) {
            addCriterion("comphone <", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneLessThanOrEqualTo(String value) {
            addCriterion("comphone <=", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneLike(String value) {
            addCriterion("comphone like", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneNotLike(String value) {
            addCriterion("comphone not like", value, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneIn(List<String> values) {
            addCriterion("comphone in", values, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneNotIn(List<String> values) {
            addCriterion("comphone not in", values, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneBetween(String value1, String value2) {
            addCriterion("comphone between", value1, value2, "comphone");
            return (Criteria) this;
        }

        public Criteria andComphoneNotBetween(String value1, String value2) {
            addCriterion("comphone not between", value1, value2, "comphone");
            return (Criteria) this;
        }

        public Criteria andCameraIsNull() {
            addCriterion("camera is null");
            return (Criteria) this;
        }

        public Criteria andCameraIsNotNull() {
            addCriterion("camera is not null");
            return (Criteria) this;
        }

        public Criteria andCameraEqualTo(String value) {
            addCriterion("camera =", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotEqualTo(String value) {
            addCriterion("camera <>", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraGreaterThan(String value) {
            addCriterion("camera >", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraGreaterThanOrEqualTo(String value) {
            addCriterion("camera >=", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLessThan(String value) {
            addCriterion("camera <", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLessThanOrEqualTo(String value) {
            addCriterion("camera <=", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLike(String value) {
            addCriterion("camera like", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotLike(String value) {
            addCriterion("camera not like", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraIn(List<String> values) {
            addCriterion("camera in", values, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotIn(List<String> values) {
            addCriterion("camera not in", values, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraBetween(String value1, String value2) {
            addCriterion("camera between", value1, value2, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotBetween(String value1, String value2) {
            addCriterion("camera not between", value1, value2, "camera");
            return (Criteria) this;
        }

        public Criteria andPresentIsNull() {
            addCriterion("present is null");
            return (Criteria) this;
        }

        public Criteria andPresentIsNotNull() {
            addCriterion("present is not null");
            return (Criteria) this;
        }

        public Criteria andPresentEqualTo(String value) {
            addCriterion("present =", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotEqualTo(String value) {
            addCriterion("present <>", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentGreaterThan(String value) {
            addCriterion("present >", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentGreaterThanOrEqualTo(String value) {
            addCriterion("present >=", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLessThan(String value) {
            addCriterion("present <", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLessThanOrEqualTo(String value) {
            addCriterion("present <=", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLike(String value) {
            addCriterion("present like", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotLike(String value) {
            addCriterion("present not like", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentIn(List<String> values) {
            addCriterion("present in", values, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotIn(List<String> values) {
            addCriterion("present not in", values, "present");
            return (Criteria) this;
        }

        public Criteria andPresentBetween(String value1, String value2) {
            addCriterion("present between", value1, value2, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotBetween(String value1, String value2) {
            addCriterion("present not between", value1, value2, "present");
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

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterionForJDBCDate("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterionForJDBCDate("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterionForJDBCDate("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("addtime not between", value1, value2, "addtime");
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