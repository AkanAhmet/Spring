package com.akan.PostgreSQL.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "kisiadres")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of= {"id"}) // Hashcode ları eşitse id leri de eşittir.
@ToString
public class Adres implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_kisi_adresi", allocationSize = 1) //PostgreSQL de Sequence kullanılmalı.
    @GeneratedValue(generator = "seq_kisi_adres", strategy = GenerationType.SEQUENCE) // MYSQL DE AutoIncrement diyebiliriz !
    private long id;
    @Column(length = 500, name = "adres")// Bir sürü özellik değiştiriliebilir, gözat !
    private String adres;
    @Enumerated
    private AdresTip adresTip;
    @Column(name = "aktif")
    private Boolean aktif;

    @ManyToOne // Fetch = EAGER - LAZY araştır !
    @JoinColumn(name = "kisi_adres_id")
    private Kisi kisi;

    public enum AdresTip {
        EV_ADRESI,
        IS_ADRESI,
        DIGER
    }
}
