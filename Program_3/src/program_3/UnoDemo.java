package program_3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class UnoDemo {
	public static void main(String[] args) {
		
        UnoDemo game = new UnoDemo();
        game.setupGame();   
        game.startGameLoop(); 
        
	}
	
	
	private LinkedList<Card> hand;
    private List<Card> deck;
    private Stack drawPile;
    private Stack discardPile;
    private Scanner scanner;

    
    public UnoDemo() {
    	
        hand = new LinkedList<>();
        drawPile = new Stack();
        discardPile = new Stack();
        deck = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
	
	
    public void setupGame() {
		createDeck();
		Collections.shuffle(deck);
		loadDrawPile();
		loadHand();
		discardPile.push(drawPile.pop());
	}

	
    public void startGameLoop() {
    	
		boolean gameWon = false;
		boolean saidUno = false;
		while(!gameWon) {
			
			UnoPrinter.printGame(hand, discardPile.peek(), drawPile.peek(), drawPile.getSize());
			if (drawPile.getSize() == 0 && hand.size() == 0) {
				System.out.println("You win!");
				System.exit(0);	
			}
			
			
			else if (hand.size() == 0) {
				int drawCount = drawPile.getSize();
				System.out.println(drawCount);
				int count = Math.min(drawCount, 6);
				for (int i = 0; i < count; i++) {
					hand.add(drawPile.pop());
				}
			}
			
			
			else if(cannotPlay() == true) {
				System.out.println("You lose!");
				System.exit(0);
			}
			
			
			else {
				boolean validPlay = false;
				while(!validPlay) {
					System.out.println("Enter the number of the card from your hand you wish to play:");
					String input = scanner.nextLine();		
					
					
					if(hand.size() == 1) {
						
						if(input.equalsIgnoreCase("uno")) {
							System.out.println("You said UNO!");
							saidUno = true;
							continue;
						}
						
						if(!saidUno) {
							System.out.println("You forgot to say UNO! You lose!");
							System.exit(0);
						}
					}
					
					
					int inputNumber;
					inputNumber = Integer.parseInt(input) - 1;

						
					if (inputNumber >= hand.size()) {
						System.out.println("Please enter a number attached to a card.");
						continue;
					}
					
					
					Card chosenCard = hand.get(inputNumber);
					char chosenColor = chosenCard.getColor();
					char chosenValue = chosenCard.getValue();
					char discardCardValue = discardPile.peek().getValue();
					char discardCardColor = discardPile.peek().getColor();
					
					
					if (discardCardValue == 'D' && chosenValue == 'D') {
                        discardPile.push(chosenCard);
                        hand.remove(chosenCard);
                        drawCards(2);
                        validPlay = true;
                    } 
					
					else if (discardCardColor == chosenColor && chosenValue == 'D') {
                        discardPile.push(chosenCard);
                        hand.remove(chosenCard);
                        drawCards(2);
                        validPlay = true;
                    }
					
					else if(chosenValue == 'W') {
						discardPile.push(chosenCard);
						hand.remove(chosenCard);
	                    validPlay = true;

					}
					
					else if(chosenColor == discardCardColor || chosenValue == discardCardValue) {
						discardPile.push(chosenCard);
						hand.remove(chosenCard);
	                    validPlay = true;
					}
				
					else {
						System.out.println("You cannot play the card " + chosenCard.toString() + " on the card " + discardPile.peek().toString());
					}
				}
			saidUno = false;
			}
		}
	}

	private void drawCards(int count) {
        int drawCount = Math.min(drawPile.getSize(), count);
        for (int i = 0; i < drawCount; i++) {
            Card drawCard = drawPile.pop();
            
            if (drawCard != null) {
                hand.add(drawCard);
            }
        }
        
        if (drawCount < count) {
        	return;
        }
    }
	
	
	
	private boolean valuesMatch() {
		char discardCardValue = discardPile.peek().getValue();
		String input = scanner.nextLine();
	    int inputNumber = Integer.parseInt(input);
		Card chosenCard = hand.get(inputNumber);
		char chosenValue = chosenCard.getValue();
		if(chosenValue == discardCardValue || chosenValue == 'W') {
			return true ;
		}
		return false;
	}
	
	private boolean colorsMatch() {
		char discardCardColor = discardPile.peek().getColor();
		String input = scanner.nextLine();
	    int inputNumber = Integer.parseInt(input);
		Card chosenCard = hand.get(inputNumber);
		char chosenColor = chosenCard.getColor();
		if(chosenColor == discardCardColor) {
			return true;
		}
		return false;
	}
	
	
		
	private boolean cannotPlay() {
		char discardCardColor = discardPile.peek().getColor();
		char discardCardValue = discardPile.peek().getValue();
		for(Card card: hand) {
			char color = card.getColor();
			char value = card.getValue();
			if (color == discardCardColor || value == discardCardValue || value == 'W' ) {
				return false;
			}
		}
		return true;
	}

	

	private void createDeck() {
		addCard("RD", 2);
		addCard("RW", 1);
		addCard("R1", 2);
		addCard("R2", 1);
		addCard("R3", 1);
		addCard("R4", 1);
		
		addCard("BD", 2);
		addCard("BW", 1);
		addCard("B1", 1);
		addCard("B2", 1);
		addCard("B3", 1);
		addCard("B4", 1);
		
		addCard("GD", 2);
		addCard("GW", 1);
		addCard("G1", 1);
		addCard("G2", 1);
		addCard("G3", 1);
		addCard("G4", 1);
	}

	
	
	private void addCard(String code, int count) {
		char color = code.charAt(0);
		char value = code.charAt(1);
		for (int i = 0; i < count; i++) {
			deck.add(new Card(color, value));
		}
	}

	
	
	private void loadDrawPile() {
		for (Card card : deck) {
			drawPile.push(card);
		}
	}
	
	
	
	private void loadHand() {
		for (int i = 0; i < 6; i++) {
            hand.add(drawPile.pop());
        }
	}

}
