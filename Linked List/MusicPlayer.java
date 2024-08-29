class MusicNode{
    String name;
    MusicNode next;
    MusicNode prev;

    public MusicNode(String name){
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}

class Player{
    public MusicNode head = null;
    public MusicNode current = null;
    public MusicNode tail = null;


    //add a song in playlist
    public void addsong(String songName) {
        MusicNode newNode = new MusicNode(songName);
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void play(){
        if(current != null){
            System.out.println("Now Playing: "+current.name);
        }else{
            System.out.println("No song in playlist");
        }
    }

    public void next(){
        if(current != null && current.next != null){
            current = current.next;
            play();
        }else{
            System.out.println("No next song available");
        }
    }

    public void prev(){
        if(current != null && current.prev != null){
            current = current.prev;
            play();
        }else{
            System.out.println("No previous song available");
        }
    }
}
public class MusicPlayer {
    public static void main(String[] args) {
        Player music = new Player();
        music.addsong("Man meri jaan");
        music.addsong("O maahi");
        music.addsong("apna bana le");
        music.play();
        music.next();
        music.next();
        music.prev();
    }
}
