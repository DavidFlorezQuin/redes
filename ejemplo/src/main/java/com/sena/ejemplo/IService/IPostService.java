package com.sena.ejemplo.IService;

import com.sena.ejemplo.DTO.IUserDto;
import com.sena.ejemplo.Entity.Post;

import java.util.List;

public interface IPostService extends IBaseService<Post> {
    List<IUserDto> getList();

}
