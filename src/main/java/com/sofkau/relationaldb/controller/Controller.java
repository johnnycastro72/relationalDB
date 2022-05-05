package com.sofkau.relationaldb.controller;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;
import com.sofkau.relationaldb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class Controller {

    @Autowired
    private PostService service;

    @GetMapping
    public List<Post> getAllPosts(){
        return service.findAllPosts();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return service.createPost(post);
    }

    @PostMapping
    public Post createComment(@RequestBody Comment comment){
        return service.createComment(comment);
    }

    @DeleteMapping
    public void deletePost(@RequestBody Post post) {
        service.deletePost(post);
    }

    @DeleteMapping
    public void deleteComment(@RequestBody Comment comment) {
        service.deleteComment(comment);
    }
}
