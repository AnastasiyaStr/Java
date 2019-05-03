package ua.home.projecttemplate.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.home.projecttemplate.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    void createCustomer (CustomerEntity customer);
    CustomerEntity updateCustomer(Long id, CustomerEntity customer);
    List<CustomerEntity> getAllCustomers ();
    CustomerEntity deleteCustomer (Long id);
    CustomerEntity getCustomerById(Long id);
   Page<CustomerEntity> getCustomersByPage(int page);
   void addImageToCustomer(Long id, String fileName);
}
