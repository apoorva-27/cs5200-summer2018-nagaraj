package edu.northeastern.cs5200.cs5200summer2018nagaraj.controllers.hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<HelloObject, Integer> {

}
