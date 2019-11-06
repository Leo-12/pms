package com.youjiuye.sys.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEsexIsNull() {
            addCriterion("esex is null");
            return (Criteria) this;
        }

        public Criteria andEsexIsNotNull() {
            addCriterion("esex is not null");
            return (Criteria) this;
        }

        public Criteria andEsexEqualTo(String value) {
            addCriterion("esex =", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotEqualTo(String value) {
            addCriterion("esex <>", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexGreaterThan(String value) {
            addCriterion("esex >", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexGreaterThanOrEqualTo(String value) {
            addCriterion("esex >=", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexLessThan(String value) {
            addCriterion("esex <", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexLessThanOrEqualTo(String value) {
            addCriterion("esex <=", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexLike(String value) {
            addCriterion("esex like", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotLike(String value) {
            addCriterion("esex not like", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexIn(List<String> values) {
            addCriterion("esex in", values, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotIn(List<String> values) {
            addCriterion("esex not in", values, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexBetween(String value1, String value2) {
            addCriterion("esex between", value1, value2, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotBetween(String value1, String value2) {
            addCriterion("esex not between", value1, value2, "esex");
            return (Criteria) this;
        }

        public Criteria andEageIsNull() {
            addCriterion("eage is null");
            return (Criteria) this;
        }

        public Criteria andEageIsNotNull() {
            addCriterion("eage is not null");
            return (Criteria) this;
        }

        public Criteria andEageEqualTo(Integer value) {
            addCriterion("eage =", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageNotEqualTo(Integer value) {
            addCriterion("eage <>", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageGreaterThan(Integer value) {
            addCriterion("eage >", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageGreaterThanOrEqualTo(Integer value) {
            addCriterion("eage >=", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageLessThan(Integer value) {
            addCriterion("eage <", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageLessThanOrEqualTo(Integer value) {
            addCriterion("eage <=", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageIn(List<Integer> values) {
            addCriterion("eage in", values, "eage");
            return (Criteria) this;
        }

        public Criteria andEageNotIn(List<Integer> values) {
            addCriterion("eage not in", values, "eage");
            return (Criteria) this;
        }

        public Criteria andEageBetween(Integer value1, Integer value2) {
            addCriterion("eage between", value1, value2, "eage");
            return (Criteria) this;
        }

        public Criteria andEageNotBetween(Integer value1, Integer value2) {
            addCriterion("eage not between", value1, value2, "eage");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNull() {
            addCriterion("hiredate is null");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNotNull() {
            addCriterion("hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andHiredateEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate =", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate <>", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThan(Date value) {
            addCriterionForJDBCDate("hiredate >", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate >=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThan(Date value) {
            addCriterionForJDBCDate("hiredate <", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate <=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateIn(List<Date> values) {
            addCriterionForJDBCDate("hiredate in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hiredate not in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hiredate between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hiredate not between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andPnumIsNull() {
            addCriterion("pnum is null");
            return (Criteria) this;
        }

        public Criteria andPnumIsNotNull() {
            addCriterion("pnum is not null");
            return (Criteria) this;
        }

        public Criteria andPnumEqualTo(String value) {
            addCriterion("pnum =", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotEqualTo(String value) {
            addCriterion("pnum <>", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThan(String value) {
            addCriterion("pnum >", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThanOrEqualTo(String value) {
            addCriterion("pnum >=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThan(String value) {
            addCriterion("pnum <", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThanOrEqualTo(String value) {
            addCriterion("pnum <=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLike(String value) {
            addCriterion("pnum like", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotLike(String value) {
            addCriterion("pnum not like", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumIn(List<String> values) {
            addCriterion("pnum in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotIn(List<String> values) {
            addCriterion("pnum not in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumBetween(String value1, String value2) {
            addCriterion("pnum between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotBetween(String value1, String value2) {
            addCriterion("pnum not between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andPFkIsNull() {
            addCriterion("p_fk is null");
            return (Criteria) this;
        }

        public Criteria andPFkIsNotNull() {
            addCriterion("p_fk is not null");
            return (Criteria) this;
        }

        public Criteria andPFkEqualTo(Integer value) {
            addCriterion("p_fk =", value, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkNotEqualTo(Integer value) {
            addCriterion("p_fk <>", value, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkGreaterThan(Integer value) {
            addCriterion("p_fk >", value, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_fk >=", value, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkLessThan(Integer value) {
            addCriterion("p_fk <", value, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkLessThanOrEqualTo(Integer value) {
            addCriterion("p_fk <=", value, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkIn(List<Integer> values) {
            addCriterion("p_fk in", values, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkNotIn(List<Integer> values) {
            addCriterion("p_fk not in", values, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkBetween(Integer value1, Integer value2) {
            addCriterion("p_fk between", value1, value2, "pFk");
            return (Criteria) this;
        }

        public Criteria andPFkNotBetween(Integer value1, Integer value2) {
            addCriterion("p_fk not between", value1, value2, "pFk");
            return (Criteria) this;
        }

        public Criteria andDFkIsNull() {
            addCriterion("d_fk is null");
            return (Criteria) this;
        }

        public Criteria andDFkIsNotNull() {
            addCriterion("d_fk is not null");
            return (Criteria) this;
        }

        public Criteria andDFkEqualTo(Integer value) {
            addCriterion("d_fk =", value, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkNotEqualTo(Integer value) {
            addCriterion("d_fk <>", value, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkGreaterThan(Integer value) {
            addCriterion("d_fk >", value, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_fk >=", value, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkLessThan(Integer value) {
            addCriterion("d_fk <", value, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkLessThanOrEqualTo(Integer value) {
            addCriterion("d_fk <=", value, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkIn(List<Integer> values) {
            addCriterion("d_fk in", values, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkNotIn(List<Integer> values) {
            addCriterion("d_fk not in", values, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkBetween(Integer value1, Integer value2) {
            addCriterion("d_fk between", value1, value2, "dFk");
            return (Criteria) this;
        }

        public Criteria andDFkNotBetween(Integer value1, Integer value2) {
            addCriterion("d_fk not between", value1, value2, "dFk");
            return (Criteria) this;
        }

        public Criteria andLFkIsNull() {
            addCriterion("l_fk is null");
            return (Criteria) this;
        }

        public Criteria andLFkIsNotNull() {
            addCriterion("l_fk is not null");
            return (Criteria) this;
        }

        public Criteria andLFkEqualTo(Integer value) {
            addCriterion("l_fk =", value, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkNotEqualTo(Integer value) {
            addCriterion("l_fk <>", value, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkGreaterThan(Integer value) {
            addCriterion("l_fk >", value, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_fk >=", value, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkLessThan(Integer value) {
            addCriterion("l_fk <", value, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkLessThanOrEqualTo(Integer value) {
            addCriterion("l_fk <=", value, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkIn(List<Integer> values) {
            addCriterion("l_fk in", values, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkNotIn(List<Integer> values) {
            addCriterion("l_fk not in", values, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkBetween(Integer value1, Integer value2) {
            addCriterion("l_fk between", value1, value2, "lFk");
            return (Criteria) this;
        }

        public Criteria andLFkNotBetween(Integer value1, Integer value2) {
            addCriterion("l_fk not between", value1, value2, "lFk");
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