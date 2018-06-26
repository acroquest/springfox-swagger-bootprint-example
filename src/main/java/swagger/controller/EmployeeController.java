package swagger.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import swagger.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> list() {
        // Return employee list
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody @Valid Employee employee) {
        // Add employee
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable Integer id,
            @RequestBody @Valid Employee employee) {
        // Update employee
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        // Delete employee
    }
}
