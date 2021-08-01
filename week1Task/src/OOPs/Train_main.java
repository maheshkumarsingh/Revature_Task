package OOPs;

public class Train_main {
	
	public void Print_Main(){
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213");
		System.out.println("-------------------------------------------------");
		System.out.printf("%1s %10s %20s %6s %6s \n","#","code","Station","Arr","Dep");
		System.out.println("-------------------------------------------------");
	}
	
	
	

	public static void main(String[] args) {
		Train_main main=new Train_main();
		main.Print_Main();
		TrainJourneySchd tjs[]= {
				new TrainJourneySchd(1, "YPR", "Yasvantpur Jn"," ","23.40"),
				new TrainJourneySchd(2, "GTL", "Guntakal Jn","03.45","03.50"),
				new TrainJourneySchd(3, "SC", "Secundrabad Jn","08.55","09.10"),
				new TrainJourneySchd(4, "BPQ", "Balharshah Jn","13.30","13.35"),
				new TrainJourneySchd(5, "HBJ", "Habibganj Jn","21.20","21.25"),
				new TrainJourneySchd(6, "JHS", "Jhansi Jn","01.15","01.20"),
				new TrainJourneySchd(7, "DEE", "Delhi S Rohilla","07.00"," "),
		};
		
		for (TrainJourneySchd trainJourneySchd : tjs) {
			trainJourneySchd.Print();
	}
		System.out.println("-------------------------------------------------");

}
}
