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

    PFont corsiva, corsivaSmall, shadows, lucida;
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
        corsivaSmall = createFont("Corsiva.TTF", 35);
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
            text("Discontentment to ", 135, 200);
            textFont(corsiva);
            text("Fulfillment", 405, 200);
            textFont(corsivaSmall);
            text("By: Chris Hitchcock", 225, 250);
            rect(260, 400, 200, 100);
            fill(50);
            textFont(corsiva);
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
                    String t = "                                                   Jane's Hatred Towards Gateshead\n            Jane’s early life is filled with tragedy and discontentment, and it seems to follow her wherever she goes, including during her time at Gateshead. This is culminated when she is leaving for Lowood and she says to Aunt Reed that she is “glad you are no relation of mine. I will never call you aunt again as long as I live. I will never come to visit you when I am grown up; and if any one asks me how I liked you, and how you treated me, I will say the very thought of you makes me sick, and that you treated me with miserable cruelty...” (Brontë 36). While under Aunt Reed’s “care,” she is treated worse than the rest of the children, and is punished much harder. This makes Jane grow disdain for Aunt Reed, her children and Gateshead as a whole, and she does not enjoy her time there but rather despises it. From being socially isolated from the rest of the children to being put in the red room as punishment, Jane feels only discontentment towards Aunt Rood and Gateshead, which stuck with her throughout her early life. ";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Discontentment: Lowood    
                } else if (mouseX >= 25 && mouseX <= 200 && mouseY >= 480 && mouseY <= 505) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "                                                               Living at Lowood\n            Jane’s time at Lowood is very poor and came with many hardships. Even when things start going her way, it all comes tumbling back down, as described when Jane says: “I had meant to be so good, and to do so much at Lowood; to make so many friends, to earn respect, and win affection. Already I had made visible progress: that very morning I had reached the head of my class; Miss Miller had praised me warmly; Miss Temple had smiled approbation; she had promised to teach me drawing, and to let me learn French, if I continued to make similar improvement two months longer: and then I was well-received by my fellow-pupils; treated as an equal by those of my own age, and not molested by any: now, here I lay again crushed and trodden on; and could I ever rise more?” (68). Though there are positive aspects of Jane’s time at Lowood, like her education and friendship with Helen Burns, it is mostly negative, and so Jane is unable to lead a fulfilling life there. She is subject to poor living conditions (for example: little food, restrictive rules, etc.), which inhibit her ability to truly grow as a person. This leads to her being very discontent about her situation; she wants to be able to live a good life however once again, as with her time at Gateshead, that is hindered by her living situation. Ultimately, though her time at Lowood does have some fulfilling aspects, it mostly brings discontentment to Jane, and is not a pleasant period of her life.";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Fulfillment: Thornfield Hall
                } else if (mouseX >= 125 && mouseX <= 300 && mouseY >= 350 && mouseY <= 375) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "                                                                Finding Home\n            Due to her being an orphan, as well as her mistreatment in both Gateshead and Lowood, Jane has never truly had a home - until her time at Thornfield Hall. She grows to truly love Thornfield and her time with Rochester, to whom she says: “Thank you, Mr. Rochester, for your great kindness. I am strangely glad to get back again to you; and wherever you are us my home,-my only home” (246). After spending so much time at Thornfield, and then leaving to stay at Gateshead with her Aunt and her children, Jane really starts to appreciate her time there. While at Thornfield she has a family, responsibilities and the respect of others, which she has never truly had before. All of this is very fulfilling to her; it has allowed her to truly live out her life in a way that she enjoys it, instead of being confined to what Aunt Reed/Brocklehurst wanted for her. For these reasons, most of her time at Thornfield is very fulfilling, and is what really allows her to thrive as a person.";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Discontentment: Thornfield Hall
                } else if (mouseX >= 350 && mouseX <= 550 && mouseY >= 350 && mouseY <= 375) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "                                                                The Failed Wedding\n" +
