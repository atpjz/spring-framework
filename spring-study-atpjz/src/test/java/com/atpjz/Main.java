package com.atpjz;

import com.atpjz.bean.Person;
import com.atpjz.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pengjianzhong
 * @date 2021/10/8 20:04
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Person person = ac.getBean("person", Person.class);
		person.sayHello();
		ac.close();
	}

}
