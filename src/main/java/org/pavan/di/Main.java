package org.pavan.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserProfile pavan = context.getBean("pavan", UserProfile.class);
        pavan.displayUserProfile();

        UserProfile dipak = context.getBean("dipak", UserProfile.class);
        dipak.displayUserProfile();
    }
}