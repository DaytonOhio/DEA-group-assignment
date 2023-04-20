package com.workoutplanner.workoutplannerapp.coach;

import com.workoutplanner.workoutplannerapp.model.Coach;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author albertlusk
 */
@Repository
public interface CoachRepository extends JpaRepository<Coach, Long>{

    Optional<Coach> findByUsernameAndPassword(String username, String password);
}
