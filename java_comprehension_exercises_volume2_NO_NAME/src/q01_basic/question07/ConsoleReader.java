package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public int inputNumber() throws IOException, NumberFormatException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String limitNum = reader.readLine();
		int intLimitNum = Integer.parseInt(limitNum);
		return intLimitNum;
	}

}
