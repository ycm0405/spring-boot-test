package com.plumblum.repository;

import com.plumblum.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: cpb
 * @Date: 2018/8/7 20:07
 * @Description:
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
}
