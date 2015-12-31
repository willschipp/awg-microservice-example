package com.emc.awg.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="/department")
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
