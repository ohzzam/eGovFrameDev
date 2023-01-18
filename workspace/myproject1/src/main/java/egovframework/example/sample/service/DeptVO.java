package egovframework.example.sample.service;

public class DeptVO {
	
	// 객체지향 : 캡슐화
	private String deptno;  // 접근 지정자.
	private String dname;
	private String loc;
	
	
	// 아래 구문은 해당 DeptVO.java file 에서 오른쪽 클릭 -> source -> generate getters and s.. 에서 설정을 하면 자동 완성 된다. 
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	

}
