package grade;

/**
 * @file : GradeService.java
 * @author USER
 * @date 2016. 3. 14.
 * @story
 * crud c create 생성
 * 		r read	조회
 * 		u update 수정
 * 		d delete 삭제
 */
public interface GradeService {
	// c 성젃표 등록
	public void input(); //추상 메소드 기능 은 추상화 속성은 추상화x
	// r 성적표 리스트 출력
	public void getList();
	
	//r  성적표 조회 (학번)
	public void getGradeByHak();
	
	//r  성적표 조회 (이름)
	public void getGradeByName();
	
	//u 성적표 수정
	public void update();
	
	//d  성적표 삭제
	public void delete();
}
