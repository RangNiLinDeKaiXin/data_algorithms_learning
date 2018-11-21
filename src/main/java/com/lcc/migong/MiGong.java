package com.lcc.migong;

/**
 * @author: lcc
 * @Date: 2018-11-08
 **/
public class MiGong {
	public int[][] ditu() {
		int[][] mg = new int[10][10];
		mg[0][0] = 1;
		mg[1][0] = 1;
		mg[2][0] = 1;
		mg[3][0] = 1;
		mg[4][0] = 1;
		mg[5][0] = 1;
		mg[6][0] = 1;
		mg[7][0] = 1;
		mg[8][0] = 1;
		mg[9][0] = 1;

		mg[0][1] = 1;
		mg[1][1] = 0;
		mg[2][1] = 0;
		mg[3][1] = 0;
		mg[4][1] = 0;
		mg[5][1] = 0;
		mg[6][1] = 0;
		mg[7][1] = 0;
		mg[8][1] = 1;
		mg[9][1] = 1;

		mg[0][2] = 1;
		mg[1][2] = 0;
		mg[2][2] = 0;
		mg[3][2] = 0;
		mg[4][2] = 1;
		mg[5][2] = 0;
		mg[6][2] = 1;
		mg[7][2] = 1;
		mg[8][2] = 0;
		mg[9][2] = 1;

		mg[0][3] = 1;
		mg[1][3] = 1;
		mg[2][3] = 1;
		mg[3][3] = 0;
		mg[4][3] = 1;
		mg[5][3] = 0;
		mg[6][3] = 0;
		mg[7][3] = 1;
		mg[8][3] = 0;
		mg[9][3] = 1;

		mg[0][4] = 1;
		mg[1][4] = 0;
		mg[2][4] = 0;
		mg[3][4] = 0;
		mg[4][4] = 1;
		mg[5][4] = 1;
		mg[6][4] = 0;
		mg[7][4] = 1;
		mg[8][4] = 0;
		mg[9][4] = 1;

		mg[0][5] = 1;
		mg[1][5] = 0;
		mg[2][5] = 0;
		mg[3][5] = 1;
		mg[4][5] = 0;
		mg[5][5] = 0;
		mg[6][5] = 0;
		mg[7][5] = 0;
		mg[8][5] = 0;
		mg[9][5] = 1;

		mg[0][6] = 1;
		mg[1][6] = 0;
		mg[2][6] = 0;
		mg[3][6] = 1;
		mg[4][6] = 0;
		mg[5][6] = 0;
		mg[6][6] = 1;
		mg[7][6] = 1;
		mg[8][6] = 0;
		mg[9][6] = 1;

		mg[0][7] = 1;
		mg[1][7] = 1;
		mg[2][7] = 1;
		mg[3][7] = 0;
		mg[4][7] = 0;
		mg[5][7] = 0;
		mg[6][7] = 0;
		mg[7][7] = 1;
		mg[8][7] = 0;
		mg[9][7] = 1;

		mg[0][8] = 1;
		mg[1][8] = 0;
		mg[2][8] = 0;
		mg[3][8] = 0;
		mg[4][8] = 0;
		mg[5][8] = 0;
		mg[6][8] = 0;
		mg[7][8] = 0;
		mg[8][8] = 0;
		mg[9][8] = 1;

		mg[0][9] = 1;
		mg[1][9] = 1;
		mg[2][9] = 1;
		mg[3][9] = 1;
		mg[4][9] = 1;
		mg[5][9] = 1;
		mg[6][9] = 1;
		mg[7][9] = 1;
		mg[8][9] = 1;
		mg[9][9] = 1;
		return mg;
	}


