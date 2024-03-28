package view;


public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist("Usuário");
        playlist.adicionarMusica(new Musica("Bohemian Rhapsody", "Queen", "EMI"));
        playlist.adicionarMusica(new Musica("Shape of You", "Ed Sheeran", "Atlantic"));
        playlist.adicionarMusica(new Musica("Billie Jean", "Michael Jackson", "Epic"));

        playlist.tocarMusica();
    }
}
