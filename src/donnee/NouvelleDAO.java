package donnee;

import org.xml.sax.SAXException;
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

import modele.Nouvelle;

public class NouvelleDAO {
	public List<Nouvelle> listerNouvelles() {
		
		List<Nouvelle> nouvelles = new ArrayList<Nouvelle>();
		
		String URL_LISTE_SORTIES = "https://leagueoflegends.jeuxonline.info/rss/actualites/rss.xml";
		String xml = "";
		try {
			URL url = new URL(URL_LISTE_SORTIES);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			xml = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(xml);
		try {
            DocumentBuilder parseur = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            byte[] octets = xml.getBytes();
            InputStream flux = new ByteArrayInputStream(octets);
            Document document = parseur.parse(flux);
            NodeList listeNoeudsItems = document.getElementsByTagName("item");
            System.out.println("Nombre de nouvelles: " + listeNoeudsItems.getLength());
            
            for(int position = 0; position<listeNoeudsItems.getLength();position++) {
            	Element noeudItem = (Element)listeNoeudsItems.item(position);
            	String titre = noeudItem.getElementsByTagName("title").item(0).getTextContent();
            	//System.out.println("Titre: " + titre);
            	
            	Nouvelle nouvelle = new Nouvelle(titre, "");
            	nouvelles.add(nouvelle);
            	}
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
		return nouvelles;
	}
}
