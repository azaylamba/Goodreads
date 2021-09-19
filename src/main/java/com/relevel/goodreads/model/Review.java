package com.relevel.goodreads.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    private long review_id;
}
