package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){
        //Given
        Book book1 = new Book("The Alchemist","Paulo Coelho", LocalDate.of(1988,1,2));
        Book book2 = new Book("The Da Vinci Code", "Dan Brown", LocalDate.of(2003,2,3));
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupery", LocalDate.of(1943,11,8));

        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowClone();
            clonedLibrary.setName("Cloned Library");
        }catch (CloneNotSupportedException e) {
            System.out.println("Exception" + e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            clonedLibrary.setName("Deep Cloned Library");
        }catch(CloneNotSupportedException e){
            System.out.println("Exception2" + e);
        }
        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assertions.assertEquals(2,library.getBooks().size());
        Assertions.assertEquals(2,clonedLibrary.getBooks().size());
        Assertions.assertEquals(3,deepClonedLibrary.getBooks().size());
        Assertions.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assertions.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());

    }
}
