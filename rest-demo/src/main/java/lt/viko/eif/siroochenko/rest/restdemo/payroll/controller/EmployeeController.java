package lt.viko.eif.siroochenko.rest.restdemo.payroll.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lt.viko.eif.siroochenko.rest.restdemo.payroll.db.EmployeeRepository;
import lt.viko.eif.siroochenko.rest.restdemo.payroll.exception.EmployeeNotFoundExeption;
import lt.viko.eif.siroochenko.rest.restdemo.payroll.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Tag(name = "Employee Controller")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping
    public List<Employee> all() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee one (@PathVariable Long id){
        try{
            Employee employee = repository.findById(id).orElseThrow(() -> new EmployeeNotFoundExeption(id));
            return employee;
        }catch (EmployeeNotFoundExeption ex){
            return  null;
        }
    }
}
