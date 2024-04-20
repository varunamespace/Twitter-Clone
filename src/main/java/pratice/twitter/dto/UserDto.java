package pratice.twitter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pratice.twitter.domain.Tweet;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
    private String username;
    private List<Tweet> tweets;
}
