package com.sc.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VaccinationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VaccinationExample() {
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

        public Criteria andVaccinationIdIsNull() {
            addCriterion("vaccination_id is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdIsNotNull() {
            addCriterion("vaccination_id is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdEqualTo(Integer value) {
            addCriterion("vaccination_id =", value, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdNotEqualTo(Integer value) {
            addCriterion("vaccination_id <>", value, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdGreaterThan(Integer value) {
            addCriterion("vaccination_id >", value, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vaccination_id >=", value, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdLessThan(Integer value) {
            addCriterion("vaccination_id <", value, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdLessThanOrEqualTo(Integer value) {
            addCriterion("vaccination_id <=", value, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdIn(List<Integer> values) {
            addCriterion("vaccination_id in", values, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdNotIn(List<Integer> values) {
            addCriterion("vaccination_id not in", values, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdBetween(Integer value1, Integer value2) {
            addCriterion("vaccination_id between", value1, value2, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vaccination_id not between", value1, value2, "vaccinationId");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameIsNull() {
            addCriterion("vaccination_name is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameIsNotNull() {
            addCriterion("vaccination_name is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameEqualTo(String value) {
            addCriterion("vaccination_name =", value, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameNotEqualTo(String value) {
            addCriterion("vaccination_name <>", value, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameGreaterThan(String value) {
            addCriterion("vaccination_name >", value, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameGreaterThanOrEqualTo(String value) {
            addCriterion("vaccination_name >=", value, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameLessThan(String value) {
            addCriterion("vaccination_name <", value, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameLessThanOrEqualTo(String value) {
            addCriterion("vaccination_name <=", value, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameLike(String value) {
            addCriterion("vaccination_name like", value, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameNotLike(String value) {
            addCriterion("vaccination_name not like", value, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameIn(List<String> values) {
            addCriterion("vaccination_name in", values, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameNotIn(List<String> values) {
            addCriterion("vaccination_name not in", values, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameBetween(String value1, String value2) {
            addCriterion("vaccination_name between", value1, value2, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationNameNotBetween(String value1, String value2) {
            addCriterion("vaccination_name not between", value1, value2, "vaccinationName");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexIsNull() {
            addCriterion("vaccination_sex is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexIsNotNull() {
            addCriterion("vaccination_sex is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexEqualTo(String value) {
            addCriterion("vaccination_sex =", value, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexNotEqualTo(String value) {
            addCriterion("vaccination_sex <>", value, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexGreaterThan(String value) {
            addCriterion("vaccination_sex >", value, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexGreaterThanOrEqualTo(String value) {
            addCriterion("vaccination_sex >=", value, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexLessThan(String value) {
            addCriterion("vaccination_sex <", value, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexLessThanOrEqualTo(String value) {
            addCriterion("vaccination_sex <=", value, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexLike(String value) {
            addCriterion("vaccination_sex like", value, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexNotLike(String value) {
            addCriterion("vaccination_sex not like", value, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexIn(List<String> values) {
            addCriterion("vaccination_sex in", values, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexNotIn(List<String> values) {
            addCriterion("vaccination_sex not in", values, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexBetween(String value1, String value2) {
            addCriterion("vaccination_sex between", value1, value2, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationSexNotBetween(String value1, String value2) {
            addCriterion("vaccination_sex not between", value1, value2, "vaccinationSex");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneIsNull() {
            addCriterion("vaccination_phone is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneIsNotNull() {
            addCriterion("vaccination_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneEqualTo(String value) {
            addCriterion("vaccination_phone =", value, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneNotEqualTo(String value) {
            addCriterion("vaccination_phone <>", value, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneGreaterThan(String value) {
            addCriterion("vaccination_phone >", value, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("vaccination_phone >=", value, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneLessThan(String value) {
            addCriterion("vaccination_phone <", value, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneLessThanOrEqualTo(String value) {
            addCriterion("vaccination_phone <=", value, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneLike(String value) {
            addCriterion("vaccination_phone like", value, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneNotLike(String value) {
            addCriterion("vaccination_phone not like", value, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneIn(List<String> values) {
            addCriterion("vaccination_phone in", values, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneNotIn(List<String> values) {
            addCriterion("vaccination_phone not in", values, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneBetween(String value1, String value2) {
            addCriterion("vaccination_phone between", value1, value2, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationPhoneNotBetween(String value1, String value2) {
            addCriterion("vaccination_phone not between", value1, value2, "vaccinationPhone");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressIsNull() {
            addCriterion("vaccination_adress is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressIsNotNull() {
            addCriterion("vaccination_adress is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressEqualTo(String value) {
            addCriterion("vaccination_adress =", value, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressNotEqualTo(String value) {
            addCriterion("vaccination_adress <>", value, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressGreaterThan(String value) {
            addCriterion("vaccination_adress >", value, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressGreaterThanOrEqualTo(String value) {
            addCriterion("vaccination_adress >=", value, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressLessThan(String value) {
            addCriterion("vaccination_adress <", value, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressLessThanOrEqualTo(String value) {
            addCriterion("vaccination_adress <=", value, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressLike(String value) {
            addCriterion("vaccination_adress like", value, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressNotLike(String value) {
            addCriterion("vaccination_adress not like", value, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressIn(List<String> values) {
            addCriterion("vaccination_adress in", values, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressNotIn(List<String> values) {
            addCriterion("vaccination_adress not in", values, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressBetween(String value1, String value2) {
            addCriterion("vaccination_adress between", value1, value2, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationAdressNotBetween(String value1, String value2) {
            addCriterion("vaccination_adress not between", value1, value2, "vaccinationAdress");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstIsNull() {
            addCriterion("vaccination_first is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstIsNotNull() {
            addCriterion("vaccination_first is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstEqualTo(String value) {
            addCriterion("vaccination_first =", value, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstNotEqualTo(String value) {
            addCriterion("vaccination_first <>", value, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstGreaterThan(String value) {
            addCriterion("vaccination_first >", value, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstGreaterThanOrEqualTo(String value) {
            addCriterion("vaccination_first >=", value, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstLessThan(String value) {
            addCriterion("vaccination_first <", value, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstLessThanOrEqualTo(String value) {
            addCriterion("vaccination_first <=", value, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstLike(String value) {
            addCriterion("vaccination_first like", value, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstNotLike(String value) {
            addCriterion("vaccination_first not like", value, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstIn(List<String> values) {
            addCriterion("vaccination_first in", values, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstNotIn(List<String> values) {
            addCriterion("vaccination_first not in", values, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstBetween(String value1, String value2) {
            addCriterion("vaccination_first between", value1, value2, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirstNotBetween(String value1, String value2) {
            addCriterion("vaccination_first not between", value1, value2, "vaccinationFirst");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeIsNull() {
            addCriterion("vaccination_firstTime is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeIsNotNull() {
            addCriterion("vaccination_firstTime is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_firstTime =", value, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_firstTime <>", value, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("vaccination_firstTime >", value, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_firstTime >=", value, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeLessThan(Date value) {
            addCriterionForJDBCDate("vaccination_firstTime <", value, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_firstTime <=", value, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeIn(List<Date> values) {
            addCriterionForJDBCDate("vaccination_firstTime in", values, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("vaccination_firstTime not in", values, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vaccination_firstTime between", value1, value2, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationFirsttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vaccination_firstTime not between", value1, value2, "vaccinationFirsttime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondIsNull() {
            addCriterion("vaccination_second is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondIsNotNull() {
            addCriterion("vaccination_second is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondEqualTo(String value) {
            addCriterion("vaccination_second =", value, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondNotEqualTo(String value) {
            addCriterion("vaccination_second <>", value, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondGreaterThan(String value) {
            addCriterion("vaccination_second >", value, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondGreaterThanOrEqualTo(String value) {
            addCriterion("vaccination_second >=", value, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondLessThan(String value) {
            addCriterion("vaccination_second <", value, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondLessThanOrEqualTo(String value) {
            addCriterion("vaccination_second <=", value, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondLike(String value) {
            addCriterion("vaccination_second like", value, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondNotLike(String value) {
            addCriterion("vaccination_second not like", value, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondIn(List<String> values) {
            addCriterion("vaccination_second in", values, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondNotIn(List<String> values) {
            addCriterion("vaccination_second not in", values, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondBetween(String value1, String value2) {
            addCriterion("vaccination_second between", value1, value2, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondNotBetween(String value1, String value2) {
            addCriterion("vaccination_second not between", value1, value2, "vaccinationSecond");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeIsNull() {
            addCriterion("vaccination_secondTime is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeIsNotNull() {
            addCriterion("vaccination_secondTime is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_secondTime =", value, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_secondTime <>", value, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("vaccination_secondTime >", value, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_secondTime >=", value, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeLessThan(Date value) {
            addCriterionForJDBCDate("vaccination_secondTime <", value, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_secondTime <=", value, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeIn(List<Date> values) {
            addCriterionForJDBCDate("vaccination_secondTime in", values, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("vaccination_secondTime not in", values, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vaccination_secondTime between", value1, value2, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationSecondtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vaccination_secondTime not between", value1, value2, "vaccinationSecondtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdIsNull() {
            addCriterion("vaccination_third is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdIsNotNull() {
            addCriterion("vaccination_third is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdEqualTo(String value) {
            addCriterion("vaccination_third =", value, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdNotEqualTo(String value) {
            addCriterion("vaccination_third <>", value, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdGreaterThan(String value) {
            addCriterion("vaccination_third >", value, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdGreaterThanOrEqualTo(String value) {
            addCriterion("vaccination_third >=", value, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdLessThan(String value) {
            addCriterion("vaccination_third <", value, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdLessThanOrEqualTo(String value) {
            addCriterion("vaccination_third <=", value, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdLike(String value) {
            addCriterion("vaccination_third like", value, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdNotLike(String value) {
            addCriterion("vaccination_third not like", value, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdIn(List<String> values) {
            addCriterion("vaccination_third in", values, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdNotIn(List<String> values) {
            addCriterion("vaccination_third not in", values, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdBetween(String value1, String value2) {
            addCriterion("vaccination_third between", value1, value2, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdNotBetween(String value1, String value2) {
            addCriterion("vaccination_third not between", value1, value2, "vaccinationThird");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeIsNull() {
            addCriterion("vaccination_thirdTime is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeIsNotNull() {
            addCriterion("vaccination_thirdTime is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_thirdTime =", value, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_thirdTime <>", value, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("vaccination_thirdTime >", value, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_thirdTime >=", value, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeLessThan(Date value) {
            addCriterionForJDBCDate("vaccination_thirdTime <", value, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vaccination_thirdTime <=", value, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeIn(List<Date> values) {
            addCriterionForJDBCDate("vaccination_thirdTime in", values, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("vaccination_thirdTime not in", values, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vaccination_thirdTime between", value1, value2, "vaccinationThirdtime");
            return (Criteria) this;
        }

        public Criteria andVaccinationThirdtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vaccination_thirdTime not between", value1, value2, "vaccinationThirdtime");
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