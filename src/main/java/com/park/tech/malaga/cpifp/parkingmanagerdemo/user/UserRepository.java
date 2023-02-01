package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
