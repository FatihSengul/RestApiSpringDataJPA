package com.fsengul.restapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address/")
public class AddressController {

    @GetMapping("getAddress")
    public String getAddress() {
        return "This is address of student";
    }
}
