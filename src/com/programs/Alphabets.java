package com.programs;

public class Alphabets {
	public static void main(String[] args) {
		/*
		 * letterA(10);letterB(11);letterC(10);letterD(10);letterE(10);letterF(10);
		 * letterG(10);letterH(10);letterI(10);letterJ(10);letterK(10);letterL(10);
		 * letterM(10);letterN(10);letterO(10);letterP(10);letterQ(10);letterR(10);
		 * letterS(10);letterT(10); letterU(10);letterV(10); letterW(10);letterX(10);
		 * letterY(10);letterZ(10);
		 */
		letterA(8);
		letterB(8);
		letterC(8);
		letterD(8);
		letterE(8);
		letterF(8);
		letterG(8);
		letterH(8);
		letterI(8);
		letterJ(8);
	}

	public static void letterA(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((j == 1 && i != 0 && i != line - 1) || (i == 0 && i == line - 1 && j > 1 && j < line - 2)
						|| (i == ((line - 1) / 2) && j > 1 && j < line - 1)
						|| (j == line - 2 && i != 0 && i >= ((line - 1) / line) && i != line - 1)
						|| (i == 0 && j < line - 2 && j > 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterB(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((i == 0 && j <= line - 2) || (i == line - 1 && j <= line - 2)
						|| (i == (line - 1) / 2 && j <= line - 2)
						|| (j == line - 1 && i != 0 && i != (line - 1) / 2 && i != line - 1)
						|| (i >= 0 && i <= line - 1 && j == 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterC(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((i == 0 && j >= 1 && j <= line - 2) || (i == line - 1 && j >= 1 && j <= line - 2)
						|| (i > 0 && i < line - 1 && j == 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterD(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((i == 0 && j >= 1 && j < line - 1) || (i == line - 1 && j >= 1 && j < line - 1)
						|| (i >= 0 && i <= line - 1 && j == 0) || (i != 0 && i <= line - 2 && j == (line - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterE(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((i == 0 && j <= line - 2) || (i == line - 1 && j <= line - 2)
						|| (i == (line - 1) / 2 && j <= line - 2) || (i >= 0 && i <= line - 1 && j == 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterF(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((i == 0 && j <= line - 2) || (i == (line - 1) / 2 && j <= line - 2)
						|| (i >= 0 && i <= line - 1 && j == 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterG(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((j == 1 && i != 0 && i != line - 1) || ((i == 0 || i == line - 1) && j > 1 && j < line - 2)
						|| (i == ((line - 1) / 2) && j > 2 && j < line - 1)
						|| (j == line - 2 && i != 0 && i >= ((line - 1) / 2) && i != line - 1))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

	public static void letterH(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((j == 1 && i != 0 && i != line - 1) || (i == 0 && i == line - 1 && j > 1 && j < line - 2)
						|| (i == ((line - 1) / 2) && j > 1 && j < line - 1)
						|| (j == line - 2 && i != 0 && i >= ((line - 1) / line) && i != line - 1)
						|| (i == 1 && j == 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterI(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if (i == 0 || j == ((line / 2)) || (i == line - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterJ(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((i == 0 || j == (line / 2) && i < line - 1) || (i == line - 1 && j <= (line / 2) - 1 && j != 0)
						|| (i == line - 2 && j == 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterK(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((i >= 0 && i <= line - 1 && j == 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterN(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((j == 0 && i >= 0 && i <= line - 1) || (j == line - 1 && i <= line - 2) || (i == j && i != line)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterR(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((j == 1 && i != 0 && i != line - 1) || (i == 0 && i == line - 1 && j > 1 && j < line - 2)
						|| (i != 0 && i < line - 3 && j == 1 && j < line - 1)
						|| (i == 0 && i == line - 1 && j > 1 && j < line - 2)
						|| (i == ((line - 1) / 2) && j > 1 && j < line - 2) || (i == 0 && j < line - 2 && j > 1)
						|| (j == line - 2 && i != 0 && i <= (line - 1) / 2 - 1 && i < line - 1)
						|| (i >= (line - 1) / 2 && j == i && j < line - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterT(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if (i == 0 || j == ((line / 2))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void letterU(int line) {
		int i, j;
		for (i = 0; i < line; i++) {
			for (j = 0; j < line; j++) {
				if ((j == 0 && i >= 0 && i <= line - 2) || (j != 0 && j < line - 1 && i == line - 1)
						|| (j == line - 1 && i != line - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}