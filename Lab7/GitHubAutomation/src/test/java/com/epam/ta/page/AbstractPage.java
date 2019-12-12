package com.epam.ta.page;

import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractPage
{
	protected final Logger logger = LogManager.getRootLogger();
	protected WebDriver driver;

	protected abstract AbstractPage openPage();
	protected final int WAIT_TIMEOUT_SECONDS = 10;

	protected AbstractPage(WebDriver driver)
	{
		this.driver = driver;
	}
}
