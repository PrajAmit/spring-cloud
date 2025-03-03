package com.howtodoinjava.feign.client;

import java.util.List;

import com.howtodoinjava.feign.dto.Post;

import feign.RequestLine;

//@FeignClient(value = "postsFeignClient", url = "https://jsonplaceholder.typicode.com/")
public interface PostsFeignClient {

	@RequestLine("GET /posts")
	//@RequestMapping(method = RequestMethod.GET, value = "/posts")
	List<Post> getPosts();
}
