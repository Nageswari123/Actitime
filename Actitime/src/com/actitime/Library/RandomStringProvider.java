package com.actitime.Library;

import net.bytebuddy.utility.RandomString;

public class RandomStringProvider
{
	public static String getRandomString()
	{
		return RandomString.make(8);
	}
	
}
