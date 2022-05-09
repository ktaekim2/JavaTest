package day31_20220429_03;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {

	static List<PostDTO> postList = new ArrayList<>();

	// 1.PostRepository postSave()
	public boolean save(PostDTO newPost) {
		return postList.add(newPost);
	}

	// 2.PostRepository postFindAll()
	public List<PostDTO> postFindAll() {
		return postList;
	}

	// 3.PostRepository postFindById()
	public PostDTO postFindById(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id == postList.get(i).getId()) {
				int postHits = postList.get(i).getPostHits();
				postList.get(i).setPostHits(++postHits);
				return postList.get(i);
			}
		}
		return null;
	}

	// PostRepository postCheck()
	public Long postCheck(Long id, String postPass) {
		Long postId = null;
		for (int i = 0; i < postList.size(); i++) {
			if (id == postList.get(i).getId() && postPass.equals(postList.get(i).getPostPass())) {
				postId = id;
			}
		}
		return postId;
	}

	// 4.PostRepository postUpdate()
	public PostDTO postUpdate(Long postId, String postTitle, String postContents) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {
			if (postId == postList.get(i).getId()) {
				postList.get(i).setPostTitle(postTitle);
				postList.get(i).setPostContents(postContents);
				post = postList.get(i);
			}

		}
		return post;
	}

	// 5.PostRepository postSearch()


	// 6.PostRepository postDelete()
	public void postDelete(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id == postList.get(i).getId()) {
				postList.remove(i);
			}
		}
	}

}
