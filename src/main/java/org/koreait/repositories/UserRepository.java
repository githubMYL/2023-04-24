package org.koreait.repositories;

import org.koreait.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserRepository extends JpaRepository<Users, Long>, QuerydslPredicateExecutor {
}
