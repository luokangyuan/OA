package cn.luo.ssm.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import cn.luo.ssm.mapper.SystemNoticeMapper;
import cn.luo.ssm.po.ActiveUser;
import cn.luo.ssm.po.DeptVO;
import cn.luo.ssm.po.Notice;
import cn.luo.ssm.po.NoticeVO;
import cn.luo.ssm.po.Noticebulletins;
import cn.luo.ssm.po.Noticetype;
import cn.luo.ssm.service.SystemNoticeService;

/**
 * 系统公告业务实现类
 * @author Administrator
 *
 */
@Service
@Transactional
public class SystemNoticeServiceImpl implements SystemNoticeService {
	@Autowired 
	SystemNoticeMapper systemNoticeMapper;
	@Override
	public List<NoticeVO> findAllNotice(NoticeVO noticeVO) throws Exception {
		return systemNoticeMapper.findAllNotice(noticeVO);
	}
	@Override
	public List<DeptVO> findAllDepts() throws Exception {
		
		List<DeptVO> alldepts = systemNoticeMapper.findAllDeptNOChar();
		List<DeptVO> depts =  systemNoticeMapper.findAllDepts();
		
		for(DeptVO l1:depts){
			for(DeptVO l2:alldepts){
				if(l1.getDeptName().equals(l2.getDeptName())){
					alldepts.remove(l2);
					break;
				}
			}
		}
		depts.addAll(alldepts);
		for(int i = 0; i<depts.size();i++){
			DeptVO deptVO = depts.get(i);
			String depNumber = deptVO.getDeptNumber();
			deptVO.setDeptCount(systemNoticeMapper.findCountStaff(depNumber));
			depNumber = depNumber.substring(0, depNumber.length()-2);
			for(int j = 0 ; j<depts.size();j++){
				DeptVO deptV = depts.get(j);
				String depNumbe = deptV.getDeptNumber();
				if(depNumber.equals(depNumbe)){
					deptVO.setDeptSupperName(deptV.getDeptName());
				}else if(deptVO.getDeptNumber().equals("00")){
					deptVO.setDeptSupperName("暂无上级部门");
				}
			}
			
		}
		return depts;
	}
	@Override
	public void insertNotice(Notice notice) throws Exception {
		systemNoticeMapper.insertNotice(notice);
	}
	@Override
	public void insertNoticeBull(Noticebulletins noticebulletins)
			throws Exception {
		systemNoticeMapper.insertNoticeBull(noticebulletins);
	}
	@Override
	public int getNoticeId() throws Exception {
		return systemNoticeMapper.getNoticeId();
	}
	@Override
	public void updateNotice(Notice notice) throws Exception {
		systemNoticeMapper.updateNotice(notice);
	}
	@Override
	public void updateNoticeBull(Integer bullId,MultipartFile file)
			throws Exception {
		if(!file.isEmpty()){
			Noticebulletins noticebulletins = new Noticebulletins();
			String file_path = "E:\\myeclipse10\\upload\\temp\\file\\";
				//获取每一个原始文件的文件名
				String OriginalFilename = file.getOriginalFilename();
				noticebulletins.setBullName(OriginalFilename);
				//新的文件名
				String newFileName = UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
				noticebulletins.setBullServerName(newFileName);
				//新文件
				File newFile = new File(file_path+newFileName);
				//将内存中的数据写入磁盘
				file.transferTo(newFile);
				//如果包含文件
				
				long size = file.getSize();
				String si = size+"KB";
				noticebulletins.setBullsize(si);
				noticebulletins.setBullType(file.getContentType());
				noticebulletins.setBullId(bullId);
				systemNoticeMapper.updateNoticeBull(noticebulletins);
		}
	}
	@Override
	public void deleteNotice(int nid) throws Exception {
		systemNoticeMapper.deleteNotice(nid);
	}
	@Override
	public void deleteNoticeBull(int nbid) throws Exception {
		systemNoticeMapper.deleteNoticeBull(nbid);
	}
	@Override
	public List<Noticetype> selectNoticeType(Noticetype noticetype) throws Exception {
		return systemNoticeMapper.selectNoticeType(noticetype);
	}
	@Override
	public List<DeptVO> findAllPersi() throws Exception {
		List<DeptVO> deptlist = systemNoticeMapper.findAllDepts();
		DeptVO deptVO = new DeptVO();
		deptVO.setDeptName("全体员工");
		deptlist.add(deptVO);
		return deptlist;
	}
	@Override
	public void insertNoticeType(Noticetype noticetype) throws Exception {
		Date date = new Date();
		noticetype.setNtcreate(date);
		Subject subject = SecurityUtils.getSubject();
		//取出身份信息
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		String author = activeUser.getUsername();
		noticetype.setNtauthor(author);
		systemNoticeMapper.insertNoticeType(noticetype);
	}
	@Override
	public void deleteNoticeType(int ntid) throws Exception {
		systemNoticeMapper.deleteNoticeType(ntid);
	}
	@Override
	public void updateNoticeType(Noticetype noticetype) throws Exception {
		systemNoticeMapper.updateNoticeType(noticetype);
	}
	@Override
	public List<NoticeVO> selectNoticeToShow(NoticeVO noticeVO)
			throws Exception {
		Subject subject = SecurityUtils.getSubject();
		//取出身份信息
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		int uid = activeUser.getUserid();
		//根据用户id获取部门
		int pid = systemNoticeMapper.selectDepIdByUserId(uid);
		String deptName = systemNoticeMapper.selectDeptNameBydeptid(pid);
		noticeVO.setNoticeArea(deptName);
		List<NoticeVO> showlist = systemNoticeMapper.selectNoticeToShow(noticeVO);
		return showlist;
	}

}
