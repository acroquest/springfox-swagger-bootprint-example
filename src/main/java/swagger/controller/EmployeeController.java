package swagger.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import swagger.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    public List<Employee> list() {
        // Return employee list
        return new ArrayList<>();
    }

    @PostMapping
    public void create(@RequestBody @Valid Employee employee) {
        // Add employee
    }

    @GetMapping("/{id}")
    public Employee get() {
        // Return employee
        return new Employee();
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable Integer id, @RequestBody @Valid Employee employee) {
        // Update employee
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        // Delete employee
    }
}
