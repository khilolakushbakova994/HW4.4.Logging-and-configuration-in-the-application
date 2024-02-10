package HW44.LoggingAndConfigurationInTheApplication.repository;





import HW44.LoggingAndConfigurationInTheApplication.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findFacultyByColorOrNameContainsIgnoreCase  (String color, String name);
    Collection<Faculty>findFacultyByNameIgnoreCase (String name);
    Collection<Faculty>findFacultyByColorIgnoreCase (String color);




}

