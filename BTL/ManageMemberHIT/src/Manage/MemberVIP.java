package Manage;

import java.util.ArrayList;

public class MemberVIP extends Person{
	private ArrayList<LopHoc> listClass = new ArrayList<LopHoc>();//những lớp là leader/support đảm nhiệm

	public MemberVIP() {
		super();
	}

	public MemberVIP(String code, String firstName, String lastName, String birth, String address, String major, int k,
			String phone, String position, ArrayList<LopHoc> listClass) {
		super(code, firstName, lastName, birth, address, major, k, phone, position);
		this.listClass = listClass;
	}

	public ArrayList<LopHoc> getListClass() {
		return listClass;
	}

	public void setListClass(ArrayList<LopHoc> listClass) {
		this.listClass = listClass;
	}
	public void inputInfor() {};
	public void outputInfor() {};
	
}
