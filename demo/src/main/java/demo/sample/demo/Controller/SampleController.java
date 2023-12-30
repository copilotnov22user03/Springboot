
package demo.sample.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.sample.demo.Repository.Employee;
import demo.sample.demo.Repository.SampleRepository;

@RestController
public class SampleController {
    @Autowired
    private SampleRepository sampleRepository;


    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/employees")
    public String getAllEmployees() {
        return sampleRepository.getAllEmployees().toString();
    }

    @GetMapping("/employeesj")
    public List<Employee> getAllEmployeesj() {
        return sampleRepository.getAllEmployees();
    }





}
