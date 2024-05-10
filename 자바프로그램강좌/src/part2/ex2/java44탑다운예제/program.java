/* 44강, Top Down 방식으로 구현하는 간단 예제 */

package part2.ex2.java44탑다운예제;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] lottos = null;
		int menu;
		Boolean running = true;
		
		while (running) {
			
				menu = inputMenu();
	
				switch (menu) {
				case 1:
					lottos = createLottosAuto();
					break;
				case 2:
					lottos = createLottosManual();
					break;
				case 3:
					printLottos(lottos);
					break;
				case 4:
					running=false;
					break;
	
				default:
					break;
				}//switch
				
		}//while
		
	}//main

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}

	private static int[][] createLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}//class
