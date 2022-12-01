package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDataBase {
    List<String> listBooksWithCondition(String titleFragment);

    List<String> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentABook(LibraryUser libraryUser, Book book);

    int returnBooks(LibraryUser libraryUser);

}
