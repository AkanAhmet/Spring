package com.akan.redis.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheSevice {

    @Cacheable(cacheNames = "myspecialcache") // Cacheable yapmadan sayfa f5 lenince 5 saniye bekliyordu artık beklemiyor! BİZ SPRING ÜZERİNDEN YONETTİK REDİS UZERİNDEN VEYA HIBERNATE UZERINDEN DE YONETİLEBİLİR !
   public String longRunningMethod() throws  InterruptedException {
       Thread.sleep(5000L);
        return " Mehod Çalıştı";
    }

    @CacheEvict(cacheNames = "myspecialcache") // Cache öldürmek için kullanılır !
    public void clearCache() {
        System.out.println("Cache Temizlendi!");
    }
}
