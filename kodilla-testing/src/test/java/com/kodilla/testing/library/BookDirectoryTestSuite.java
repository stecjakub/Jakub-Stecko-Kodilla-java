package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Mock
    private LibraryDataBase libraryDataBaseMock;

    @Test
    public void testBookListWithConditionsReturnList(){
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List <Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamao", "AAA", 2000);
        Book book2 = new Book("Secretaries","BBB",2001);
        Book book3 = new Book("Secret life of programmers", "CCC",2002);
        Book book4 = new Book("Secrets of Java", "DDD",2003);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDataBaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        assertEquals(4,resultListOfBooks.size());

    }
    @Test
    public void testBookListWithConditionsMoreThan20(){
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDataBaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);

        List<Book> theListOf0Books = bookLibrary.listBooksWithCondition("Zero Books");
        List<Book> theListOf15Books = bookLibrary.listBooksWithCondition("Any Books");
        List<Book> theListOf40Books = bookLibrary.listBooksWithCondition("Forty Books");

        assertEquals(0,theListOf0Books.size());
        assertEquals(15,theListOf15Books.size());
        assertEquals(0,theListOf40Books.size());

    }
    @Test
    public void testBookListWithConditionsFragmentShorterThan3(){
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);

        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("Any String");

        assertEquals(0,theListOfBooks10.size());
        verify(libraryDataBaseMock,times(0)).listBooksWithCondition(anyString());

    }
    private List<Book> generateListOfNBooks (int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n<= booksQuantity; n++){
            Book theBook = new Book("Title"+n,"Author"+n,1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

}
