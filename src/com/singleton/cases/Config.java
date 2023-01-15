package com.singleton.cases;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	
	private static Config config;
	private static Properties p = null;
	
	public Config() {
		try {
			if ( p == null ) {
				p = new Properties();
				InputStream is = this.getClass().getResourceAsStream("/config.properties");
				p.load(is);// carregar config.
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Config getInstance() {
		if(config == null) {
			config = new Config();
		}
		return config;
	}
	
	public static String get(String key) {
		return p.getProperty(key);
	}

}
