package br.com.suellenlima.pagination.controller;

import br.com.suellenlima.pagination.model.Post;
import br.com.suellenlima.pagination.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping
    List<Post> listPosts(Pageable pageable){
        return postService.listPost(pageable).getContent();
    }

}
