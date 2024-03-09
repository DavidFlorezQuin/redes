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


    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     * @param entityName The name of the entity.
     */
    protected PostController(IPostService service, String entityName) {
        super(service, entityName);
    }
}
