package donnee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modele.Servanto;

public class ServantoDAO {

	public Servanto recupServant() {
		Servanto servant = new Servanto();
		String URL_ATLAS_ACADEMY = "https://api.atlasacademy.io/nice/NA/servant/104900?lore=false";
		String json = "";
		try {
			URL url = new URL(URL_ATLAS_ACADEMY);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JsonParser parseur = new JsonParser();
		JsonObject servJson = parseur.parse(json).getAsJsonObject();
		
		String name = servJson.get("name").getAsString();
		servant.setNom(name);
		
		String classe = servJson.get("className").getAsString();
		servant.setClasse(classe);
		
		int rarity = servJson.get("rarity").getAsInt();
		servant.setRarete(rarity);
		
		int atk = servJson.get("atkMax").getAsInt();
		servant.setAtk(atk);
		
		int hp = servJson.get("hpMax").getAsInt();
		servant.setPv(hp);
		
		JsonElement npJson = servJson.getAsJsonArray("noblePhantasms").get(0);
		JsonObject npInfosJson = npJson.getAsJsonObject();
		String np = npInfosJson.get("name").getAsString();
		servant.setNp(np);
		System.out.println(name + " " + classe + " " + rarity + " " + atk + " " + hp + " " +np);
		return servant;
	}
	
}
