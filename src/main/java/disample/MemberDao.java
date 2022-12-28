package disample;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	// 멤버의  ID를 관리하는 필드
	// 멤버 생성시 마다 하나씩 즈악시켜 중복되지 않도록 관리 
	private static long nextId = 0;
	
	// 멤버 정보(객체)를 저장하는 맵 객체를 정의
	private Map<String, Member> map = new HashMap<>();

	// 이메일을 이용해서 멤버를 조회해서 반환
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	// 멤버 정보를 맵에 추가
	public void update(Member member) {
		this.nextId++;
		member.setId(this.nextId);
		map.put(member.getEmail(), member);
	}
	
	// 멤버 정보를 맵에 업데이트
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
	
	// 모든 멤버의 정보를 반환
	public Collection<Member> selectAll(){
		return map.values();
	}
	
}
