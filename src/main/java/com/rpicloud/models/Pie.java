package com.rpicloud.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by kaspernissen on 11/02/2016.
 */
@Entity
public class Pie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String author;

    public Pie(String name, String description, String author) {
        this.name = name;
        this.description = description;
        this.author =author;
    }

    //for JPA
    public Pie() {
        new Pie("Test", "Test desc","Test author");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }
}
