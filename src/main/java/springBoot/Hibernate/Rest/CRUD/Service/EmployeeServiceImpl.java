package springBoot.Hibernate.Rest.CRUD.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import springBoot.Hibernate.Rest.CRUD.Employee.Employee;

import springBoot.Hibernate.Rest.CRUD.Employee.DAO.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	
	private EmployeeRepository employeeRepository;

	@Override

	public List<Employee> findAll() {

		return employeeRepository.findAll();
	}

	@Override

	public Employee findById(int theId) {

		Optional<Employee> result = employeeRepository.findById(theId);
		Employee theEmployee = null;
		if (result.isPresent()) {
			theEmployee=result.get();
	}
		else {
			throw new RuntimeException("Did not find employee id -" +theId);
		}
		return theEmployee;
	}

	@Override

	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);

	}

	@Override

	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);

	}

}
