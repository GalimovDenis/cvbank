package org.telran.cvbank.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cv")
public class CVController {

    @PostMapping("create/")
    public void createCV(){

    }

    @PostMapping("update/")
    public void updateCV(){

    }

    @PostMapping("get/")
    public void getCV(){

    }

    @PostMapping("delete/")
    public void deleteCV(){

    }
}
