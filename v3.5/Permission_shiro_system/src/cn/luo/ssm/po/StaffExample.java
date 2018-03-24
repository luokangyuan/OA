package cn.luo.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaidIsNull() {
            addCriterion("staId is null");
            return (Criteria) this;
        }

        public Criteria andStaidIsNotNull() {
            addCriterion("staId is not null");
            return (Criteria) this;
        }

        public Criteria andStaidEqualTo(Integer value) {
            addCriterion("staId =", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotEqualTo(Integer value) {
            addCriterion("staId <>", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThan(Integer value) {
            addCriterion("staId >", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staId >=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThan(Integer value) {
            addCriterion("staId <", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThanOrEqualTo(Integer value) {
            addCriterion("staId <=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidIn(List<Integer> values) {
            addCriterion("staId in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotIn(List<Integer> values) {
            addCriterion("staId not in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidBetween(Integer value1, Integer value2) {
            addCriterion("staId between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotBetween(Integer value1, Integer value2) {
            addCriterion("staId not between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("jobId is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("jobId =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("jobId <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("jobId >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobId >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("jobId <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("jobId <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("jobId in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("jobId not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("jobId between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("jobId not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andStanumberIsNull() {
            addCriterion("staNumber is null");
            return (Criteria) this;
        }

        public Criteria andStanumberIsNotNull() {
            addCriterion("staNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStanumberEqualTo(String value) {
            addCriterion("staNumber =", value, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberNotEqualTo(String value) {
            addCriterion("staNumber <>", value, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberGreaterThan(String value) {
            addCriterion("staNumber >", value, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberGreaterThanOrEqualTo(String value) {
            addCriterion("staNumber >=", value, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberLessThan(String value) {
            addCriterion("staNumber <", value, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberLessThanOrEqualTo(String value) {
            addCriterion("staNumber <=", value, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberLike(String value) {
            addCriterion("staNumber like", value, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberNotLike(String value) {
            addCriterion("staNumber not like", value, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberIn(List<String> values) {
            addCriterion("staNumber in", values, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberNotIn(List<String> values) {
            addCriterion("staNumber not in", values, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberBetween(String value1, String value2) {
            addCriterion("staNumber between", value1, value2, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStanumberNotBetween(String value1, String value2) {
            addCriterion("staNumber not between", value1, value2, "stanumber");
            return (Criteria) this;
        }

        public Criteria andStausercodeIsNull() {
            addCriterion("staUserCode is null");
            return (Criteria) this;
        }

        public Criteria andStausercodeIsNotNull() {
            addCriterion("staUserCode is not null");
            return (Criteria) this;
        }

        public Criteria andStausercodeEqualTo(String value) {
            addCriterion("staUserCode =", value, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeNotEqualTo(String value) {
            addCriterion("staUserCode <>", value, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeGreaterThan(String value) {
            addCriterion("staUserCode >", value, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeGreaterThanOrEqualTo(String value) {
            addCriterion("staUserCode >=", value, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeLessThan(String value) {
            addCriterion("staUserCode <", value, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeLessThanOrEqualTo(String value) {
            addCriterion("staUserCode <=", value, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeLike(String value) {
            addCriterion("staUserCode like", value, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeNotLike(String value) {
            addCriterion("staUserCode not like", value, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeIn(List<String> values) {
            addCriterion("staUserCode in", values, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeNotIn(List<String> values) {
            addCriterion("staUserCode not in", values, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeBetween(String value1, String value2) {
            addCriterion("staUserCode between", value1, value2, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStausercodeNotBetween(String value1, String value2) {
            addCriterion("staUserCode not between", value1, value2, "stausercode");
            return (Criteria) this;
        }

        public Criteria andStapasswordIsNull() {
            addCriterion("staPassword is null");
            return (Criteria) this;
        }

        public Criteria andStapasswordIsNotNull() {
            addCriterion("staPassword is not null");
            return (Criteria) this;
        }

        public Criteria andStapasswordEqualTo(String value) {
            addCriterion("staPassword =", value, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordNotEqualTo(String value) {
            addCriterion("staPassword <>", value, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordGreaterThan(String value) {
            addCriterion("staPassword >", value, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordGreaterThanOrEqualTo(String value) {
            addCriterion("staPassword >=", value, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordLessThan(String value) {
            addCriterion("staPassword <", value, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordLessThanOrEqualTo(String value) {
            addCriterion("staPassword <=", value, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordLike(String value) {
            addCriterion("staPassword like", value, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordNotLike(String value) {
            addCriterion("staPassword not like", value, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordIn(List<String> values) {
            addCriterion("staPassword in", values, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordNotIn(List<String> values) {
            addCriterion("staPassword not in", values, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordBetween(String value1, String value2) {
            addCriterion("staPassword between", value1, value2, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStapasswordNotBetween(String value1, String value2) {
            addCriterion("staPassword not between", value1, value2, "stapassword");
            return (Criteria) this;
        }

        public Criteria andStanameIsNull() {
            addCriterion("staName is null");
            return (Criteria) this;
        }

        public Criteria andStanameIsNotNull() {
            addCriterion("staName is not null");
            return (Criteria) this;
        }

        public Criteria andStanameEqualTo(String value) {
            addCriterion("staName =", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotEqualTo(String value) {
            addCriterion("staName <>", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameGreaterThan(String value) {
            addCriterion("staName >", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameGreaterThanOrEqualTo(String value) {
            addCriterion("staName >=", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLessThan(String value) {
            addCriterion("staName <", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLessThanOrEqualTo(String value) {
            addCriterion("staName <=", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLike(String value) {
            addCriterion("staName like", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotLike(String value) {
            addCriterion("staName not like", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameIn(List<String> values) {
            addCriterion("staName in", values, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotIn(List<String> values) {
            addCriterion("staName not in", values, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameBetween(String value1, String value2) {
            addCriterion("staName between", value1, value2, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotBetween(String value1, String value2) {
            addCriterion("staName not between", value1, value2, "staname");
            return (Criteria) this;
        }

        public Criteria andStatelIsNull() {
            addCriterion("staTel is null");
            return (Criteria) this;
        }

        public Criteria andStatelIsNotNull() {
            addCriterion("staTel is not null");
            return (Criteria) this;
        }

        public Criteria andStatelEqualTo(String value) {
            addCriterion("staTel =", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelNotEqualTo(String value) {
            addCriterion("staTel <>", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelGreaterThan(String value) {
            addCriterion("staTel >", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelGreaterThanOrEqualTo(String value) {
            addCriterion("staTel >=", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelLessThan(String value) {
            addCriterion("staTel <", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelLessThanOrEqualTo(String value) {
            addCriterion("staTel <=", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelLike(String value) {
            addCriterion("staTel like", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelNotLike(String value) {
            addCriterion("staTel not like", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelIn(List<String> values) {
            addCriterion("staTel in", values, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelNotIn(List<String> values) {
            addCriterion("staTel not in", values, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelBetween(String value1, String value2) {
            addCriterion("staTel between", value1, value2, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelNotBetween(String value1, String value2) {
            addCriterion("staTel not between", value1, value2, "statel");
            return (Criteria) this;
        }

        public Criteria andStaemailIsNull() {
            addCriterion("staEmail is null");
            return (Criteria) this;
        }

        public Criteria andStaemailIsNotNull() {
            addCriterion("staEmail is not null");
            return (Criteria) this;
        }

        public Criteria andStaemailEqualTo(String value) {
            addCriterion("staEmail =", value, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailNotEqualTo(String value) {
            addCriterion("staEmail <>", value, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailGreaterThan(String value) {
            addCriterion("staEmail >", value, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailGreaterThanOrEqualTo(String value) {
            addCriterion("staEmail >=", value, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailLessThan(String value) {
            addCriterion("staEmail <", value, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailLessThanOrEqualTo(String value) {
            addCriterion("staEmail <=", value, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailLike(String value) {
            addCriterion("staEmail like", value, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailNotLike(String value) {
            addCriterion("staEmail not like", value, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailIn(List<String> values) {
            addCriterion("staEmail in", values, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailNotIn(List<String> values) {
            addCriterion("staEmail not in", values, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailBetween(String value1, String value2) {
            addCriterion("staEmail between", value1, value2, "staemail");
            return (Criteria) this;
        }

        public Criteria andStaemailNotBetween(String value1, String value2) {
            addCriterion("staEmail not between", value1, value2, "staemail");
            return (Criteria) this;
        }

        public Criteria andStapolIsNull() {
            addCriterion("staPol is null");
            return (Criteria) this;
        }

        public Criteria andStapolIsNotNull() {
            addCriterion("staPol is not null");
            return (Criteria) this;
        }

        public Criteria andStapolEqualTo(String value) {
            addCriterion("staPol =", value, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolNotEqualTo(String value) {
            addCriterion("staPol <>", value, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolGreaterThan(String value) {
            addCriterion("staPol >", value, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolGreaterThanOrEqualTo(String value) {
            addCriterion("staPol >=", value, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolLessThan(String value) {
            addCriterion("staPol <", value, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolLessThanOrEqualTo(String value) {
            addCriterion("staPol <=", value, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolLike(String value) {
            addCriterion("staPol like", value, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolNotLike(String value) {
            addCriterion("staPol not like", value, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolIn(List<String> values) {
            addCriterion("staPol in", values, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolNotIn(List<String> values) {
            addCriterion("staPol not in", values, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolBetween(String value1, String value2) {
            addCriterion("staPol between", value1, value2, "stapol");
            return (Criteria) this;
        }

        public Criteria andStapolNotBetween(String value1, String value2) {
            addCriterion("staPol not between", value1, value2, "stapol");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeIsNull() {
            addCriterion("staEntryTime is null");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeIsNotNull() {
            addCriterion("staEntryTime is not null");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeEqualTo(Date value) {
            addCriterionForJDBCDate("staEntryTime =", value, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("staEntryTime <>", value, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("staEntryTime >", value, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staEntryTime >=", value, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeLessThan(Date value) {
            addCriterionForJDBCDate("staEntryTime <", value, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staEntryTime <=", value, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeIn(List<Date> values) {
            addCriterionForJDBCDate("staEntryTime in", values, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("staEntryTime not in", values, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staEntryTime between", value1, value2, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStaentrytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staEntryTime not between", value1, value2, "staentrytime");
            return (Criteria) this;
        }

        public Criteria andStasexIsNull() {
            addCriterion("staSex is null");
            return (Criteria) this;
        }

        public Criteria andStasexIsNotNull() {
            addCriterion("staSex is not null");
            return (Criteria) this;
        }

        public Criteria andStasexEqualTo(String value) {
            addCriterion("staSex =", value, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexNotEqualTo(String value) {
            addCriterion("staSex <>", value, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexGreaterThan(String value) {
            addCriterion("staSex >", value, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexGreaterThanOrEqualTo(String value) {
            addCriterion("staSex >=", value, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexLessThan(String value) {
            addCriterion("staSex <", value, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexLessThanOrEqualTo(String value) {
            addCriterion("staSex <=", value, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexLike(String value) {
            addCriterion("staSex like", value, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexNotLike(String value) {
            addCriterion("staSex not like", value, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexIn(List<String> values) {
            addCriterion("staSex in", values, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexNotIn(List<String> values) {
            addCriterion("staSex not in", values, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexBetween(String value1, String value2) {
            addCriterion("staSex between", value1, value2, "stasex");
            return (Criteria) this;
        }

        public Criteria andStasexNotBetween(String value1, String value2) {
            addCriterion("staSex not between", value1, value2, "stasex");
            return (Criteria) this;
        }

        public Criteria andStaheadimageIsNull() {
            addCriterion("staHeadImage is null");
            return (Criteria) this;
        }

        public Criteria andStaheadimageIsNotNull() {
            addCriterion("staHeadImage is not null");
            return (Criteria) this;
        }

        public Criteria andStaheadimageEqualTo(String value) {
            addCriterion("staHeadImage =", value, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageNotEqualTo(String value) {
            addCriterion("staHeadImage <>", value, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageGreaterThan(String value) {
            addCriterion("staHeadImage >", value, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageGreaterThanOrEqualTo(String value) {
            addCriterion("staHeadImage >=", value, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageLessThan(String value) {
            addCriterion("staHeadImage <", value, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageLessThanOrEqualTo(String value) {
            addCriterion("staHeadImage <=", value, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageLike(String value) {
            addCriterion("staHeadImage like", value, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageNotLike(String value) {
            addCriterion("staHeadImage not like", value, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageIn(List<String> values) {
            addCriterion("staHeadImage in", values, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageNotIn(List<String> values) {
            addCriterion("staHeadImage not in", values, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageBetween(String value1, String value2) {
            addCriterion("staHeadImage between", value1, value2, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStaheadimageNotBetween(String value1, String value2) {
            addCriterion("staHeadImage not between", value1, value2, "staheadimage");
            return (Criteria) this;
        }

        public Criteria andStatypeIsNull() {
            addCriterion("staType is null");
            return (Criteria) this;
        }

        public Criteria andStatypeIsNotNull() {
            addCriterion("staType is not null");
            return (Criteria) this;
        }

        public Criteria andStatypeEqualTo(String value) {
            addCriterion("staType =", value, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeNotEqualTo(String value) {
            addCriterion("staType <>", value, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeGreaterThan(String value) {
            addCriterion("staType >", value, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeGreaterThanOrEqualTo(String value) {
            addCriterion("staType >=", value, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeLessThan(String value) {
            addCriterion("staType <", value, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeLessThanOrEqualTo(String value) {
            addCriterion("staType <=", value, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeLike(String value) {
            addCriterion("staType like", value, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeNotLike(String value) {
            addCriterion("staType not like", value, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeIn(List<String> values) {
            addCriterion("staType in", values, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeNotIn(List<String> values) {
            addCriterion("staType not in", values, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeBetween(String value1, String value2) {
            addCriterion("staType between", value1, value2, "statype");
            return (Criteria) this;
        }

        public Criteria andStatypeNotBetween(String value1, String value2) {
            addCriterion("staType not between", value1, value2, "statype");
            return (Criteria) this;
        }

        public Criteria andStaaddressIsNull() {
            addCriterion("staAddress is null");
            return (Criteria) this;
        }

        public Criteria andStaaddressIsNotNull() {
            addCriterion("staAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaaddressEqualTo(String value) {
            addCriterion("staAddress =", value, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressNotEqualTo(String value) {
            addCriterion("staAddress <>", value, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressGreaterThan(String value) {
            addCriterion("staAddress >", value, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressGreaterThanOrEqualTo(String value) {
            addCriterion("staAddress >=", value, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressLessThan(String value) {
            addCriterion("staAddress <", value, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressLessThanOrEqualTo(String value) {
            addCriterion("staAddress <=", value, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressLike(String value) {
            addCriterion("staAddress like", value, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressNotLike(String value) {
            addCriterion("staAddress not like", value, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressIn(List<String> values) {
            addCriterion("staAddress in", values, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressNotIn(List<String> values) {
            addCriterion("staAddress not in", values, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressBetween(String value1, String value2) {
            addCriterion("staAddress between", value1, value2, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaaddressNotBetween(String value1, String value2) {
            addCriterion("staAddress not between", value1, value2, "staaddress");
            return (Criteria) this;
        }

        public Criteria andStaremarkIsNull() {
            addCriterion("staRemark is null");
            return (Criteria) this;
        }

        public Criteria andStaremarkIsNotNull() {
            addCriterion("staRemark is not null");
            return (Criteria) this;
        }

        public Criteria andStaremarkEqualTo(String value) {
            addCriterion("staRemark =", value, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkNotEqualTo(String value) {
            addCriterion("staRemark <>", value, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkGreaterThan(String value) {
            addCriterion("staRemark >", value, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkGreaterThanOrEqualTo(String value) {
            addCriterion("staRemark >=", value, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkLessThan(String value) {
            addCriterion("staRemark <", value, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkLessThanOrEqualTo(String value) {
            addCriterion("staRemark <=", value, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkLike(String value) {
            addCriterion("staRemark like", value, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkNotLike(String value) {
            addCriterion("staRemark not like", value, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkIn(List<String> values) {
            addCriterion("staRemark in", values, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkNotIn(List<String> values) {
            addCriterion("staRemark not in", values, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkBetween(String value1, String value2) {
            addCriterion("staRemark between", value1, value2, "staremark");
            return (Criteria) this;
        }

        public Criteria andStaremarkNotBetween(String value1, String value2) {
            addCriterion("staRemark not between", value1, value2, "staremark");
            return (Criteria) this;
        }

        public Criteria andStabirthdayIsNull() {
            addCriterion("staBirthday is null");
            return (Criteria) this;
        }

        public Criteria andStabirthdayIsNotNull() {
            addCriterion("staBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andStabirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("staBirthday =", value, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("staBirthday <>", value, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("staBirthday >", value, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staBirthday >=", value, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayLessThan(Date value) {
            addCriterionForJDBCDate("staBirthday <", value, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staBirthday <=", value, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("staBirthday in", values, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("staBirthday not in", values, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staBirthday between", value1, value2, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStabirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staBirthday not between", value1, value2, "stabirthday");
            return (Criteria) this;
        }

        public Criteria andStaidcardIsNull() {
            addCriterion("staIdcard is null");
            return (Criteria) this;
        }

        public Criteria andStaidcardIsNotNull() {
            addCriterion("staIdcard is not null");
            return (Criteria) this;
        }

        public Criteria andStaidcardEqualTo(String value) {
            addCriterion("staIdcard =", value, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardNotEqualTo(String value) {
            addCriterion("staIdcard <>", value, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardGreaterThan(String value) {
            addCriterion("staIdcard >", value, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardGreaterThanOrEqualTo(String value) {
            addCriterion("staIdcard >=", value, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardLessThan(String value) {
            addCriterion("staIdcard <", value, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardLessThanOrEqualTo(String value) {
            addCriterion("staIdcard <=", value, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardLike(String value) {
            addCriterion("staIdcard like", value, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardNotLike(String value) {
            addCriterion("staIdcard not like", value, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardIn(List<String> values) {
            addCriterion("staIdcard in", values, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardNotIn(List<String> values) {
            addCriterion("staIdcard not in", values, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardBetween(String value1, String value2) {
            addCriterion("staIdcard between", value1, value2, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaidcardNotBetween(String value1, String value2) {
            addCriterion("staIdcard not between", value1, value2, "staidcard");
            return (Criteria) this;
        }

        public Criteria andStaenduceIsNull() {
            addCriterion("staEnduce is null");
            return (Criteria) this;
        }

        public Criteria andStaenduceIsNotNull() {
            addCriterion("staEnduce is not null");
            return (Criteria) this;
        }

        public Criteria andStaenduceEqualTo(String value) {
            addCriterion("staEnduce =", value, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceNotEqualTo(String value) {
            addCriterion("staEnduce <>", value, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceGreaterThan(String value) {
            addCriterion("staEnduce >", value, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceGreaterThanOrEqualTo(String value) {
            addCriterion("staEnduce >=", value, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceLessThan(String value) {
            addCriterion("staEnduce <", value, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceLessThanOrEqualTo(String value) {
            addCriterion("staEnduce <=", value, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceLike(String value) {
            addCriterion("staEnduce like", value, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceNotLike(String value) {
            addCriterion("staEnduce not like", value, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceIn(List<String> values) {
            addCriterion("staEnduce in", values, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceNotIn(List<String> values) {
            addCriterion("staEnduce not in", values, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceBetween(String value1, String value2) {
            addCriterion("staEnduce between", value1, value2, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStaenduceNotBetween(String value1, String value2) {
            addCriterion("staEnduce not between", value1, value2, "staenduce");
            return (Criteria) this;
        }

        public Criteria andStahabitIsNull() {
            addCriterion("staHabit is null");
            return (Criteria) this;
        }

        public Criteria andStahabitIsNotNull() {
            addCriterion("staHabit is not null");
            return (Criteria) this;
        }

        public Criteria andStahabitEqualTo(String value) {
            addCriterion("staHabit =", value, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitNotEqualTo(String value) {
            addCriterion("staHabit <>", value, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitGreaterThan(String value) {
            addCriterion("staHabit >", value, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitGreaterThanOrEqualTo(String value) {
            addCriterion("staHabit >=", value, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitLessThan(String value) {
            addCriterion("staHabit <", value, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitLessThanOrEqualTo(String value) {
            addCriterion("staHabit <=", value, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitLike(String value) {
            addCriterion("staHabit like", value, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitNotLike(String value) {
            addCriterion("staHabit not like", value, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitIn(List<String> values) {
            addCriterion("staHabit in", values, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitNotIn(List<String> values) {
            addCriterion("staHabit not in", values, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitBetween(String value1, String value2) {
            addCriterion("staHabit between", value1, value2, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStahabitNotBetween(String value1, String value2) {
            addCriterion("staHabit not between", value1, value2, "stahabit");
            return (Criteria) this;
        }

        public Criteria andStamajorIsNull() {
            addCriterion("staMajor is null");
            return (Criteria) this;
        }

        public Criteria andStamajorIsNotNull() {
            addCriterion("staMajor is not null");
            return (Criteria) this;
        }

        public Criteria andStamajorEqualTo(String value) {
            addCriterion("staMajor =", value, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorNotEqualTo(String value) {
            addCriterion("staMajor <>", value, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorGreaterThan(String value) {
            addCriterion("staMajor >", value, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorGreaterThanOrEqualTo(String value) {
            addCriterion("staMajor >=", value, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorLessThan(String value) {
            addCriterion("staMajor <", value, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorLessThanOrEqualTo(String value) {
            addCriterion("staMajor <=", value, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorLike(String value) {
            addCriterion("staMajor like", value, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorNotLike(String value) {
            addCriterion("staMajor not like", value, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorIn(List<String> values) {
            addCriterion("staMajor in", values, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorNotIn(List<String> values) {
            addCriterion("staMajor not in", values, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorBetween(String value1, String value2) {
            addCriterion("staMajor between", value1, value2, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamajorNotBetween(String value1, String value2) {
            addCriterion("staMajor not between", value1, value2, "stamajor");
            return (Criteria) this;
        }

        public Criteria andStamarryIsNull() {
            addCriterion("staMarry is null");
            return (Criteria) this;
        }

        public Criteria andStamarryIsNotNull() {
            addCriterion("staMarry is not null");
            return (Criteria) this;
        }

        public Criteria andStamarryEqualTo(String value) {
            addCriterion("staMarry =", value, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryNotEqualTo(String value) {
            addCriterion("staMarry <>", value, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryGreaterThan(String value) {
            addCriterion("staMarry >", value, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryGreaterThanOrEqualTo(String value) {
            addCriterion("staMarry >=", value, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryLessThan(String value) {
            addCriterion("staMarry <", value, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryLessThanOrEqualTo(String value) {
            addCriterion("staMarry <=", value, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryLike(String value) {
            addCriterion("staMarry like", value, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryNotLike(String value) {
            addCriterion("staMarry not like", value, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryIn(List<String> values) {
            addCriterion("staMarry in", values, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryNotIn(List<String> values) {
            addCriterion("staMarry not in", values, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryBetween(String value1, String value2) {
            addCriterion("staMarry between", value1, value2, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStamarryNotBetween(String value1, String value2) {
            addCriterion("staMarry not between", value1, value2, "stamarry");
            return (Criteria) this;
        }

        public Criteria andStaageIsNull() {
            addCriterion("staAge is null");
            return (Criteria) this;
        }

        public Criteria andStaageIsNotNull() {
            addCriterion("staAge is not null");
            return (Criteria) this;
        }

        public Criteria andStaageEqualTo(String value) {
            addCriterion("staAge =", value, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageNotEqualTo(String value) {
            addCriterion("staAge <>", value, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageGreaterThan(String value) {
            addCriterion("staAge >", value, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageGreaterThanOrEqualTo(String value) {
            addCriterion("staAge >=", value, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageLessThan(String value) {
            addCriterion("staAge <", value, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageLessThanOrEqualTo(String value) {
            addCriterion("staAge <=", value, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageLike(String value) {
            addCriterion("staAge like", value, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageNotLike(String value) {
            addCriterion("staAge not like", value, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageIn(List<String> values) {
            addCriterion("staAge in", values, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageNotIn(List<String> values) {
            addCriterion("staAge not in", values, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageBetween(String value1, String value2) {
            addCriterion("staAge between", value1, value2, "staage");
            return (Criteria) this;
        }

        public Criteria andStaageNotBetween(String value1, String value2) {
            addCriterion("staAge not between", value1, value2, "staage");
            return (Criteria) this;
        }

        public Criteria andStaeducationIsNull() {
            addCriterion("staEducation is null");
            return (Criteria) this;
        }

        public Criteria andStaeducationIsNotNull() {
            addCriterion("staEducation is not null");
            return (Criteria) this;
        }

        public Criteria andStaeducationEqualTo(String value) {
            addCriterion("staEducation =", value, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationNotEqualTo(String value) {
            addCriterion("staEducation <>", value, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationGreaterThan(String value) {
            addCriterion("staEducation >", value, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationGreaterThanOrEqualTo(String value) {
            addCriterion("staEducation >=", value, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationLessThan(String value) {
            addCriterion("staEducation <", value, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationLessThanOrEqualTo(String value) {
            addCriterion("staEducation <=", value, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationLike(String value) {
            addCriterion("staEducation like", value, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationNotLike(String value) {
            addCriterion("staEducation not like", value, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationIn(List<String> values) {
            addCriterion("staEducation in", values, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationNotIn(List<String> values) {
            addCriterion("staEducation not in", values, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationBetween(String value1, String value2) {
            addCriterion("staEducation between", value1, value2, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStaeducationNotBetween(String value1, String value2) {
            addCriterion("staEducation not between", value1, value2, "staeducation");
            return (Criteria) this;
        }

        public Criteria andStacomputerIsNull() {
            addCriterion("staComputer is null");
            return (Criteria) this;
        }

        public Criteria andStacomputerIsNotNull() {
            addCriterion("staComputer is not null");
            return (Criteria) this;
        }

        public Criteria andStacomputerEqualTo(String value) {
            addCriterion("staComputer =", value, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerNotEqualTo(String value) {
            addCriterion("staComputer <>", value, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerGreaterThan(String value) {
            addCriterion("staComputer >", value, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerGreaterThanOrEqualTo(String value) {
            addCriterion("staComputer >=", value, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerLessThan(String value) {
            addCriterion("staComputer <", value, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerLessThanOrEqualTo(String value) {
            addCriterion("staComputer <=", value, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerLike(String value) {
            addCriterion("staComputer like", value, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerNotLike(String value) {
            addCriterion("staComputer not like", value, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerIn(List<String> values) {
            addCriterion("staComputer in", values, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerNotIn(List<String> values) {
            addCriterion("staComputer not in", values, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerBetween(String value1, String value2) {
            addCriterion("staComputer between", value1, value2, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStacomputerNotBetween(String value1, String value2) {
            addCriterion("staComputer not between", value1, value2, "stacomputer");
            return (Criteria) this;
        }

        public Criteria andStaenglishIsNull() {
            addCriterion("staEnglish is null");
            return (Criteria) this;
        }

        public Criteria andStaenglishIsNotNull() {
            addCriterion("staEnglish is not null");
            return (Criteria) this;
        }

        public Criteria andStaenglishEqualTo(String value) {
            addCriterion("staEnglish =", value, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishNotEqualTo(String value) {
            addCriterion("staEnglish <>", value, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishGreaterThan(String value) {
            addCriterion("staEnglish >", value, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishGreaterThanOrEqualTo(String value) {
            addCriterion("staEnglish >=", value, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishLessThan(String value) {
            addCriterion("staEnglish <", value, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishLessThanOrEqualTo(String value) {
            addCriterion("staEnglish <=", value, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishLike(String value) {
            addCriterion("staEnglish like", value, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishNotLike(String value) {
            addCriterion("staEnglish not like", value, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishIn(List<String> values) {
            addCriterion("staEnglish in", values, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishNotIn(List<String> values) {
            addCriterion("staEnglish not in", values, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishBetween(String value1, String value2) {
            addCriterion("staEnglish between", value1, value2, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaenglishNotBetween(String value1, String value2) {
            addCriterion("staEnglish not between", value1, value2, "staenglish");
            return (Criteria) this;
        }

        public Criteria andStaworkerIsNull() {
            addCriterion("staWorker is null");
            return (Criteria) this;
        }

        public Criteria andStaworkerIsNotNull() {
            addCriterion("staWorker is not null");
            return (Criteria) this;
        }

        public Criteria andStaworkerEqualTo(String value) {
            addCriterion("staWorker =", value, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerNotEqualTo(String value) {
            addCriterion("staWorker <>", value, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerGreaterThan(String value) {
            addCriterion("staWorker >", value, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerGreaterThanOrEqualTo(String value) {
            addCriterion("staWorker >=", value, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerLessThan(String value) {
            addCriterion("staWorker <", value, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerLessThanOrEqualTo(String value) {
            addCriterion("staWorker <=", value, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerLike(String value) {
            addCriterion("staWorker like", value, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerNotLike(String value) {
            addCriterion("staWorker not like", value, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerIn(List<String> values) {
            addCriterion("staWorker in", values, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerNotIn(List<String> values) {
            addCriterion("staWorker not in", values, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerBetween(String value1, String value2) {
            addCriterion("staWorker between", value1, value2, "staworker");
            return (Criteria) this;
        }

        public Criteria andStaworkerNotBetween(String value1, String value2) {
            addCriterion("staWorker not between", value1, value2, "staworker");
            return (Criteria) this;
        }

        public Criteria andStabanknumberIsNull() {
            addCriterion("staBankNumber is null");
            return (Criteria) this;
        }

        public Criteria andStabanknumberIsNotNull() {
            addCriterion("staBankNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStabanknumberEqualTo(String value) {
            addCriterion("staBankNumber =", value, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberNotEqualTo(String value) {
            addCriterion("staBankNumber <>", value, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberGreaterThan(String value) {
            addCriterion("staBankNumber >", value, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("staBankNumber >=", value, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberLessThan(String value) {
            addCriterion("staBankNumber <", value, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberLessThanOrEqualTo(String value) {
            addCriterion("staBankNumber <=", value, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberLike(String value) {
            addCriterion("staBankNumber like", value, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberNotLike(String value) {
            addCriterion("staBankNumber not like", value, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberIn(List<String> values) {
            addCriterion("staBankNumber in", values, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberNotIn(List<String> values) {
            addCriterion("staBankNumber not in", values, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberBetween(String value1, String value2) {
            addCriterion("staBankNumber between", value1, value2, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStabanknumberNotBetween(String value1, String value2) {
            addCriterion("staBankNumber not between", value1, value2, "stabanknumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberIsNull() {
            addCriterion("staQqNumber is null");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberIsNotNull() {
            addCriterion("staQqNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberEqualTo(String value) {
            addCriterion("staQqNumber =", value, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberNotEqualTo(String value) {
            addCriterion("staQqNumber <>", value, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberGreaterThan(String value) {
            addCriterion("staQqNumber >", value, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberGreaterThanOrEqualTo(String value) {
            addCriterion("staQqNumber >=", value, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberLessThan(String value) {
            addCriterion("staQqNumber <", value, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberLessThanOrEqualTo(String value) {
            addCriterion("staQqNumber <=", value, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberLike(String value) {
            addCriterion("staQqNumber like", value, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberNotLike(String value) {
            addCriterion("staQqNumber not like", value, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberIn(List<String> values) {
            addCriterion("staQqNumber in", values, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberNotIn(List<String> values) {
            addCriterion("staQqNumber not in", values, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberBetween(String value1, String value2) {
            addCriterion("staQqNumber between", value1, value2, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStaqqnumberNotBetween(String value1, String value2) {
            addCriterion("staQqNumber not between", value1, value2, "staqqnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberIsNull() {
            addCriterion("staPostNumber is null");
            return (Criteria) this;
        }

        public Criteria andStapostnumberIsNotNull() {
            addCriterion("staPostNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStapostnumberEqualTo(String value) {
            addCriterion("staPostNumber =", value, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberNotEqualTo(String value) {
            addCriterion("staPostNumber <>", value, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberGreaterThan(String value) {
            addCriterion("staPostNumber >", value, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberGreaterThanOrEqualTo(String value) {
            addCriterion("staPostNumber >=", value, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberLessThan(String value) {
            addCriterion("staPostNumber <", value, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberLessThanOrEqualTo(String value) {
            addCriterion("staPostNumber <=", value, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberLike(String value) {
            addCriterion("staPostNumber like", value, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberNotLike(String value) {
            addCriterion("staPostNumber not like", value, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberIn(List<String> values) {
            addCriterion("staPostNumber in", values, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberNotIn(List<String> values) {
            addCriterion("staPostNumber not in", values, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberBetween(String value1, String value2) {
            addCriterion("staPostNumber between", value1, value2, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStapostnumberNotBetween(String value1, String value2) {
            addCriterion("staPostNumber not between", value1, value2, "stapostnumber");
            return (Criteria) this;
        }

        public Criteria andStachargeIsNull() {
            addCriterion("staCharge is null");
            return (Criteria) this;
        }

        public Criteria andStachargeIsNotNull() {
            addCriterion("staCharge is not null");
            return (Criteria) this;
        }

        public Criteria andStachargeEqualTo(String value) {
            addCriterion("staCharge =", value, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeNotEqualTo(String value) {
            addCriterion("staCharge <>", value, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeGreaterThan(String value) {
            addCriterion("staCharge >", value, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeGreaterThanOrEqualTo(String value) {
            addCriterion("staCharge >=", value, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeLessThan(String value) {
            addCriterion("staCharge <", value, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeLessThanOrEqualTo(String value) {
            addCriterion("staCharge <=", value, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeLike(String value) {
            addCriterion("staCharge like", value, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeNotLike(String value) {
            addCriterion("staCharge not like", value, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeIn(List<String> values) {
            addCriterion("staCharge in", values, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeNotIn(List<String> values) {
            addCriterion("staCharge not in", values, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeBetween(String value1, String value2) {
            addCriterion("staCharge between", value1, value2, "stacharge");
            return (Criteria) this;
        }

        public Criteria andStachargeNotBetween(String value1, String value2) {
            addCriterion("staCharge not between", value1, value2, "stacharge");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(String value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(String value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(String value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(String value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(String value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(String value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLike(String value) {
            addCriterion("locked like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotLike(String value) {
            addCriterion("locked not like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<String> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<String> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(String value1, String value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(String value1, String value2) {
            addCriterion("locked not between", value1, value2, "locked");
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