package com.test.script;

import org.testng.annotations.Test;

import com.test.genrics.BaseTest;
import com.test.pages.ActionsClass;

public class TestActions extends BaseTest
{
 @Test
 public void testActionsClass( )
 {
	
	ActionsClass ac = new ActionsClass(driver);
	ac.clickOnCityName(driver);
	ac.clickOnConstructionBtn(driver);
}
}
