package cn.luo.ssm.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

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
public interface SystemNoticeService {
	//查询所有的系统公告
	public List<NoticeVO> findAllNotice(NoticeVO noticeVO)throws Exception;
	//查询所有系统部门
	public List<DeptVO> findAllDepts()throws Exception;
	//发布系统公告
	public void insertNotice(Notice notice)throws Exception;
	//插入系统公告附件
	public void insertNoticeBull(Noticebulletins noticebulletins)throws Exception;
	//得到系统公告id
	public int getNoticeId()throws Exception;
	//修改系统公告
	public void updateNotice(Notice notice)throws Exception;
	//修改系统公告附件
	public void updateNoticeBull(Integer bullId,MultipartFile file)throws Exception;
	//删除系统公告
	public void deleteNotice(int nid)throws Exception;
	//删除系统公告附件
	public void deleteNoticeBull(int nbid)throws Exception;
	//查询全部的公告类型
	public List<Noticetype> selectNoticeType(Noticetype noticetype)throws Exception;
	//查询所有的公告权限
	public List<DeptVO> findAllPersi()throws Exception;
	//插入公告类型
	public void insertNoticeType(Noticetype noticetype)throws Exception;
	//删除公告类型
	public void deleteNoticeType(int ntid)throws Exception;
	//修改公告类型
	public void updateNoticeType(Noticetype noticetype)throws Exception;
	//查看公告
	public List<NoticeVO> selectNoticeToShow(NoticeVO noticeVO)throws Exception;
	
}
