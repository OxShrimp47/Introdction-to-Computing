/*Name:Tommy Lee Truong
 *Last Edit:Nov 13 2017
 *Program Name: Roommate Compatibility Program 
 */
public class Student {
	private String name = "";
	private char gender = 'M';
	private Date birthdate;
	private Preference pref;
	private Boolean match = false;
	public void StudentInfo() {
		name = "";
		gender = 'M';
		birthdate = new Date();
		pref = new Preference();
		match = false;
	}
	public String getName() {
		return name;
	}
	public void setName (String newName) {
		name = newName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender (char newGender) {
		gender = newGender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(int newY, int newM, int newD) {
		birthdate.Year(newY);
		birthdate.Month(newM);
		birthdate.Day(newD);
	}
	public Preference getPref() {
		return pref;
	}
	public void setPref(int newQT, int newMu, int newR, int newCh ) {
		pref.QuietTime(newQT);
		pref.Music(newMu);
		pref.Reading(newR);
		pref.Chatting(newCh);
	}
	public Boolean getMatch() {
		return match;
	}
	
public int compare (Student st) {
		int Score = (40 -(this.getPref().comparepref(st.getPref())) ) + (60 - (this.getBirthdate().comparedate(st.getBirthdate())));
		return Score;
	}
	public void CheckMatch(Student A, Student B) {
			A.match = true;
			B.match =true;
		
	}
	
	
	
}
