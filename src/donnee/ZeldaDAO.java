package donnee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import modele.JeuZelda;


public class ZeldaDAO {
	public List<JeuZelda> listerZelda() {
		List<JeuZelda> jeux = new ArrayList<JeuZelda>();
		
		String URL_ZELDA_LIST = "https://zelda.fanapis.com/api/games?limit=100";
		String json = "";
		try {
			URL url = new URL(URL_ZELDA_LIST);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(json);
		JsonParser parseur = new JsonParser();
		JsonObject zeldaJson = parseur.parse(json).getAsJsonObject();
		JsonArray listJson = zeldaJson.get("data").getAsJsonArray();
		
		for(JsonElement jeu : listJson) {
			JsonObject jeuxJson = jeu.getAsJsonObject();
			JeuZelda jeuZelda = new JeuZelda();
			String name = jeuxJson.get("name").getAsString();
			String description = jeuxJson.get("description").getAsString();
			String releaseDate = jeuxJson.get("released_date").getAsString();
			jeuZelda.setNom(name);
			jeuZelda.setDate_sortie(releaseDate);
			jeuZelda.setDescription(description);
			jeux.add(jeuZelda);
			//System.out.println(name + " " + description + " " + releaseDate);
		}
		return jeux;
	}
}
