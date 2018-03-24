package cn.luo.ssm.po;

import java.util.Date;

public class Noticebulletins {
    private Integer bullId;

  

    private Date bullcreate;

    private String bullName;

    private String BullType;

    private String BullServerName;

    private String bullsize;
    
    private int noticeId;

	

	public Integer getBullId() {
		return bullId;
	}

	public void setBullId(Integer bullId) {
		this.bullId = bullId;
	}

	public Date getBullcreate() {
		return bullcreate;
	}

	public void setBullcreate(Date bullcreate) {
		this.bullcreate = bullcreate;
	}

	public String getBullName() {
		return bullName;
	}

	public void setBullName(String bullName) {
		this.bullName = bullName;
	}

	public String getBullType() {
		return BullType;
	}

	public void setBullType(String bullType) {
		BullType = bullType;
	}

	public String getBullServerName() {
		return BullServerName;
	}

	public void setBullServerName(String bullServerName) {
		BullServerName = bullServerName;
	}

	public String getBullsize() {
		return bullsize;
	}

	public void setBullsize(String bullsize) {
		this.bullsize = bullsize;
	}

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
    

    
}