package com.kodilla.stream.forumuser;

import java.util.ArrayList;

public class ForumUser {
    private final int iD;
    private final String username;
    private final char sex;
    private final int dateOfBirth;
    private final int numberOfPublishedPost;

    public ForumUser(final int iD, final String username, final char sex, final int dateOfBirth, final int numberOfPublishedPost) {
        this.iD = iD;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPublishedPost = numberOfPublishedPost;
    }

    public int getiD() {
        return iD;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPublishedPost() {
        return numberOfPublishedPost;
    }

    @Override
    public String toString() {
        return "ID: " + iD + "\n" + "Username: " + username + "\n" + "Sex: " + sex + "\n" + "Date of birth: " + dateOfBirth + "\n" + "Number of published post: " + numberOfPublishedPost + "\n";
    }
}

