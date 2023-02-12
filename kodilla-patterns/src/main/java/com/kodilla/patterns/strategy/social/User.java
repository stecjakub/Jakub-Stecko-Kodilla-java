package com.kodilla.patterns.strategy.social;

public class User {
    public String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String predict(){
        return socialPublisher.share();
    }
    public void setSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
