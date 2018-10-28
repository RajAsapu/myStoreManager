package com.mystoremanager.service.controllers;

import com.mystoremanager.service.dto.Store;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    @GetMapping
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("I am running!", HttpStatus.OK);
    }

    @GetMapping("/register")
    public String demo() {
        return "Store added";
    }

    /*
     * Service to register a store
     */
    @PostMapping("/register")
    public String registerStore(Store store) {
        return "Store added";
    }


    /*
     * Service to update store details
     */
    @PostMapping("/update")
    public String updateStoreDetails(Store store) {
        return "Update Store Details";
    }
}
