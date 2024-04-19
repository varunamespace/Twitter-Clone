package pratice.twitter.service;

import org.springframework.stereotype.Service;
import pratice.twitter.domain.Tweet;
import pratice.twitter.domain.TweetRepository;
@Service
public class TweetService{
    private TweetRepository tweetRepository;
    public TweetService(TweetRepository tweetRepository){
        this.tweetRepository = tweetRepository;
    }
    public void saveTweet(Tweet tweet){
        tweetRepository.save(tweet);
    }
}
