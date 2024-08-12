package br.com.suellenlima.pagination;

import br.com.suellenlima.pagination.model.Post;
import br.com.suellenlima.pagination.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PaginationApplicationTests {

    @Autowired
    PostService postService;

    static final Post POST_0 =
            new Post(1l, "Vamos aprender mais de paginação", "@suellenlima");
    static final Post POST_1 =
            new Post(2l, "Conhecendo mais de spring", "@suellenlima");

    @Test
    void testListPostPaginated() {
        Pageable pageable = PageRequest.of(0, 2);
        Page<Post> pagePost = postService.listPost(pageable);

        assertEquals(2, pagePost.getContent().size());
        assertEquals(POST_0, pagePost.getContent().get(0));
        assertEquals(POST_1, pagePost.getContent().get(1));
    }

}
