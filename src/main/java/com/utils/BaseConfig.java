package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	public static String getValue (String key) {
		String configFilePath = System.getProperty("user.dir") + "/config.properties";
		
		Properties props = new Properties();
		
		try {
			props.load(new FileInputStream(configFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props.get(key).toString();
	}
}
