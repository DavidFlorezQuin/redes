package com.sena.ejemplo.IRepository;

import com.sena.ejemplo.Entity.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepository extends IBaseRepository<Post, Long>{
}
