package pratice.twitter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pratice.twitter.domain.Tweet;
import pratice.twitter.domain.User;
import pratice.twitter.dto.TweetDto;
import pratice.twitter.dto.UserDto;
import pratice.twitter.service.TweetService;
import pratice.twitter.service.UserService;

@RestController
public class UserController {
    private UserService uService;
    private TweetService tweetService;
    public UserController(UserService uService,TweetService tweetService){
        this.uService = uService;
        this.tweetService = tweetService;
    }
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
}
