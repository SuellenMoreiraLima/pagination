package br.com.suellenlima.pagination.repository;

import br.com.suellenlima.pagination.model.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
