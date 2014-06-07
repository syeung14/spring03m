package com.ssyeung.ibatis.test;

import java.io.Reader;
import java.sql.SQLException;

import junit.framework.TestCase;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ssyeung.ibatis.User;

public class TestUser extends TestCase {
	SqlMapClient sqlMapClient; 
	
	public TestUser() {

	}
	
	public void testDbOps() {
		User user = new User(); 
		user.setName("john smith"); 
		user.setEmail("22@abc.com"); 
		user.setStatus(0); 

		// insert 
		try {
			sqlMapClient.insert("addUser", user);

			// select and update 
			// This throws exception if name is not unique 
			user = (User)sqlMapClient.queryForObject("getUserById", 1); 
			user.setStatus(10); 
			sqlMapClient.update("updateUserStatus", user); 

			// delete 
			//	        sqlMapClient.delete("deleteUser", user); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	protected void setUp() throws Exception {

		super.setUp();

		super.setUp();

		Reader reader = Resources.getResourceAsReader("com/ssyeung/ibatis/sqlMapConfig.xml");
		sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
	}

}
