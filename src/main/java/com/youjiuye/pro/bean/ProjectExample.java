package com.youjiuye.pro.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
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

        public Criteria andComnameEqualTo(Integer value) {
            addCriterion("comname =", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotEqualTo(Integer value) {
            addCriterion("comname <>", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThan(Integer value) {
            addCriterion("comname >", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("comname >=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThan(Integer value) {
            addCriterion("comname <", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThanOrEqualTo(Integer value) {
            addCriterion("comname <=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameIn(List<Integer> values) {
            addCriterion("comname in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotIn(List<Integer> values) {
            addCriterion("comname not in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameBetween(Integer value1, Integer value2) {
            addCriterion("comname between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotBetween(Integer value1, Integer value2) {
            addCriterion("comname not between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComperIsNull() {
            addCriterion("comper is null");
            return (Criteria) this;
        }

        public Criteria andComperIsNotNull() {
            addCriterion("comper is not null");
            return (Criteria) this;
        }

        public Criteria andComperEqualTo(String value) {
            addCriterion("comper =", value, "comper");
            return (Criteria) this;
        }

        public Criteria andComperNotEqualTo(String value) {
            addCriterion("comper <>", value, "comper");
            return (Criteria) this;
        }

        public Criteria andComperGreaterThan(String value) {
            addCriterion("comper >", value, "comper");
            return (Criteria) this;
        }

        public Criteria andComperGreaterThanOrEqualTo(String value) {
            addCriterion("comper >=", value, "comper");
            return (Criteria) this;
        }

        public Criteria andComperLessThan(String value) {
            addCriterion("comper <", value, "comper");
            return (Criteria) this;
        }

        public Criteria andComperLessThanOrEqualTo(String value) {
            addCriterion("comper <=", value, "comper");
            return (Criteria) this;
        }

        public Criteria andComperLike(String value) {
            addCriterion("comper like", value, "comper");
            return (Criteria) this;
        }

        public Criteria andComperNotLike(String value) {
            addCriterion("comper not like", value, "comper");
            return (Criteria) this;
        }

        public Criteria andComperIn(List<String> values) {
            addCriterion("comper in", values, "comper");
            return (Criteria) this;
        }

        public Criteria andComperNotIn(List<String> values) {
            addCriterion("comper not in", values, "comper");
            return (Criteria) this;
        }

        public Criteria andComperBetween(String value1, String value2) {
            addCriterion("comper between", value1, value2, "comper");
            return (Criteria) this;
        }

        public Criteria andComperNotBetween(String value1, String value2) {
            addCriterion("comper not between", value1, value2, "comper");
            return (Criteria) this;
        }

        public Criteria andEmpFk1IsNull() {
            addCriterion("emp_fk1 is null");
            return (Criteria) this;
        }

        public Criteria andEmpFk1IsNotNull() {
            addCriterion("emp_fk1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFk1EqualTo(Integer value) {
            addCriterion("emp_fk1 =", value, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1NotEqualTo(Integer value) {
            addCriterion("emp_fk1 <>", value, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1GreaterThan(Integer value) {
            addCriterion("emp_fk1 >", value, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1GreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_fk1 >=", value, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1LessThan(Integer value) {
            addCriterion("emp_fk1 <", value, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1LessThanOrEqualTo(Integer value) {
            addCriterion("emp_fk1 <=", value, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1In(List<Integer> values) {
            addCriterion("emp_fk1 in", values, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1NotIn(List<Integer> values) {
            addCriterion("emp_fk1 not in", values, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1Between(Integer value1, Integer value2) {
            addCriterion("emp_fk1 between", value1, value2, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpFk1NotBetween(Integer value1, Integer value2) {
            addCriterion("emp_fk1 not between", value1, value2, "empFk1");
            return (Criteria) this;
        }

        public Criteria andEmpcountIsNull() {
            addCriterion("empcount is null");
            return (Criteria) this;
        }

        public Criteria andEmpcountIsNotNull() {
            addCriterion("empcount is not null");
            return (Criteria) this;
        }

        public Criteria andEmpcountEqualTo(Integer value) {
            addCriterion("empcount =", value, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountNotEqualTo(Integer value) {
            addCriterion("empcount <>", value, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountGreaterThan(Integer value) {
            addCriterion("empcount >", value, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("empcount >=", value, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountLessThan(Integer value) {
            addCriterion("empcount <", value, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountLessThanOrEqualTo(Integer value) {
            addCriterion("empcount <=", value, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountIn(List<Integer> values) {
            addCriterion("empcount in", values, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountNotIn(List<Integer> values) {
            addCriterion("empcount not in", values, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountBetween(Integer value1, Integer value2) {
            addCriterion("empcount between", value1, value2, "empcount");
            return (Criteria) this;
        }

        public Criteria andEmpcountNotBetween(Integer value1, Integer value2) {
            addCriterion("empcount not between", value1, value2, "empcount");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIsNull() {
            addCriterion("buildtime is null");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIsNotNull() {
            addCriterion("buildtime is not null");
            return (Criteria) this;
        }

        public Criteria andBuildtimeEqualTo(Date value) {
            addCriterionForJDBCDate("buildtime =", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("buildtime <>", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("buildtime >", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buildtime >=", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLessThan(Date value) {
            addCriterionForJDBCDate("buildtime <", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buildtime <=", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIn(List<Date> values) {
            addCriterionForJDBCDate("buildtime in", values, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("buildtime not in", values, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buildtime between", value1, value2, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buildtime not between", value1, value2, "buildtime");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Integer value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Integer value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Integer value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Integer value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Integer value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Integer> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Integer> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Integer value1, Integer value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Integer value1, Integer value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime not between", value1, value2, "endtime");
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