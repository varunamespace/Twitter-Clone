package pratice.twitter.service;

import org.springframework.stereotype.Service;
import pratice.twitter.domain.User;
import pratice.twitter.domain.UserRepository;

@Service
public class UserService {
    private UserRepository userRepo;
    public UserService(UserRepository userRepo){
        this.userRepo = userRepo;
    }
    public void saveUser(User user){
        userRepo.save(user);
    }
}
