package repository;

import entity.Team;

public class TeamRepository {
	
	 //should return MI team details
	  public static Team getMiTeamDetails() {
		  
	  
	  
	   Team team = new Team();
	   team.setId(45);
	   team.setTeamName("Mumbai Indians");
	   team.setCaptainName("Hardik Pandya");
	   team.setCoachName("Jaywadhane");
	   team.setQualified(true);
	   team.setnRR(10.3f);
	   return team;
	  }
	  // add similar methods for remaining 9 teams
	  
	  public static Team getRCBTeamDetails() {
		  
		   Team team1 = new Team();
		   team1.setId(18);
		   team1.setTeamName("Royal Challengers Banglore");
		   team1.setCaptainName("Virat Kohali");
		   team1.setCoachName("Andy Flower");
		   team1.setQualified(false);
		   team1.setnRR(5.3f);
		   return team1;
		  }
	
	  public static Team getCSKTeamDetails() {
		  
		   Team team2 = new Team();
		   team2.setId(7);
		   team2.setTeamName("Chennai Super Kings");
		   team2.setCaptainName("MS Dhoni");
		   team2.setCoachName("Stephen Fleming");
		   team2.setQualified(true);
		   team2.setnRR(7.3f);
		   return team2;  	  
	  }
	  
	  public static Team getGTTeamDetails() {
		  
		   Team team3 = new Team();
		   team3.setId(77);
		   team3.setTeamName("Gujrat Titans");
		   team3.setCaptainName("Shubhaman Gill");
		   team3.setCoachName("Ashish Nehra");
		   team3.setQualified(true);
		   team3.setnRR(6.1f);
		   return team3;     
	  }
	  
	  public static Team getRRTeamDetails() {
		  
		   Team team4 = new Team();
		   team4.setId(11);
		   team4.setTeamName("Rajasthan Royals");
		   team4.setCaptainName("Sanju Samson");
		   team4.setCoachName("Rahul Dravid");
		   team4.setQualified(false);
		   team4.setnRR(4.1f);
		   return team4;     
	  }
	  
	  public static Team getDCTeamDetails() {
		  
		   Team team5 = new Team();
		   team5.setId(20);
		   team5.setTeamName("Delhi Captitals");
		   team5.setCaptainName("Axar Patel");
		   team5.setCoachName("Hemang Badani");
		   team5.setQualified(false);
		   team5.setnRR(3.1f);
		   return team5;     
	  }
	  
	  public static Team getLSGTeamDetails() {
		  
		   Team team6 = new Team();
		   team6.setId(20);
		   team6.setTeamName("Lucknow SuperGiants");
		   team6.setCaptainName("Rishabh Pant");
		   team6.setCoachName("Justin Langer");
		   team6.setQualified(false);
		   team6.setnRR(2.9f);
		   return team6;     
	  }
	  
	  public static Team getPBKSTeamDetails() {
		  
		   Team team7 = new Team();
		   team7.setId(20);
		   team7.setTeamName("Punjab Kings");
		   team7.setCaptainName("Punjab Kings");
		   team7.setCoachName("Ricky Ponting");
		   team7.setQualified(false);
		   team7.setnRR(7.9f);
		   return team7;     
	  }
	  
	  public static Team getSRHTeamDetails() {
		  
		   Team team7 = new Team();
		   team7.setId(20);
		   team7.setTeamName("Sunrisers Haiderabad");
		   team7.setCaptainName("Pat Cummins");
		   team7.setCoachName("Daniel Vettori");
		   team7.setQualified(false);
		   team7.setnRR(8.9f);
		   return team7;     
	  } 
	  
	  public static Team getKKRTeamDetails() {
		  
		   Team team8 = new Team();
		   team8.setId(20);
		   team8.setTeamName("Kolkata Knight Riders");
		   team8.setCaptainName("Ajinkya Rahane");
		   team8.setCoachName("Chandrakant Pandit");
		   team8.setQualified(false);
		   team8.setnRR(7.2f);
		   return team8;     
	  }  
}
	  
	
