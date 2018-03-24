package cn.luo.ssm.po;

import java.util.Date;

/**
 * 系统公告管理类
 *<p>Title:NoticeVO </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2017-3-16
 */
public class NoticeVO {
		private int noticeId;
		private int bullId;
		private String deptName;
		private String staName;
		private String noticeTitle;
		private String noticeType;
		private String noticeArea;
		private String BullType;
		private String bullName;
		private String BullServerName;
		private Date noticeTime;
		
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
		public int getNoticeId() {
			return noticeId;
		}
		public void setNoticeId(int noticeId) {
			this.noticeId = noticeId;
		}
		public int getBullId() {
			return bullId;
		}
		public void setBullId(int bullId) {
			this.bullId = bullId;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getStaName() {
			return staName;
		}
		public void setStaName(String staName) {
			this.staName = staName;
		}
		public String getNoticeTitle() {
			return noticeTitle;
		}
		public void setNoticeTitle(String noticeTitle) {
			this.noticeTitle = noticeTitle;
		}
		public String getNoticeType() {
			return noticeType;
		}
		public void setNoticeType(String noticeType) {
			this.noticeType = noticeType;
		}
		public String getNoticeArea() {
			return noticeArea;
		}
		public void setNoticeArea(String noticeArea) {
			this.noticeArea = noticeArea;
		}
		public String getBullType() {
			return BullType;
		}
		public void setBullType(String bullType) {
			BullType = bullType;
		}
		public String getBullName() {
			return bullName;
		}
		public void setBullName(String bullName) {
			this.bullName = bullName;
		}
		public String getBullServerName() {
			return BullServerName;
		}
		public void setBullServerName(String bullServerName) {
			BullServerName = bullServerName;
		}
		public Date getNoticeTime() {
			return noticeTime;
		}
		public void setNoticeTime(Date noticeTime) {
			this.noticeTime = noticeTime;
		}
		
		
		
	 

}
