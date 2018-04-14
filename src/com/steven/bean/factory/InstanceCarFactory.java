package com.steven.bean.factory;
/**
 * 实例工厂方法:实例工厂的方法。既现需要创建工厂本身，在调用工厂的实例方法来返回bean的实例  
 * 
 * 
 * @author zhiwenyan
 *
 */

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	private Map<String, Car> cars;
	public InstanceCarFactory() {
		cars=new HashMap<>();
		cars.put("audi",new Car("audi", "300000"));
		cars.put("Ford",new Car("Ford", "400000"));
	}
	public  Car getCar(String name) {
		return cars.get(name);
	}
}
