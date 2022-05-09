package day30_20220428;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {

	Scanner scan = new Scanner(System.in);
	static List<MemberDTO> memberList = new ArrayList<>();

	// Repository idPw()
	String[] idPw() {
		String idPwArray[] = new String[2];
		System.out.print("아이디: ");
		idPwArray[0] = scan.next();
		System.out.print("비밀번호: ");
		idPwArray[1] = scan.next();
		return idPwArray;
	}

	// Repository save()
	void save(MemberDTO member) {
		memberList.add(member);
	}

	// Repository login()
	boolean login(String memberId, String memberPassword) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())
					&& memberPassword.equals(memberList.get(i).getMemberPassword())) {
				return true;
			}
		}
		return false;
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

	// Repository update()
	MemberDTO update(String memberId, String memberMobile) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())) {
				memberList.get(i).setMemberMobile(memberMobile);
				member = memberList.get(i);
			}
		}
		return member;

	}

	// Repository delete()
	List<MemberDTO> delete(Long id) {
		for (int i = 0; i < memberList.size(); i++) {
			if (id == memberList.get(i).getId()) {
				memberList.remove(i);
			}
		}
		return memberList;
	}
}
