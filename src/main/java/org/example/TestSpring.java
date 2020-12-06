package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("classicalBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        firstMusicPlayer.setName("moloko");
//
//        firstMusicPlayer.setVolume(20);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        //firstMusicPlayer.playMusic();
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());


        context.close();
    }


}

