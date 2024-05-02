package lt.viko.eif.siroochenko.rest.restdemo.payroll.exception;

public class EmployeeNotFoundExeption extends RuntimeException {
    public EmployeeNotFoundExeption(Long id){
        super("Could not find  employee " + id);
    }
}
