package dao;

import bean.java.Admin;
import exceptions.AdminException;

public interface AdminDao  {
	
	//login admin
	public Admin loginAdmin(String username,String password)throws AdminException;
	
	
	//logout admin
	public void logoutAdmin() throws AdminException;

}