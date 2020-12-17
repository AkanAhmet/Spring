package com.akan.PostgreSQL.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "kisi")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id]"})
@ToString
public class Kisi implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_kisi", allocationSize = 1) //PostgreSQL de Sequence kullanılmalı.
    @GeneratedValue(generator = "seq_kisi", strategy = GenerationType.SEQUENCE) // MYSQL DE AutoIncrement diyebiliriz !
    private long id;

    @Column(length = 100 , name = "adi")
    private  String adi;
    @Column(length = 100 , name = "soyadi")
    private  String soyadi;

    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> adresleri;



}
