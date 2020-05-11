package com.arun.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

//@Controller
@RestController
public class CityController {
    @Autowired
    CityRepository cityRepository;

    //     Get
//    @GetMapping("/city")
    @RequestMapping("/city")
    public List<City> getAllCity(){
        return cityRepository.findAll();
    }
//    public ResponseEntity<Optional<City>> findCityById() {
//        return ResponseEntity.ok(cityRepository.findById(40));
//
//    }
// Create a new Note
    @PostMapping("/city/post")
    public City createCity(@Valid @RequestBody City city) {
    return cityRepository.save(city);
    }
}