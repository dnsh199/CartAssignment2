package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spring.model.*;
import spring.service.AddressService;
import spring.service.RoleService;
import spring.service.SongService;
import spring.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    AddressService addressService;
    @Autowired
    SongService songService;

    @GetMapping("/registration")
    public ModelAndView userRegistration(){
        ModelAndView modelAndView = new ModelAndView("registrationForm");
        modelAndView.addObject("address",new Address());
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
    @GetMapping("/saveNewUser")
    public ModelAndView saveNewUser(@ModelAttribute("user")User user,@ModelAttribute("address")Address address){
       User user1= save(user);
       address.setUserId(user1.getId());
       addressService.insertAddress(address);
        Role role = new Role();
        role.setUserId(user1.getId());
        role.setRole("USER");
        roleService.insertRole(role);
        return new ModelAndView("registrationSuccessful");
    }
    private User save(User user) {
        user.setActive(false);
        user.setStatus("Registered");
        userService.insertUser(user);
        return user;
    }
    @GetMapping(value = "/viewSongs/{userId}")
    public ModelAndView viewAllProducts(@PathVariable int customerId) {
        ModelAndView modelAndView = new ModelAndView("songList");
        List<Song> songList = songService.getAllSong();
        modelAndView.addObject(songList, songList);
        modelAndView.addObject("song", new Song());
        Basket basket = validateBasket(customerId);
        modelAndView.addObject("cart", cart);
        return modelAndView;
    }

}
