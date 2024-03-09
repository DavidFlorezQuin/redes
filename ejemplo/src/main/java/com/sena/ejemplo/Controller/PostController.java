package com.sena.ejemplo.Controller;

import com.sena.ejemplo.Entity.Post;
import com.sena.ejemplo.IService.IPostService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/post")

public class PostController extends ABaseController<Post, IPostService> {

    public PostController(IPostService service) {
        super(service, "Post");
    }
}
