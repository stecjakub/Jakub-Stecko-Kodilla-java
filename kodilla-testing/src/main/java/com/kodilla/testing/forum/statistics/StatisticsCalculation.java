package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers > 0) {
            averagePostsPerUser = numberOfPosts / numberOfUsers;
            averageCommentsPerUser = numberOfComments / numberOfUsers;
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        }
        if (numberOfPosts > 0)
            averageCommentsPerPost = numberOfComments / numberOfPosts;
        else
            averageCommentsPerPost = 0;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
    public void showStatistics() {
        System.out.println("NumberOfUsers = " + numberOfUsers);
        System.out.println("NumberOfPosts = " + numberOfPosts);
        System.out.println("NumberOfComments = " + numberOfComments);
        System.out.println("AveragePostPerUser = " + averagePostsPerUser);
        System.out.println("AverageCommentsPerUser = " + averageCommentsPerUser);
        System.out.println("AverageCommentsPerPost = " + averageCommentsPerPost);

    }
}
