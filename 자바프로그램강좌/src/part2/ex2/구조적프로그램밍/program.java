package part2.ex2.구조적프로그램밍;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while (running) {
			
			menu = inputMenu();
			 
			switch (menu) {
				case 1:
					lottos = creatLottosAuto();
					break;
					
				case 2:
					lottos = creatLottosManual();
					break;
					
				case 3:
					printLottos(lottos);
					break;
					
				case 4:
					running = false;
					break;
		
				default:
					break;
			}
		}
		

		 

	}

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}

	private static int[][] creatLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	private static int[][] creatLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

}
