package Controller;

import Repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @Autowired
    private userRepository userRepo;
}
