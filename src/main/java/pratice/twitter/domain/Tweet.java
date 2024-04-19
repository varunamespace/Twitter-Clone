package pratice.twitter.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tweet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tweets;
    public Tweet(String tweets){
        this.tweets = tweets;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    User user;
}
