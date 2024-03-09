package com.sena.ejemplo.IRepository;

import com.sena.ejemplo.DTO.IPostDto;
import com.sena.ejemplo.Entity.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepository extends IBaseRepository<Post, Long>{

    @Query(value = " SELECT  "
            + " id, "
            + " title as person "
            + "	FROM  "
            + "	post "
            + "	WHERE  "
            + " deleted_at IS NULL", nativeQuery = true)
    List<IPostDto> getList();

}
