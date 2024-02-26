package org.example;

/**
 * Hello world!
 *
 */
class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language followes the word order: " + wordOrder + "." );
    }

    public static void main(String[] args) {
        Language spanish = new Language("Spanish ", 555000000, " Spain, Latin America ", " subject-verb-object");
        spanish.getInfo();

        Mayan kiiche = new Mayan("Kiiche", 50000);
        kiiche.getInfo();

        SinoTibetan MandarinChinese = new SinoTibetan("Mandarin Chinese", 60000000);
        MandarinChinese.getInfo();
    }
}
