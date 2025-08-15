package service;

 import java.util.Scanner;

//import entity.Team;
 import repository.TeamRepository;

public class TeamService {
	
   public void selectOptions() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Welcome to IPL portal");
	    System.out.println("Please select following options - ");
	    System.out.println("1. Get All Team Details :");
	    System.out.println("2. Get Team Details By Name :");
	    System.out.println("3. Get Team Details By ID ");
    
	    int input = sc.nextInt();
	    System.err.println("You have selected option :" + input );
	    
	    switch(input) {
	    
	    case 1:  {
	    	
	    	System.out.println(TeamRepository.getMiTeamDetails());
	    	System.out.println(TeamRepository.getRCBTeamDetails());
	    	System.out.println(TeamRepository.getCSKTeamDetails());
	    	System.out.println(TeamRepository.getGTTeamDetails());
	    	System.out.println(TeamRepository.getLSGTeamDetails());
	    	System.out.println(TeamRepository.getDCTeamDetails());
	    	System.out.println(TeamRepository.getKKRTeamDetails());
	    	System.out.println(TeamRepository.getRRTeamDetails());
	    	System.out.println(TeamRepository.getSRHTeamDetails());
	    	System.out.println(TeamRepository.getPBKSTeamDetails());


	    	// call all remaining 8 team methods here
	    	break;
	    	 
	    }
	    //get team details by short name
	    case 2: {
	
	    	System.out.println("Please Enter Your Fav Teams Short Name : ");
	    	String teamShortName = sc.next();
	    	System.err.println("Entered Team Short Name Is : "+ teamShortName);
	    	getTeamByShortName(teamShortName);  
	    	break; 
	    }
	    case 3: {
	    	
	    	System.out.println("Please Enter Team ID : ");
	    	int teamId = sc.nextInt();
	    	System.err.println("Entered Team ID : "+ teamId);
	    	getTeamById(teamId);
	    	break;
	    }
	    
	    // for get team details by ID
    	// further logic should not have switch case
	   
	    default: 
	    	throw new IllegalArgumentException("Unexpected value : "+input);
	    }
   } 
     private void getTeamByShortName(String shortName) {
    	 //here we will write a code logic to get team details by short name
    	if(shortName.equalsIgnoreCase("MI")) {
    		System.out.println(TeamRepository.getMiTeamDetails());
    	} else if (shortName.equalsIgnoreCase("RCB")) {
    		System.out.println(TeamRepository.getRCBTeamDetails());
    	} else if (shortName.equalsIgnoreCase("CSK")) {
    		System.out.println(TeamRepository.getCSKTeamDetails());
    	} else if (shortName.equalsIgnoreCase("GT")) {
    		System.out.println(TeamRepository.getGTTeamDetails());
    	} else if (shortName.equalsIgnoreCase("LSG")) {
    		System.out.println(TeamRepository.getLSGTeamDetails());
    	} else if (shortName.equalsIgnoreCase("DC")) {
    		System.out.println(TeamRepository.getDCTeamDetails());
    	} else if (shortName.equalsIgnoreCase("KKR")) {
    		System.out.println(TeamRepository.getKKRTeamDetails());
    	} else if (shortName.equalsIgnoreCase("RR")) {
    		System.out.println(TeamRepository.getSRHTeamDetails());
    	} else if (shortName.equalsIgnoreCase("SRH")) {
    		System.out.println(TeamRepository.getSRHTeamDetails());
    	} else if (shortName.equalsIgnoreCase("PBKS")) {
    		System.out.println(TeamRepository.getPBKSTeamDetails());
    	} else {
    		System.out.println("Invalid Short Name ! Please try again");
        } 	 
     }
	     private void getTeamById(int id) {
	    if(id == 101) {
	    	System.out.println(TeamRepository.getMiTeamDetails());
	    } else if (id == 102) {
	    	System.out.println(TeamRepository.getRCBTeamDetails());
	    } else if (id == 103) {
	    	System.out.println(TeamRepository.getCSKTeamDetails());
	    } else if (id == 104) {
	    	System.out.println(TeamRepository.getGTTeamDetails());
	    } else if (id == 105) {
	    	System.out.println(TeamRepository.getRRTeamDetails());
	    } else if (id == 106) {
	    	System.out.println(TeamRepository.getDCTeamDetails());
	    } else if (id == 107) {
	    	System.out.println(TeamRepository.getLSGTeamDetails());
	    } else if (id == 108) {
	    	System.out.println(TeamRepository.getPBKSTeamDetails());
	    } else if (id == 109) {
	    	System.out.println(TeamRepository.getSRHTeamDetails());
	    } else if (id == 110) {
	    	System.out.println(TeamRepository.getKKRTeamDetails());
	    } else {
	    	System.out.println("Invalid Team ID ! Please try again");
	    }
	    	 
	     }
     
     
}
