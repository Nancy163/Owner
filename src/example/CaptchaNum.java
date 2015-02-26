package example;

import java.util.Random;

public class CaptchaNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random yzm = new Random();
		int num = yzm.nextInt(10000);
		System.err.print("------------------随机生成的验证码：" + num);

	}

}
