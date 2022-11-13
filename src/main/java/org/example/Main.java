package org.example;

import org.example.service.MusicPlayerServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        var musicPlayerService = (MusicPlayerServiceImpl) ac.getBean("musicPlayer");
        System.out.println(musicPlayerService.playRockMusic(0));
        System.out.println(musicPlayerService.playClassicMusic(1));
    }
}