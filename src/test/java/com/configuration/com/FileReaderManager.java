package com.configuration.com;

import org.openqa.selenium.WebDriver;

public class FileReaderManager { //page 3
	// private cons
	private FileReaderManager() {
	}

	// current class static
	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	// another class methods should be non static
	public Config_Reader getInstance_CR() throws Exception {

		Config_Reader cr = new Config_Reader();
		return cr;

	}

}
