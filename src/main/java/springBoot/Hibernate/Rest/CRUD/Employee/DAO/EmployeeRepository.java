package springBoot.Hibernate.Rest.CRUD.Employee.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springBoot.Hibernate.Rest.CRUD.Employee.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
