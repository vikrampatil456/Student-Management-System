package com.student.management.Repository;

import com.student.management.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Long> {

    boolean existsByUserName(String userName);

}
