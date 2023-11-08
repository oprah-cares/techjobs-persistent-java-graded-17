package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
    //TODO: DONE. EmployerRepository should extend CrudRepository
    // TODO: DONE. EmployerRepository should be annotated with @Repository

}
