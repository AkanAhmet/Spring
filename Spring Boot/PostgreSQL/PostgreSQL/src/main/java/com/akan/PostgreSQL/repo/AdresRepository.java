package com.akan.PostgreSQL.repo;

import com.akan.PostgreSQL.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepository extends JpaRepository<Adres,Long> { // CRUD ve PagingAndSorting alternatifleride var. En geniş kapsamlı olanı JPARepo
}
