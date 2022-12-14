package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String role);

}