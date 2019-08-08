package com.whereToWatch.WhereToWatch.repos;

import com.whereToWatch.WhereToWatch.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

public interface UserRepo extends JpaRepository<User, Integer> {

        boolean existsByUsername(String username);

        User findByUsername(String username);

        @Transactional
        void deleteByUsername(String username);

    }
