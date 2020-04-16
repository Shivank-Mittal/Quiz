package fr.shiv.quiz.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" ...... Bean: " + beanName +" is initialized");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.print("Bean: " + beanName +" is initializing");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
