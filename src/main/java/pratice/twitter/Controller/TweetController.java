package pratice.twitter.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pratice.twitter.domain.Tweet;
import pratice.twitter.service.TweetService;

@RestController
public class TweetController {
    private final TweetService service;
    public TweetController(TweetService service){
        this.service = service;
    }
    @PostMapping("/save/{tweet}")
    public void saveTweet(@PathVariable String tweet){
        Tweet tweet1 = new Tweet(tweet);
        service.saveTweet(tweet1);
    }
}
