package com.youjiuye.sys.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArchivesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArchivesExample() {
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

        public Criteria andDnumIsNull() {
            addCriterion("dnum is null");
            return (Criteria) this;
        }

        public Criteria andDnumIsNotNull() {
            addCriterion("dnum is not null");
            return (Criteria) this;
        }

        public Criteria andDnumEqualTo(String value) {
            addCriterion("dnum =", value, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumNotEqualTo(String value) {
            addCriterion("dnum <>", value, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumGreaterThan(String value) {
            addCriterion("dnum >", value, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumGreaterThanOrEqualTo(String value) {
            addCriterion("dnum >=", value, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumLessThan(String value) {
            addCriterion("dnum <", value, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumLessThanOrEqualTo(String value) {
            addCriterion("dnum <=", value, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumLike(String value) {
            addCriterion("dnum like", value, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumNotLike(String value) {
            addCriterion("dnum not like", value, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumIn(List<String> values) {
            addCriterion("dnum in", values, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumNotIn(List<String> values) {
            addCriterion("dnum not in", values, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumBetween(String value1, String value2) {
            addCriterion("dnum between", value1, value2, "dnum");
            return (Criteria) this;
        }

        public Criteria andDnumNotBetween(String value1, String value2) {
            addCriterion("dnum not between", value1, value2, "dnum");
            return (Criteria) this;
        }

        public Criteria andLandlineIsNull() {
            addCriterion("landline is null");
            return (Criteria) this;
        }

        public Criteria andLandlineIsNotNull() {
            addCriterion("landline is not null");
            return (Criteria) this;
        }

        public Criteria andLandlineEqualTo(String value) {
            addCriterion("landline =", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotEqualTo(String value) {
            addCriterion("landline <>", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineGreaterThan(String value) {
            addCriterion("landline >", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineGreaterThanOrEqualTo(String value) {
            addCriterion("landline >=", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLessThan(String value) {
            addCriterion("landline <", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLessThanOrEqualTo(String value) {
            addCriterion("landline <=", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLike(String value) {
            addCriterion("landline like", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotLike(String value) {
            addCriterion("landline not like", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineIn(List<String> values) {
            addCriterion("landline in", values, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotIn(List<String> values) {
            addCriterion("landline not in", values, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineBetween(String value1, String value2) {
            addCriterion("landline between", value1, value2, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotBetween(String value1, String value2) {
            addCriterion("landline not between", value1, value2, "landline");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNull() {
            addCriterion("zhuanye is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNotNull() {
            addCriterion("zhuanye is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeEqualTo(String value) {
            addCriterion("zhuanye =", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotEqualTo(String value) {
            addCriterion("zhuanye <>", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThan(String value) {
            addCriterion("zhuanye >", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThanOrEqualTo(String value) {
            addCriterion("zhuanye >=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThan(String value) {
            addCriterion("zhuanye <", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThanOrEqualTo(String value) {
            addCriterion("zhuanye <=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLike(String value) {
            addCriterion("zhuanye like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotLike(String value) {
            addCriterion("zhuanye not like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIn(List<String> values) {
            addCriterion("zhuanye in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotIn(List<String> values) {
            addCriterion("zhuanye not in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeBetween(String value1, String value2) {
            addCriterion("zhuanye between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotBetween(String value1, String value2) {
            addCriterion("zhuanye not between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andSospersonIsNull() {
            addCriterion("sosperson is null");
            return (Criteria) this;
        }

        public Criteria andSospersonIsNotNull() {
            addCriterion("sosperson is not null");
            return (Criteria) this;
        }

        public Criteria andSospersonEqualTo(String value) {
            addCriterion("sosperson =", value, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonNotEqualTo(String value) {
            addCriterion("sosperson <>", value, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonGreaterThan(String value) {
            addCriterion("sosperson >", value, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonGreaterThanOrEqualTo(String value) {
            addCriterion("sosperson >=", value, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonLessThan(String value) {
            addCriterion("sosperson <", value, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonLessThanOrEqualTo(String value) {
            addCriterion("sosperson <=", value, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonLike(String value) {
            addCriterion("sosperson like", value, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonNotLike(String value) {
            addCriterion("sosperson not like", value, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonIn(List<String> values) {
            addCriterion("sosperson in", values, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonNotIn(List<String> values) {
            addCriterion("sosperson not in", values, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonBetween(String value1, String value2) {
            addCriterion("sosperson between", value1, value2, "sosperson");
            return (Criteria) this;
        }

        public Criteria andSospersonNotBetween(String value1, String value2) {
            addCriterion("sosperson not between", value1, value2, "sosperson");
            return (Criteria) this;
        }

        public Criteria andBiyedateIsNull() {
            addCriterion("biyedate is null");
            return (Criteria) this;
        }

        public Criteria andBiyedateIsNotNull() {
            addCriterion("biyedate is not null");
            return (Criteria) this;
        }

        public Criteria andBiyedateEqualTo(Date value) {
            addCriterionForJDBCDate("biyedate =", value, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("biyedate <>", value, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateGreaterThan(Date value) {
            addCriterionForJDBCDate("biyedate >", value, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("biyedate >=", value, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateLessThan(Date value) {
            addCriterionForJDBCDate("biyedate <", value, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("biyedate <=", value, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateIn(List<Date> values) {
            addCriterionForJDBCDate("biyedate in", values, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("biyedate not in", values, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("biyedate between", value1, value2, "biyedate");
            return (Criteria) this;
        }

        public Criteria andBiyedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("biyedate not between", value1, value2, "biyedate");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("zzmm like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("zzmm not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNull() {
            addCriterion("minzu is null");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNotNull() {
            addCriterion("minzu is not null");
            return (Criteria) this;
        }

        public Criteria andMinzuEqualTo(String value) {
            addCriterion("minzu =", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotEqualTo(String value) {
            addCriterion("minzu <>", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThan(String value) {
            addCriterion("minzu >", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("minzu >=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThan(String value) {
            addCriterion("minzu <", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThanOrEqualTo(String value) {
            addCriterion("minzu <=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLike(String value) {
            addCriterion("minzu like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotLike(String value) {
            addCriterion("minzu not like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuIn(List<String> values) {
            addCriterion("minzu in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotIn(List<String> values) {
            addCriterion("minzu not in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuBetween(String value1, String value2) {
            addCriterion("minzu between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotBetween(String value1, String value2) {
            addCriterion("minzu not between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("xueli is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("xueli is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("xueli =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("xueli <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("xueli >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("xueli >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("xueli <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("xueli <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("xueli like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("xueli not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("xueli in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("xueli not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("xueli between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("xueli not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andHirdateIsNull() {
            addCriterion("hirdate is null");
            return (Criteria) this;
        }

        public Criteria andHirdateIsNotNull() {
            addCriterion("hirdate is not null");
            return (Criteria) this;
        }

        public Criteria andHirdateEqualTo(Date value) {
            addCriterionForJDBCDate("hirdate =", value, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hirdate <>", value, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateGreaterThan(Date value) {
            addCriterionForJDBCDate("hirdate >", value, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hirdate >=", value, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateLessThan(Date value) {
            addCriterionForJDBCDate("hirdate <", value, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hirdate <=", value, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateIn(List<Date> values) {
            addCriterionForJDBCDate("hirdate in", values, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hirdate not in", values, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hirdate between", value1, value2, "hirdate");
            return (Criteria) this;
        }

        public Criteria andHirdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hirdate not between", value1, value2, "hirdate");
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