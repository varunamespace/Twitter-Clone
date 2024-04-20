package pratice.twitter.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet,Long> {
//    @Query(value = "SELECT * FROM tweet WHERE  ")
//    Tweet findByUserName(String name);
}
