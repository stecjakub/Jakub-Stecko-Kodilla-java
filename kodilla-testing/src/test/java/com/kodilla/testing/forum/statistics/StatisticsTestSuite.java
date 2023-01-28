package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    @Mock
    private Statistics statistics;

    private List<String> generateUsernames(int number) {
        List<String> userNames = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String userName = "User " + i;
            userNames.add(userName);
        }
        return userNames;
    }

    private void mockStatistics(int numberOfUsers, int numberOfPosts, int numberOfComments) {
        when(statistics.usersNames()).thenReturn(generateUsernames(numberOfUsers));
        when(statistics.postsCount()).thenReturn(numberOfPosts);
        when(statistics.commentsCount()).thenReturn(numberOfComments);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestsForPosts {
        @Test
        public void testIfPosts0() {
            //Given
            StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
            mockStatistics(2, 0, 0);
            statisticsCalculation.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(0, statisticsCalculation.getAverageCommentsPerPost(),0.1);
            assertEquals(0, statisticsCalculation.getAveragePostsPerUser(), 0.1);
            assertEquals(0,statisticsCalculation.getAverageCommentsPerUser(),0.1);
        }

        @Test
        public void testIfPosts1000() {
            //Given
            StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
            mockStatistics(250, 1000, 2000);
            statisticsCalculation.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(8, statisticsCalculation.getAverageCommentsPerUser(), 0.1);
            assertEquals(4, statisticsCalculation.getAveragePostsPerUser(), 0.1);
            assertEquals(2,statisticsCalculation.getAverageCommentsPerPost(),0.1);
        }
    }
    @Nested
    @DisplayName("Tests for comments")
    class TestsForComments {
        @Test
        public void testIfComments0() {
            //Given
            StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
            mockStatistics(4, 10, 0);
            statisticsCalculation.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(0, statisticsCalculation.getAverageCommentsPerPost(), 0.1);
            assertEquals(2.5, statisticsCalculation.getAveragePostsPerUser(), 0.1);
            assertEquals(0,statisticsCalculation.getAverageCommentsPerUser(),0.1);
        }
        @Test
        public void testIfCommentsLessThanPosts() {
            //Given
            StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
            mockStatistics(4, 10, 5);
            statisticsCalculation.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(0.5, statisticsCalculation.getAverageCommentsPerPost(), 0.1);
            assertEquals(1.25, statisticsCalculation.getAverageCommentsPerUser(), 0.01);
            assertEquals(2.5,statisticsCalculation.getAveragePostsPerUser(),0.1);
        }

        @Test
        public void testIfCommentsMoreThanPosts() {
            //Given
            StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
            mockStatistics(4, 10, 15);
            statisticsCalculation.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(1.5, statisticsCalculation.getAverageCommentsPerPost(), 0.1);
            assertEquals(3.75, statisticsCalculation.getAverageCommentsPerUser(), 0.01);
            assertEquals(2.5,statisticsCalculation.getAveragePostsPerUser(),0.1);
        }
    }
    @Nested
    @DisplayName("Tests for users")
    class TestsForUsers {
        @Test
        public void testIfUsers0() {
            //Given
            StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
            mockStatistics(0, 0, 0);
            statisticsCalculation.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(0, statisticsCalculation.getAverageCommentsPerPost(), 0.1);
            assertEquals(0, statisticsCalculation.getAverageCommentsPerUser(), 0.01);
            assertEquals(0,statisticsCalculation.getAveragePostsPerUser(),0.1);

        }

        @Test
        public void testIfUsers100() {
            //Given
            StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
            mockStatistics(100, 500, 2000);
            statisticsCalculation.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(20, statisticsCalculation.getAverageCommentsPerUser(), 0.1);
            assertEquals(4, statisticsCalculation.getAverageCommentsPerPost(), 0.1);
            assertEquals(5, statisticsCalculation.getAveragePostsPerUser(), 0.1);
        }
    }

}
