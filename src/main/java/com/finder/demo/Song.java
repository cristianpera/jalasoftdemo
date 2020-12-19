package com.finder.demo;

import java.util.StringTokenizer;

public class Song {

    private int words;

    private int lines;

    public Song(String lyrics){
        lines = countLines(lyrics);
        words = countWords(lyrics);
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public int countWords(String lyrics){
        if(lyrics == null || lyrics.isEmpty()){
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(lyrics);
        return tokens.countTokens();
    }

    public int countLines(String lyrics){
        if(lyrics == null || lyrics.isEmpty()){
            return 0;
        }
        String[] lines = lyrics.split("\\r?\\n");
        return lines.length;
    }

}
