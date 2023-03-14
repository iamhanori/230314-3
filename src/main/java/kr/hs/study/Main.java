package kr.hs.study;

import kr.hs.study.beans.HelloworldEn;
import kr.hs.study.beans.HelloworldKr;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        HelloworldKr kr = ctx.getBean("kr", HelloworldKr.class);
        kr.hello();

        HelloworldEn en = ctx.getBean("en", HelloworldEn.class);
        en.hello();

        System.out.println("Hello world!");
    }
}