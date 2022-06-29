package io.jejuwn.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PromotionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public PromotionExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecIsNull() {
            addCriterion("PROMOTION_VALUE_DEC is null");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecIsNotNull() {
            addCriterion("PROMOTION_VALUE_DEC is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_DEC =", value, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecNotEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_DEC <>", value, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecGreaterThan(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_DEC >", value, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_DEC >=", value, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecLessThan(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_DEC <", value, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_DEC <=", value, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecIn(List<BigDecimal> values) {
            addCriterion("PROMOTION_VALUE_DEC in", values, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecNotIn(List<BigDecimal> values) {
            addCriterion("PROMOTION_VALUE_DEC not in", values, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_VALUE_DEC between", value1, value2, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueDecNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_VALUE_DEC not between", value1, value2, "promotionValueDec");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsIsNull() {
            addCriterion("PROMOTION_VALUE_ABS is null");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsIsNotNull() {
            addCriterion("PROMOTION_VALUE_ABS is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_ABS =", value, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsNotEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_ABS <>", value, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsGreaterThan(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_ABS >", value, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_ABS >=", value, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsLessThan(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_ABS <", value, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_VALUE_ABS <=", value, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsIn(List<BigDecimal> values) {
            addCriterion("PROMOTION_VALUE_ABS in", values, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsNotIn(List<BigDecimal> values) {
            addCriterion("PROMOTION_VALUE_ABS not in", values, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_VALUE_ABS between", value1, value2, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andPromotionValueAbsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_VALUE_ABS not between", value1, value2, "promotionValueAbs");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(BigDecimal value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROMOTION
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 29 20:14:37 KST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROMOTION
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
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