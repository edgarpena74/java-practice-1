
import java.util.stream.IntStream;

public class Pet {
    private String petType;
    private String petName;
    private int petAge;
    // init dog spaces 1...30
    // rangeClosed(int startInclusive, int endInclusive)
    // include num1 and num2
//    private int[] dogSpaces = IntStream.rangeClosed(1, 30).toArray();
    private int dogSpaces;
    // init cat spaces 1..12
    private int catSpaces;
    private int daysStay;
    private int amountDue;
    
    
    // Constructor
    public Pet(String petType, String petName, int petAge, int daysStay) {
        super();
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
    }
 
	public int getDogSpaces() {
		return dogSpaces;
	}

	public void setDogSpaces(int dogSpaces) {
		this.dogSpaces = dogSpaces;
	}

	public int getCatSpaces() {
		return catSpaces;
	}

	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public int getDaysStay() {
		return daysStay;
	}

	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}

	public int getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}
    
//	public static void main(String[] args) {
//		
//	}
   
}
