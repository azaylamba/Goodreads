package com.relevel.goodreads.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private long book_id;
}
