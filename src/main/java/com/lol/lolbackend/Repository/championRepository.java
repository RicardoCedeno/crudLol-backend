package com.lol.lolbackend.Repository;

import com.lol.lolbackend.Entity.Champions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface championRepository extends JpaRepository<Champions, Integer> {
}
