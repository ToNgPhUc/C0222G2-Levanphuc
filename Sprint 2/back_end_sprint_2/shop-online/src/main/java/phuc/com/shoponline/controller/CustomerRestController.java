package phuc.com.shoponline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import phuc.com.shoponline.model.customer.Customer;
import phuc.com.shoponline.service.customer.ICustomerService;
@CrossOrigin
@RestController
public class CustomerRestController {
    @Autowired
    private ICustomerService iCustomerService;
    @GetMapping("/get/customer/{username}")
    public ResponseEntity<Customer> getCustomerByUsername(@PathVariable String username) {
        Customer customer = this.iCustomerService.getCustomerByUsername(username);
        if (customer == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
