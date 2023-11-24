package ro.itschool.project.models.entities;

import lombok.Data;

@Data
public class Book {

    private String title;
    private String author;
    private Double price;
    private long id;
}