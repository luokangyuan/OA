package cn.luo.ssm.po;

import java.util.Date;

public class Sysrole {
    private Integer roleid;

    private String rolename;
    
    private Date createTime;

    private String rolevaliable;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolevaliable() {
        return rolevaliable;
    }

    public void setRolevaliable(String rolevaliable) {
        this.rolevaliable = rolevaliable == null ? null : rolevaliable.trim();
    }

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}