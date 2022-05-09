package day33_20220503_03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day31_20220429_01.MemberDTO;

public class MemberRepository {

	static Map<Long, MemberDTO> memberMap = new HashMap<>();

	Scanner scan = new Scanner(System.in);

	// save()
	public MemberDTO save(MemberDTO newMember) {
		return memberMap.put(newMember.getId(), newMember);
	}

	// login()
	boolean login(String memberId, String memberPassword) {
		boolean result = false;
		for (Long l : memberMap.keySet()) {
			if (memberId.equals(memberMap.get(l).getMemberId())
					&& memberPassword.equals(memberMap.get(l).getMemberPassword())) {
				result = true;
			}
		}
		return result;
	}

	// findAll()
	Map<Long, MemberDTO> findAll() {
		return memberMap;
	}

	// findById()
	MemberDTO findById(Long id) {
		MemberDTO member = null;
		for (Long l : memberMap.keySet()) {
			if (id == memberMap.get(l).getId()) {
				member = memberMap.get(l);
			}
		}
		return member;
	}

	// loginCheck
	public Long loginCheck(String memberId, String memberPassword) {
		Long loginId = null;
		for (Long l : memberMap.keySet()) {
			if (memberId.equals(memberMap.get(l).getMemberId())
					&& memberPassword.equals(memberMap.get(l).getMemberPassword())) {
				loginId = memberMap.get(l).getId();
			}
		}
		return loginId;
	}

	// update()
	MemberDTO update(Long loginId, String memberMobile) {
		MemberDTO member = null;
		for (Long l : memberMap.keySet()) {
			if (loginId.equals(memberMap.get(l).getId())) {
				memberMap.get(l).setMemberMobile(memberMobile);
				member = memberMap.get(l);
			}
		}
		return member;
	}

	// delete()
	Map<Long, MemberDTO> delete(Long deleteId) {
		for (Long l : memberMap.keySet()) {
			if (deleteId == memberMap.get(l).getId()) {
				memberMap.remove(l);
			}
		}
		return memberMap;
	}
}
