package com.youjiuye.pro.bean;

import java.util.ArrayList;
import java.util.List;

public class AttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttachmentExample() {
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

        public Criteria andProFkIsNull() {
            addCriterion("pro_fk is null");
            return (Criteria) this;
        }

        public Criteria andProFkIsNotNull() {
            addCriterion("pro_fk is not null");
            return (Criteria) this;
        }

        public Criteria andProFkEqualTo(Integer value) {
            addCriterion("pro_fk =", value, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkNotEqualTo(Integer value) {
            addCriterion("pro_fk <>", value, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkGreaterThan(Integer value) {
            addCriterion("pro_fk >", value, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_fk >=", value, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkLessThan(Integer value) {
            addCriterion("pro_fk <", value, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkLessThanOrEqualTo(Integer value) {
            addCriterion("pro_fk <=", value, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkIn(List<Integer> values) {
            addCriterion("pro_fk in", values, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkNotIn(List<Integer> values) {
            addCriterion("pro_fk not in", values, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkBetween(Integer value1, Integer value2) {
            addCriterion("pro_fk between", value1, value2, "proFk");
            return (Criteria) this;
        }

        public Criteria andProFkNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_fk not between", value1, value2, "proFk");
            return (Criteria) this;
        }

        public Criteria andAttnameIsNull() {
            addCriterion("attname is null");
            return (Criteria) this;
        }

        public Criteria andAttnameIsNotNull() {
            addCriterion("attname is not null");
            return (Criteria) this;
        }

        public Criteria andAttnameEqualTo(String value) {
            addCriterion("attname =", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameNotEqualTo(String value) {
            addCriterion("attname <>", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameGreaterThan(String value) {
            addCriterion("attname >", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameGreaterThanOrEqualTo(String value) {
            addCriterion("attname >=", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameLessThan(String value) {
            addCriterion("attname <", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameLessThanOrEqualTo(String value) {
            addCriterion("attname <=", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameLike(String value) {
            addCriterion("attname like", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameNotLike(String value) {
            addCriterion("attname not like", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameIn(List<String> values) {
            addCriterion("attname in", values, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameNotIn(List<String> values) {
            addCriterion("attname not in", values, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameBetween(String value1, String value2) {
            addCriterion("attname between", value1, value2, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameNotBetween(String value1, String value2) {
            addCriterion("attname not between", value1, value2, "attname");
            return (Criteria) this;
        }

        public Criteria andAttdisIsNull() {
            addCriterion("attdis is null");
            return (Criteria) this;
        }

        public Criteria andAttdisIsNotNull() {
            addCriterion("attdis is not null");
            return (Criteria) this;
        }

        public Criteria andAttdisEqualTo(String value) {
            addCriterion("attdis =", value, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisNotEqualTo(String value) {
            addCriterion("attdis <>", value, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisGreaterThan(String value) {
            addCriterion("attdis >", value, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisGreaterThanOrEqualTo(String value) {
            addCriterion("attdis >=", value, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisLessThan(String value) {
            addCriterion("attdis <", value, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisLessThanOrEqualTo(String value) {
            addCriterion("attdis <=", value, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisLike(String value) {
            addCriterion("attdis like", value, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisNotLike(String value) {
            addCriterion("attdis not like", value, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisIn(List<String> values) {
            addCriterion("attdis in", values, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisNotIn(List<String> values) {
            addCriterion("attdis not in", values, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisBetween(String value1, String value2) {
            addCriterion("attdis between", value1, value2, "attdis");
            return (Criteria) this;
        }

        public Criteria andAttdisNotBetween(String value1, String value2) {
            addCriterion("attdis not between", value1, value2, "attdis");
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

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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