	boolean mgStYypepath(int xi, int yi, int xe, int ye) {
		int i, j, di, find;
		int[][] ditu = ditu();
		StYype stYype = new StYype();
		stYype.top = 0;
		Box box = new Box();
		box.i = xi;
		box.j = yi;
		box.di = -1;
		stYype.data[stYype.top] = box;

		while (stYype.top > -1) {
			i = stYype.data[stYype.top].i;
			j = stYype.data[stYype.top].j;
			di = stYype.data[stYype.top].di;
			if (i == xe && j == ye) {
				System.out.println("迷宫路径如下");
				for (int k = 0; k <= stYype.top; k++) {
					System.out.print(stYype.data[k].i + "," + stYype.data[k].j + "  ");
					if ((k + 1) % 5 == 0) {
						System.out.println();
					}
				}
				System.out.println();

				return true;
			}
			find = 0;
			while (di < 4 && find == 0) {
				di++;
				switch (di) {
					case 0:
						i = stYype.data[stYype.top].i - 1;
						j = stYype.data[stYype.top].j;
						break;

					case 1:
						i = stYype.data[stYype.top].i;
						j = stYype.data[stYype.top].j + 1;
						break;

					case 2:
						i = stYype.data[stYype.top].i + 1;
						j = stYype.data[stYype.top].j;
						break;

					case 3:
						i = stYype.data[stYype.top].i;
						j = stYype.data[stYype.top].j - 1;
						break;

				}
				if (ditu[i][j] == 0) find = 1;

			}
			if (find == 1) {
				stYype.data[stYype.top].di = di;
				stYype.top++;
				Box box2 = new Box();
				box2.i = i;
				box2.j = j;
				box2.di = -1;
				stYype.data[stYype.top] = box2;
				ditu[i][j] = -1;
			} else {
				ditu[stYype.data[stYype.top].i][stYype.data[stYype.top].j] = 0;
				stYype.top--;
			}
		}

		return false;
	}

	boolean mgQuYypepath(int xi, int yi, int xe, int ye) {
		int i, j;
		int find = 0;
		int[][] ditu = ditu();
		Box box = new Box();
		box.i = xi;
		box.j = yi;
		box.di = -1;
		QuType quType = new QuType();
		quType.front = -1;
		quType.rear = 0;
		quType.data[quType.rear] = box;
		ditu[xi][yi] = -1;
		while (quType.rear != quType.front && find == 0) {
			quType.front++;
			i = quType.getData()[quType.front].i;
			j = quType.getData()[quType.front].j;

			if (i == xe && j == ye) {
				find = 1;
				printQu(quType, quType.front);
				return true;
			}
			for (int di = 0; di < 4; di++) {
				switch (di) {
					case 0:
						i = quType.data[quType.front].i - 1;
						j = quType.data[quType.front].j;
						break;

					case 1:
						i = quType.data[quType.front].i;
						j = quType.data[quType.front].j + 1;
						break;

					case 2:
						i = quType.data[quType.front].i + 1;
						j = quType.data[quType.front].j;
						break;

					case 3:
						i = quType.data[quType.front].i;
						j = quType.data[quType.front].j - 1;
						break;
				}
				if (ditu[i][j] == 0) {
					quType.rear++;
					Box box2 = new Box();
					box2.i = i;
					box2.j = j;
					box2.di = quType.front;

					quType.data[quType.rear] = box2;
					ditu[i][j] = -1;
				}

			}


		}


		return false;
	}

	private void printQu(QuType quType, int front) {
		int pre = quType.data[front].di;
		System.out.println(quType.data[front].i + " " + quType.data[front].j + "  ");
		int q = 0;
		while (pre != -1) {
			System.out.print(quType.data[pre].i + " " + quType.data[pre].j + "  ");
			pre = quType.data[pre].di;
			q++;
			if (q % 4 == 0) {
				System.out.println();
			}

		}


	}

	public static void main(String[] args) {
		MiGong a = new MiGong();
		if (!a.mgStYypepath(1, 1, 8, 8)) System.out.println("没有解");

		if (!a.mgQuYypepath(1, 1, 8, 8)) System.out.println("没有解");
	}


}
