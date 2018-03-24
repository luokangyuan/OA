package cn.luo.ssm.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Syspermission implements Serializable {
    private Integer perid;

    private String pername;

    private String pertype;

    private String perurl;

    private String perpercode;

    private String perparentid;

    private String perparentids;

    private String persoft;

    private String peraviliable;
    
    private String icon;
    
    
    public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	List<Syspermission> semenu = new ArrayList<Syspermission>();
    
    

    public List<Syspermission> getSemenu() {
		return semenu;
	}

	public void setSemenu(List<Syspermission> semenu) {
		this.semenu = semenu;
	}

	public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername == null ? null : pername.trim();
    }

    public String getPertype() {
        return pertype;
    }

    public void setPertype(String pertype) {
        this.pertype = pertype == null ? null : pertype.trim();
    }

    public String getPerurl() {
        return perurl;
    }

    public void setPerurl(String perurl) {
        this.perurl = perurl == null ? null : perurl.trim();
    }

    public String getPerpercode() {
        return perpercode;
    }

    public void setPerpercode(String perpercode) {
        this.perpercode = perpercode == null ? null : perpercode.trim();
    }

    public String getPerparentid() {
        return perparentid;
    }

    public void setPerparentid(String perparentid) {
        this.perparentid = perparentid == null ? null : perparentid.trim();
    }

    public String getPerparentids() {
        return perparentids;
    }

    public void setPerparentids(String perparentids) {
        this.perparentids = perparentids == null ? null : perparentids.trim();
    }

    public String getPersoft() {
        return persoft;
    }

    public void setPersoft(String persoft) {
        this.persoft = persoft == null ? null : persoft.trim();
    }

    public String getPeraviliable() {
        return peraviliable;
    }

    public void setPeraviliable(String peraviliable) {
        this.peraviliable = peraviliable == null ? null : peraviliable.trim();
    }
}