package cn.luo.ssm.po;
/**
 * 部门信息扩展类
 *<p>Title:DeptVO </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2017-3-18
 */
public class DeptVO extends Dept{
	private int deptCount;//部门人数
	
	private String deptSupperName;//上级部门名称
	
	private String  staName;//部门负责人
	
	private String staTel;//部门负责人联系电话 
	
	private Integer staId;
	
	

	public Integer getStaId() {
		return staId;
	}

	public void setStaId(Integer staId) {
		this.staId = staId;
	}

	public int getDeptCount() {
		return deptCount;
	}

	public void setDeptCount(int deptCount) {
		this.deptCount = deptCount;
	}

	public String getDeptSupperName() {
		return deptSupperName;
	}

	public void setDeptSupperName(String deptSupperName) {
		this.deptSupperName = deptSupperName;
	}

	public String getStaName() {
		return staName;
	}

	public void setStaName(String staName) {
		this.staName = staName;
	}

	public String getStaTel() {
		return staTel;
	}

	public void setStaTel(String staTel) {
		this.staTel = staTel;
	}
	
	
}
