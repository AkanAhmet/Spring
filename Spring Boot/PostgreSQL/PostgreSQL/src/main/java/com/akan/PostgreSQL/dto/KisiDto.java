package com.akan.PostgreSQL.dto;
import com.sun.istack.NotNull;
import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class KisiDto { // Entitylerimizi dışarıya direk açmak istemeyiz ,dto yoluyla açarız. Entitylerde esneklik kazandırır.

    private Long id;

    @NotNull
    private String adi;

    private String soyadi;

    private List<String> adresler;
}

