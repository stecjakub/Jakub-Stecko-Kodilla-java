package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Mobile Phone");
        Item item1 = new Item(new BigDecimal(1000),1,new BigDecimal(500));
        productDao.save(product1);
        product1.getItems().add(item1);
        item1.setProduct(product1);
        Invoice invoice1 = new Invoice("Invoice number 1");
        invoice1.getItems().add(item1);
        item1.setInvoice(invoice1);

        //When
        productDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
        assertEquals(0,invoice1Id);

        //CleanUp
        productDao.deleteAll();
    }
}
