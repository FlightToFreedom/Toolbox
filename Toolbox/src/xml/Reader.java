package xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Reader {

	public static void main(String[] args) {
		File fXmlFile = new File(args[0]);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		String chosenLevel = "2";// lets suppose they have chosen level one

		try {
			dBuilder = dbFactory.newDocumentBuilder();
			org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			// suppose they choose level one
			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("level");

			for (int i = 0; i < nList.getLength(); i++) {
				Node levelNode = nList.item(i);
				if (levelNode.getNodeType() == Node.ELEMENT_NODE) {
					Element levelElement = (Element) levelNode;
					if (levelElement.getAttribute("id").equals(chosenLevel)) {
						NodeList sites = doc.getElementsByTagName("site");
						for (int z = 0; z < sites.getLength(); z++) {
							Node siteNode = sites.item(z);
							if (siteNode.getNodeType() == Node.ELEMENT_NODE) {
								Element siteElement = (Element) siteNode;
								Node papa = siteElement.getParentNode();
								Element change = (Element) papa;
								if (change.getAttribute("id").equals(
										chosenLevel)) {
									String virtualSite = siteElement
											.getAttribute("name");// the value
									// to
									// return!!
									System.out.println("SITE " + virtualSite);
									NodeList nameValuePairs = siteElement
											.getElementsByTagName("namevaluepair");
									for (int h = 0; h < nameValuePairs
											.getLength(); h++) {
										System.out.println(nameValuePairs.item(
												h).getTextContent());
									}

								}
							}
						}
					}
				}
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
