package com.akan.PostgreSQL.controller;

import com.akan.PostgreSQL.KisiService;
import com.akan.PostgreSQL.dto.KisiDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class KisiController {

    private final KisiService kisiService;

    @RequestMapping(value = "/kisi" ,method = RequestMethod.POST)
    public ResponseEntity<KisiDto> kaydet (@RequestBody  KisiDto kisiDto) {
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }

    @RequestMapping(value = "/kisi" ,method = RequestMethod.GET)
    public ResponseEntity<List<KisiDto>> tumunuListele () {
        return ResponseEntity.ok(kisiService.getAll());
    }
}

