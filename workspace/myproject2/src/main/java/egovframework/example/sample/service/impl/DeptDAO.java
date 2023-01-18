package egovframework.example.sample.service.impl;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVo;


@Repository("deptDAO")
public class DeptDAO extends EgovAbstractDAO {

	public String InsertDept(DeptVo vo) throws Exception {
		// TODO Auto-generated method stub
		return (String)insert("deptDAO.InsertDept",vo);
	}
	

}
