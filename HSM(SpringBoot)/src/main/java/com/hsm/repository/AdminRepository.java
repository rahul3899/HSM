package com.hsm.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.hsm.model.Admin;
@Component
public interface AdminRepository extends JpaRepository<Admin, String>{
		public	Admin findByUsername(String username);
		public	Admin findByPassword(String password);

}
