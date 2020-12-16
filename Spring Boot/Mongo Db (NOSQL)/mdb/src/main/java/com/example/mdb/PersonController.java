package com.example.mdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostConstruct
    public void deneme() {
        Person person = new Person(1,"Ahmet","AKAN");
        Person person1 = new Person(2,"Duman","AKAN");
        Person person2 = new Person(3,"Zıpzıp","AKAN");
        personService.save(person);
        personService.save(person1);
        personService.save(person2);

    }
    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

    @RequestMapping(value = "/people/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> findByName(@PathVariable String name){
        return ResponseEntity.ok(personService.findByName(name));
    }

//    @RequestMapping(value = "/people/{name}", method = RequestMethod.GET)
//    public ResponseEntity<List<Person>> findByNameLike(@PathVariable String name){
//        return ResponseEntity.ok(personService.findByNameLike(name));
//    }

//    @RequestMapping(value = "/people/{id}" , method = RequestMethod.GET)
//    public Person findById(@PathVariable Long id){
//        return personService.findById(id);
//    }

    @RequestMapping(value = "/people" , method = RequestMethod.POST)
    public void save(@RequestBody Person person){
        personService.save(person);
    }

    @RequestMapping(value = "/people/{id}" , method = RequestMethod.PUT)
    public void save(@RequestBody Person person, @PathVariable Long id){
        personService.update(person);
    }


    @RequestMapping(value = "/people/{id}", method =RequestMethod.DELETE )
    public void deleteById(@PathVariable Long id) {
        personService.deleteById(id);
    }

    @RequestMapping(value = "/people" , method = RequestMethod.DELETE)
    public void deleteAll() {
        personService.deleteAll();
    }

    @RequestMapping(value = "/people/exits/{id}" , method = RequestMethod.GET)
    public String exitsById(@PathVariable Long id) {
       if(personService.exitsById(id))
           return "Kişi Mevcut";
            return "Kişi mevcut değil";
    }
}
