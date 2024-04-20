package pratice.twitter.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "tweets")
    private String tweets;

    public Tweet(String tweets){
        this.tweets = tweets;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonIgnore
    User user;
}
