/*	supplies the needed functionalities to the GameWindow	*/
public class GameWindow_Support {
	
/*	keeps the track on the count of button clicks	*/
	private int clickCounter = 1;
	
/*	an array to store whether the buttons are pressed or not	*/
	//initially not pressed
	private boolean btnPress[] = {false, false, false, false, false, false, false, false, false};
	
/*	to store click patterns	*/
	private int firstPlayer[] = {0, 0, 0, 0};
	private int secondPlayer[] = {0, 0, 0, 0};
	
/*	for the multi-player game	*/
	public int clickMultiPlayer(int btnNo){
		////System.out.println("1 "+clickCounter);
		
		if(!btnPress[btnNo-1]){//if the button has not pressed before
			
			btnPress[btnNo-1] = true;
			
			if(clickCounter%2 == 1){//for the 1st, 3rd, 5th, 7th, 9th button clicks(button clicks of the first player)
				clickCounter++;
				////System.out.println("2 "+clickCounter);
				return 1;
			}
			else if(clickCounter%2 == 0){
				clickCounter++;
				////System.out.println("3 "+clickCounter);
				return 2;
			}
		}
		return 0;
	}
	
}
