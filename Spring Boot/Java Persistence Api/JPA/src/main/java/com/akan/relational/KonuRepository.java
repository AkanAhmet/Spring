package com.akan.relational;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KonuRepository extends JpaRepository<Konu,String> {
    public List<Konu> findByDersId(String dersId);
}
