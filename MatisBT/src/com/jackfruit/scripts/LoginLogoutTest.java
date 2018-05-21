package com.jackfruit.scripts;
import org.testng.annotations.Test;

import com.jackfruit.base.BaseTest;

public class LoginLogoutTest extends BaseTest{
	@Test(priority=1,enabled=true)
	public void testAutoLoginLogout1(){
		log.info("\n-------- This script will automatically login and logout ----------\n");
	}
}
