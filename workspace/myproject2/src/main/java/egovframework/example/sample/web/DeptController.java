package egovframework.example.sample.web;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVo;


@Controller   // 어노테이션
public class DeptController {

	@Resource(name="deptService")
	private DeptService deptService;
		
	@RequestMapping(value="/deptWrite.do") // DeptController 에서 deptWrite.do 가 있으면 아래 메소드를 수행한다. 
	public String deptWrite() { // 메소드에서 
		return "dept/deptWrite";   // 실제 jsp file 이 있는 경로를 적어준다. 
	}
	
		
	@RequestMapping(value="/deptWriteSave.do")	
	public String InsertDept(DeptVo vo) throws Exception{  // vo 주고 받는 역활을 한다. 
		
		System.out.println("부서번호 : "+vo.getDeptno());
		System.out.println("부서이름 : "+vo.getDname());
		System.out.println("부서위치 : "+vo.getLoc());
		
		String result = deptService.InsertDept(vo);
		if ( result == null ) {
			System.out.println("저장완료");
		}else {
			System.out.println("fail");
		}
		
//		deptService.InsertDept(vo.getDname());
//		deptService.InsertDept(vo.getLoc());
		
		
		
		
		return "";
		//return "dept/deptWriteSave";
	}
	
} 