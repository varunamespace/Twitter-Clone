package pratice.twitter.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pratice.twitter.domain.Tweet;
import pratice.twitter.domain.User;
import pratice.twitter.domain.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;

    public void saveUser(User user)
    {
        userRepo.save(user);

    }

    public List<User> getAllUsers()
    {
        return userRepo.findAll();

    }

    public List<Tweet> showAllTweets(User user){
        if(user==null){
            System.out.println("its empty");
            return null;
        }
        Long userId = user.getId();
        return userRepo.getAllTweetsByUser(userId);
    }


}
