package cn.luo.ssm.mapper;

import java.util.List;

import cn.luo.ssm.po.Dept;
import cn.luo.ssm.po.DeptVO;
import cn.luo.ssm.po.Notice;
import cn.luo.ssm.po.NoticeVO;
import cn.luo.ssm.po.Noticebulletins;
import cn.luo.ssm.po.Noticetype;

/**
 * 系统公告
 * @author Administrator
 *
 */
public interface SystemNoticeMapper {
	//查询所有的系统公告		
	public List<NoticeVO> findAllNotice(NoticeVO noticeVO)throws Exception;
	//查询所有的有负责人的系统部门
	public List<DeptVO>findAllDepts()throws Exception;
	//查询部门总人数
	public int findCountStaff(String staNumber)throws Exception;
	//发布系统公告
	public void insertNotice(Notice notice)throws Exception;
	//插入系统公告附件
	public void insertNoticeBull(Noticebulletins noticebulletins)throws Exception;
	//得到系统公告id
	public int getNoticeId()throws Exception;
	//修改系统公告
	public void updateNotice(Notice notice)throws Exception;
	//修改系统公告附件
	public void updateNoticeBull(Noticebulletins noticebulletins)throws Exception;
	//删除系统公告
	public void deleteNotice(int nid)throws Exception;
	//删除系统公告附件
	public void deleteNoticeBull(int nbid)throws Exception;
	//查询全部的公告类型
	public List<Noticetype> selectNoticeType(Noticetype noticetype)throws Exception;
	//查询所有的部门
	public List<DeptVO> findAllDeptNOChar()throws Exception;
	//插入公告类型
	public void insertNoticeType(Noticetype noticetype)throws Exception;
	//删除公告类型
	public void deleteNoticeType(int ntid)throws Exception;
	//修改公告类型
	public void updateNoticeType(Noticetype noticetype)throws Exception;
	//查看公告
	public List<NoticeVO> selectNoticeToShow(NoticeVO noticeVO)throws Exception;
	//根据部门id获取部门信息
	public String selectDeptNameBydeptid(int deptId)throws Exception;
	//根据用户id获取部门id
	public int selectDepIdByUserId(int uid)throws Exception;
}
