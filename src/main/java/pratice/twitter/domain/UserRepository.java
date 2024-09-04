package pratice.twitter.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select * from xuser where username = ?1", nativeQuery = true)
    User findByUserName(String name);
    Optional<User> findByEmail(String email);
}
