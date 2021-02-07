public class Inheritance {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20 ,"Male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        Engineer working = new Engineer("Mark", 30, "Male");
        working.work = "desing and draft blueprints";
        working.introduce();
        working.design();

        Doctor type = new Doctor("Emma", 27, "Female");
        type.doc = "She take care of Allergic diseases";
        type.introduce();
        type.specialty();

        Actor Movie = new Actor("Mille", 16, "Female");
        Movie.movie = "Enola Holmes";
        Movie.introduce();
        Movie.Actress();

       Singer Album = new Singer("Keshi", 26, "Male");
       Album.song = "Hip hop,R&B";
       Album.introduce();
       Album.Music();

       Designer sign = new Designer("John",60, "Male");
       sign.dior = "Dior fashion";
       sign.introduce();
       sign.diorWork();

    }
}
