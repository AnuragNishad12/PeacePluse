package com.example.Model;

public class youtube {
    String name,link;

    public youtube(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public youtube() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
