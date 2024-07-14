package com.manuelDev.LibraryApi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "publishers")
public class PublisherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "publisher_id_seq")
    private Long id;

    private String name;

    private String address;

    private String contactNumber;
}
