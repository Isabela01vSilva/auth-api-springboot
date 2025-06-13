package br.com.Isabela01vSilva.auth_api_security.repository;

import br.com.Isabela01vSilva.auth_api_security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}