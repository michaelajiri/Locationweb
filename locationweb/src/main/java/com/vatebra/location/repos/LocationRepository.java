package com.vatebra.location.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vatebra.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
