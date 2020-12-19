package com.finder.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Translation {
    private String err;
    private String result;
    private String cacheUse;
    private String source;
    private String from;
    private String sourceTransliteration;
    private String targetTransliteration;

    public Translation(String err, String result, String cacheUse, String source, String from, String sourceTransliteration, String targetTransliteration) {
        this.err = err;
        this.result = result;
        this.cacheUse = cacheUse;
        this.source = source;
        this.from = from;
        this.sourceTransliteration = sourceTransliteration;
        this.targetTransliteration = targetTransliteration;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCacheUse() {
        return cacheUse;
    }

    public void setCacheUse(String cacheUse) {
        this.cacheUse = cacheUse;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSourceTransliteration() {
        return sourceTransliteration;
    }

    public void setSourceTransliteration(String sourceTransliteration) {
        this.sourceTransliteration = sourceTransliteration;
    }

    public String getTargetTransliteration() {
        return targetTransliteration;
    }

    public void setTargetTransliteration(String targetTransliteration) {
        this.targetTransliteration = targetTransliteration;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "err='" + err + '\'' +
                ", result='" + result + '\'' +
                ", cacheUse='" + cacheUse + '\'' +
                ", source='" + source + '\'' +
                ", from='" + from + '\'' +
                ", sourceTransliteration='" + sourceTransliteration + '\'' +
                ", targetTransliteration='" + targetTransliteration + '\'' +
                '}';
    }
}
