package cn.luo.ssm.po;

public class Job {
    private Integer jobId;

    private String jobName;

    private String jobRemark;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobRemark() {
        return jobRemark;
    }

    public void setJobRemark(String jobRemark) {
        this.jobRemark = jobRemark == null ? null : jobRemark.trim();
    }
}