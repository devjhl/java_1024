package Student;

import java.util.Scanner;

public class StudentProgramTest {
	/*
	 * 학생 성적 관리 프로그램을 작성 하세요. - 작성하기 위해 필요한 작업들을 주석으로 정리해보세요
	 */
	// 내가 작성한 주석
	/*
	 * 1. 학생 객체 만들기 1-1 필드 작성함 1-2 getter setter 작성함 1-3 toString 작성함 2. 성적 관리 인터페이스
	 * 만들기 2-1 메소드 만듬 3. 클래스 파일에서 성적 관리 인터페이스를 implement로 받아 메소드를 불러옴 4. 클래스 파일에서
	 * 메소드 파일을 완성함 5. toString을 sysout 출력할때 활용함
	 */

	// 강사님이 작성한 주석
	/*
	 * 1. 프로그램에 필요한 기능을 정리 메뉴 1. 학생 정보 추가 2. 학생 성적 추가 3. 학생 정보 출력 4. 프로그램 종료
	 * 
	 * 2. 프로그램 실행 과정은 어떻게 할건지? 기능 1. 학생정보 추가 - 학년, 반 , 번호, 이름을 입력하여 학생 정보 추가 - 학년,
	 * 반, 번호가 같은 학생이 이미 있으면 추가하지않음 //객체끼리 비교 2. 학생 성적 추가 - 학년 , 반 ,번호로 학생을 검색 한 후
	 * 있으면 성적을 추가 - 성적 추가시 과목명, 중간, 기말 수행 평가를 입력하여 추가한다. - 이미 추가된 과목이면(학기랑 과목명이 같으면)
	 * 추가하지 않음 3. 학생 정보 출력
	 * 
	 * 3. 정보를 효율적으로 관리하기 위해 클래스를 만들것인가? 만든다면 어떤 클래스를 만들건지? - 학생클래스 HighStudent -
	 * 성적클래스 Score
	 * 
	 * 4. 프로그램 실행 과정을 주석으로 작성 // 반복 // 메뉴 출력 // 메뉴 선택
	 * 
	 * // 선택한 메뉴에 따른 기능 실행
	 * 
	 * 1. 학생 정보 추가* // 학생 정보를 입력(학년,반 번호 ,이름) // 입력한 학생 정보가 없으면 추가 2. 학생 성적 추가 // 학생
	 * 정보를 입력(학년,반,번호) //입력한 학생 정보가 없으면 끝
	 * 
	 * //성적 정보를 입력(과목,학기,중간,기말,수행평가) // 입력한 성적 정보가 없으면 추가 3. 학생 정보 출력 // 저장된 정보 출력
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HighStudent hs = new HighStudent();
		
		int menu=0;
		 // 반복
		do {
			System.out.println("====메뉴=====");
			System.out.println("1.학생 정보 추가");
			System.out.println("2.학생 성적 추가");
			System.out.println("3.학생 정보 출력");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 선택>>>");
			// 메뉴 선택
			menu = sc.nextInt();
			if(menu == 1) {
				//1. 학생 정보 추가
				System.out.println("학생 정보를 입력해주세요.");
				// 학생 정보를 입력(학년,반 번호 ,이름)
				System.out.print("학년,반,번호,이름>>");
				// 입력한 학생 정보가 없으면 추가
				int grade = sc.nextInt();
				int classNum = sc.nextInt();
				int number = sc.nextInt();
				String name = sc.next();
				if(menu ==2) {
					
				}else if(menu ==3) {
					//3. 학생 정보 출력
					  	// 저장된 정보 출력
				}else if(menu ==4) {
					System.out.println("프로그램 종료");
				}else {
					System.out.println("잘못된 메뉴!!");
				}
			}	
		}while(menu != 4);
			
		// 선택한 메뉴에 따른 기능 실행
		
		}
}