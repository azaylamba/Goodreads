package com.relevel.goodreads.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating {

    @Id
    private long rating_id;
}
