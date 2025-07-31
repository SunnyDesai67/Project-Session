package com.training.Mapping;

import com.training.Mapping.entities.Post;
import com.training.Mapping.entities.User;
import com.training.Mapping.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setId(1);
		user.setName("sai");

		Post post1 = new Post();
		post1.setId(100);
		post1.setContent("Content Image");
		post1.setUser(user);

		Post post2 = new Post();
		post2.setId(200);
		post2.setContent("Content Video");
		post2.setUser(user);

		Post post3 = new Post();
		post3.setId(300);
		post3.setContent("Content GIF");
		post3.setUser(user);

		List<Post> postList = List.of(post1,post2, post3);

		user.setPostList(postList);
		userRepository.save(user);





	}
}
