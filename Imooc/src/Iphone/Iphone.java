package Iphone;

public class Iphone {
	int ScreenSize;
	int CPUSize;
	int InternalSize;
	
	Iphone(int ScreenSize, int CPUSize, int InternalSize){
		this.ScreenSize = ScreenSize;
		this.CPUSize = CPUSize;
		this.InternalSize = InternalSize;
		
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Iphone other = (Iphone) obj;
		if (CPUSize != other.CPUSize)
			return false;
		if (InternalSize != other.InternalSize)
			return false;
		if (ScreenSize != other.ScreenSize)
			return false;
		return true;
	}
}
