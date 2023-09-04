package org.example;

public class Word {
    private int id;
    private  int level;
    private String word;
    private String meaning;

    Word(){}

    public Word(int id, int level, String word, String meaning) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        String slevel = "";
        for(int i=0; i<level; i++) slevel += "*";
        String str = String.format("%-3s", slevel)
                +String.format("%-15s", word)+" "+meaning;
        return str;
    }
}
