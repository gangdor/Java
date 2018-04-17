package practice;

import java.util.Scanner;

public class BJ_1063 {

	// ��, ��, ��, ��
	static int[] dx = { 1, -1, 0, 0 };
	// ��, ��, ��, ��
	static int[] dy = { 0, 0, -1, 1 };

	public static int setDirection(char x) {
		if (x == 'R') { // ��ĭ ������
			return 0;
		} else if (x == 'L') { // ��ĭ ��������
			return 1;
		} else if (x == 'B') { // ��ĭ �Ʒ���
			return 2;
		} else { // ��ĭ ����
			return 3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] lok = sc.next().toCharArray();
		char[] los = sc.next().toCharArray();
		int kingX = (int) (lok[0] - 64); // king�� X��ġ
		int kingY = (int) (lok[1] - 48); // king�� Y��ġ
		int stoneX = (int) (los[0] - 64); // stone�� X��ġ
		int stoneY = (int) (los[1] - 48); // stone�� X��ġ
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			char[] direction = sc.next().toCharArray();
			int moveX = dx[setDirection(direction[0])];
			int moveY = dy[setDirection(direction[0])];
			if (direction.length == 2) { // �밢������ ������ ���
				moveX += dx[setDirection(direction[1])];
				moveY += dy[setDirection(direction[1])];
			}
			// ŷ�� �������� �� ���� ��ġ�� ���� �� ���
			int tempKingX = kingX + moveX;
			int tempKingY = kingY + moveY;
			if ((tempKingX == stoneX) && (tempKingY == stoneY)) {
				// ���� �������� �� ���� ��ġ�� ������ ����� �ʴ� ���
				if (1 <= (stoneX + moveX) && (stoneX + moveX) <= 8 && 1 <= (stoneY + moveY) && (stoneY + moveY) <= 8) {
					kingX = tempKingX;
					kingY = tempKingY;
					stoneX += moveX;
					stoneY += moveY;
				}
			} else { // ŷ�� �������� �� ���� ��ġ�� �ٸ� ���
				// ŷ�� �������� �� ŷ�� ��ġ�� ������ ����� �ʴ� ���
				if (1 <= (kingX + moveX) && (kingX + moveX) <= 8 && 1 <= (kingY + moveY) && (kingY + moveY) <= 8) {
					kingX = tempKingX;
					kingY = tempKingY;
				}
			}
		}
		sc.close();
		System.out.println(((char) (kingX + 64)) + "" + kingY);
		System.out.println(((char) (stoneX + 64)) + "" + stoneY);
	}
}
