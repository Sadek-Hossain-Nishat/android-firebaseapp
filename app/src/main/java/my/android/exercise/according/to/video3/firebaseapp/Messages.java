package my.android.exercise.according.to.video3.firebaseapp;

public class Messages {

    // Model Class
    String name,imageUrl;

    //Constructors
    public Messages() {
    }

    public Messages(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    //getters and setters of these declearing variables

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
