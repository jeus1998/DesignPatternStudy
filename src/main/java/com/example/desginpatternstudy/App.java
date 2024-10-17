package com.example.desginpatternstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String hello1 = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        System.out.println(hello1 == hello2); // true
        String hello3 = new String("hello");
        String hello4 = new String("hello");
        System.out.println(hello3 != hello4); // true 힙에 각각 다른 참조를 가지고 저장

        String hello5 = "hello";
        String hello6 = "hello";
        System.out.println(hello5 == hello6); // true String Constant Pool(힙 메모리 일부)

        System.out.println(hello1 == hello5); // true 결국 ApplicationContext 내에 있는 리터럴 또한 상수 풀에 존재
    }
}
/* Runtime
public class App {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // new Runtime(); private 생성자
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
 */