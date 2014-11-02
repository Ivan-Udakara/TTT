import javax.swing.JOptionPane;

/*	supplies the needed functionalities to the GameWindow	*/
public class GameWindow_Support {
	
/*	keeps the track on the count of button clicks	*/
	private int clickCounter = 1;
/*	keeps the number of rounds	*/
	private int rounds = 0;
	
/*	an array to store whether the buttons are pressed or not	*/
	//initially not pressed
	private boolean btnPress[] = {false, false, false, false, false, false, false, false, false};
	
/*	to store click patterns	*/
	private int firstPlayer[] = {0, 0, 0, 0, 0};
	private int secondPlayer[] = {0, 0, 0, 0};
	
	
/*********************************************************/
/*````````````for the multi-player game``````````````````*/
	public int clickMultiPlayer(int btnNo){
		////System.out.println("1 "+clickCounter);
		
		if(!btnPress[btnNo-1]){//if the button has not pressed before
			
			/*	the btnNo th button marks as pressed	*/
			btnPress[btnNo-1] = true;
			
			if(clickCounter%2 == 1){//for the 1st, 3rd, 5th, 7th, 9th button clicks(button clicks of the first player)
				/*	first player put a cross on the btnNo th cell	*/
				firstPlayer[rounds] = btnNo;
				sort(firstPlayer);
				/*	number of clicks increases by one	*/
				clickCounter++;
				System.out.println("first Player "+rounds);
				/*	return the image number(cross)	*/
				return 1;
			}
			else if(clickCounter%2 == 0){
				/*	second player put a dot on the btnNo th cell	*/
				secondPlayer[rounds] = btnNo;
				sort(secondPlayer);
				/*	after both 2 players have played one round finishes	*/
				rounds++;
				/*	number of clicks increases by one	*/
				clickCounter++;
				System.out.println("second player "+rounds);
				/*	return the image number(dot)	*/
				return 2;
			}
		}
		return 0;
	}
	
/*	determines the victory and the defeat	*/
	public void checkGameStatus(){
		
	/*	for the first player	*/
		if(firstPlayer[0] == 9){
			if(search(8, firstPlayer)){
				if(search(7, firstPlayer)){
					JOptionPane.showMessageDialog(null, "Player one wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(search(6, firstPlayer)){
				if(search(3, firstPlayer)){
					JOptionPane.showMessageDialog(null, "Player one wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(search(5, firstPlayer)){
				if(search(1, firstPlayer)){
					JOptionPane.showMessageDialog(null, "Player one wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(firstPlayer[0] == 8){
			if(search(5, firstPlayer)){
				if(search(2, firstPlayer)){
					JOptionPane.showMessageDialog(null, "Player one wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(firstPlayer[0] == 7){
			if(search(5, firstPlayer)){
				if(search(3, firstPlayer)){
					JOptionPane.showMessageDialog(null, "Player one wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(search(4, firstPlayer)){
				if(search(1, firstPlayer)){
					JOptionPane.showMessageDialog(null, "Player one wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(firstPlayer[0] == 6){
			if(search(5, firstPlayer)){
				if(search(4, firstPlayer)){
					JOptionPane.showMessageDialog(null, "Player one wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(firstPlayer[0] == 3){
			if(search(2, firstPlayer)){
				if(search(1, firstPlayer)){
					JOptionPane.showMessageDialog(null, "Player one wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		
	/*	for the second player	*/
		if(secondPlayer[0] == 9){
			if(search(8, secondPlayer)){
				if(search(7, secondPlayer)){
					JOptionPane.showMessageDialog(null, "Player two wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(search(6, secondPlayer)){
				if(search(3, secondPlayer)){
					JOptionPane.showMessageDialog(null, "Player two wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(search(5, secondPlayer)){
				if(search(1, secondPlayer)){
					JOptionPane.showMessageDialog(null, "Player two wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(secondPlayer[0] == 8){
			if(search(5, secondPlayer)){
				if(search(2, secondPlayer)){
					JOptionPane.showMessageDialog(null, "Player two wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(secondPlayer[0] == 7){
			if(search(5, secondPlayer)){
				if(search(3, secondPlayer)){
					JOptionPane.showMessageDialog(null, "Player two wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(search(4, secondPlayer)){
				if(search(1, secondPlayer)){
					JOptionPane.showMessageDialog(null, "Player two wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(secondPlayer[0] == 6){
			if(search(5, secondPlayer)){
				if(search(4, secondPlayer)){
					JOptionPane.showMessageDialog(null, "Player two wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(secondPlayer[0] == 3){
			if(search(2, secondPlayer)){
				if(search(1, secondPlayer)){
					JOptionPane.showMessageDialog(null, "Player two wins", "Victory", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		
	}
	
	
/*	sorts the requested array	*/
	public void sort(int array[]){
		int j,i,key;
		for(j=1;j<array.length;j++){
			key = array[j];
			i = j-1;

			while((i>=0) && (array[i] < key)){
				array[i+1] = array[i];
				i = i-1;
				array[i+1] = key;
			}

		}

		/*for(i=0;i<array.length;i++){
			System.out.println("**** "+array[i]);
		}*/

	}
	
/*	searches for the given number	*/
	public boolean search(int number, int array[]){
		for(int i=0; i<array.length; i++){
			if(array[i] == number){
				return true;
			}
		}
		return false;
	}
	
}
