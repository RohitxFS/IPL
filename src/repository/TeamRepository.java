package repository;

import entity.Team;

public class TeamRepository {
	
	 //should return MI team details
	  public static Team getMiTeamDetails() {
		  
	   Team team = new Team();
	   team.setId(101);
	   team.setTeamName("Mumbai Indians");
	   team.setCaptainName("Hardik Pandya");
	   team.setCoachName("Mahela Jaywardhane");
	   team.setQualified(false);
	   team.setnRR(10.3f);
	   team.setShortName("MI");
	   return team;  
	  }
	  
	  public static Team getRCBTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(102);
		   team.setTeamName("Royal Challengers Banglore");
		   team.setCaptainName("Virat Kohli");
		   team.setCoachName("Andy Flower");
		   team.setQualified(false);
		   team.setnRR(5.3f);
		   team.setShortName("RCB");
		   return team;
		  }
	  
	  public static Team getCSKTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(103);
		   team.setTeamName("Chennai Super Kings");
		   team.setCaptainName("MS Dhoni");
		   team.setCoachName("Stephen Fleming");
		   team.setQualified(true);
		   team.setnRR(7.3f);
		   return team;  	  
	  }
	  
	  public static Team getGTTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(104);
		   team.setTeamName("Gujrat Titans");
		   team.setCaptainName("Shubhaman Gill");
		   team.setCoachName("Ashish Nehra");
		   team.setQualified(true);
		   team.setnRR(6.1f);
		   return team;     
	  }
	  public static Team getRRTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(105);
		   team.setTeamName("Rajasthan Royals");
		   team.setCaptainName("Sanju Samson");
		   team.setCoachName("Rahul Dravid");
		   team.setQualified(false);
		   team.setnRR(4.1f);
		   return team;     
	  }
	  
	  public static Team getDCTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(106);
		   team.setTeamName("Delhi Captitals");
		   team.setCaptainName("Axar Patel");
		   team.setCoachName("Hemang Badani");
		   team.setQualified(false);
		   team.setnRR(3.1f);
		   return team;     
	  }
	  public static Team getLSGTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(107);
		   team.setTeamName("Lucknow SuperGiants");
		   team.setCaptainName("Rishabh Pant");
		   team.setCoachName("Justin Langer");
		   team.setQualified(false);
		   team.setnRR(2.9f);
		   return team;     
	  }
	  public static Team getPBKSTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(108);
		   team.setTeamName("Punjab Kings");
		   team.setCaptainName("Punjab Kings");
		   team.setCoachName("Ricky Ponting");
		   team.setQualified(false);
		   team.setnRR(7.9f);
		   return team;     
	  }
	  public static Team getSRHTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(109);
		   team.setTeamName("Sunrisers Haiderabad");
		   team.setCaptainName("Pat Cummins");
		   team.setCoachName("Daniel Vettori");
		   team.setQualified(false);
		   team.setnRR(8.9f);
		   return team;     
	  } 
	  
	  public static Team getKKRTeamDetails() {
		  
		   Team team = new Team();
		   team.setId(110);
		   team.setTeamName("Kolkata Knight Riders");
		   team.setCaptainName("Ajinkya Rahane");
		   team.setCoachName("Chandrakant Pandit");
		   team.setQualified(false);
		   team.setnRR(6.9f);
		   return team;     
	  } 
}



	  
	
	   

	  
	
