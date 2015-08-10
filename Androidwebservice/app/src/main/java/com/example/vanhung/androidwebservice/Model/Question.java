package com.example.vanhung.androidwebservice.Model;

import java.util.List;

/**
 * Created by vanhung on 10/08/2015.
 */
public class Question {
    private Integer id;
    private String content;
    private List<Anwser>answers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Anwser> getAnwsers() {
        return answers;
    }

    public void setAnwsers(List<Anwser> anwsers) {
        this.answers = anwsers;
    }
}
