package com.sena.ejemplo.IRepository;

import com.sena.ejemplo.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends IBaseRepository<User,Long>{

}
