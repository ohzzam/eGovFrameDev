package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;
import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVo;


@Service("deptService")
public class DeptServiceImpl extends EgovAbstractServiceImpl implements DeptService {

	@Resource (name="deptDAO")
	private DeptDAO deptDAO;
	
	
	@Override
	public String InsertDept(DeptVo vo) throws Exception {		
		return deptDAO.InsertDept(vo);
	}

	
}
