package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyUtils {
	
	static Properties prop = new Properties();
	
	public static void initProperty() {   //execute once
		
		try {
			FileReader reader = new FileReader("src/test/resources/config/config.properties");
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
