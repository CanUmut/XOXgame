package SysAndMain;

public class XOXSys {
	
	public static String[][] arr = new String[3][3];
	public static String turn = "x";
	public static String winner;
	public static int draw = 0;
	
	public static void mark(String sign, int xlocation, int ylocation) {
		arr[xlocation][ylocation] = sign;
	}

	public static String[][] getArr() {
		return arr;
	}

	public static void setArr(String[][] arr) {
		XOXSys.arr = arr;
	}

	public static String getTurn() {
		return turn;
	}

	public static void setTurn(String turn) {
		XOXSys.turn = turn;
	}
	
	
	
	public static String getWinner() {
		return winner;
	}

	public static void setWinner(String nwinner) {
		winner = nwinner;
	}

	public static int getDraw() {
		return draw;
	}

	public static void setDraw(int draw) {
		XOXSys.draw = draw;
	}

	public static boolean finish() {
		if(((arr[0][0] == arr[1][0] && arr[2][0] == arr[0][0]) && (arr[0][0] == "x" || arr[0][0] == "o")) ||
			((arr[0][1] == arr[1][1] && arr[2][1] == arr[0][1]) && (arr[0][1] == "x" || arr[0][1] == "o")) ||
			((arr[0][2] == arr[1][2] && arr[2][2] == arr[0][2]) && (arr[0][2] == "x" || arr[0][2] == "o")) ||
			((arr[0][0] == arr[0][1] && arr[0][2] == arr[0][0]) && (arr[0][0] == "x" || arr[0][0] == "o")) ||
			((arr[1][0] == arr[1][1] && arr[1][2] == arr[1][0]) && (arr[1][0] == "x" || arr[1][0] == "o")) ||
			((arr[2][0] == arr[2][1] && arr[2][2] == arr[2][0]) && (arr[2][0] == "x" || arr[2][0] == "o")) ||
			((arr[0][2] == arr[1][1] && arr[2][0] == arr[0][2]) && (arr[0][2] == "x" || arr[0][2] == "o")) ||
			((arr[0][0] == arr[1][1] && arr[2][2] == arr[0][0]) && (arr[0][0] == "x" || arr[0][0] == "o"))
			) {
			
			return true;
		}else
			
			if((arr[0][0] == "x" || arr[0][0] == "o") && (arr[0][1] == "x" || arr[0][1] == "o") && (arr[0][2] == "x" || arr[0][2] == "o")
					&& (arr[1][0] == "x" || arr[1][0] == "o") && (arr[1][1] == "x" || arr[1][1] == "o") && (arr[1][2] == "x" || arr[1][2] == "o")
					&& (arr[2][0] == "x" || arr[2][0] == "o") && (arr[2][1] == "x" || arr[2][1] == "o") && (arr[2][2] == "x" || arr[2][2] == "o")) {
				draw = 1;
				return true;
			}
			
			return false;
	}
	
}
