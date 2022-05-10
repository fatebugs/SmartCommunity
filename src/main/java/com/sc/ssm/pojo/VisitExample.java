package com.sc.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitExample() {
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

        public Criteria andVisitIdIsNull() {
            addCriterion("visit_id is null");
            return (Criteria) this;
        }

        public Criteria andVisitIdIsNotNull() {
            addCriterion("visit_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIdEqualTo(Date value) {
            addCriterionForJDBCDate("visit_id =", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotEqualTo(Date value) {
            addCriterionForJDBCDate("visit_id <>", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThan(Date value) {
            addCriterionForJDBCDate("visit_id >", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("visit_id >=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThan(Date value) {
            addCriterionForJDBCDate("visit_id <", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("visit_id <=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdIn(List<Date> values) {
            addCriterionForJDBCDate("visit_id in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotIn(List<Date> values) {
            addCriterionForJDBCDate("visit_id not in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("visit_id between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("visit_id not between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdsIsNull() {
            addCriterion("visit_ids is null");
            return (Criteria) this;
        }

        public Criteria andVisitIdsIsNotNull() {
            addCriterion("visit_ids is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIdsEqualTo(String value) {
            addCriterion("visit_ids =", value, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsNotEqualTo(String value) {
            addCriterion("visit_ids <>", value, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsGreaterThan(String value) {
            addCriterion("visit_ids >", value, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsGreaterThanOrEqualTo(String value) {
            addCriterion("visit_ids >=", value, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsLessThan(String value) {
            addCriterion("visit_ids <", value, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsLessThanOrEqualTo(String value) {
            addCriterion("visit_ids <=", value, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsLike(String value) {
            addCriterion("visit_ids like", value, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsNotLike(String value) {
            addCriterion("visit_ids not like", value, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsIn(List<String> values) {
            addCriterion("visit_ids in", values, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsNotIn(List<String> values) {
            addCriterion("visit_ids not in", values, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsBetween(String value1, String value2) {
            addCriterion("visit_ids between", value1, value2, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitIdsNotBetween(String value1, String value2) {
            addCriterion("visit_ids not between", value1, value2, "visitIds");
            return (Criteria) this;
        }

        public Criteria andVisitNameIsNull() {
            addCriterion("visit_name is null");
            return (Criteria) this;
        }

        public Criteria andVisitNameIsNotNull() {
            addCriterion("visit_name is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNameEqualTo(String value) {
            addCriterion("visit_name =", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameNotEqualTo(String value) {
            addCriterion("visit_name <>", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameGreaterThan(String value) {
            addCriterion("visit_name >", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameGreaterThanOrEqualTo(String value) {
            addCriterion("visit_name >=", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameLessThan(String value) {
            addCriterion("visit_name <", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameLessThanOrEqualTo(String value) {
            addCriterion("visit_name <=", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameLike(String value) {
            addCriterion("visit_name like", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameNotLike(String value) {
            addCriterion("visit_name not like", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameIn(List<String> values) {
            addCriterion("visit_name in", values, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameNotIn(List<String> values) {
            addCriterion("visit_name not in", values, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameBetween(String value1, String value2) {
            addCriterion("visit_name between", value1, value2, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameNotBetween(String value1, String value2) {
            addCriterion("visit_name not between", value1, value2, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneIsNull() {
            addCriterion("visit_phone is null");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneIsNotNull() {
            addCriterion("visit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneEqualTo(String value) {
            addCriterion("visit_phone =", value, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneNotEqualTo(String value) {
            addCriterion("visit_phone <>", value, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneGreaterThan(String value) {
            addCriterion("visit_phone >", value, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("visit_phone >=", value, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneLessThan(String value) {
            addCriterion("visit_phone <", value, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneLessThanOrEqualTo(String value) {
            addCriterion("visit_phone <=", value, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneLike(String value) {
            addCriterion("visit_phone like", value, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneNotLike(String value) {
            addCriterion("visit_phone not like", value, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneIn(List<String> values) {
            addCriterion("visit_phone in", values, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneNotIn(List<String> values) {
            addCriterion("visit_phone not in", values, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneBetween(String value1, String value2) {
            addCriterion("visit_phone between", value1, value2, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitPhoneNotBetween(String value1, String value2) {
            addCriterion("visit_phone not between", value1, value2, "visitPhone");
            return (Criteria) this;
        }

        public Criteria andVisitAdressIsNull() {
            addCriterion("visit_adress is null");
            return (Criteria) this;
        }

        public Criteria andVisitAdressIsNotNull() {
            addCriterion("visit_adress is not null");
            return (Criteria) this;
        }

        public Criteria andVisitAdressEqualTo(String value) {
            addCriterion("visit_adress =", value, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressNotEqualTo(String value) {
            addCriterion("visit_adress <>", value, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressGreaterThan(String value) {
            addCriterion("visit_adress >", value, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressGreaterThanOrEqualTo(String value) {
            addCriterion("visit_adress >=", value, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressLessThan(String value) {
            addCriterion("visit_adress <", value, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressLessThanOrEqualTo(String value) {
            addCriterion("visit_adress <=", value, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressLike(String value) {
            addCriterion("visit_adress like", value, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressNotLike(String value) {
            addCriterion("visit_adress not like", value, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressIn(List<String> values) {
            addCriterion("visit_adress in", values, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressNotIn(List<String> values) {
            addCriterion("visit_adress not in", values, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressBetween(String value1, String value2) {
            addCriterion("visit_adress between", value1, value2, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitAdressNotBetween(String value1, String value2) {
            addCriterion("visit_adress not between", value1, value2, "visitAdress");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsIsNull() {
            addCriterion("visit_details is null");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsIsNotNull() {
            addCriterion("visit_details is not null");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsEqualTo(String value) {
            addCriterion("visit_details =", value, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsNotEqualTo(String value) {
            addCriterion("visit_details <>", value, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsGreaterThan(String value) {
            addCriterion("visit_details >", value, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("visit_details >=", value, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsLessThan(String value) {
            addCriterion("visit_details <", value, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsLessThanOrEqualTo(String value) {
            addCriterion("visit_details <=", value, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsLike(String value) {
            addCriterion("visit_details like", value, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsNotLike(String value) {
            addCriterion("visit_details not like", value, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsIn(List<String> values) {
            addCriterion("visit_details in", values, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsNotIn(List<String> values) {
            addCriterion("visit_details not in", values, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsBetween(String value1, String value2) {
            addCriterion("visit_details between", value1, value2, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitDetailsNotBetween(String value1, String value2) {
            addCriterion("visit_details not between", value1, value2, "visitDetails");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNull() {
            addCriterion("visit_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(String value) {
            addCriterion("visit_time =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(String value) {
            addCriterion("visit_time <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(String value) {
            addCriterion("visit_time >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("visit_time >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(String value) {
            addCriterion("visit_time <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(String value) {
            addCriterion("visit_time <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLike(String value) {
            addCriterion("visit_time like", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotLike(String value) {
            addCriterion("visit_time not like", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<String> values) {
            addCriterion("visit_time in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<String> values) {
            addCriterion("visit_time not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(String value1, String value2) {
            addCriterion("visit_time between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(String value1, String value2) {
            addCriterion("visit_time not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitStateIsNull() {
            addCriterion("visit_state is null");
            return (Criteria) this;
        }

        public Criteria andVisitStateIsNotNull() {
            addCriterion("visit_state is not null");
            return (Criteria) this;
        }

        public Criteria andVisitStateEqualTo(String value) {
            addCriterion("visit_state =", value, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateNotEqualTo(String value) {
            addCriterion("visit_state <>", value, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateGreaterThan(String value) {
            addCriterion("visit_state >", value, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateGreaterThanOrEqualTo(String value) {
            addCriterion("visit_state >=", value, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateLessThan(String value) {
            addCriterion("visit_state <", value, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateLessThanOrEqualTo(String value) {
            addCriterion("visit_state <=", value, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateLike(String value) {
            addCriterion("visit_state like", value, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateNotLike(String value) {
            addCriterion("visit_state not like", value, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateIn(List<String> values) {
            addCriterion("visit_state in", values, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateNotIn(List<String> values) {
            addCriterion("visit_state not in", values, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateBetween(String value1, String value2) {
            addCriterion("visit_state between", value1, value2, "visitState");
            return (Criteria) this;
        }

        public Criteria andVisitStateNotBetween(String value1, String value2) {
            addCriterion("visit_state not between", value1, value2, "visitState");
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