package ua.home.projecttemplate.controller;

import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.home.projecttemplate.entity.CustomerEntity;
import ua.home.projecttemplate.service.CustomerService;

@CrossOrigin("*")
@RestController
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> createCustomer(
            @RequestBody CustomerEntity customer) {
        customerService.createCustomer(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(
                customerService.getAllCustomers(), HttpStatus.OK
        );
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getUserById(@PathVariable("userId") Long id) {
        return new ResponseEntity<>(
                customerService.getCustomerById(id), HttpStatus.OK
        );
    }
    @GetMapping("list")
    public ResponseEntity<?> getUsersByPage(@RequestParam(defaultValue = "0") int page)  {
        return new ResponseEntity<>(customerService.getCustomersByPage(page), HttpStatus.OK);
    }


    @DeleteMapping("{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable("userId") Long id) {
       customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<?> updateUser(
            @PathVariable("id") Long id,
            @RequestBody CustomerEntity customer
    ) {
        CustomerEntity customerUpdated= customerService.updateCustomer(id, customer);

        if (customerUpdated == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // 400
        }

        return new ResponseEntity<>(customerUpdated, HttpStatus.OK); // 200
    }

}
