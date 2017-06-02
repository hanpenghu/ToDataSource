package com.aiBanShi.ErpToShop.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LxsktExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LxsktExample() {
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

        public Criteria andCgqIsNull() {
            addCriterion("CGQ is null");
            return (Criteria) this;
        }

        public Criteria andCgqIsNotNull() {
            addCriterion("CGQ is not null");
            return (Criteria) this;
        }

        public Criteria andCgqEqualTo(String value) {
            addCriterion("CGQ =", value, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqNotEqualTo(String value) {
            addCriterion("CGQ <>", value, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqGreaterThan(String value) {
            addCriterion("CGQ >", value, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqGreaterThanOrEqualTo(String value) {
            addCriterion("CGQ >=", value, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqLessThan(String value) {
            addCriterion("CGQ <", value, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqLessThanOrEqualTo(String value) {
            addCriterion("CGQ <=", value, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqLike(String value) {
            addCriterion("CGQ like", value, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqNotLike(String value) {
            addCriterion("CGQ not like", value, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqIn(List<String> values) {
            addCriterion("CGQ in", values, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqNotIn(List<String> values) {
            addCriterion("CGQ not in", values, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqBetween(String value1, String value2) {
            addCriterion("CGQ between", value1, value2, "cgq");
            return (Criteria) this;
        }

        public Criteria andCgqNotBetween(String value1, String value2) {
            addCriterion("CGQ not between", value1, value2, "cgq");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("DH is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("DH is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("DH =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("DH <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("DH >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("DH >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("DH <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("DH <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("DH like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("DH not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("DH in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("DH not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("DH between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("DH not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andTeamTimeIsNull() {
            addCriterion("TEAM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTeamTimeIsNotNull() {
            addCriterion("TEAM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamTimeEqualTo(Date value) {
            addCriterion("TEAM_TIME =", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeNotEqualTo(Date value) {
            addCriterion("TEAM_TIME <>", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeGreaterThan(Date value) {
            addCriterion("TEAM_TIME >", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TEAM_TIME >=", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeLessThan(Date value) {
            addCriterion("TEAM_TIME <", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeLessThanOrEqualTo(Date value) {
            addCriterion("TEAM_TIME <=", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeIn(List<Date> values) {
            addCriterion("TEAM_TIME in", values, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeNotIn(List<Date> values) {
            addCriterion("TEAM_TIME not in", values, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeBetween(Date value1, Date value2) {
            addCriterion("TEAM_TIME between", value1, value2, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeNotBetween(Date value1, Date value2) {
            addCriterion("TEAM_TIME not between", value1, value2, "teamTime");
            return (Criteria) this;
        }

        public Criteria andDyNameIsNull() {
            addCriterion("DY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDyNameIsNotNull() {
            addCriterion("DY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDyNameEqualTo(String value) {
            addCriterion("DY_NAME =", value, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameNotEqualTo(String value) {
            addCriterion("DY_NAME <>", value, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameGreaterThan(String value) {
            addCriterion("DY_NAME >", value, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameGreaterThanOrEqualTo(String value) {
            addCriterion("DY_NAME >=", value, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameLessThan(String value) {
            addCriterion("DY_NAME <", value, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameLessThanOrEqualTo(String value) {
            addCriterion("DY_NAME <=", value, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameLike(String value) {
            addCriterion("DY_NAME like", value, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameNotLike(String value) {
            addCriterion("DY_NAME not like", value, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameIn(List<String> values) {
            addCriterion("DY_NAME in", values, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameNotIn(List<String> values) {
            addCriterion("DY_NAME not in", values, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameBetween(String value1, String value2) {
            addCriterion("DY_NAME between", value1, value2, "dyName");
            return (Criteria) this;
        }

        public Criteria andDyNameNotBetween(String value1, String value2) {
            addCriterion("DY_NAME not between", value1, value2, "dyName");
            return (Criteria) this;
        }

        public Criteria andLxsRsIsNull() {
            addCriterion("LXS_RS is null");
            return (Criteria) this;
        }

        public Criteria andLxsRsIsNotNull() {
            addCriterion("LXS_RS is not null");
            return (Criteria) this;
        }

        public Criteria andLxsRsEqualTo(Integer value) {
            addCriterion("LXS_RS =", value, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsNotEqualTo(Integer value) {
            addCriterion("LXS_RS <>", value, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsGreaterThan(Integer value) {
            addCriterion("LXS_RS >", value, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsGreaterThanOrEqualTo(Integer value) {
            addCriterion("LXS_RS >=", value, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsLessThan(Integer value) {
            addCriterion("LXS_RS <", value, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsLessThanOrEqualTo(Integer value) {
            addCriterion("LXS_RS <=", value, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsIn(List<Integer> values) {
            addCriterion("LXS_RS in", values, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsNotIn(List<Integer> values) {
            addCriterion("LXS_RS not in", values, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsBetween(Integer value1, Integer value2) {
            addCriterion("LXS_RS between", value1, value2, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRsNotBetween(Integer value1, Integer value2) {
            addCriterion("LXS_RS not between", value1, value2, "lxsRs");
            return (Criteria) this;
        }

        public Criteria andLxsRtfIsNull() {
            addCriterion("LXS_RTF is null");
            return (Criteria) this;
        }

        public Criteria andLxsRtfIsNotNull() {
            addCriterion("LXS_RTF is not null");
            return (Criteria) this;
        }

        public Criteria andLxsRtfEqualTo(BigDecimal value) {
            addCriterion("LXS_RTF =", value, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfNotEqualTo(BigDecimal value) {
            addCriterion("LXS_RTF <>", value, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfGreaterThan(BigDecimal value) {
            addCriterion("LXS_RTF >", value, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LXS_RTF >=", value, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfLessThan(BigDecimal value) {
            addCriterion("LXS_RTF <", value, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LXS_RTF <=", value, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfIn(List<BigDecimal> values) {
            addCriterion("LXS_RTF in", values, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfNotIn(List<BigDecimal> values) {
            addCriterion("LXS_RTF not in", values, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXS_RTF between", value1, value2, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsRtfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXS_RTF not between", value1, value2, "lxsRtf");
            return (Criteria) this;
        }

        public Criteria andLxsTclIsNull() {
            addCriterion("LXS_TCL is null");
            return (Criteria) this;
        }

        public Criteria andLxsTclIsNotNull() {
            addCriterion("LXS_TCL is not null");
            return (Criteria) this;
        }

        public Criteria andLxsTclEqualTo(BigDecimal value) {
            addCriterion("LXS_TCL =", value, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclNotEqualTo(BigDecimal value) {
            addCriterion("LXS_TCL <>", value, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclGreaterThan(BigDecimal value) {
            addCriterion("LXS_TCL >", value, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LXS_TCL >=", value, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclLessThan(BigDecimal value) {
            addCriterion("LXS_TCL <", value, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LXS_TCL <=", value, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclIn(List<BigDecimal> values) {
            addCriterion("LXS_TCL in", values, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclNotIn(List<BigDecimal> values) {
            addCriterion("LXS_TCL not in", values, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXS_TCL between", value1, value2, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andLxsTclNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXS_TCL not between", value1, value2, "lxsTcl");
            return (Criteria) this;
        }

        public Criteria andScfMoneyIsNull() {
            addCriterion("SCF_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andScfMoneyIsNotNull() {
            addCriterion("SCF_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andScfMoneyEqualTo(BigDecimal value) {
            addCriterion("SCF_MONEY =", value, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyNotEqualTo(BigDecimal value) {
            addCriterion("SCF_MONEY <>", value, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyGreaterThan(BigDecimal value) {
            addCriterion("SCF_MONEY >", value, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCF_MONEY >=", value, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyLessThan(BigDecimal value) {
            addCriterion("SCF_MONEY <", value, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCF_MONEY <=", value, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyIn(List<BigDecimal> values) {
            addCriterion("SCF_MONEY in", values, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyNotIn(List<BigDecimal> values) {
            addCriterion("SCF_MONEY not in", values, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCF_MONEY between", value1, value2, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andScfMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCF_MONEY not between", value1, value2, "scfMoney");
            return (Criteria) this;
        }

        public Criteria andJsyNameIsNull() {
            addCriterion("JSY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJsyNameIsNotNull() {
            addCriterion("JSY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJsyNameEqualTo(String value) {
            addCriterion("JSY_NAME =", value, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameNotEqualTo(String value) {
            addCriterion("JSY_NAME <>", value, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameGreaterThan(String value) {
            addCriterion("JSY_NAME >", value, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameGreaterThanOrEqualTo(String value) {
            addCriterion("JSY_NAME >=", value, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameLessThan(String value) {
            addCriterion("JSY_NAME <", value, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameLessThanOrEqualTo(String value) {
            addCriterion("JSY_NAME <=", value, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameLike(String value) {
            addCriterion("JSY_NAME like", value, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameNotLike(String value) {
            addCriterion("JSY_NAME not like", value, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameIn(List<String> values) {
            addCriterion("JSY_NAME in", values, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameNotIn(List<String> values) {
            addCriterion("JSY_NAME not in", values, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameBetween(String value1, String value2) {
            addCriterion("JSY_NAME between", value1, value2, "jsyName");
            return (Criteria) this;
        }

        public Criteria andJsyNameNotBetween(String value1, String value2) {
            addCriterion("JSY_NAME not between", value1, value2, "jsyName");
            return (Criteria) this;
        }

        public Criteria andBfbIsNull() {
            addCriterion("BFB is null");
            return (Criteria) this;
        }

        public Criteria andBfbIsNotNull() {
            addCriterion("BFB is not null");
            return (Criteria) this;
        }

        public Criteria andBfbEqualTo(BigDecimal value) {
            addCriterion("BFB =", value, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbNotEqualTo(BigDecimal value) {
            addCriterion("BFB <>", value, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbGreaterThan(BigDecimal value) {
            addCriterion("BFB >", value, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BFB >=", value, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbLessThan(BigDecimal value) {
            addCriterion("BFB <", value, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BFB <=", value, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbIn(List<BigDecimal> values) {
            addCriterion("BFB in", values, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbNotIn(List<BigDecimal> values) {
            addCriterion("BFB not in", values, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BFB between", value1, value2, "bfb");
            return (Criteria) this;
        }

        public Criteria andBfbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BFB not between", value1, value2, "bfb");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("JG is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("JG is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(String value) {
            addCriterion("JG =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(String value) {
            addCriterion("JG <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(String value) {
            addCriterion("JG >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(String value) {
            addCriterion("JG >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(String value) {
            addCriterion("JG <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(String value) {
            addCriterion("JG <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLike(String value) {
            addCriterion("JG like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotLike(String value) {
            addCriterion("JG not like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<String> values) {
            addCriterion("JG in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<String> values) {
            addCriterion("JG not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(String value1, String value2) {
            addCriterion("JG between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(String value1, String value2) {
            addCriterion("JG not between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andCphIsNull() {
            addCriterion("CPH is null");
            return (Criteria) this;
        }

        public Criteria andCphIsNotNull() {
            addCriterion("CPH is not null");
            return (Criteria) this;
        }

        public Criteria andCphEqualTo(String value) {
            addCriterion("CPH =", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphNotEqualTo(String value) {
            addCriterion("CPH <>", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphGreaterThan(String value) {
            addCriterion("CPH >", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphGreaterThanOrEqualTo(String value) {
            addCriterion("CPH >=", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphLessThan(String value) {
            addCriterion("CPH <", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphLessThanOrEqualTo(String value) {
            addCriterion("CPH <=", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphLike(String value) {
            addCriterion("CPH like", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphNotLike(String value) {
            addCriterion("CPH not like", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphIn(List<String> values) {
            addCriterion("CPH in", values, "cph");
            return (Criteria) this;
        }

        public Criteria andCphNotIn(List<String> values) {
            addCriterion("CPH not in", values, "cph");
            return (Criteria) this;
        }

        public Criteria andCphBetween(String value1, String value2) {
            addCriterion("CPH between", value1, value2, "cph");
            return (Criteria) this;
        }

        public Criteria andCphNotBetween(String value1, String value2) {
            addCriterion("CPH not between", value1, value2, "cph");
            return (Criteria) this;
        }

        public Criteria andLxsNameIsNull() {
            addCriterion("LXS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLxsNameIsNotNull() {
            addCriterion("LXS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLxsNameEqualTo(String value) {
            addCriterion("LXS_NAME =", value, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameNotEqualTo(String value) {
            addCriterion("LXS_NAME <>", value, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameGreaterThan(String value) {
            addCriterion("LXS_NAME >", value, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameGreaterThanOrEqualTo(String value) {
            addCriterion("LXS_NAME >=", value, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameLessThan(String value) {
            addCriterion("LXS_NAME <", value, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameLessThanOrEqualTo(String value) {
            addCriterion("LXS_NAME <=", value, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameLike(String value) {
            addCriterion("LXS_NAME like", value, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameNotLike(String value) {
            addCriterion("LXS_NAME not like", value, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameIn(List<String> values) {
            addCriterion("LXS_NAME in", values, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameNotIn(List<String> values) {
            addCriterion("LXS_NAME not in", values, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameBetween(String value1, String value2) {
            addCriterion("LXS_NAME between", value1, value2, "lxsName");
            return (Criteria) this;
        }

        public Criteria andLxsNameNotBetween(String value1, String value2) {
            addCriterion("LXS_NAME not between", value1, value2, "lxsName");
            return (Criteria) this;
        }

        public Criteria andJjsjIsNull() {
            addCriterion("JJSJ is null");
            return (Criteria) this;
        }

        public Criteria andJjsjIsNotNull() {
            addCriterion("JJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJjsjEqualTo(Date value) {
            addCriterion("JJSJ =", value, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjNotEqualTo(Date value) {
            addCriterion("JJSJ <>", value, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjGreaterThan(Date value) {
            addCriterion("JJSJ >", value, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("JJSJ >=", value, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjLessThan(Date value) {
            addCriterion("JJSJ <", value, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjLessThanOrEqualTo(Date value) {
            addCriterion("JJSJ <=", value, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjIn(List<Date> values) {
            addCriterion("JJSJ in", values, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjNotIn(List<Date> values) {
            addCriterion("JJSJ not in", values, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjBetween(Date value1, Date value2) {
            addCriterion("JJSJ between", value1, value2, "jjsj");
            return (Criteria) this;
        }

        public Criteria andJjsjNotBetween(Date value1, Date value2) {
            addCriterion("JJSJ not between", value1, value2, "jjsj");
            return (Criteria) this;
        }

        public Criteria andGwzkIsNull() {
            addCriterion("GWZK is null");
            return (Criteria) this;
        }

        public Criteria andGwzkIsNotNull() {
            addCriterion("GWZK is not null");
            return (Criteria) this;
        }

        public Criteria andGwzkEqualTo(BigDecimal value) {
            addCriterion("GWZK =", value, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkNotEqualTo(BigDecimal value) {
            addCriterion("GWZK <>", value, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkGreaterThan(BigDecimal value) {
            addCriterion("GWZK >", value, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GWZK >=", value, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkLessThan(BigDecimal value) {
            addCriterion("GWZK <", value, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GWZK <=", value, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkIn(List<BigDecimal> values) {
            addCriterion("GWZK in", values, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkNotIn(List<BigDecimal> values) {
            addCriterion("GWZK not in", values, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GWZK between", value1, value2, "gwzk");
            return (Criteria) this;
        }

        public Criteria andGwzkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GWZK not between", value1, value2, "gwzk");
            return (Criteria) this;
        }

        public Criteria andYyyIsNull() {
            addCriterion("YYY is null");
            return (Criteria) this;
        }

        public Criteria andYyyIsNotNull() {
            addCriterion("YYY is not null");
            return (Criteria) this;
        }

        public Criteria andYyyEqualTo(String value) {
            addCriterion("YYY =", value, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyNotEqualTo(String value) {
            addCriterion("YYY <>", value, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyGreaterThan(String value) {
            addCriterion("YYY >", value, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyGreaterThanOrEqualTo(String value) {
            addCriterion("YYY >=", value, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyLessThan(String value) {
            addCriterion("YYY <", value, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyLessThanOrEqualTo(String value) {
            addCriterion("YYY <=", value, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyLike(String value) {
            addCriterion("YYY like", value, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyNotLike(String value) {
            addCriterion("YYY not like", value, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyIn(List<String> values) {
            addCriterion("YYY in", values, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyNotIn(List<String> values) {
            addCriterion("YYY not in", values, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyBetween(String value1, String value2) {
            addCriterion("YYY between", value1, value2, "yyy");
            return (Criteria) this;
        }

        public Criteria andYyyNotBetween(String value1, String value2) {
            addCriterion("YYY not between", value1, value2, "yyy");
            return (Criteria) this;
        }

        public Criteria andQclxIsNull() {
            addCriterion("QCLX is null");
            return (Criteria) this;
        }

        public Criteria andQclxIsNotNull() {
            addCriterion("QCLX is not null");
            return (Criteria) this;
        }

        public Criteria andQclxEqualTo(String value) {
            addCriterion("QCLX =", value, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxNotEqualTo(String value) {
            addCriterion("QCLX <>", value, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxGreaterThan(String value) {
            addCriterion("QCLX >", value, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxGreaterThanOrEqualTo(String value) {
            addCriterion("QCLX >=", value, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxLessThan(String value) {
            addCriterion("QCLX <", value, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxLessThanOrEqualTo(String value) {
            addCriterion("QCLX <=", value, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxLike(String value) {
            addCriterion("QCLX like", value, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxNotLike(String value) {
            addCriterion("QCLX not like", value, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxIn(List<String> values) {
            addCriterion("QCLX in", values, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxNotIn(List<String> values) {
            addCriterion("QCLX not in", values, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxBetween(String value1, String value2) {
            addCriterion("QCLX between", value1, value2, "qclx");
            return (Criteria) this;
        }

        public Criteria andQclxNotBetween(String value1, String value2) {
            addCriterion("QCLX not between", value1, value2, "qclx");
            return (Criteria) this;
        }

        public Criteria andKrlyIsNull() {
            addCriterion("KRLY is null");
            return (Criteria) this;
        }

        public Criteria andKrlyIsNotNull() {
            addCriterion("KRLY is not null");
            return (Criteria) this;
        }

        public Criteria andKrlyEqualTo(String value) {
            addCriterion("KRLY =", value, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyNotEqualTo(String value) {
            addCriterion("KRLY <>", value, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyGreaterThan(String value) {
            addCriterion("KRLY >", value, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyGreaterThanOrEqualTo(String value) {
            addCriterion("KRLY >=", value, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyLessThan(String value) {
            addCriterion("KRLY <", value, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyLessThanOrEqualTo(String value) {
            addCriterion("KRLY <=", value, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyLike(String value) {
            addCriterion("KRLY like", value, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyNotLike(String value) {
            addCriterion("KRLY not like", value, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyIn(List<String> values) {
            addCriterion("KRLY in", values, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyNotIn(List<String> values) {
            addCriterion("KRLY not in", values, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyBetween(String value1, String value2) {
            addCriterion("KRLY between", value1, value2, "krly");
            return (Criteria) this;
        }

        public Criteria andKrlyNotBetween(String value1, String value2) {
            addCriterion("KRLY not between", value1, value2, "krly");
            return (Criteria) this;
        }

        public Criteria andHyhIsNull() {
            addCriterion("HYH is null");
            return (Criteria) this;
        }

        public Criteria andHyhIsNotNull() {
            addCriterion("HYH is not null");
            return (Criteria) this;
        }

        public Criteria andHyhEqualTo(Integer value) {
            addCriterion("HYH =", value, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhNotEqualTo(Integer value) {
            addCriterion("HYH <>", value, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhGreaterThan(Integer value) {
            addCriterion("HYH >", value, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhGreaterThanOrEqualTo(Integer value) {
            addCriterion("HYH >=", value, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhLessThan(Integer value) {
            addCriterion("HYH <", value, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhLessThanOrEqualTo(Integer value) {
            addCriterion("HYH <=", value, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhIn(List<Integer> values) {
            addCriterion("HYH in", values, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhNotIn(List<Integer> values) {
            addCriterion("HYH not in", values, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhBetween(Integer value1, Integer value2) {
            addCriterion("HYH between", value1, value2, "hyh");
            return (Criteria) this;
        }

        public Criteria andHyhNotBetween(Integer value1, Integer value2) {
            addCriterion("HYH not between", value1, value2, "hyh");
            return (Criteria) this;
        }

        public Criteria andLxsNoIsNull() {
            addCriterion("LXS_NO is null");
            return (Criteria) this;
        }

        public Criteria andLxsNoIsNotNull() {
            addCriterion("LXS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLxsNoEqualTo(String value) {
            addCriterion("LXS_NO =", value, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoNotEqualTo(String value) {
            addCriterion("LXS_NO <>", value, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoGreaterThan(String value) {
            addCriterion("LXS_NO >", value, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoGreaterThanOrEqualTo(String value) {
            addCriterion("LXS_NO >=", value, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoLessThan(String value) {
            addCriterion("LXS_NO <", value, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoLessThanOrEqualTo(String value) {
            addCriterion("LXS_NO <=", value, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoLike(String value) {
            addCriterion("LXS_NO like", value, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoNotLike(String value) {
            addCriterion("LXS_NO not like", value, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoIn(List<String> values) {
            addCriterion("LXS_NO in", values, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoNotIn(List<String> values) {
            addCriterion("LXS_NO not in", values, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoBetween(String value1, String value2) {
            addCriterion("LXS_NO between", value1, value2, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andLxsNoNotBetween(String value1, String value2) {
            addCriterion("LXS_NO not between", value1, value2, "lxsNo");
            return (Criteria) this;
        }

        public Criteria andXsjeIsNull() {
            addCriterion("XSJE is null");
            return (Criteria) this;
        }

        public Criteria andXsjeIsNotNull() {
            addCriterion("XSJE is not null");
            return (Criteria) this;
        }

        public Criteria andXsjeEqualTo(BigDecimal value) {
            addCriterion("XSJE =", value, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeNotEqualTo(BigDecimal value) {
            addCriterion("XSJE <>", value, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeGreaterThan(BigDecimal value) {
            addCriterion("XSJE >", value, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XSJE >=", value, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeLessThan(BigDecimal value) {
            addCriterion("XSJE <", value, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XSJE <=", value, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeIn(List<BigDecimal> values) {
            addCriterion("XSJE in", values, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeNotIn(List<BigDecimal> values) {
            addCriterion("XSJE not in", values, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XSJE between", value1, value2, "xsje");
            return (Criteria) this;
        }

        public Criteria andXsjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XSJE not between", value1, value2, "xsje");
            return (Criteria) this;
        }

        public Criteria andRthjIsNull() {
            addCriterion("RTHJ is null");
            return (Criteria) this;
        }

        public Criteria andRthjIsNotNull() {
            addCriterion("RTHJ is not null");
            return (Criteria) this;
        }

        public Criteria andRthjEqualTo(BigDecimal value) {
            addCriterion("RTHJ =", value, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjNotEqualTo(BigDecimal value) {
            addCriterion("RTHJ <>", value, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjGreaterThan(BigDecimal value) {
            addCriterion("RTHJ >", value, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTHJ >=", value, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjLessThan(BigDecimal value) {
            addCriterion("RTHJ <", value, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTHJ <=", value, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjIn(List<BigDecimal> values) {
            addCriterion("RTHJ in", values, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjNotIn(List<BigDecimal> values) {
            addCriterion("RTHJ not in", values, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTHJ between", value1, value2, "rthj");
            return (Criteria) this;
        }

        public Criteria andRthjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTHJ not between", value1, value2, "rthj");
            return (Criteria) this;
        }

        public Criteria andSgfIsNull() {
            addCriterion("SGF is null");
            return (Criteria) this;
        }

        public Criteria andSgfIsNotNull() {
            addCriterion("SGF is not null");
            return (Criteria) this;
        }

        public Criteria andSgfEqualTo(BigDecimal value) {
            addCriterion("SGF =", value, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfNotEqualTo(BigDecimal value) {
            addCriterion("SGF <>", value, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfGreaterThan(BigDecimal value) {
            addCriterion("SGF >", value, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SGF >=", value, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfLessThan(BigDecimal value) {
            addCriterion("SGF <", value, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SGF <=", value, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfIn(List<BigDecimal> values) {
            addCriterion("SGF in", values, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfNotIn(List<BigDecimal> values) {
            addCriterion("SGF not in", values, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SGF between", value1, value2, "sgf");
            return (Criteria) this;
        }

        public Criteria andSgfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SGF not between", value1, value2, "sgf");
            return (Criteria) this;
        }

        public Criteria andHjIsNull() {
            addCriterion("HJ is null");
            return (Criteria) this;
        }

        public Criteria andHjIsNotNull() {
            addCriterion("HJ is not null");
            return (Criteria) this;
        }

        public Criteria andHjEqualTo(BigDecimal value) {
            addCriterion("HJ =", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotEqualTo(BigDecimal value) {
            addCriterion("HJ <>", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjGreaterThan(BigDecimal value) {
            addCriterion("HJ >", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HJ >=", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjLessThan(BigDecimal value) {
            addCriterion("HJ <", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HJ <=", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjIn(List<BigDecimal> values) {
            addCriterion("HJ in", values, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotIn(List<BigDecimal> values) {
            addCriterion("HJ not in", values, "hj");
            return (Criteria) this;
        }

        public Criteria andHjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HJ between", value1, value2, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HJ not between", value1, value2, "hj");
            return (Criteria) this;
        }

        public Criteria andJsIsNull() {
            addCriterion("JS is null");
            return (Criteria) this;
        }

        public Criteria andJsIsNotNull() {
            addCriterion("JS is not null");
            return (Criteria) this;
        }

        public Criteria andJsEqualTo(String value) {
            addCriterion("JS =", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotEqualTo(String value) {
            addCriterion("JS <>", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThan(String value) {
            addCriterion("JS >", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThanOrEqualTo(String value) {
            addCriterion("JS >=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThan(String value) {
            addCriterion("JS <", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThanOrEqualTo(String value) {
            addCriterion("JS <=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLike(String value) {
            addCriterion("JS like", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotLike(String value) {
            addCriterion("JS not like", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsIn(List<String> values) {
            addCriterion("JS in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotIn(List<String> values) {
            addCriterion("JS not in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsBetween(String value1, String value2) {
            addCriterion("JS between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotBetween(String value1, String value2) {
            addCriterion("JS not between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andUsrIsNull() {
            addCriterion("USR is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsNotNull() {
            addCriterion("USR is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEqualTo(String value) {
            addCriterion("USR =", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotEqualTo(String value) {
            addCriterion("USR <>", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThan(String value) {
            addCriterion("USR >", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThanOrEqualTo(String value) {
            addCriterion("USR >=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThan(String value) {
            addCriterion("USR <", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThanOrEqualTo(String value) {
            addCriterion("USR <=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLike(String value) {
            addCriterion("USR like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotLike(String value) {
            addCriterion("USR not like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrIn(List<String> values) {
            addCriterion("USR in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotIn(List<String> values) {
            addCriterion("USR not in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrBetween(String value1, String value2) {
            addCriterion("USR between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotBetween(String value1, String value2) {
            addCriterion("USR not between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andDepIsNull() {
            addCriterion("DEP is null");
            return (Criteria) this;
        }

        public Criteria andDepIsNotNull() {
            addCriterion("DEP is not null");
            return (Criteria) this;
        }

        public Criteria andDepEqualTo(String value) {
            addCriterion("DEP =", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotEqualTo(String value) {
            addCriterion("DEP <>", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThan(String value) {
            addCriterion("DEP >", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThanOrEqualTo(String value) {
            addCriterion("DEP >=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThan(String value) {
            addCriterion("DEP <", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThanOrEqualTo(String value) {
            addCriterion("DEP <=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLike(String value) {
            addCriterion("DEP like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotLike(String value) {
            addCriterion("DEP not like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepIn(List<String> values) {
            addCriterion("DEP in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotIn(List<String> values) {
            addCriterion("DEP not in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepBetween(String value1, String value2) {
            addCriterion("DEP between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotBetween(String value1, String value2) {
            addCriterion("DEP not between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNull() {
            addCriterion("BIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNotNull() {
            addCriterion("BIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBilTypeEqualTo(String value) {
            addCriterion("BIL_TYPE =", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotEqualTo(String value) {
            addCriterion("BIL_TYPE <>", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThan(String value) {
            addCriterion("BIL_TYPE >", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE >=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThan(String value) {
            addCriterion("BIL_TYPE <", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE <=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLike(String value) {
            addCriterion("BIL_TYPE like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotLike(String value) {
            addCriterion("BIL_TYPE not like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeIn(List<String> values) {
            addCriterion("BIL_TYPE in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotIn(List<String> values) {
            addCriterion("BIL_TYPE not in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeBetween(String value1, String value2) {
            addCriterion("BIL_TYPE between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotBetween(String value1, String value2) {
            addCriterion("BIL_TYPE not between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNull() {
            addCriterion("SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNotNull() {
            addCriterion("SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateEqualTo(Date value) {
            addCriterion("SYS_DATE =", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotEqualTo(Date value) {
            addCriterion("SYS_DATE <>", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThan(Date value) {
            addCriterion("SYS_DATE >", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE >=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThan(Date value) {
            addCriterion("SYS_DATE <", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE <=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIn(List<Date> values) {
            addCriterion("SYS_DATE in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotIn(List<Date> values) {
            addCriterion("SYS_DATE not in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE not between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andChkManIsNull() {
            addCriterion("CHK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andChkManIsNotNull() {
            addCriterion("CHK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andChkManEqualTo(String value) {
            addCriterion("CHK_MAN =", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotEqualTo(String value) {
            addCriterion("CHK_MAN <>", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThan(String value) {
            addCriterion("CHK_MAN >", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MAN >=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThan(String value) {
            addCriterion("CHK_MAN <", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThanOrEqualTo(String value) {
            addCriterion("CHK_MAN <=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLike(String value) {
            addCriterion("CHK_MAN like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotLike(String value) {
            addCriterion("CHK_MAN not like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManIn(List<String> values) {
            addCriterion("CHK_MAN in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotIn(List<String> values) {
            addCriterion("CHK_MAN not in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManBetween(String value1, String value2) {
            addCriterion("CHK_MAN between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotBetween(String value1, String value2) {
            addCriterion("CHK_MAN not between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNull() {
            addCriterion("CLS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNotNull() {
            addCriterion("CLS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClsDateEqualTo(Date value) {
            addCriterion("CLS_DATE =", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotEqualTo(Date value) {
            addCriterion("CLS_DATE <>", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThan(Date value) {
            addCriterion("CLS_DATE >", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE >=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThan(Date value) {
            addCriterion("CLS_DATE <", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE <=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateIn(List<Date> values) {
            addCriterion("CLS_DATE in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotIn(List<Date> values) {
            addCriterion("CLS_DATE not in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE not between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNull() {
            addCriterion("MOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNotNull() {
            addCriterion("MOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMobIdEqualTo(String value) {
            addCriterion("MOB_ID =", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotEqualTo(String value) {
            addCriterion("MOB_ID <>", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThan(String value) {
            addCriterion("MOB_ID >", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThanOrEqualTo(String value) {
            addCriterion("MOB_ID >=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThan(String value) {
            addCriterion("MOB_ID <", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThanOrEqualTo(String value) {
            addCriterion("MOB_ID <=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLike(String value) {
            addCriterion("MOB_ID like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotLike(String value) {
            addCriterion("MOB_ID not like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdIn(List<String> values) {
            addCriterion("MOB_ID in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotIn(List<String> values) {
            addCriterion("MOB_ID not in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdBetween(String value1, String value2) {
            addCriterion("MOB_ID between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotBetween(String value1, String value2) {
            addCriterion("MOB_ID not between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNull() {
            addCriterion("MODIFY_DD is null");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNotNull() {
            addCriterion("MODIFY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDdEqualTo(Date value) {
            addCriterion("MODIFY_DD =", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotEqualTo(Date value) {
            addCriterion("MODIFY_DD <>", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThan(Date value) {
            addCriterion("MODIFY_DD >", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD >=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThan(Date value) {
            addCriterion("MODIFY_DD <", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD <=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdIn(List<Date> values) {
            addCriterion("MODIFY_DD in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotIn(List<Date> values) {
            addCriterion("MODIFY_DD not in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD not between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNull() {
            addCriterion("MODIFY_MAN is null");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNotNull() {
            addCriterion("MODIFY_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andModifyManEqualTo(String value) {
            addCriterion("MODIFY_MAN =", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotEqualTo(String value) {
            addCriterion("MODIFY_MAN <>", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThan(String value) {
            addCriterion("MODIFY_MAN >", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN >=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThan(String value) {
            addCriterion("MODIFY_MAN <", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN <=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLike(String value) {
            addCriterion("MODIFY_MAN like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotLike(String value) {
            addCriterion("MODIFY_MAN not like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManIn(List<String> values) {
            addCriterion("MODIFY_MAN in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotIn(List<String> values) {
            addCriterion("MODIFY_MAN not in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN not between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andThIsNull() {
            addCriterion("TH is null");
            return (Criteria) this;
        }

        public Criteria andThIsNotNull() {
            addCriterion("TH is not null");
            return (Criteria) this;
        }

        public Criteria andThEqualTo(String value) {
            addCriterion("TH =", value, "th");
            return (Criteria) this;
        }

        public Criteria andThNotEqualTo(String value) {
            addCriterion("TH <>", value, "th");
            return (Criteria) this;
        }

        public Criteria andThGreaterThan(String value) {
            addCriterion("TH >", value, "th");
            return (Criteria) this;
        }

        public Criteria andThGreaterThanOrEqualTo(String value) {
            addCriterion("TH >=", value, "th");
            return (Criteria) this;
        }

        public Criteria andThLessThan(String value) {
            addCriterion("TH <", value, "th");
            return (Criteria) this;
        }

        public Criteria andThLessThanOrEqualTo(String value) {
            addCriterion("TH <=", value, "th");
            return (Criteria) this;
        }

        public Criteria andThLike(String value) {
            addCriterion("TH like", value, "th");
            return (Criteria) this;
        }

        public Criteria andThNotLike(String value) {
            addCriterion("TH not like", value, "th");
            return (Criteria) this;
        }

        public Criteria andThIn(List<String> values) {
            addCriterion("TH in", values, "th");
            return (Criteria) this;
        }

        public Criteria andThNotIn(List<String> values) {
            addCriterion("TH not in", values, "th");
            return (Criteria) this;
        }

        public Criteria andThBetween(String value1, String value2) {
            addCriterion("TH between", value1, value2, "th");
            return (Criteria) this;
        }

        public Criteria andThNotBetween(String value1, String value2) {
            addCriterion("TH not between", value1, value2, "th");
            return (Criteria) this;
        }

        public Criteria andDytclIsNull() {
            addCriterion("DYTCL is null");
            return (Criteria) this;
        }

        public Criteria andDytclIsNotNull() {
            addCriterion("DYTCL is not null");
            return (Criteria) this;
        }

        public Criteria andDytclEqualTo(String value) {
            addCriterion("DYTCL =", value, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclNotEqualTo(String value) {
            addCriterion("DYTCL <>", value, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclGreaterThan(String value) {
            addCriterion("DYTCL >", value, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclGreaterThanOrEqualTo(String value) {
            addCriterion("DYTCL >=", value, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclLessThan(String value) {
            addCriterion("DYTCL <", value, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclLessThanOrEqualTo(String value) {
            addCriterion("DYTCL <=", value, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclLike(String value) {
            addCriterion("DYTCL like", value, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclNotLike(String value) {
            addCriterion("DYTCL not like", value, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclIn(List<String> values) {
            addCriterion("DYTCL in", values, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclNotIn(List<String> values) {
            addCriterion("DYTCL not in", values, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclBetween(String value1, String value2) {
            addCriterion("DYTCL between", value1, value2, "dytcl");
            return (Criteria) this;
        }

        public Criteria andDytclNotBetween(String value1, String value2) {
            addCriterion("DYTCL not between", value1, value2, "dytcl");
            return (Criteria) this;
        }

        public Criteria andLxsjeIsNull() {
            addCriterion("LXSJE is null");
            return (Criteria) this;
        }

        public Criteria andLxsjeIsNotNull() {
            addCriterion("LXSJE is not null");
            return (Criteria) this;
        }

        public Criteria andLxsjeEqualTo(BigDecimal value) {
            addCriterion("LXSJE =", value, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeNotEqualTo(BigDecimal value) {
            addCriterion("LXSJE <>", value, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeGreaterThan(BigDecimal value) {
            addCriterion("LXSJE >", value, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LXSJE >=", value, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeLessThan(BigDecimal value) {
            addCriterion("LXSJE <", value, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LXSJE <=", value, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeIn(List<BigDecimal> values) {
            addCriterion("LXSJE in", values, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeNotIn(List<BigDecimal> values) {
            addCriterion("LXSJE not in", values, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXSJE between", value1, value2, "lxsje");
            return (Criteria) this;
        }

        public Criteria andLxsjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXSJE not between", value1, value2, "lxsje");
            return (Criteria) this;
        }

        public Criteria andDyjeIsNull() {
            addCriterion("DYJE is null");
            return (Criteria) this;
        }

        public Criteria andDyjeIsNotNull() {
            addCriterion("DYJE is not null");
            return (Criteria) this;
        }

        public Criteria andDyjeEqualTo(BigDecimal value) {
            addCriterion("DYJE =", value, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeNotEqualTo(BigDecimal value) {
            addCriterion("DYJE <>", value, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeGreaterThan(BigDecimal value) {
            addCriterion("DYJE >", value, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DYJE >=", value, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeLessThan(BigDecimal value) {
            addCriterion("DYJE <", value, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DYJE <=", value, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeIn(List<BigDecimal> values) {
            addCriterion("DYJE in", values, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeNotIn(List<BigDecimal> values) {
            addCriterion("DYJE not in", values, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DYJE between", value1, value2, "dyje");
            return (Criteria) this;
        }

        public Criteria andDyjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DYJE not between", value1, value2, "dyje");
            return (Criteria) this;
        }

        public Criteria andTcjeIsNull() {
            addCriterion("TCJE is null");
            return (Criteria) this;
        }

        public Criteria andTcjeIsNotNull() {
            addCriterion("TCJE is not null");
            return (Criteria) this;
        }

        public Criteria andTcjeEqualTo(BigDecimal value) {
            addCriterion("TCJE =", value, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeNotEqualTo(BigDecimal value) {
            addCriterion("TCJE <>", value, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeGreaterThan(BigDecimal value) {
            addCriterion("TCJE >", value, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TCJE >=", value, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeLessThan(BigDecimal value) {
            addCriterion("TCJE <", value, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TCJE <=", value, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeIn(List<BigDecimal> values) {
            addCriterion("TCJE in", values, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeNotIn(List<BigDecimal> values) {
            addCriterion("TCJE not in", values, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TCJE between", value1, value2, "tcje");
            return (Criteria) this;
        }

        public Criteria andTcjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TCJE not between", value1, value2, "tcje");
            return (Criteria) this;
        }

        public Criteria andJsytclIsNull() {
            addCriterion("JSYTCL is null");
            return (Criteria) this;
        }

        public Criteria andJsytclIsNotNull() {
            addCriterion("JSYTCL is not null");
            return (Criteria) this;
        }

        public Criteria andJsytclEqualTo(BigDecimal value) {
            addCriterion("JSYTCL =", value, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclNotEqualTo(BigDecimal value) {
            addCriterion("JSYTCL <>", value, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclGreaterThan(BigDecimal value) {
            addCriterion("JSYTCL >", value, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JSYTCL >=", value, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclLessThan(BigDecimal value) {
            addCriterion("JSYTCL <", value, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JSYTCL <=", value, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclIn(List<BigDecimal> values) {
            addCriterion("JSYTCL in", values, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclNotIn(List<BigDecimal> values) {
            addCriterion("JSYTCL not in", values, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JSYTCL between", value1, value2, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andJsytclNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JSYTCL not between", value1, value2, "jsytcl");
            return (Criteria) this;
        }

        public Criteria andLcIsNull() {
            addCriterion("LC is null");
            return (Criteria) this;
        }

        public Criteria andLcIsNotNull() {
            addCriterion("LC is not null");
            return (Criteria) this;
        }

        public Criteria andLcEqualTo(BigDecimal value) {
            addCriterion("LC =", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotEqualTo(BigDecimal value) {
            addCriterion("LC <>", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcGreaterThan(BigDecimal value) {
            addCriterion("LC >", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LC >=", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcLessThan(BigDecimal value) {
            addCriterion("LC <", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LC <=", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcIn(List<BigDecimal> values) {
            addCriterion("LC in", values, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotIn(List<BigDecimal> values) {
            addCriterion("LC not in", values, "lc");
            return (Criteria) this;
        }

        public Criteria andLcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LC between", value1, value2, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LC not between", value1, value2, "lc");
            return (Criteria) this;
        }

        public Criteria andXjIsNull() {
            addCriterion("XJ is null");
            return (Criteria) this;
        }

        public Criteria andXjIsNotNull() {
            addCriterion("XJ is not null");
            return (Criteria) this;
        }

        public Criteria andXjEqualTo(BigDecimal value) {
            addCriterion("XJ =", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjNotEqualTo(BigDecimal value) {
            addCriterion("XJ <>", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjGreaterThan(BigDecimal value) {
            addCriterion("XJ >", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XJ >=", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjLessThan(BigDecimal value) {
            addCriterion("XJ <", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XJ <=", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjIn(List<BigDecimal> values) {
            addCriterion("XJ in", values, "xj");
            return (Criteria) this;
        }

        public Criteria andXjNotIn(List<BigDecimal> values) {
            addCriterion("XJ not in", values, "xj");
            return (Criteria) this;
        }

        public Criteria andXjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XJ between", value1, value2, "xj");
            return (Criteria) this;
        }

        public Criteria andXjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XJ not between", value1, value2, "xj");
            return (Criteria) this;
        }

        public Criteria andRjlIsNull() {
            addCriterion("RJL is null");
            return (Criteria) this;
        }

        public Criteria andRjlIsNotNull() {
            addCriterion("RJL is not null");
            return (Criteria) this;
        }

        public Criteria andRjlEqualTo(BigDecimal value) {
            addCriterion("RJL =", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlNotEqualTo(BigDecimal value) {
            addCriterion("RJL <>", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlGreaterThan(BigDecimal value) {
            addCriterion("RJL >", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RJL >=", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlLessThan(BigDecimal value) {
            addCriterion("RJL <", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RJL <=", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlIn(List<BigDecimal> values) {
            addCriterion("RJL in", values, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlNotIn(List<BigDecimal> values) {
            addCriterion("RJL not in", values, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RJL between", value1, value2, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RJL not between", value1, value2, "rjl");
            return (Criteria) this;
        }

        public Criteria andXspIsNull() {
            addCriterion("XSP is null");
            return (Criteria) this;
        }

        public Criteria andXspIsNotNull() {
            addCriterion("XSP is not null");
            return (Criteria) this;
        }

        public Criteria andXspEqualTo(BigDecimal value) {
            addCriterion("XSP =", value, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspNotEqualTo(BigDecimal value) {
            addCriterion("XSP <>", value, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspGreaterThan(BigDecimal value) {
            addCriterion("XSP >", value, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XSP >=", value, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspLessThan(BigDecimal value) {
            addCriterion("XSP <", value, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XSP <=", value, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspIn(List<BigDecimal> values) {
            addCriterion("XSP in", values, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspNotIn(List<BigDecimal> values) {
            addCriterion("XSP not in", values, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XSP between", value1, value2, "xsp");
            return (Criteria) this;
        }

        public Criteria andXspNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XSP not between", value1, value2, "xsp");
            return (Criteria) this;
        }

        public Criteria andTtcIsNull() {
            addCriterion("TTC is null");
            return (Criteria) this;
        }

        public Criteria andTtcIsNotNull() {
            addCriterion("TTC is not null");
            return (Criteria) this;
        }

        public Criteria andTtcEqualTo(BigDecimal value) {
            addCriterion("TTC =", value, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcNotEqualTo(BigDecimal value) {
            addCriterion("TTC <>", value, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcGreaterThan(BigDecimal value) {
            addCriterion("TTC >", value, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TTC >=", value, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcLessThan(BigDecimal value) {
            addCriterion("TTC <", value, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TTC <=", value, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcIn(List<BigDecimal> values) {
            addCriterion("TTC in", values, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcNotIn(List<BigDecimal> values) {
            addCriterion("TTC not in", values, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TTC between", value1, value2, "ttc");
            return (Criteria) this;
        }

        public Criteria andTtcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TTC not between", value1, value2, "ttc");
            return (Criteria) this;
        }

        public Criteria andCyIsNull() {
            addCriterion("CY is null");
            return (Criteria) this;
        }

        public Criteria andCyIsNotNull() {
            addCriterion("CY is not null");
            return (Criteria) this;
        }

        public Criteria andCyEqualTo(BigDecimal value) {
            addCriterion("CY =", value, "cy");
            return (Criteria) this;
        }

        public Criteria andCyNotEqualTo(BigDecimal value) {
            addCriterion("CY <>", value, "cy");
            return (Criteria) this;
        }

        public Criteria andCyGreaterThan(BigDecimal value) {
            addCriterion("CY >", value, "cy");
            return (Criteria) this;
        }

        public Criteria andCyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CY >=", value, "cy");
            return (Criteria) this;
        }

        public Criteria andCyLessThan(BigDecimal value) {
            addCriterion("CY <", value, "cy");
            return (Criteria) this;
        }

        public Criteria andCyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CY <=", value, "cy");
            return (Criteria) this;
        }

        public Criteria andCyIn(List<BigDecimal> values) {
            addCriterion("CY in", values, "cy");
            return (Criteria) this;
        }

        public Criteria andCyNotIn(List<BigDecimal> values) {
            addCriterion("CY not in", values, "cy");
            return (Criteria) this;
        }

        public Criteria andCyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CY between", value1, value2, "cy");
            return (Criteria) this;
        }

        public Criteria andCyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CY not between", value1, value2, "cy");
            return (Criteria) this;
        }

        public Criteria andJfIsNull() {
            addCriterion("JF is null");
            return (Criteria) this;
        }

        public Criteria andJfIsNotNull() {
            addCriterion("JF is not null");
            return (Criteria) this;
        }

        public Criteria andJfEqualTo(BigDecimal value) {
            addCriterion("JF =", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotEqualTo(BigDecimal value) {
            addCriterion("JF <>", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfGreaterThan(BigDecimal value) {
            addCriterion("JF >", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JF >=", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfLessThan(BigDecimal value) {
            addCriterion("JF <", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JF <=", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfIn(List<BigDecimal> values) {
            addCriterion("JF in", values, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotIn(List<BigDecimal> values) {
            addCriterion("JF not in", values, "jf");
            return (Criteria) this;
        }

        public Criteria andJfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JF between", value1, value2, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JF not between", value1, value2, "jf");
            return (Criteria) this;
        }

        public Criteria andLxsztcIsNull() {
            addCriterion("LXSZTC is null");
            return (Criteria) this;
        }

        public Criteria andLxsztcIsNotNull() {
            addCriterion("LXSZTC is not null");
            return (Criteria) this;
        }

        public Criteria andLxsztcEqualTo(BigDecimal value) {
            addCriterion("LXSZTC =", value, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcNotEqualTo(BigDecimal value) {
            addCriterion("LXSZTC <>", value, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcGreaterThan(BigDecimal value) {
            addCriterion("LXSZTC >", value, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LXSZTC >=", value, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcLessThan(BigDecimal value) {
            addCriterion("LXSZTC <", value, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LXSZTC <=", value, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcIn(List<BigDecimal> values) {
            addCriterion("LXSZTC in", values, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcNotIn(List<BigDecimal> values) {
            addCriterion("LXSZTC not in", values, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXSZTC between", value1, value2, "lxsztc");
            return (Criteria) this;
        }

        public Criteria andLxsztcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXSZTC not between", value1, value2, "lxsztc");
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