package ch11_api.sec04;

public class ExitEx2 {

	public static void main(String[] args) {
		// 보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				System.exit(i);
			} catch (Exception e) {
			}
		}
	}
}