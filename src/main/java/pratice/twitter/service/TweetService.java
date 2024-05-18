package pratice.twitter.service;

import org.springframework.stereotype.Service;
import pratice.twitter.domain.Tweet;
import pratice.twitter.domain.TweetRepository;
import pratice.twitter.domain.User;
import pratice.twitter.domain.UserRepository;
import pratice.twitter.dto.TweetDto;
import pratice.twitter.dto.UserDto;

import java.util.List;

@Service
public class TweetService{
    private final TweetRepository tweetRepository;
    private final UserRepository userRepository;

    public TweetService(TweetRepository tweetRepository, UserRepository userRepository){
        this.tweetRepository = tweetRepository;
        this.userRepository = userRepository;
    }
    public void saveTweet(TweetDto tweetDto){
        Tweet tweet = new Tweet();
        tweet.setUser(userRepository.findByUserName(tweetDto.getUser()));
        tweet.setTweets(tweetDto.getTweet());
        tweetRepository.save(tweet);
    }
    public List<Tweet> getTweetsByUserName(UserDto userDto){
        User user = userRepository.findByUserName(userDto.getUsername());
        return user.getTweets();
    }

    public List<Tweet> getAllTweets(){
        return tweetRepository.getAllTweets();
    }
}
