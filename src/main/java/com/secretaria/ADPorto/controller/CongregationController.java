package com.secretaria.ADPorto.controller;


import com.secretaria.ADPorto.entity.Member;
import com.secretaria.ADPorto.service.CongregationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/ADPorto")

public class CongregationController {


        @Autowired
        private CongregationService congregationService;

        @PostMapping("/congregacao")
        public String saveCongregationMember(@RequestBody Member member) throws ExecutionException, InterruptedException {

            return congregationService.saveCongregationMember( member);
        }


}
