/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janeeyreassignment;

import processing.core.*;

/**
 *
 * @author Chris
 */
public class JaneEyreAssignment extends PApplet {

    PFont corsiva, shadows, lucida;
    PImage map;
    boolean startScreen = true;
    boolean mainScreen = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PApplet.main("janeeyreassignment.JaneEyreAssignment");
    }

    public void settings() {
        size(736, 588);
        map = loadImage("Map.jpg");
    }

    public void setup() {
        corsiva = createFont("Corsiva.TTF", 46);
        shadows = createFont("ShadowsIntoLight.ttf", 37);
        lucida = createFont("LucidaGrande.ttf", 12);
    }

    public void draw() {
        if (startScreen) {
            fill(50);
            rect(0, 0, 746, 588);
            fill(255);
            textSize(40);
            textFont(shadows);
            text("Discontentment to ", 110, 200);
            textFont(corsiva);
            text("Fulfillment", 385, 200);
            rect(260, 400, 200, 100);
            fill(50);
            text("Continue", 278,460);
            if (mousePressed && mouseX >= 275 && mouseX <= 475 && mouseY >=400 && mouseY <= 500) {
                mainScreen = true;
                startScreen = false;
            }
        }

        if (mainScreen && startScreen == false) {
            image(map, 0, 0);
            textFont(lucida);
            fill(255, 255, 255);
            rect(25, 175, 175, 25); //Discontentment: Gateshead
            rect(25, 480, 175, 25); //Discontentment: Lowood
            rect(125, 350, 175, 25); //Fulfillment: Thornfield
            rect(350, 350, 200, 25); //Discontentment: Thornfield
            rect(300, 150, 160, 25); //Fulfillment: Moor House
            rect(500, 150, 200, 25); //Discontentment: Moor House
            rect(550, 540, 175, 25); //Fulfillment: Ferndean Manor
            fill(50);
            textSize(12);
            text("Discontentment: Gateshead", 33, 192);
            text("Discontentment: Lowood", 33, 497);
            text("Fulfillment: Thornfield Hall", 135, 367);
            text("Discontentment: Thornfield Hall", 358, 367);
            text("Fulfillment: Moor House", 311, 167);
            text("Discontentment: Moor House", 511, 167);
            text("Fulfillment: Ferndean Manor", 558, 557);
            if (mousePressed) {
                //Discontentment: Gateshead
                if (mouseX >= 25 && mouseX <= 200 && mouseY >= 175 && mouseY <= 200) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "                                                   Jane's Hatred Towards Gateshead\n    Jane’s early life is filled with tragedy and discontentment, and it seems to follow her wherever she goes, including during her time at Gateshead. This is culminated when she is leaving for Lowood and she says to Aunt Reed that she is “glad you are no relation of mine. I will never call you aunt again as long as I live. I will never come to visit you when I am grown up; and if any one asks me how I liked you, and how you treated me, I will say the very thought of you makes me sick, and that you treated me with miserable cruelty...” (Brontë 36). While under Aunt Reed’s “care,” she is treated worse than the rest of the children, and is punished much harder. This makes Jane grow disdain for Aunt Reed, her children and Gateshead as a whole, and she does not enjoy her time there but rather despises it. From being socially isolated from the rest of the children to being put in the red room as punishment, Jane feels only discontentment towards Aunt Rood and Gateshead, which stuck with her throughout her early life. ";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Discontentment: Lowood    
                } else if (mouseX >= 25 && mouseX <= 200 && mouseY >= 480 && mouseY <= 505) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "Discontentment: Lowood Placeholder";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Fulfillment: Thornfield Hall
                } else if (mouseX >= 125 && mouseX <= 300 && mouseY >= 350 && mouseY <= 375) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "Fulfillment: Thornfield Placeholder";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Discontentment: Thornfield Hall
                } else if (mouseX >= 350 && mouseX <= 550 && mouseY >= 350 && mouseY <= 375) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "Discontentment: Thornfield Placeholder";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Fulfillment: Moor House
                } else if (mouseX >= 300 && mouseX <= 460 && mouseY >= 150 && mouseY <= 175) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "Fulfillment: Moor House";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Discontentment: Moor House
                } else if (mouseX >= 500 && mouseX <= 700 && mouseY >= 150 && mouseY <= 175) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "Discontentment: Moor House";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Fulfillment: Ferndean Manor   
                } else if (mouseX >= 550 && mouseX <= 700 && mouseY >= 540 && mouseY <= 565) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "                                                      Jane's Marriage to Rochester\n    At the end of the book, it is clear that Jane is changed drastically, and as has her life, especially during her times with Mr. Rochester. This all comes together in the end, where ten years have passed and Jane says: “Reader, I married him. A quiet wedding we had: he and I, the parson and clerk, were alone present” (448). Jane’s experiences with Rochester are some of her best, and so this marriage brings all of these positive times together in the joining of the two. This is a very significant event; and marks one of the most fulfilling things that Jane experiences throughout the novel. This is especially so due to the outcome of the first marriage; where it ended abruptly and is why Jane left Thornfield in the first place. Now that she has a proper marriage, and all goes well this time, it is clear that things have finally gone her way, and is able to lead a wonderful, fulfilling life as Mr. Rochester’s wife.";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);

                }
            }
        }
    }
}
