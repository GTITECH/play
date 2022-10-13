package aula11_10_22;

import java.util.ArrayList;

public class PlayGlaudestony implements IPlay {

	
	public ArrayList<Album> listaAlbum;
	
	public PlayGlaudestony() {
		this.listaAlbum= new ArrayList<Album>();
		System.out.println();
	}
	
	
	@Override
	public void start() {
		System.out.println("aluno");
		for (Album album : listaAlbum) {
			for (Musica m : album.getListaMusica()) {
				System.out.println(m.getNome());
			}
		}
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void stop() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void next(int quantidade) {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void back(int quantidade) {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void pause() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public String fabricante() {
		// TODO Stub de método gerado automaticamente
		return null;
	}

}
