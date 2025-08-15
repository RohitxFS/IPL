package entity;

public class Team {
	
	 private int id;
	 
	 private String teamName;
	 
	 private String captainName;
	 
	 private String coachName;
	 
	 private float nRR;
	 
	 private boolean isQualified;
	 
	 private String shortName;
	 
	 public String getShortName() {
		 return shortName;
	 }
	 public void setShortName(String shortName) {
		 this.shortName = shortName;
	 }
	 
	 //toString() -> converts objects toString
	 //right click -> source -> generate toString()
	 
	 @Override
		public String toString() {
			return " Team id=" + id +"\n"+ " teamName=" + teamName +"\n"+ " captainName=" + captainName +"\n"+ " coachName=" + coachName
					+"\n" + " nRR=" + nRR +"\n" + " isQualified=" + isQualified +"\n" + " shortName=" + shortName + "\n";
		}

	 // setter-getter
	 public int getId() {
		 return id;
	 }
	  
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getTeamName() {
		 return teamName;
	 }
	 public void setTeamName(String teamName) {
		 this.teamName = teamName;
	 }
	 public String getCaptainName() {
		 return captainName;
	 }
	 public void setCaptainName(String captainName) {
		 this.captainName =  captainName;
	 }
	 public String getCoachName() {
		return coachName;
	 }
	 public void setCoachName(String coachName) {
		 this.coachName = coachName;
	 }
	 
	 public float getnRR() {
		 return nRR;
	 }
	 
	 public void setnRR(float nRR) {
		 this.nRR = nRR;
	 }
	 
	 public boolean isQualified() {
		 return isQualified;
	 }
	 
	 public void setQualified(boolean isQualified) {
		 this.isQualified = isQualified;
	 }
}
