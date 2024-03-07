package com.source.xml.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author huangfukexing
 * @date 2024/3/7 12:58
 */
public class BeanNameAwareTest implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}
}
