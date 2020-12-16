package com.example.mdb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Konya")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {



    @Id
    private long id;
    private String name;
    private String surname;
}
