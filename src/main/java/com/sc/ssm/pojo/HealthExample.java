package com.sc.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HealthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealthExample() {
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

        public Criteria andHealthIdIsNull() {
            addCriterion("health_id is null");
            return (Criteria) this;
        }

        public Criteria andHealthIdIsNotNull() {
            addCriterion("health_id is not null");
            return (Criteria) this;
        }

        public Criteria andHealthIdEqualTo(Date value) {
            addCriterionForJDBCDate("health_id =", value, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdNotEqualTo(Date value) {
            addCriterionForJDBCDate("health_id <>", value, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdGreaterThan(Date value) {
            addCriterionForJDBCDate("health_id >", value, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("health_id >=", value, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdLessThan(Date value) {
            addCriterionForJDBCDate("health_id <", value, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("health_id <=", value, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdIn(List<Date> values) {
            addCriterionForJDBCDate("health_id in", values, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdNotIn(List<Date> values) {
            addCriterionForJDBCDate("health_id not in", values, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("health_id between", value1, value2, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("health_id not between", value1, value2, "healthId");
            return (Criteria) this;
        }

        public Criteria andHealthIdsIsNull() {
            addCriterion("health_ids is null");
            return (Criteria) this;
        }

        public Criteria andHealthIdsIsNotNull() {
            addCriterion("health_ids is not null");
            return (Criteria) this;
        }

        public Criteria andHealthIdsEqualTo(String value) {
            addCriterion("health_ids =", value, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsNotEqualTo(String value) {
            addCriterion("health_ids <>", value, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsGreaterThan(String value) {
            addCriterion("health_ids >", value, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsGreaterThanOrEqualTo(String value) {
            addCriterion("health_ids >=", value, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsLessThan(String value) {
            addCriterion("health_ids <", value, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsLessThanOrEqualTo(String value) {
            addCriterion("health_ids <=", value, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsLike(String value) {
            addCriterion("health_ids like", value, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsNotLike(String value) {
            addCriterion("health_ids not like", value, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsIn(List<String> values) {
            addCriterion("health_ids in", values, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsNotIn(List<String> values) {
            addCriterion("health_ids not in", values, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsBetween(String value1, String value2) {
            addCriterion("health_ids between", value1, value2, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthIdsNotBetween(String value1, String value2) {
            addCriterion("health_ids not between", value1, value2, "healthIds");
            return (Criteria) this;
        }

        public Criteria andHealthNameIsNull() {
            addCriterion("health_name is null");
            return (Criteria) this;
        }

        public Criteria andHealthNameIsNotNull() {
            addCriterion("health_name is not null");
            return (Criteria) this;
        }

        public Criteria andHealthNameEqualTo(String value) {
            addCriterion("health_name =", value, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameNotEqualTo(String value) {
            addCriterion("health_name <>", value, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameGreaterThan(String value) {
            addCriterion("health_name >", value, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameGreaterThanOrEqualTo(String value) {
            addCriterion("health_name >=", value, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameLessThan(String value) {
            addCriterion("health_name <", value, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameLessThanOrEqualTo(String value) {
            addCriterion("health_name <=", value, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameLike(String value) {
            addCriterion("health_name like", value, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameNotLike(String value) {
            addCriterion("health_name not like", value, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameIn(List<String> values) {
            addCriterion("health_name in", values, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameNotIn(List<String> values) {
            addCriterion("health_name not in", values, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameBetween(String value1, String value2) {
            addCriterion("health_name between", value1, value2, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthNameNotBetween(String value1, String value2) {
            addCriterion("health_name not between", value1, value2, "healthName");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureIsNull() {
            addCriterion("health_temperature is null");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureIsNotNull() {
            addCriterion("health_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureEqualTo(String value) {
            addCriterion("health_temperature =", value, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureNotEqualTo(String value) {
            addCriterion("health_temperature <>", value, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureGreaterThan(String value) {
            addCriterion("health_temperature >", value, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("health_temperature >=", value, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureLessThan(String value) {
            addCriterion("health_temperature <", value, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureLessThanOrEqualTo(String value) {
            addCriterion("health_temperature <=", value, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureLike(String value) {
            addCriterion("health_temperature like", value, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureNotLike(String value) {
            addCriterion("health_temperature not like", value, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureIn(List<String> values) {
            addCriterion("health_temperature in", values, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureNotIn(List<String> values) {
            addCriterion("health_temperature not in", values, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureBetween(String value1, String value2) {
            addCriterion("health_temperature between", value1, value2, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthTemperatureNotBetween(String value1, String value2) {
            addCriterion("health_temperature not between", value1, value2, "healthTemperature");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIsNull() {
            addCriterion("health_status is null");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIsNotNull() {
            addCriterion("health_status is not null");
            return (Criteria) this;
        }

        public Criteria andHealthStatusEqualTo(String value) {
            addCriterion("health_status =", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotEqualTo(String value) {
            addCriterion("health_status <>", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusGreaterThan(String value) {
            addCriterion("health_status >", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusGreaterThanOrEqualTo(String value) {
            addCriterion("health_status >=", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLessThan(String value) {
            addCriterion("health_status <", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLessThanOrEqualTo(String value) {
            addCriterion("health_status <=", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLike(String value) {
            addCriterion("health_status like", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotLike(String value) {
            addCriterion("health_status not like", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIn(List<String> values) {
            addCriterion("health_status in", values, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotIn(List<String> values) {
            addCriterion("health_status not in", values, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusBetween(String value1, String value2) {
            addCriterion("health_status between", value1, value2, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotBetween(String value1, String value2) {
            addCriterion("health_status not between", value1, value2, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusIsNull() {
            addCriterion("health_otherstatus is null");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusIsNotNull() {
            addCriterion("health_otherstatus is not null");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusEqualTo(String value) {
            addCriterion("health_otherstatus =", value, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusNotEqualTo(String value) {
            addCriterion("health_otherstatus <>", value, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusGreaterThan(String value) {
            addCriterion("health_otherstatus >", value, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusGreaterThanOrEqualTo(String value) {
            addCriterion("health_otherstatus >=", value, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusLessThan(String value) {
            addCriterion("health_otherstatus <", value, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusLessThanOrEqualTo(String value) {
            addCriterion("health_otherstatus <=", value, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusLike(String value) {
            addCriterion("health_otherstatus like", value, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusNotLike(String value) {
            addCriterion("health_otherstatus not like", value, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusIn(List<String> values) {
            addCriterion("health_otherstatus in", values, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusNotIn(List<String> values) {
            addCriterion("health_otherstatus not in", values, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusBetween(String value1, String value2) {
            addCriterion("health_otherstatus between", value1, value2, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthOtherstatusNotBetween(String value1, String value2) {
            addCriterion("health_otherstatus not between", value1, value2, "healthOtherstatus");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchIsNull() {
            addCriterion("health_istouch is null");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchIsNotNull() {
            addCriterion("health_istouch is not null");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchEqualTo(String value) {
            addCriterion("health_istouch =", value, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchNotEqualTo(String value) {
            addCriterion("health_istouch <>", value, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchGreaterThan(String value) {
            addCriterion("health_istouch >", value, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchGreaterThanOrEqualTo(String value) {
            addCriterion("health_istouch >=", value, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchLessThan(String value) {
            addCriterion("health_istouch <", value, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchLessThanOrEqualTo(String value) {
            addCriterion("health_istouch <=", value, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchLike(String value) {
            addCriterion("health_istouch like", value, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchNotLike(String value) {
            addCriterion("health_istouch not like", value, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchIn(List<String> values) {
            addCriterion("health_istouch in", values, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchNotIn(List<String> values) {
            addCriterion("health_istouch not in", values, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchBetween(String value1, String value2) {
            addCriterion("health_istouch between", value1, value2, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthIstouchNotBetween(String value1, String value2) {
            addCriterion("health_istouch not between", value1, value2, "healthIstouch");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneIsNull() {
            addCriterion("health_phone is null");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneIsNotNull() {
            addCriterion("health_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneEqualTo(String value) {
            addCriterion("health_phone =", value, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneNotEqualTo(String value) {
            addCriterion("health_phone <>", value, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneGreaterThan(String value) {
            addCriterion("health_phone >", value, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("health_phone >=", value, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneLessThan(String value) {
            addCriterion("health_phone <", value, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneLessThanOrEqualTo(String value) {
            addCriterion("health_phone <=", value, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneLike(String value) {
            addCriterion("health_phone like", value, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneNotLike(String value) {
            addCriterion("health_phone not like", value, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneIn(List<String> values) {
            addCriterion("health_phone in", values, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneNotIn(List<String> values) {
            addCriterion("health_phone not in", values, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneBetween(String value1, String value2) {
            addCriterion("health_phone between", value1, value2, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthPhoneNotBetween(String value1, String value2) {
            addCriterion("health_phone not between", value1, value2, "healthPhone");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeIsNull() {
            addCriterion("health_adree is null");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeIsNotNull() {
            addCriterion("health_adree is not null");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeEqualTo(String value) {
            addCriterion("health_adree =", value, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeNotEqualTo(String value) {
            addCriterion("health_adree <>", value, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeGreaterThan(String value) {
            addCriterion("health_adree >", value, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeGreaterThanOrEqualTo(String value) {
            addCriterion("health_adree >=", value, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeLessThan(String value) {
            addCriterion("health_adree <", value, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeLessThanOrEqualTo(String value) {
            addCriterion("health_adree <=", value, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeLike(String value) {
            addCriterion("health_adree like", value, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeNotLike(String value) {
            addCriterion("health_adree not like", value, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeIn(List<String> values) {
            addCriterion("health_adree in", values, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeNotIn(List<String> values) {
            addCriterion("health_adree not in", values, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeBetween(String value1, String value2) {
            addCriterion("health_adree between", value1, value2, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthAdreeNotBetween(String value1, String value2) {
            addCriterion("health_adree not between", value1, value2, "healthAdree");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsIsNull() {
            addCriterion("health_details is null");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsIsNotNull() {
            addCriterion("health_details is not null");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsEqualTo(String value) {
            addCriterion("health_details =", value, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsNotEqualTo(String value) {
            addCriterion("health_details <>", value, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsGreaterThan(String value) {
            addCriterion("health_details >", value, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("health_details >=", value, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsLessThan(String value) {
            addCriterion("health_details <", value, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsLessThanOrEqualTo(String value) {
            addCriterion("health_details <=", value, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsLike(String value) {
            addCriterion("health_details like", value, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsNotLike(String value) {
            addCriterion("health_details not like", value, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsIn(List<String> values) {
            addCriterion("health_details in", values, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsNotIn(List<String> values) {
            addCriterion("health_details not in", values, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsBetween(String value1, String value2) {
            addCriterion("health_details between", value1, value2, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthDetailsNotBetween(String value1, String value2) {
            addCriterion("health_details not between", value1, value2, "healthDetails");
            return (Criteria) this;
        }

        public Criteria andHealthMatterIsNull() {
            addCriterion("health_matter is null");
            return (Criteria) this;
        }

        public Criteria andHealthMatterIsNotNull() {
            addCriterion("health_matter is not null");
            return (Criteria) this;
        }

        public Criteria andHealthMatterEqualTo(String value) {
            addCriterion("health_matter =", value, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterNotEqualTo(String value) {
            addCriterion("health_matter <>", value, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterGreaterThan(String value) {
            addCriterion("health_matter >", value, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterGreaterThanOrEqualTo(String value) {
            addCriterion("health_matter >=", value, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterLessThan(String value) {
            addCriterion("health_matter <", value, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterLessThanOrEqualTo(String value) {
            addCriterion("health_matter <=", value, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterLike(String value) {
            addCriterion("health_matter like", value, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterNotLike(String value) {
            addCriterion("health_matter not like", value, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterIn(List<String> values) {
            addCriterion("health_matter in", values, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterNotIn(List<String> values) {
            addCriterion("health_matter not in", values, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterBetween(String value1, String value2) {
            addCriterion("health_matter between", value1, value2, "healthMatter");
            return (Criteria) this;
        }

        public Criteria andHealthMatterNotBetween(String value1, String value2) {
            addCriterion("health_matter not between", value1, value2, "healthMatter");
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