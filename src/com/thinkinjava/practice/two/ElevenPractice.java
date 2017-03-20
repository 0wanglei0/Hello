package com.thinkinjava.practice.two;

/**
 * 
 * @author wang_lei
 *
 */
public class ElevenPractice {

    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
    public static void main(String[] args) {
        ElevenPractice han = new ElevenPractice();
        han.anIntegerRepresentingColors = 5;
        han.changeTheHueOfTheColor(3);
        System.out.println(han.anIntegerRepresentingColors);
    }

}
