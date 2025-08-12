package service;

 import entity.Team;
 import repository.TeamRepository;

public class TeamService {
	
	 public void printTeamDetails() {
		 Team team = TeamRepository.getMiTeamDetails();
		 Team team1 = TeamRepository.getRCBTeamDetails();
		 Team team2 = TeamRepository.getCSKTeamDetails();
		 Team team3 = TeamRepository.getGTTeamDetails();
		 Team team4 = TeamRepository.getRRTeamDetails();
		 Team team5 = TeamRepository.getDCTeamDetails();
		 Team team6 = TeamRepository.getLSGTeamDetails();
		 Team team7 = TeamRepository.getSRHTeamDetails();
		 Team team8 = TeamRepository.getKKRTeamDetails();
	 
		 
		  System.out.println(team.getId());
		  System.out.println(team.getTeamName());
		  System.out.println(team.getCaptainName());
		  System.out.println(team.getCoachName());
		  System.out.println(team.getnRR());
		  System.out.println(team.isQualified()); 
		  
		  System.out.println(team1.getId());
	      System.out.println(team1.getTeamName());
	      System.out.println(team1.getCaptainName());
	      System.out.println(team1.getCoachName());
	      System.out.println(team1.getnRR());
	      System.out.println(team1.isQualified()); 
	     
	      System.out.println(team2.getId());
	      System.out.println(team2.getTeamName());
	      System.out.println(team2.getCaptainName());
	      System.out.println(team2.getCoachName());
	      System.out.println(team2.getnRR());
	      System.out.println(team2.isQualified()); 
	      
	      System.out.println(team3.getId());
	      System.out.println(team3.getTeamName());
	      System.out.println(team3.getCaptainName());
	      System.out.println(team3.getCoachName());
	      System.out.println(team3.getnRR());
	      System.out.println(team3.isQualified());
	      
	      System.out.println(team4.getId());
	      System.out.println(team4.getTeamName());
	      System.out.println(team4.getCaptainName());
	      System.out.println(team4.getCoachName());
	      System.out.println(team4.getnRR());
	      System.out.println(team4.isQualified());
	      
	      System.out.println(team5.getId());
	      System.out.println(team5.getTeamName());
	      System.out.println(team5.getCaptainName());
	      System.out.println(team5.getCoachName());
	      System.out.println(team5.getnRR());
	      System.out.println(team5.isQualified());
	      
	      System.out.println(team6.getId());
	      System.out.println(team6.getTeamName());
	      System.out.println(team6.getCaptainName());
	      System.out.println(team6.getCoachName());
	      System.out.println(team6.getnRR());
	      System.out.println(team6.isQualified());
	      
	      System.out.println(team7.getId());
	      System.out.println(team7.getTeamName());
	      System.out.println(team7.getCaptainName());
	      System.out.println(team7.getCoachName());
	      System.out.println(team7.getnRR());
	      System.out.println(team7.isQualified());
	      
	      System.out.println(team8.getId());
	      System.out.println(team8.getTeamName());
	      System.out.println(team8.getCaptainName());
	      System.out.println(team8.getCoachName());
	      System.out.println(team8.getnRR());
	      System.out.println(team8.isQualified());
	 }    
	     
}
