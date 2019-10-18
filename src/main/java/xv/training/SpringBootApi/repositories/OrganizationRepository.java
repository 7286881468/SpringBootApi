package xv.training.SpringBootApi.repositories;

import org.springframework.data.repository.CrudRepository;

import xv.training.SpringBootApi.entities.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, Long>{

}