"	            After finally confessing her love to Rochester, Jane is set to marry him and they plan to live their lives out together; however this is abruptly ended by Mr. Mason exposing that Rochester is already married, which hurt Jane. After this happens, Jane is considering leaving Thornfield when Rochester comes and she says:\n" +
"            I cannot: I am tired and sick. I want some water… I had become icy cold in my chamber…\n" +
"            I  was in the library-sitting in his chair-he was quite near. “If I could go out of life now, without\n            sharp a pang, it would be well for me,” I thought; “then I should not have to make the effort of\n            cracking my heart-strings in rending them from among Mr. Rochester’s. I must leave him, it\n            appears I do not want to leave him-I cannot leave him” (298).\n" +
"The wedding that was ended by Mr. Mason clearly affects Jane; in this passage she is distraught and is clearly pained, both emotionally and physically, to quite a bad extent. Not only does she feel sick, she is also torn between staying with or leaving Rochester. She believes that she should leave due to the events that occurred during the wedding, however she knows she still loves Rochester and thus doesn’t want to leave for that reason. Not only does the wedding end in her leaving Thornfield Hall, it also causes her much distress, and is the worst thing that has happened to her with Rochester since meeting him.";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Fulfillment: Moor House
                } else if (mouseX >= 300 && mouseX <= 460 && mouseY >= 150 && mouseY <= 175) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "                                                                Finding Her Family\n" +
"           After leaving Thornfield, Jane arrives at the Moor House, and spends quite some time with St. John, Diana, Mary and Hannah Rivers. During this time, she discovers that the Rivers’ are all her actual family; and for the first time she meets relatives that can truly be considered family. At the Moor House “... had found a brother: one [she] could be proud of,-one [she] could love; and two sisters, whose qualities were such, that when [she] knew them but as mere strangers, they had inspired me with genuine affection and admiration… Glorious discovery to a lonely wretch! This was wealth indeed!-wealth for the heart!-a mine of pure, genial affections” (385). Jane’s experiences with her relatives are only poor up to this point; specifically living under Aunt Reed, and so now that she has met family that she truly loves, she is ecstatic. This news is amazing to her; worth more than the riches she inherits from her dead uncle, and she celebrates this with her newly found family. Finally being able to meet blood relatives who she loves is a very fulfilling experience for her; and it makes her time at Moor House even more enjoyable to her than it was before she knew of this.";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Discontentment: Moor House
                } else if (mouseX >= 500 && mouseX <= 700 && mouseY >= 150 && mouseY <= 175) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "                                                                Leaving St. John\n" +
"	            Though Jane loves her time at the Moor House, her time there ends on a very unfulfilling note. After Jane declines St. John’s proposal to her, and consequently his offer for her to go to India with him, she converses with Diana about the matter: \n" +
"“...you have not consented-have you, Jane?” \n            " +
"“I have refused to marry him--” \n            " +
"“And have consequently displeased him?” she suggested. \n            " +
"“Deeply: he will never forgive me, I fear…” (415). \n            " +
"Jane’s last few days with the Rivers are very somber for her; after she refuses to marry St. John and travel with him to India, and although she is excited to return to Mr. Rochester, she worries over the state of her relationship with St. John. This also ends in Jane and the residents of Moor House parting, with St. John leaving for India and Jane returning to Thornfield Hall. This is especially sad for Jane as she is now parting with her only known family who she truly cares for, and is a heavy period of discontentment for her after she finally started to feel truly fulfilled again.";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);
                    //Fulfillment: Ferndean Manor   
                } else if (mouseX >= 550 && mouseX <= 700 && mouseY >= 540 && mouseY <= 565) {
                    fill(255, 255, 255);
                    rect(0, 00, 736, 588);
                    String t = "                                                                Marrying Rochester\n            At the end of the book, it is clear that Jane is changed drastically, and as has her life, especially during her times with Mr. Rochester. This all comes together in the end, where ten years have passed and Jane says: “Reader, I married him. A quiet wedding we had: he and I, the parson and clerk, were alone present” (448). Jane’s experiences with Rochester are some of her best, and so this marriage brings all of these positive times together in the joining of the two. This is a very significant event; and marks one of the most fulfilling things that Jane experiences throughout the novel. This is especially so due to the outcome of the first marriage; where it ended abruptly and is why Jane left Thornfield in the first place. Now that she has a proper marriage, and all goes well this time, it is clear that things have finally gone her way, and is able to lead a wonderful, fulfilling life as Mr. Rochester’s wife.";
                    fill(50);
                    textSize(14);
                    text(t, 25, 25, 700, 588);

                }
            }
        }
    }
}
