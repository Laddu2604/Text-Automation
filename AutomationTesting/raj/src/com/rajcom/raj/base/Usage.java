package com.rajcom.raj.base;
import org.junit.Test;

import com.rajcom.raj.base.CommonActions;

public class Usage extends CommonActions{
	
	CommonActions obj = new CommonActions();
	@Test
	public void login()
	{
		obj.waiting();
		System.out.println(obj.value());
		obj.openApp("https://www.facebook.com");
	}

}
