package override;

public class Programer extends Human{
	
		public String devLang;
		public int repoCount;
		
		
		@Override
		public void 자기소개하기() {
			System.out.println("이름:"+name);
			System.out.println("나이:"+age);
			System.out.println("개발언어:"+devLang);
			System.out.println("깃허브 레포지토리 개수:"+repoCount);
			
		}
		
		public void 코딩하기() {
			System.out.println("개발자가"+devLang+"으로 코딩합니다.");
		}

	}

