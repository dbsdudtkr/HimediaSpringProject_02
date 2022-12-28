package disample;

public class MemberRegisterService {

	// 회원 정보를 다루는 DAO 객체를 필드로 선언
	
	// 생성자를 통해서 필드를 초기화
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	// 회원 등록을 처리하는 메서드
	// registerRequest 타입을 매개변수로 받아서 등록에 성공하면 회원 ID를 반환
	public Long regist(RegisterRequest req) {
		// 이메일 중복 여부를 확인
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null) {
			throw new DuplicateMember
		}
	}
	
}
