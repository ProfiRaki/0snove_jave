package d19_05_2022;

public class MainFaceBookPost {
    public static void main(String[] args) {
        FaceBookPost f1 = new FaceBookPost();
        FaceBookPost f2 = new FaceBookPost();
        f1.objavioc = "Tr Tric";
        f1.objavljenioc = "Kod Kodic";
        f1.text = "kkkkkk kkkkl";
        f1.lajkovi = 10;
        f1.deljenja = 3;
        f1.stampaj();
        f1.like();
        f1.like();
        f1.share();
        f1.stampaj();
        f1.dislike();
        f1.stampaj();
        
    }
}
