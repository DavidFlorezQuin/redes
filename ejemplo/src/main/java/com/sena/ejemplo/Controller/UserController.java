package com.sena.ejemplo.Controller;


import com.sena.ejemplo.DTO.ApiResponseDto;
import com.sena.ejemplo.DTO.IUserDto;
import com.sena.ejemplo.Entity.User;
import com.sena.ejemplo.IService.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")

public class UserController extends ABaseController<User, IUserService>{
        public UserController(IUserService service) {
        super(service, "User");
    }

}
