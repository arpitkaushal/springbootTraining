package com.sbtrain.assgn;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/flights")
    public ResponseEntity<?> getAvailableFlights() {
        return ResponseEntity.ok().body("Working");
    }

    
    
    
}
