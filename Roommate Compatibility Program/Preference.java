/*Name:Tommy Lee Truong
 *Last Edit:Nov 13 2017
 *Program Name: Roommate Compatibility Program 
 */
public class Preference {
	private int quietTime = 0;
	private int music = 0;
	private int reading = 0;
	private int chatting = 0;
	
		
	
	public void QuietTime (int newQuietTime) {
		if (newQuietTime > 10 || newQuietTime < 0 ) {
			throw new IllegalArgumentException("quietTime should be in the range of [0-10].");
		}
		else {
			quietTime = newQuietTime;
		}
	}
	public void Music (int newMusic) {
		if ( newMusic > 10 || newMusic < 0 ) {
			throw new IllegalArgumentException("music should be in the range of [0-10].");
		}
		else {
			music = newMusic;
		}
	}
	public void Reading (int newReading) {
		if (newReading> 10 || newReading < 0 ) {
			throw new IllegalArgumentException("reading should be in the range of [0-10].");
		}
		else {
			reading = newReading;
		}
	}
	public void Chatting (int newChatting) {
		if (newChatting > 10 || newChatting < 0 ) {
			throw new IllegalArgumentException("chatting should be in the range of [0-10].");
		}
		else {
			chatting = newChatting;
		}
	}
	public int getquietTime() {
		return quietTime;
	}
	
	public int getmusic() {
		return music;
	}
	public int getreading() {
		return reading;
	}
	public int getchatting() {
		return chatting;
	}
	public int comparepref (Preference pref) {
		int Diff =Math.abs(this.getquietTime() - pref.getquietTime()) + Math.abs(this.getmusic() - pref.getmusic()) + Math.abs(this.getreading() - pref.getreading()) + Math.abs(this.getchatting() - pref.getchatting());
		return Diff;
	}
	
}
