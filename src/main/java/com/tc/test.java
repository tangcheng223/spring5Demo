package com.tc;

import com.tc.sp.domain.Domain;
import com.tc.sp.domain.DomainOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Domain domain = (Domain) applicationContext.getBean("domain");
        DomainOrder domainOrder = (DomainOrder) applicationContext.getBean("domainOrder");
        System.out.println(domain.getTitle());
        System.out.println(domainOrder.getOderNo());
        System.out.println(domainOrder.getDomain().getTitle());
    }
}
