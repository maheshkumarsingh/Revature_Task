package OOPs;

public class TrainJourneySchd {
	private int num;
	private String code;
	private String station;
	private String Arr;
	private String Dep;
	public TrainJourneySchd(int num, String code, String station,String Arr,String Dep) {
		super();
		this.num = num;
		this.code = code;
		this.station = station;
		this.Arr=Arr;
		this.Dep=Dep;
	}
	
	public void Print()
	{
		System.out.printf("%1s %10s %20s %6s %6s \n",num,code,station,Arr,Dep);//printf hai see
	}
	
	
	public String getArr() {
		return Arr;
	}

	public String getDep() {
		return Dep;
	}

	public static void main(String[] args) {
		
//		TrainJourneySchd tjs[]= {
//				new TrainJourneySchd(1, "YPR", "Yasvantpur Jn"," ","23.40"),
//				new TrainJourneySchd(2, "GTL", "Guntakal Jn","03.45","03.50"),
//				new TrainJourneySchd(3, "SC", "Secundrabad Jn","08.55","09.10"),
//				new TrainJourneySchd(4, "BPQ", "Balharshah Jn","13.30","13.35"),
//				new TrainJourneySchd(5, "HBJ", "Habibganj Jn","21.20","21.25"),
//				new TrainJourneySchd(6, "JHS", "Jhansi Jn","01.15","01.20"),
//				new TrainJourneySchd(7, "DEE", "Delhi S Rohilla","07.00"," "),
//		};
//		
//		for (TrainJourneySchd trainJourneySchd : tjs) {
//			trainJourneySchd.Print();
//		}
		
	}
	
	

}
