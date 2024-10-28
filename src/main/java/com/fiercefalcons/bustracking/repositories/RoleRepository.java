package com.fiercefalcons.bustracking.repositories;
import com.fiercefalcons.bustracking.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
