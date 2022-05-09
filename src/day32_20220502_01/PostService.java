package day32_20220502_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import day31_20220429_02.PostDTO;

public class PostService {

	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	int postHits;
	PostRepository postRepository = new PostRepository();

	// 1.PostService postSave()
	public void postSave() {
		System.out.print("제목: ");
		String postTitle = scan.next();
		System.out.print("작성자: ");
		String postWriter = scan.next();
		System.out.print("비밀번호: ");
		String postPass = scan.next();
		System.out.print("내용: ");
		String postContents = scan.next();
		LocalDateTime dateTime = LocalDateTime.now();
		String postDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		PostDTO newPost = new PostDTO(++id, postTitle, postWriter, postPass, postContents, postHits, postDate);

		boolean saveResult = postRepository.save(newPost);
		if (saveResult) {
			System.out.println("글등록 완료");
		} else {
			System.out.println("글등록 실패");
		}
	}

	// 2.PostService postFindAll()
	public void postFindAll() {
		List<PostDTO> postList = postRepository.postFindAll();
		for (int i = 0; i < postList.size(); i++) {
			System.out.println(postList.get(i));
		}
	}

	// 3.PostService postFindById()
	public void postFindById() {
		System.out.print("글번호: ");
		Long id = scan.nextLong();

		// 조회수처리 (최대한 기능별 매서드 분리)
		postRepository.updateHits(id);

		PostDTO post = postRepository.postFindById(id);
		if (post == null) {
			System.out.println("조회결과가 없습니다!!");
		} else {
			System.out.println(post);
		}
	}

	// 4.PostService postUpdate()
	public void postUpdate() {
		System.out.print("글번호: ");
		Long id = scan.nextLong();
		System.out.print("비밀번호: ");
		String postPass = scan.next();

		// postCheck()
		Long postId = postRepository.postCheck(id, postPass);

		if (postId != null) {
			System.out.print("수정할 제목: ");
			String postTitle = scan.next();
			System.out.print("수정할 내용: ");
			String postContents = scan.next();
			PostDTO post = postRepository.postUpdate(postId, postTitle, postContents);
			System.out.println(post);
		} else {
			System.out.println("글번호 또는 비밀번호가 일치하지 않습니다.");
		}
	}

	// 5.PostService postSearch()
	public void postSearch() {
		System.out.println("검색할 작성자: ");
		String postWriter = scan.next();
		List<PostDTO> writerPostList = postRepository.postSearch(postWriter);
		if (writerPostList.size() > 0) {
			for (PostDTO p : writerPostList) {
				System.out.println(p);
			}
		} else {
			System.out.println("검색결과가 없습니다.");
		}

	}

	// 6.PostService postDelete()
	public void postDelete() {
		System.out.print("삭제할 글번호: ");
		Long id = scan.nextLong();
		System.out.print("비밀번호: ");
		String postPass = scan.next();
		Long postId = postRepository.postCheck(id, postPass);
		if(postId != null) {
			postRepository.postDelete(postId);
			postFindAll();
		} else {
			System.out.println("비밀번호가 틀립니다");
		}

	}

}
