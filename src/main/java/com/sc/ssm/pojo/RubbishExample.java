package com.sc.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class RubbishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RubbishExample() {
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

        public Criteria andRubbishIdIsNull() {
            addCriterion("rubbish_id is null");
            return (Criteria) this;
        }

        public Criteria andRubbishIdIsNotNull() {
            addCriterion("rubbish_id is not null");
            return (Criteria) this;
        }

        public Criteria andRubbishIdEqualTo(Integer value) {
            addCriterion("rubbish_id =", value, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdNotEqualTo(Integer value) {
            addCriterion("rubbish_id <>", value, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdGreaterThan(Integer value) {
            addCriterion("rubbish_id >", value, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rubbish_id >=", value, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdLessThan(Integer value) {
            addCriterion("rubbish_id <", value, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdLessThanOrEqualTo(Integer value) {
            addCriterion("rubbish_id <=", value, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdIn(List<Integer> values) {
            addCriterion("rubbish_id in", values, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdNotIn(List<Integer> values) {
            addCriterion("rubbish_id not in", values, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdBetween(Integer value1, Integer value2) {
            addCriterion("rubbish_id between", value1, value2, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rubbish_id not between", value1, value2, "rubbishId");
            return (Criteria) this;
        }

        public Criteria andRubbishNameIsNull() {
            addCriterion("rubbish_name is null");
            return (Criteria) this;
        }

        public Criteria andRubbishNameIsNotNull() {
            addCriterion("rubbish_name is not null");
            return (Criteria) this;
        }

        public Criteria andRubbishNameEqualTo(String value) {
            addCriterion("rubbish_name =", value, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameNotEqualTo(String value) {
            addCriterion("rubbish_name <>", value, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameGreaterThan(String value) {
            addCriterion("rubbish_name >", value, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameGreaterThanOrEqualTo(String value) {
            addCriterion("rubbish_name >=", value, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameLessThan(String value) {
            addCriterion("rubbish_name <", value, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameLessThanOrEqualTo(String value) {
            addCriterion("rubbish_name <=", value, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameLike(String value) {
            addCriterion("rubbish_name like", value, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameNotLike(String value) {
            addCriterion("rubbish_name not like", value, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameIn(List<String> values) {
            addCriterion("rubbish_name in", values, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameNotIn(List<String> values) {
            addCriterion("rubbish_name not in", values, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameBetween(String value1, String value2) {
            addCriterion("rubbish_name between", value1, value2, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishNameNotBetween(String value1, String value2) {
            addCriterion("rubbish_name not between", value1, value2, "rubbishName");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidIsNull() {
            addCriterion("rubbish_fyid is null");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidIsNotNull() {
            addCriterion("rubbish_fyid is not null");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidEqualTo(Integer value) {
            addCriterion("rubbish_fyid =", value, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidNotEqualTo(Integer value) {
            addCriterion("rubbish_fyid <>", value, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidGreaterThan(Integer value) {
            addCriterion("rubbish_fyid >", value, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rubbish_fyid >=", value, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidLessThan(Integer value) {
            addCriterion("rubbish_fyid <", value, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidLessThanOrEqualTo(Integer value) {
            addCriterion("rubbish_fyid <=", value, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidIn(List<Integer> values) {
            addCriterion("rubbish_fyid in", values, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidNotIn(List<Integer> values) {
            addCriterion("rubbish_fyid not in", values, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidBetween(Integer value1, Integer value2) {
            addCriterion("rubbish_fyid between", value1, value2, "rubbishFyid");
            return (Criteria) this;
        }

        public Criteria andRubbishFyidNotBetween(Integer value1, Integer value2) {
            addCriterion("rubbish_fyid not between", value1, value2, "rubbishFyid");
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