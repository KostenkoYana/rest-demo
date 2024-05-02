package lt.viko.eif.siroochenko.rest.restdemo.payroll.db;

import lt.viko.eif.siroochenko.rest.restdemo.payroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
