package com.sena.ejemplo.Service;

import com.sena.ejemplo.Entity.Post;
import com.sena.ejemplo.IRepository.IBaseRepository;
import com.sena.ejemplo.IRepository.IPostRepository;
import com.sena.ejemplo.IService.IPostService;
import org.springframework.beans.factory.annotation.Autowired;

public class PostService extends ABaseService<Post> implements IPostService{
    @Override
    protected IBaseRepository<Post, Long> getRepository() {
        return null;
    }
    @Autowired
    private IPostRepository repository;

}
