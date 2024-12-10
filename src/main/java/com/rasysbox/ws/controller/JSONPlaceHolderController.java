package com.rasysbox.ws.controller;

import com.rasysbox.ws.service.JSONPlaceHolderClient;
import com.rasysbox.ws.model.Post;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/json-placeholder")
public class JSONPlaceHolderController {
    private final static Logger log = org.slf4j.LoggerFactory.getLogger(JSONPlaceHolderController.class);

    private final JSONPlaceHolderClient jsonPlaceHolderClient;

    public JSONPlaceHolderController(JSONPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts() {
        List<Post> posts = jsonPlaceHolderClient.getPosts();
        if (posts.isEmpty()) {
            log.warn("No posts found");
            return ResponseEntity.noContent().build();
        }
        log.info("Returning {} posts", posts.size());
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/get-post-by-id/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        Post post = jsonPlaceHolderClient.getPostById(id);
        if (post == null) {
            log.warn("Post with id {} not found", id);
            return ResponseEntity.notFound().build();
        }
        log.info("Returning post with id {}", id);
        return ResponseEntity.ok(post);
    }
}
