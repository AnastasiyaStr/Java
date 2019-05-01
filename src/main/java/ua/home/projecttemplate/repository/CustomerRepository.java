package ua.home.projecttemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.home.projecttemplate.entity.CustomerEntity;
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

}
