package ood.integer;

import java.util.Enumeration;
import java.util.Properties;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties sProperties = System.getProperties();
		//Properties sProperties1 = System.exit();
		Enumeration e = sProperties.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key+"="+sProperties.getProperty(key));
		}
		System.out.println(" 获得当前虚拟机的环境属性"+sProperties);
	}

}
