package pratice.twitter.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pratice.twitter.service.UserService;

import java.util.List;

@Entity
@Table(name = "xuser")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String userName;
    public User(String userName){
        this.userName = userName;
    }
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Tweet> tweets;
}
