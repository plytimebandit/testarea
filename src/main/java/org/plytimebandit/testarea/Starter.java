package org.plytimebandit.testarea;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        InspectedObject inspectedObject = context.getBean(InspectedObject.class);
        inspectedObject.run();
    }

}
