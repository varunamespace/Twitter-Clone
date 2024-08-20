package pratice.twitter.Controller;

import org.springframework.web.bind.annotation.*;
import pratice.twitter.domain.Tweet;
import pratice.twitter.domain.User;
import pratice.twitter.dto.TweetDto;
import pratice.twitter.dto.UserDto;
import pratice.twitter.service.TweetService;

import java.util.List;

@RestController
public class TweetController {
    private final TweetService service;
    public TweetController(TweetService service){
        this.service = service;
    }

    @GetMapping("/getTweetsByUsername")
    public List<Tweet> getTweetsByUsername(@RequestBody UserDto userDto){
        return service.getTweetsByUserName(userDto);
    }

    @GetMapping("/getAllTweets")
    public List<Tweet> getAllTweets(){
        return service.getAllTweets();
    }

    @PostMapping("/saveTweet")
    public void saveTweet(@RequestBody TweetDto tweetDto){
        service.saveTweet(tweetDto);
    }
}
