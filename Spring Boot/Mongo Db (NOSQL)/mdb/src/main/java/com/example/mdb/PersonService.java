package com.example.mdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }
    public Person findById(Long id) { return personRepository.findById(id).orElseThrow(RuntimeException::new); }
    public void save(Person person) { personRepository.save(person); }
    public void deleteById(Long id) { personRepository.deleteById(id);}
    public void deleteAll() {personRepository.deleteAll(); }
    public Boolean exitsById(Long id) { return personRepository.existsById(id); }
    public void update(Person person) { personRepository.save(person); }

    public List<Person> findByName(String name) {
        return personRepository.findByName(name);
    }

    public List<Person> findByNameLike(String name) {
        return personRepository.findByNameLike(name);
    }
}
