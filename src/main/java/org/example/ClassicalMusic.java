package org.example;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Initialization KAPPA");
    }

    public void doMyDestroy(){
        System.out.println("Destroying KEEPO");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
