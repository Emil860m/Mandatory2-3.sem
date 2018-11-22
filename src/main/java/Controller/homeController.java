package Controller;

import Repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import model.*;



@Controller
public class homeController {
    @Autowired
    private userRepository userRepo;
}
