package com.sc.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResidentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResidentExample() {
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
        return new Criteria();
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

        public Criteria andResidentsIdIsNull() {
            addCriterion("residents_id is null");
            return (Criteria) this;
        }

        public Criteria andResidentsIdIsNotNull() {
            addCriterion("residents_id is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsIdEqualTo(Integer value) {
            addCriterion("residents_id =", value, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdNotEqualTo(Integer value) {
            addCriterion("residents_id <>", value, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdGreaterThan(Integer value) {
            addCriterion("residents_id >", value, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("residents_id >=", value, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdLessThan(Integer value) {
            addCriterion("residents_id <", value, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("residents_id <=", value, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdIn(List<Integer> values) {
            addCriterion("residents_id in", values, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdNotIn(List<Integer> values) {
            addCriterion("residents_id not in", values, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdBetween(Integer value1, Integer value2) {
            addCriterion("residents_id between", value1, value2, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("residents_id not between", value1, value2, "residentsId");
            return (Criteria) this;
        }

        public Criteria andResidentsNameIsNull() {
            addCriterion("residents_name is null");
            return (Criteria) this;
        }

        public Criteria andResidentsNameIsNotNull() {
            addCriterion("residents_name is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsNameEqualTo(String value) {
            addCriterion("residents_name =", value, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameNotEqualTo(String value) {
            addCriterion("residents_name <>", value, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameGreaterThan(String value) {
            addCriterion("residents_name >", value, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameGreaterThanOrEqualTo(String value) {
            addCriterion("residents_name >=", value, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameLessThan(String value) {
            addCriterion("residents_name <", value, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameLessThanOrEqualTo(String value) {
            addCriterion("residents_name <=", value, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameLike(String value) {
            addCriterion("residents_name like", value, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameNotLike(String value) {
            addCriterion("residents_name not like", value, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameIn(List<String> values) {
            addCriterion("residents_name in", values, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameNotIn(List<String> values) {
            addCriterion("residents_name not in", values, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameBetween(String value1, String value2) {
            addCriterion("residents_name between", value1, value2, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsNameNotBetween(String value1, String value2) {
            addCriterion("residents_name not between", value1, value2, "residentsName");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordIsNull() {
            addCriterion("residents_password is null");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordIsNotNull() {
            addCriterion("residents_password is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordEqualTo(String value) {
            addCriterion("residents_password =", value, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordNotEqualTo(String value) {
            addCriterion("residents_password <>", value, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordGreaterThan(String value) {
            addCriterion("residents_password >", value, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("residents_password >=", value, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordLessThan(String value) {
            addCriterion("residents_password <", value, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordLessThanOrEqualTo(String value) {
            addCriterion("residents_password <=", value, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordLike(String value) {
            addCriterion("residents_password like", value, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordNotLike(String value) {
            addCriterion("residents_password not like", value, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordIn(List<String> values) {
            addCriterion("residents_password in", values, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordNotIn(List<String> values) {
            addCriterion("residents_password not in", values, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordBetween(String value1, String value2) {
            addCriterion("residents_password between", value1, value2, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsPasswordNotBetween(String value1, String value2) {
            addCriterion("residents_password not between", value1, value2, "residentsPassword");
            return (Criteria) this;
        }

        public Criteria andResidentsSexIsNull() {
            addCriterion("residents_sex is null");
            return (Criteria) this;
        }

        public Criteria andResidentsSexIsNotNull() {
            addCriterion("residents_sex is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsSexEqualTo(String value) {
            addCriterion("residents_sex =", value, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexNotEqualTo(String value) {
            addCriterion("residents_sex <>", value, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexGreaterThan(String value) {
            addCriterion("residents_sex >", value, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexGreaterThanOrEqualTo(String value) {
            addCriterion("residents_sex >=", value, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexLessThan(String value) {
            addCriterion("residents_sex <", value, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexLessThanOrEqualTo(String value) {
            addCriterion("residents_sex <=", value, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexLike(String value) {
            addCriterion("residents_sex like", value, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexNotLike(String value) {
            addCriterion("residents_sex not like", value, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexIn(List<String> values) {
            addCriterion("residents_sex in", values, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexNotIn(List<String> values) {
            addCriterion("residents_sex not in", values, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexBetween(String value1, String value2) {
            addCriterion("residents_sex between", value1, value2, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsSexNotBetween(String value1, String value2) {
            addCriterion("residents_sex not between", value1, value2, "residentsSex");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressIsNull() {
            addCriterion("residents_adress is null");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressIsNotNull() {
            addCriterion("residents_adress is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressEqualTo(String value) {
            addCriterion("residents_adress =", value, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressNotEqualTo(String value) {
            addCriterion("residents_adress <>", value, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressGreaterThan(String value) {
            addCriterion("residents_adress >", value, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressGreaterThanOrEqualTo(String value) {
            addCriterion("residents_adress >=", value, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressLessThan(String value) {
            addCriterion("residents_adress <", value, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressLessThanOrEqualTo(String value) {
            addCriterion("residents_adress <=", value, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressLike(String value) {
            addCriterion("residents_adress like", value, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressNotLike(String value) {
            addCriterion("residents_adress not like", value, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressIn(List<String> values) {
            addCriterion("residents_adress in", values, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressNotIn(List<String> values) {
            addCriterion("residents_adress not in", values, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressBetween(String value1, String value2) {
            addCriterion("residents_adress between", value1, value2, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsAdressNotBetween(String value1, String value2) {
            addCriterion("residents_adress not between", value1, value2, "residentsAdress");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneIsNull() {
            addCriterion("residents_phone is null");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneIsNotNull() {
            addCriterion("residents_phone is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneEqualTo(String value) {
            addCriterion("residents_phone =", value, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneNotEqualTo(String value) {
            addCriterion("residents_phone <>", value, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneGreaterThan(String value) {
            addCriterion("residents_phone >", value, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("residents_phone >=", value, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneLessThan(String value) {
            addCriterion("residents_phone <", value, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneLessThanOrEqualTo(String value) {
            addCriterion("residents_phone <=", value, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneLike(String value) {
            addCriterion("residents_phone like", value, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneNotLike(String value) {
            addCriterion("residents_phone not like", value, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneIn(List<String> values) {
            addCriterion("residents_phone in", values, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneNotIn(List<String> values) {
            addCriterion("residents_phone not in", values, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneBetween(String value1, String value2) {
            addCriterion("residents_phone between", value1, value2, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsPhoneNotBetween(String value1, String value2) {
            addCriterion("residents_phone not between", value1, value2, "residentsPhone");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityIsNull() {
            addCriterion("residents_identity is null");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityIsNotNull() {
            addCriterion("residents_identity is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityEqualTo(String value) {
            addCriterion("residents_identity =", value, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityNotEqualTo(String value) {
            addCriterion("residents_identity <>", value, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityGreaterThan(String value) {
            addCriterion("residents_identity >", value, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("residents_identity >=", value, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityLessThan(String value) {
            addCriterion("residents_identity <", value, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityLessThanOrEqualTo(String value) {
            addCriterion("residents_identity <=", value, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityLike(String value) {
            addCriterion("residents_identity like", value, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityNotLike(String value) {
            addCriterion("residents_identity not like", value, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityIn(List<String> values) {
            addCriterion("residents_identity in", values, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityNotIn(List<String> values) {
            addCriterion("residents_identity not in", values, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityBetween(String value1, String value2) {
            addCriterion("residents_identity between", value1, value2, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsIdentityNotBetween(String value1, String value2) {
            addCriterion("residents_identity not between", value1, value2, "residentsIdentity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityIsNull() {
            addCriterion("residents_security is null");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityIsNotNull() {
            addCriterion("residents_security is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityEqualTo(String value) {
            addCriterion("residents_security =", value, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityNotEqualTo(String value) {
            addCriterion("residents_security <>", value, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityGreaterThan(String value) {
            addCriterion("residents_security >", value, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("residents_security >=", value, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityLessThan(String value) {
            addCriterion("residents_security <", value, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityLessThanOrEqualTo(String value) {
            addCriterion("residents_security <=", value, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityLike(String value) {
            addCriterion("residents_security like", value, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityNotLike(String value) {
            addCriterion("residents_security not like", value, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityIn(List<String> values) {
            addCriterion("residents_security in", values, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityNotIn(List<String> values) {
            addCriterion("residents_security not in", values, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityBetween(String value1, String value2) {
            addCriterion("residents_security between", value1, value2, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsSecurityNotBetween(String value1, String value2) {
            addCriterion("residents_security not between", value1, value2, "residentsSecurity");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeIsNull() {
            addCriterion("residents_time is null");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeIsNotNull() {
            addCriterion("residents_time is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeEqualTo(Date value) {
            addCriterion("residents_time =", value, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeNotEqualTo(Date value) {
            addCriterion("residents_time <>", value, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeGreaterThan(Date value) {
            addCriterion("residents_time >", value, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("residents_time >=", value, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeLessThan(Date value) {
            addCriterion("residents_time <", value, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeLessThanOrEqualTo(Date value) {
            addCriterion("residents_time <=", value, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeIn(List<Date> values) {
            addCriterion("residents_time in", values, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeNotIn(List<Date> values) {
            addCriterion("residents_time not in", values, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeBetween(Date value1, Date value2) {
            addCriterion("residents_time between", value1, value2, "residentsTime");
            return (Criteria) this;
        }

        public Criteria andResidentsTimeNotBetween(Date value1, Date value2) {
            addCriterion("residents_time not between", value1, value2, "residentsTime");
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
