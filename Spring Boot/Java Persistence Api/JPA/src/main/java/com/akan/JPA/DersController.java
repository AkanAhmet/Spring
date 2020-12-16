package com.akan.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DersController {

    @Autowired
    private DersService dersService;

    @RequestMapping(method = RequestMethod.GET,value = "/dersler")
    public List<Ders> findAll() {
        return dersService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/dersler/{id}")
    public Ders findById(@PathVariable String id) {
        return dersService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/dersler")
    public void save(@RequestBody Ders ders) {
        dersService.save(ders);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/dersler")
    public void update(@RequestBody Ders ders) {
        dersService.update(ders);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/dersler/{id}")
    public void delete(@PathVariable String id) {
        dersService.delete(id);
    }
}
