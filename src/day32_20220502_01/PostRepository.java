package day32_20220502_01;

import java.util.ArrayList;
import java.util.List;

import day31_20220429_02.PostDTO;

public class PostRepository {

	static List<PostDTO> postList = new ArrayList<>();


	// 1.PostRepository postSave()
	public boolean save(PostDTO newPost) {
		return postList.add(newPost);
	}
	
	/*
	 * 매개변수타입: PostDTO
	 * 매개변수이름: newPost
	 * 리턴: boolean
	 * 매서드이름: save() 
	 */
	
	// 2.PostRepository postFindAll()
	public List<PostDTO> postFindAll() {
		return postList;
	}
	
	/*
	 * 매개변수타입: 없음
	 * 매개변수이름: 없음
	 * 리턴: List
	 * 매서드이름: postFindAll() 
	 */
	
	// 3.PostRepository postFindById()
	public PostDTO postFindById(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id == postList.get(i).getId()) {
				return postList.get(i);
			}
		}
		return null;
	}

	/*
	 * 매개변수타입: Long
	 * 매개변수이름: id
	 * 리턴: postDTO
	 * 매서드이름: postFindById() 
	 */

	// 조회수 처리
	public void updateHits(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				postList.get(i).setPostHits(postList.get(i).getPostHits() + 1);
			}
		}
	}
	
	/*
	 * 매개변수타입: Long
	 * 매개변수이름: id
	 * 리턴: 없음
	 * 매서드이름: updateHits() 
	 */

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

	/*
	 * 매개변수타입: Long, String, String
	 * 매개변수이름: postId, postTitle, postContents
	 * 리턴: PostDTO
	 * 매서드이름: postUpdate() 
	 */
	
	// postCheck()
	public Long postCheck(Long id, String postPass) {
		Long postId = null;
		for (int i = 0; i < postList.size(); i++) {
			if (id == postList.get(i).getId() && postPass.equals(postList.get(i).getPostPass())) {
				postId = postList.get(i).getId();
			}
		}
		return postId;
	}
	
	/*
	 * 매개변수타입: Long, String
	 * 매개변수이름: id, postPass
	 * 리턴: Long
	 * 매서드이름: postCheck() 
	 */
	
	// 5.PostRepository postSearch()
	public List<PostDTO> postSearch(String postWriter) {
		List<PostDTO> writerPostList = new ArrayList<>();
		for (int i = 0; i < postList.size(); i++) {
			if (postWriter.equals(postList.get(i).getPostWriter())) {
				writerPostList.add(postList.get(i));
			}
		}
		return writerPostList;
	}
	
	/*
	 * 매개변수타입: String
	 * 매개변수이름: postWriter
	 * 리턴: List<PostDTO>
	 * 매서드이름: postSearch() 
	 */
	
	// 6.PostRepository postDelete()
	public void postDelete(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id == postList.get(i).getId()) {
				postList.remove(i);
			}
		}
	}
	
	/*
	 * 매개변수타입: Long
	 * 매개변수이름: id
	 * 리턴: List<PostDTO>
	 * 매서드이름: postDelete() 
	 */

}
