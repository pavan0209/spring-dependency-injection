package org.pavan.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // setter injection
        UserProfile pavan = context.getBean("pavan", UserProfile.class);
        pavan.displayUserProfile();

        UserProfile dipak = context.getBean("dipak", UserProfile.class);
        dipak.displayUserProfile();

        // constructor injection
        Employee ganesh = context.getBean("ganesh", Employee.class);
        ganesh.showInfo();

        Employee rushi = context.getBean("rushi", Employee.class);
        rushi.showInfo();

        // injecting objects using setter injection
        OrderService order = context.getBean("order", OrderService.class);
        order.sendNotification();

        PaymentService payment = context.getBean("payment", PaymentService.class);
        payment.sendNotification();

        // loose coupling
        Customer customer = context.getBean("customer", Customer.class);
        customer.sendNotification();
    }
}