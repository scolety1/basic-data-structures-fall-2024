package data;

public class User {

	private String name;
	private String favoriteGift;
	private String favoriteFlowers;
	private String hobby;
	private String favoriteShow;
	private String favoriteColor;
	private String preferredGiftType;

    // Constructor
    public User(String name, String favoriteColor, String favoriteShow, String hobby, String preferredGiftType) {
        this.name = name;
        this.favoriteColor = favoriteColor;
        this.favoriteShow = favoriteShow;
        this.hobby = hobby;
        this.preferredGiftType = preferredGiftType;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getFavoriteShow() {
        return favoriteShow;
    }

    public String getHobby() {
        return hobby;
    }

    public String getPreferredGiftType() {
        return preferredGiftType;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               "\nFavorite Color: " + favoriteColor +
               "\nFavorite Show: " + favoriteShow +
               "\nHobby: " + hobby +
               "\nPreferred Gift Type: " + preferredGiftType;
    }
}
