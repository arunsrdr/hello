package com.arun.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface  CityRepository extends JpaRepository<City, Integer> {
//
//    Optional<City> findById(Integer id);
//}
public interface CityRepository extends JpaRepository<City, Long> {
}