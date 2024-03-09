package com.sena.ejemplo.Service;


import com.sena.ejemplo.Entity.User;
import com.sena.ejemplo.IRepository.IBaseRepository;
import com.sena.ejemplo.IRepository.IUserRepository;
import com.sena.ejemplo.IService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService extends ABaseService<User> implements IUserService{
    @Override
    protected IBaseRepository<User, Long> getRepository() {
        return null;
    }

    @Autowired
    private IUserRepository repository;


}
