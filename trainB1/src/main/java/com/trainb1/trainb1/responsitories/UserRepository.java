package com.trainb1.trainb1.responsitories;

import com.trainb1.trainb1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByFirstName(String firstName);
}
