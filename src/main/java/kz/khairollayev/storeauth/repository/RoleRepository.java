package kz.khairollayev.storeauth.repository;

import kz.khairollayev.storeauth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}