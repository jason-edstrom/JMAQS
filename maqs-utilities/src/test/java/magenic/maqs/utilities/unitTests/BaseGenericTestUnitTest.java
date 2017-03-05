// --------------------------------------------------
// <copyright file="BaseGenericTest.java" company="Magenic">
// Copyright 2017 Magenic, All rights Reserved
// </copyright>
// <summary>Message type enumeration</summary>
// --------------------------------------------------

package magenic.maqs.utilities.unitTests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import magenic.maqs.utilities.BaseTest.BaseGenericTest;
import magenic.maqs.utilities.Logging.FileLogger;

/**
 * Unit test class for BaseGenericTest class
 * 
 * @author ColeBo
 */
@Test
public class BaseGenericTestUnitTest extends BaseGenericTest
{
	/**
	 * Verify fully qualified test name
	 */
	@Test
	public void fullyQualifiedTestNameTest()
	{
		String testName = this.getFullyQualifiedTestClassName();
		
		Assert.assertEquals(testName, "magenic.maqs.utilities.unitTests.BaseGenericTestUnitTest.fullyQualifiedTestNameTest");
	}
	
	/**
	 * Validate setting a new logger
	 */
	@Test
	public void FileLoggerTest()
	{
		this.setLogger(new FileLogger());
		
		if (!(this.getLogger() instanceof FileLogger))
		{
			Assert.fail("FileLogger was not set.");
		}
	}
	
	/* (non-Javadoc)
	 * @see magenic.maqs.utilities.BaseTest.BaseGenericTest#postSetupLogging()
	 */
	@Override
	protected void postSetupLogging()
	{
	
	}

	/* (non-Javadoc)
	 * @see magenic.maqs.utilities.BaseTest.BaseGenericTest#beforeLoggingTeardown(org.testng.ITestResult)
	 */
	@Override
	protected void beforeLoggingTeardown(ITestResult resultType)
	{
		
	}

}
