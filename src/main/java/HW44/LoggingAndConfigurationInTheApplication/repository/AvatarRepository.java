package HW44.LoggingAndConfigurationInTheApplication.repository;



import HW44.LoggingAndConfigurationInTheApplication.model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {

}