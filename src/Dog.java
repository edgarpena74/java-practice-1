
public class Dog {
	// Attributes
	int dogSpaceNumber;
	int dogWeight;
	String grooming;

	// Constructor w/ param
	public Dog(int dogSpaceNumber, int dogWeight, String grooming) {
		this.dogSpaceNumber = dogSpaceNumber;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
	}

	// *Accessors*
	// Space number
	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}

	// weight
	public int getDogWeight() {
		return dogWeight;
	}

	// grooming
	public String getGrooming() {
		return grooming;
	}

	// *mutators*
	// space number
	public void setDogSpaceNumber(int dogSpaceNumber) {
		this.dogSpaceNumber = dogSpaceNumber;
	}

	// weight
	public void setDogWeight(int dogWeight) {
		this.dogWeight = dogWeight;
	}

	// grooming
	public void setGrooming(String grooming) {
		this.grooming = grooming;
	}
}
