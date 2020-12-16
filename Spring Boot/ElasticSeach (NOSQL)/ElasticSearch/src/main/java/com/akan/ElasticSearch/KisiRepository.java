package com.akan.ElasticSearch;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KisiRepository extends ElasticsearchRepository<Kisi,String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"ad\": \"?0\"}}]}}") //Ad ile benzeyenleri bul
    List<Kisi> getByCustomQuery(String search);

    List<Kisi> findByAdLike(String search);
    List<Kisi> findByAdLikeOrSoyadLike(String search);
}
