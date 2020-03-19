package exercise.ex2_enum;

public class EnumDemo {

	enum Action{
		STOP, RIGHT, LEFT, UP, DOWN
	}
	
	public static void main(String[] args) {
		play(Action.STOP);
	}
	
	public static void play(Action action) {
		switch(action) {
		case STOP:
			System.out.println("stop");
			break;
		case RIGHT:
			System.out.println("right");
			break;
		case LEFT:
			System.out.println("left");
			break;
		case UP:
			System.out.println("up");
			break;
		case DOWN:
			System.out.println("down");
			break;
		default:
				break;
		}
		
	}

}
