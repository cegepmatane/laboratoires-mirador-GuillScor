package donnee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modele.Operator;

public class OperatorDAO {

	public Operator recupererOperator() {
		Operator operator = new Operator();
		
		String URL_RHODES_API ="https://rhodesapi.up.railway.app/api/operator/Fiammetta";
		String json = "";
		try {
			URL url = new URL(URL_RHODES_API);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JsonParser parseur = new JsonParser();
		JsonObject operatorJson = parseur.parse(json).getAsJsonObject();
		String name = operatorJson.get("name").getAsString();
		String description = operatorJson.get("description").getAsString();
		operator.setNom(name);
		operator.setDescription(description);
		
		String job = "";
		for(int i = 0; i<=2;i++) {
			JsonElement classJson = operatorJson.getAsJsonArray("class").get(i);
			job += classJson.getAsString();
			if(i<=1) {
				job+="/";
			}
		}
		operator.setJob(job);
		System.out.println(job);
		
		JsonObject statsJson = operatorJson.get("statistics").getAsJsonObject();
		JsonObject statsE2Json = statsJson.get("e2max").getAsJsonObject();
		int hp = statsE2Json.get("hp").getAsInt();
		int atk = statsE2Json.get("atk").getAsInt();
		int def = statsE2Json.get("def").getAsInt();
		operator.setHp(hp);
		operator.setAtk(atk);
		operator.setDef(def);
		
		JsonElement image1Json = operatorJson.getAsJsonArray("art").get(1);
		JsonElement image2Json = operatorJson.getAsJsonArray("art").get(2);
		JsonObject im1Json = image1Json.getAsJsonObject();
		JsonObject im2Json = image2Json.getAsJsonObject();
		String image1 = im1Json.get("link").getAsString();
		String image2 = im2Json.get("link").getAsString();
		operator.setImage1(image1);
		operator.setImage2(image2);
		
		System.out.println(name + " " + hp + " " + atk + " " +def);
		System.out.println(description);
		System.out.println(image1);
		System.out.println(image2);
		return operator;
	}
}
