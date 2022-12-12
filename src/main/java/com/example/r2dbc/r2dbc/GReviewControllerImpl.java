package com.example.r2dbc.r2dbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;



@RestController
public class GReviewControllerImpl {
    
    @Autowired
    private GReviewRepository gReviewRepository;
    
    @GetMapping("/greview")
    public Flux<GReview> findAll(){
        return gReviewRepository.findAll();
    }
    
}
