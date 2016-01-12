package fr.afcepf.al26.spring.tests;

import fr.afcepf.al26.spring.A;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static Logger log = Logger.getLogger(Test.class);
    public static void main(String[] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        A a = (A) beanFactory.getBean("beanA");
        log.info(a.test());
    }
}
