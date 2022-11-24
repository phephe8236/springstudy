package hello.core.member;

// 회원 저장소
public interface MemberRepository {

    // 회원저장
    void save(Member member);

    // ID로 회원 찾기
    Member findById(Long memberId);

}
