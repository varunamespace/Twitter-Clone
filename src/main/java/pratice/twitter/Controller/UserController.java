package pratice.twitter.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pratice.twitter.domain.Tweet;
import pratice.twitter.domain.User;
import pratice.twitter.domain.UserRepository;
import pratice.twitter.dto.TweetDto;
import pratice.twitter.dto.UserDto;
import pratice.twitter.service.TweetService;
import pratice.twitter.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService uService;
    private final UserRepository userRepository;

    @PostMapping("/user/{name}")
    public void createUser(@PathVariable String name){
        User user = new User(name);
        uService.saveUser(user);
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody UserDto userDto){
        User user = new User();
        user.setUserName(userDto.getUsername());
        uService.saveUser(user);
    }
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return uService.getAllUsers();
    }

    @GetMapping("/getTweets/{name}")
    public List<Tweet> getAllTweetsByUser(@PathVariable String name){
        User user = userRepository.findByUserName(name);
        System.out.println(user.getId());
        return uService.showAllTweets(user);
    }
}
