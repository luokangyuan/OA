package cn.luo.ssm.po;

import java.util.Date;

public class Noticetype {
    private Integer ntid;

    private String ntname;
    
    private Date ntcreate;
    
    private String ntauthor;
    
    private String startTime;
    
	private String endTime; 
    
	private String order;//排序方式
	
	private String sort;//排序字段
	
	

    public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getNtcreate() {
		return ntcreate;
	}

	public void setNtcreate(Date ntcreate) {
		this.ntcreate = ntcreate;
	}

	public String getNtauthor() {
		return ntauthor;
	}

	public void setNtauthor(String ntauthor) {
		this.ntauthor = ntauthor;
	}

	public Integer getNtid() {
        return ntid;
    }

    public void setNtid(Integer ntid) {
        this.ntid = ntid;
    }

    public String getNtname() {
        return ntname;
    }

    public void setNtname(String ntname) {
        this.ntname = ntname == null ? null : ntname.trim();
    }
}