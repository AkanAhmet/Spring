package com.akan.relational;

import com.akan.JPA.Ders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Konu {

    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    private Ders ders;

    public Konu(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ders = new Ders(topicId,"","");
    }
}
