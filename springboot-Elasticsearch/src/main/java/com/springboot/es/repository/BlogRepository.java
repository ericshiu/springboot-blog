package com.springboot.es.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.springboot.es.domain.Blog;

/**
 * Blog 存储库.
 * 
 * @since 1.0.0 2017年3月12日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface BlogRepository extends ElasticsearchRepository<Blog, String> {
	/**
	 * 根据用户名分页查询用户列表
	 * 
	 * @param name
	 * @param pageable
	 * @return
	 */
	Page<Blog> findByTitleLikeOrContentLike(String title, String content, Pageable pageable);
}
