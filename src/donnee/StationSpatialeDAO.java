package donnee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StationSpatialeDAO {
	public void detaillerPosition() {
		System.out.println("StationSpatialeDAO : Détailler position");
		String URL_STATION_POSITION = "http://api.open-notify.org/iss-now.json";
		String json = "";
		try {
			URL url = new URL(URL_STATION_POSITION);
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
		JsonObject ssiJson = parseur.parse(json).getAsJsonObject();
		int timestamp = ssiJson.get("timestamp").getAsInt();
		System.out.println("Timestamp " + timestamp);
		JsonObject positionJson = ssiJson.get("iss_position").getAsJsonObject();
		String latitudeTexte = positionJson.get("latitude").getAsString();
		String longitudeTexte = positionJson.get("longitude").getAsString();
		System.out.println("Position : " + latitudeTexte + ", " + longitudeTexte);
	}
}
