package com.akan.redis.api;

import com.akan.redis.service.RedisCacheSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisCacheController
{
    private  int sayac = 0;

    @Autowired
    private RedisCacheSevice redisCacheSevice;


    @RequestMapping( value = "/test", method = RequestMethod.GET)
        public  String cacheControl() throws InterruptedException {
        if(sayac==5) {
            redisCacheSevice.clearCache();
            sayac = 0;
        }
        sayac++;
        return redisCacheSevice.longRunningMethod();
        }



}
