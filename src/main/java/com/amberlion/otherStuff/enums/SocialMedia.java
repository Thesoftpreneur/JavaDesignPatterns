package com.amberlion.otherStuff.enums;

public enum SocialMedia {
    facebook("facebook.com", "5"),
    instagram("instagram.com", "4"),
    twitter("twitter.com", "4");

    private String link;
    private String rate;

    private SocialMedia(String link, String rate) {
        this.link = link;
        this.rate = rate;
    }

    public String getLink() {
        return link;
    }
}
