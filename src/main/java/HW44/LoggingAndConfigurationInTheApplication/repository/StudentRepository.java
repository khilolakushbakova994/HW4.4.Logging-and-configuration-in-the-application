package HW44.LoggingAndConfigurationInTheApplication.repository;



import HW44.LoggingAndConfigurationInTheApplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findStudentByAge (int age);
    Collection<Student> findByAgeBetweenIgnoreCase(int min, int max);

}
