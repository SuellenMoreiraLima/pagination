package br.com.suellenlima.pagination.service;

import br.com.suellenlima.pagination.model.Post;
import br.com.suellenlima.pagination.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public PostService(PostRepository postRepository) {
    }

    public Page<Post> listPost(Pageable pageable){
        return postRepository.findAll(pageable);
    }
}
