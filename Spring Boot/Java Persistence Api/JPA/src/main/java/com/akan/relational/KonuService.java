package com.akan.relational;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class KonuService {

    @Autowired
    KonuRepository konuRepository;

    public List<Konu> findAll(String dersId) {
        List T = new ArrayList();
        konuRepository.findByDersId(dersId).forEach(T::add);
        return T;
    }

    public Konu findById(String id) {
        return konuRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void save(Konu konu) {
        konuRepository.save(konu);
    }

    public void update(Konu konu) {
    }

    public void delete(String id) {
        konuRepository.deleteById(id);
    }
}
