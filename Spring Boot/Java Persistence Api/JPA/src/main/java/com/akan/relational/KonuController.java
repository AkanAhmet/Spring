package com.akan.relational;

import com.akan.JPA.Ders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KonuController {

    @Autowired
    KonuService konuService;

    @RequestMapping(value = "/dersler/{dersId}/konular", method = RequestMethod.GET)
    public List<Konu> findAll(@PathVariable String dersId) {
        return konuService.findAll(dersId);
    }

    @RequestMapping(value = "/dersler/{dersId}/konular/{id}", method = RequestMethod.GET)
    public Konu findById(@PathVariable String id) {
        return konuService.findById(id);
    }

    @RequestMapping(value = "/dersler/{dersId}/konular", method = RequestMethod.POST)
    public void save(@RequestBody Konu konu, @PathVariable String dersId) {
        konu.setDers(new Ders(dersId,"",""));
        konuService.save(konu);
    }
    @RequestMapping(value = "/dersler/{dersId}/konular/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Konu konu, @PathVariable String dersId, @PathVariable String id) {
        konu.setDers(new Ders(dersId,"",""));
        konuService.update(konu);
    }
    @RequestMapping(value = "/dersler/konular/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        konuService.delete(id);
    }
}
