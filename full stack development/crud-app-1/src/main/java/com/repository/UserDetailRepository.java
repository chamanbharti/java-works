package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.UserDetail;


@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long>{

}
