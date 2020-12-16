package com.akan.ElasticSearch;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RestController
@RequiredArgsConstructor /*  ==> private !final! olması için bu anotasyon eklenir */
public class KisiController {


    @Autowired
    private final KisiRepository kisiRepository;

    /*
    @RequestMapping(value = "/kisi/{search}" ,method = RequestMethod.GET)
    public ResponseEntity<List<Kisi>> searchKisi(@PathVariable String search) {
        List<Kisi> kisiler = kisiRepository.getByCustomQuery(search);
        return ResponseEntity.ok(kisiler);
    }  */

    @RequestMapping(value = "/kisi/{search}", method = RequestMethod.GET)
    public ResponseEntity<List<Kisi>> search(@PathVariable String search) {
        List<Kisi> kisiList = kisiRepository.findByAdLike(search);
          return ResponseEntity.ok(kisiList);
    }


    @PostConstruct
    public void init() {
    Kisi kisi = new Kisi();
    kisi.setAd("Ahmet");
    kisi.setSoyad("AKAN");
    kisi.setAdres("Türkiye");
    kisi.setId("0001");
    kisi.setDogumTarihi(Calendar.getInstance().getTime());
    kisiRepository.save(kisi);

    }
}
