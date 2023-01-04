package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void probablyIWillThrowExceptionTest() {

        SecondChallenge secondChallenge = new SecondChallenge();

        assertAll (
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 3))
        );
    }
}
