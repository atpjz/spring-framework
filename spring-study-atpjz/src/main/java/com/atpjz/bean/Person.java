package com.atpjz.bean;

import org.springframework.stereotype.Component;

/**
 * @author pengjianzhong
 * @date 2021/10/8 20:14
 */
@Component
public class Person {
	private Integer age;

	public void sayHello(){
		System.out.println("hello!");
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
