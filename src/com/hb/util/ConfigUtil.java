package com.hb.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ConfigUtil {
	
	/**
	 * 
	 * @param clazz
	 */
	public static Configuration createConfiguration(Class<?> clazz){
		Configuration config = new Configuration();
		config.addAnnotatedClass(clazz);
		config.configure("/com/hb/config/hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		return config;
	}
	
//	public static void 

}
