package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int iD;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPublishedPost;

    public ForumUser( int iD,  String username,  char sex,  LocalDate dateOfBirth, int numberOfPublishedPost) {
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

    public LocalDate getDateOfBirth() {
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
