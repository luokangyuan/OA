package cn.luo.ssm.po;

import java.util.ArrayList;
import java.util.List;

/**
 * 系统角色扩展类
 * @author Administrator
 *
 */
public class RoleVo extends Sysrole {
	
	private List<Syspermission> persisions = new ArrayList<Syspermission>();

	public List<Syspermission> getPersisions() {
		return persisions;
	}

	public void setPersisions(List<Syspermission> persisions) {
		this.persisions = persisions;
	}
	
	
}
