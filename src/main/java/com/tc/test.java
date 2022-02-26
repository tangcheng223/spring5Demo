package com.tc;

import com.tc.sp.domain.Domain;
import com.tc.sp.domain.DomainOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

       // extracted(applicationContext);v
        testInjectCollection(applicationContext);
    }

    private static void extracted(ApplicationContext applicationContext) {
        Domain domain = (Domain) applicationContext.getBean("domain");
        DomainOrder domainOrder = (DomainOrder) applicationContext.getBean("domainOrder");
        System.out.println(domain.getTitle());
        System.out.println(domainOrder.getOderNo());
        System.out.println(domainOrder.getDomain().getTitle());
    }

    private static void testInjectCollection(ApplicationContext applicationContext)
    {
        Domain domain = (Domain) applicationContext.getBean("domain");
        System.out.println(domain.getList());
        System.out.println(domain.getMap());
    }
}
