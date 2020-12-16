package com.akan.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DersService{

    @Autowired
    private DersRepository dersRepository;

    public List<Ders> findAll() {
        List T = new ArrayList();
        dersRepository.findAll().forEach(T::add);
        return T;
    }

    public Ders findById(String id) {
        return dersRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void save(Ders ders) {
        dersRepository.save(ders);
    }

    public void update(Ders ders) {
        dersRepository.save(ders);
    }


    public void delete(String id) {
        dersRepository.deleteById(id);
    }


}
