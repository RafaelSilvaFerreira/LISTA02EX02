package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Playlist {
    private List<Musica> listaMusicas;

    public Playlist(String dono) {
        this.listaMusicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        listaMusicas.add(musica);
    }

    public void tocarMusica() {
        if (!listaMusicas.isEmpty()) {
            Random random = new Random();
            Musica musica = listaMusicas.get(random.nextInt(listaMusicas.size()));
            System.out.println("Tocando música: " + musica.getNome());
        } else {
            System.out.println("A playlist está vazia.");
        }
    }
}

