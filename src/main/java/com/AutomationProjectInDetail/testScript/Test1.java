package com.AutomationProjectInDetail.testScript;

import org.testng.annotations.Test;

import com.AutomationProjectInDetail.helper.assertion.AssertionHelper;
import com.AutomationProjectInDetail.testbase.TestBase;

public class Test1 extends TestBase
{
	@Test
	public void testLogin()
	{
		AssertionHelper.markPass();
	}
	
	@Test
	public void testLogin1()
	{
		AssertionHelper.markFail();
	}

}
