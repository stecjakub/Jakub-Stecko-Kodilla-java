package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double averagePostsUser;
    private double averageCommentsUser;
    private double averageCommentsPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers > 0) {
            averagePostsUser = numberOfPosts / numberOfUsers;
            averageCommentsUser = numberOfComments / numberOfUsers;
        } else {
            averagePostsUser = 0;
            averageCommentsUser = 0;
        }
        if (numberOfPosts > 0)
            averageCommentsPost = numberOfComments / numberOfPosts;
        else
            averageCommentsPost = 0;
    }

    public double getAveragePostsUser() {
        return averagePostsUser;
    }

    public double getAverageCommentsUser() {
        return averageCommentsUser;
    }

    public double getAverageCommentsPost() {
        return averageCommentsPost;
    }
    public void showStatistics() {
        System.out.println("NumberOfUsers = " + numberOfUsers);
        System.out.println("NumberOfPosts = " + numberOfPosts);
        System.out.println("NumberOfComments = " + numberOfComments);
        System.out.println("AveragePostPerUser = " + averagePostsUser);
        System.out.println("AverageCommentsPerUser = " + averageCommentsUser);
        System.out.println("AverageCommentsPerPost = " + averageCommentsPost);
    }
}
