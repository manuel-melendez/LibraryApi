package com.manuelDev.LibraryApi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.print.Book;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    private Long Id;

    private String firstName;

    private String LastName;

    private Date birthDate;

    @OneToMany(mappedBy = "authorEntity", cascade = CascadeType.ALL)
    private List<BookEntity> books = new ArrayList<BookEntity>();


}
