package day16;

class Tour{
	enum Season{
		Spring, Summer, Fall, Winter
	}
}


public class EnumTest3 {

	public static void main(String[] args) {
		Tour.Season day[]=Tour.Season.values();
		for(Tour.Season value : day)
			System.out.println(value);
		Tour.Season season = Tour.Season.valueOf("Summer");
		System.out.println("Tour.Season.valueOf(\"Summer\") :"+season );
	}
}
