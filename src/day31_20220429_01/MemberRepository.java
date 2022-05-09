package day31_20220429_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {

	static List<MemberDTO> memberList = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	// Repository save()
	public boolean save(MemberDTO newMember) {
//		boolean result = false;
//		result = memberList.add(newMember);
//		return result;

		return memberList.add(newMember);
		// add()메서드는 boolean을 메서드 성공 여부를 return
	}

	// Repository login()
	boolean login(String memberId, String memberPassword) {
		boolean result = false;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())
					&& memberPassword.equals(memberList.get(i).getMemberPassword())) {
				result = true;
			}
		}
		return result;
	}

	// Repository findAll()
	List<MemberDTO> findAll() {
		return memberList;
	}

	// Repository findById()
	MemberDTO findById(Long id) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if (id == memberList.get(i).getId()) {
				member = memberList.get(i);
			}
		}
		return member;
	}

	// Repository loginCheck
	public Long loginCheck(String memberId, String memberPassword) {
		Long loginId = null;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())
					&& memberPassword.equals(memberList.get(i).getMemberPassword())) {
				loginId = memberList.get(i).getId();
			}
		}
		return loginId;
	}

	// Repository update()
	MemberDTO update(Long loginId, String memberMobile) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if (loginId.equals(memberList.get(i).getMemberId())) {
				memberList.get(i).setMemberMobile(memberMobile);
				member = memberList.get(i);
			}
		}
		return member;
	}

	// Repository delete()
	List<MemberDTO> delete(Long deleteId) {
		for (int i = 0; i < memberList.size(); i++) {
			if (deleteId == memberList.get(i).getId()) {
				memberList.remove(i);
			}
		}
		return memberList;
	}

}
