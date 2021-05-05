package Business.Concrete;

import java.util.ArrayList;

import Business.Abstract.CampaignService;
import Business.Abstract.GameService;
import Entitties.Concrete.Campaign;
import Entitties.Concrete.Game;
import Entitties.Concrete.User;

public class GameManager implements GameService {

	ArrayList<Game> games;

	public GameManager() {
		super();
		games = new ArrayList<Game>();
	}

	@Override
	public Game get(int id) {
		Game game=games.stream().filter(c->c.getId()==id).findFirst().orElse(null);
		System.out.println("---------- Tek bir oyun getirme i�lemi ba�lang�c�-----------");
		if(game!=null) {
		System.out.println("Id : "+ game.getId());
		System.out.println("Oyun ad� : "+ game.getName());
		System.out.println("Fiyat� : "+ game.getPrice());
		System.out.println("Stok : "+ game.getStock());
		}else {
			System.out.println(	" Oyun bulunamad� ");
		}
		System.out.println("---------- Tek bir oyun getirme i�lemi son -----------");
		return game;
	}

	@Override
	public void getAll() {

		for (Game game : games) {
			System.out.println("---------- T�m oyunlar� getirme i�lemi ba�lang�c�-----------");
			System.out.println("Id : "+ game.getId());
			System.out.println("Oyun ad� : "+ game.getName());
			System.out.println("Fiyat� : "+ game.getPrice());
			System.out.println("Stok : "+ game.getStock());
			System.out.println("---------------------------------------------");
		}
		System.out.println("---------- T�m oyunlar� getirme i�lemi son -----------");

	}

	@Override
	public void update(Game game) {
		Game gameUpdate = games.stream().filter(c -> c.getId() == game.getId()).findFirst().orElse(null);
		if(gameUpdate!=null) {
		games.remove(gameUpdate);
		games.add(game);
		System.out.println(" Oyun ba�ar�yla g�ncellendi.");
		}else {
			System.out.println(" Oyun bulunamad�. ");
		}
		
	}

	@Override
	public void add(Game game) {
		games.add(game);
		System.out.println(" Oyun ba�ar�yla eklendi.");

	}

	@Override
	public void delete(int id) {
		Game gameDelete=games.stream().filter(c->c.getId()==id).findFirst().orElse(null);
		if(gameDelete!=null) {
			games.remove(gameDelete);
			System.out.println(" Oyun ba�ar�yla silindi.");
		}else {
			System.out.println(" Oyun bulunamad�.");
		}
		

	}

	@Override
	public void sales(Game selectedGame, User user, CampaignService campaignManager) {
		
		Campaign campaign=campaignManager.getByGameId(selectedGame.getId());
		
		double finalPrice = selectedGame.getPrice();		
		if(campaign !=null) {
			int rate=100- campaign.getRate();
			finalPrice=(rate* selectedGame.getPrice())/100;
			System.out.println("Oyun " + campaign.getName() + " indirimine girdi. ");
			System.out.println("Fiyat� " + selectedGame.getPrice() + " yerine " + finalPrice + " olarak g�ncellendi");
			
		}
		
		System.out.println( selectedGame.getName() +   " �simli oyun " + user.getFirstName() + " " + user.getLastName() + " ki�isi taraf�ndan " + finalPrice + " liraya sat�n al�nd�");
		
	}

}
