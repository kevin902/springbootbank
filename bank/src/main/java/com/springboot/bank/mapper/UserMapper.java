package com.springboot.bank.mapper;

import com.springboot.bank.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface UserMapper {

    User findByUsername(@Param("username")String username);
}
