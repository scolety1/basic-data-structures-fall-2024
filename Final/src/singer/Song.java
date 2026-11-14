package singer;

public class Song {

	private String songName;
	private int year;
	private Singer artist;
	
	
	public Song(String sn, int y, Singer a) {
		this.songName = sn;
		this.year = y;
		this.artist = a;
	}
	
	public void setTitle(String string) {
		this.songName = string;
	}

	public void setYear(int i) {

		this.year = i;
	}

	public String getTitle() {
		return this.songName + this.year + this.artist;
	}

}
