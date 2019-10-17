package calculatrice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceTest2 {

	private int ans;

	public CalculatriceTest2() {
		ans = 0;
	}

	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}

	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}

	public int add(int v) {
		ans += v;
		return ans;
	}

	public int sub(int v) {
		ans -= v;
		return ans;
	}

	public int ans() {
		return ans;
	}

	public void clear() {
		ans = 0;
	}

}
