package cn.luo.ssm.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.luo.ssm.mapper.SystemDeptMapper;
import cn.luo.ssm.mapper.SystemNoticeMapper;
import cn.luo.ssm.po.DeptVO;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.service.SystemDeptService;
@Service
@Transactional
public class SystemDeptServiceImpl implements SystemDeptService {
	
	@Autowired
	private SystemNoticeMapper systemNoticeMapper;
	@Autowired
	private SystemDeptMapper systemDeptMapper;
	@Override
	public void insertDept(DeptVO deptVO) throws Exception {
		deptVO.setDeptCreate(new Date());
		List<DeptVO> depts = systemNoticeMapper.findAllDeptNOChar();
		String supnumber = "";
		for(int i = 0; i<depts.size();i++){
			if(depts.get(i).getDeptName().equals(deptVO.getDeptSupperName())){
				supnumber = depts.get(i).getDeptNumber();
			}
		}
		List<Integer> number = new ArrayList<Integer>();
		for(int j = 0; j<depts.size();j++){
			String namenum = depts.get(j).getDeptNumber();
			if(namenum.length()-2 == supnumber.length()){
				namenum = namenum.substring(namenum.length()-2, namenum.length());
				Integer enumon = Integer.parseInt(namenum);
				number.add(enumon);
			}
		}
		Integer endnumber = Collections.max(number);
		String estr = "";
		if(endnumber<9){
			Integer ienmu = endnumber+1;
			estr = "0"+ienmu.toString();
		}else{
			Integer ienmu = endnumber+1;
			estr = ienmu.toString();
		}
		deptVO.setDeptNumber(supnumber+estr);
		systemDeptMapper.insertDept(deptVO);
		
	}
	@Override
	public List<Staff> findAllStaffByDept(int pid) throws Exception {
		
		return systemDeptMapper.findAllStaffByDept(pid);
	}
	@Override
	public void updateDeptInfo(DeptVO deptVO) throws Exception {
		systemDeptMapper.updateDeptInfo(deptVO);
		
	}
	@Override
	public void updateDeptNoChart(int pid) throws Exception {
		systemDeptMapper.updateDeptNoChart(pid);
		
	}
	@Override
	public void updatDdeptChart(int sid) throws Exception {
		systemDeptMapper.updatDdeptChart(sid);
	}
	@Override
	public void deleteDept(int pid) throws Exception {
		systemDeptMapper.deleteDept(pid);
	}

}
