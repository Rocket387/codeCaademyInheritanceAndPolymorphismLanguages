package org.example;

class SinoTibetan extends Language {

    public SinoTibetan(String LanguageName, int numberOfSpeakers) {
        super(LanguageName, numberOfSpeakers, "Asia", "subject-object-verb");
        if (LanguageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}
