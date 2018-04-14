package com.steven.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回Bean的实例
 * 
 * @author zhiwenyan
 *
 */

public class StaticCarFactory {
	
	public StaticCarFactory() {
		
		
	}
	private static Map<String, Car> cars = new HashMap<>();
	static {
		cars.put("audi",new Car("audi", "300000"));
		cars.put("Ford",new Car("Ford", "400000"));
	}
	/**
	 * 静态工厂方法  
	 * @param name
	 * @return
	 */
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
