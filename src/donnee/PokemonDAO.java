package donnee;

import org.xml.sax.SAXException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import modele.Pokemon;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class PokemonDAO {
	public Pokemon recupererPokemon(){
		Pokemon poke = new Pokemon();
		
		String URL_POKE_INFOS = "https://pokeapi.co/api/v2/pokemon/torchic";
		String json = "";
		try {
			URL url = new URL(URL_POKE_INFOS);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(json);
		JsonParser parseur = new JsonParser();
		JsonObject pokeJson = parseur.parse(json).getAsJsonObject();
		
		JsonElement formsJson = pokeJson.getAsJsonArray("forms").get(0);
		JsonObject nameJson = formsJson.getAsJsonObject();
		
		String name = nameJson.get("name").getAsString();
		poke.setNom(name);
		
		JsonElement typesJson = pokeJson.getAsJsonArray("types").get(0);
		JsonObject typeJson = typesJson.getAsJsonObject();
		
		JsonObject typeDescJson = typeJson.get("type").getAsJsonObject();
		String types = typeDescJson.get("name").getAsString();
		poke.setTypes(types);
		
		int id = pokeJson.get("id").getAsInt();
		poke.setId(id);
		double weight = pokeJson.get("weight").getAsDouble();
		poke.setWeight(weight/10);
		double height = pokeJson.get("height").getAsDouble();
		poke.setHeight(height*0.1);
		
		System.out.println(name + " "+ types + " " + id +" " + height + " "+ weight);
		return poke;
	}
}
