package battleships;


public class EnumChoice {
    
    public enum ChooseNumber {
		ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN;
	}
    
    private ChooseNumber choiceNumber;
    
    public EnumChoice(ChooseNumber choiceNumber){
        this.choiceNumber = choiceNumber;
    }
    
}
