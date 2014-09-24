package regexp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleMatcher {

	public static void main(String... args) {
		// String regex =
		// "^https?://.*\\.mobistar\\.be/((fr|nl)/)?(aide|forum?s|info|information|help|hulp){1,}";
		String vector = "http://www.mobistar.be/nl/";

		// System.out.println(vector.matches(regex));

		Map<String, String> rules = new HashMap<String, String>();
		rules.put(
				"^http://www\\.mobistar\\.be/fr/offre/info/charte-mobistar",
				"Ecare");
		rules.put(
				"http://www\\.mobistar\\.be/partage",
				"Eshop");
		rules.put(
				"^https?://(shops|support)\\.mobistar\\.be.*",
				"Esupport");
		rules.put(
				"^https?://www\\.mobistar\\.be/.*/user/register\\?destination\\=learn.*blog.*",
				"Blog");
		rules.put(
				"^https?://www\\.mobistar\\.be/fr/e-services/decouvrez-l-espace-client",
				"Ecare");
		rules.put(
				"^https?://www\\.mobistar\\.be/fr/offre/info/checkup",
				"Ecare");
		rules.put(
				"^https?://www\\.mobistar\\.be/fr/particuliers/campaigns/hp/index.html",
				"Eshop");
		rules.put(
				"^https?://www\\.mobistar\\.be/nl/aanbod/info/checkup",
				"Ecare");
		rules.put(
				"^https?://www\\.mobistar\\.be/nl/user/login?destination\\=forum.*",
				"Esupport");
		rules.put(
				"^https?://.*\\.mobistar\\.be/((fr|nl)/)?(aide|forum?s|info|information|help|hulp){1,}",
				"Esupport");
		rules.put(
				"^https?://.*\\.mobistar\\.be/((fr|nl)/)?(espace\\-client|e\\-services|particuliers|klantenzone|secured/espace\\-client/|secured/klantenzone/).*",
				"Ecare");
		rules.put(
				"^https?://.*\\.mobistar\\.be/(delen|fr/offre|nl/aanbod)",
				"Eshop");
		rules.put(
				"^https?://.*\\.mobistar\\.be/(fr|nl)/(blog|category/blog-category|comment){1,}",
				"Blog");
		rules.put(
				"^https?://.*\\.mobistar\\.be//?(fr|nl|en)/(offre|offer|accessoires|cart|aanbod).*",
				"Eshop");
		rules.put(
				"^http://my\\.mobistar\\.be/info/contactus.*",
				"Esupport");
		rules.put(
				"^http://my\\.mobistar\\.be/info/uitleg-factuur/index.html",
				"Esupport");
		rules.put(
				"^http://my\\.mobistar\\.be/info/verkooppunt-zoeken/index.html.*",
				"Esupport");
		rules.put(
				"^http://my\\.mobistar\\.be/information/contactus.*",
				"Esupport");
		rules.put(
				"^http://my\\.mobistar\\.be/information/explication-facture/index.html",
				"Esupport");
		rules.put(
				"^http://my\\.mobistar\\.be/information/zoomit/index.html",
				"Esupport");
		rules.put(
				"^http://www\\.mobistar\\.be/callme",
				"Esupport");
		rules.put(
				"^http://www\\.mobistar\\.be/fr/contact?m_i=OgROjt_jWCPzn5uDK08RcZddufOkXz1C%2BpNn0ObgC72Oi2eO1",
				"Ecare");
		rules.put(
				"^http://www\\.mobistar\\.be/fr/email-facture-web",
				"Ecare");
		rules.put(
				"^http://www\\.mobistar\\.be/nl/delen",
				"Eshop");
		rules.put(
				"^http://www\\.mobistar\\.be/nl/wat-betekent-third-party-services-op-mijn-factuur",
				"Esupport");
		rules.put(
				"^http://www\\.mobistar\\.be/nl/wat-een-mms",
				"Esupport");
		rules.put(
				"^http://www\\.mobistar\\.be/nl/wat-kan-ik-nog-doen-als-ik-geen-belwaarde-meer-heb",
				"Esupport");
		rules.put(
				"^http://www\\.mobistar\\.be/nl/welke-applicaties-zijn-beschikbaar-op-mmobistarbe",
				"Esupport");
		rules.put(
				"^http://www\\.mobistar\\.be/offre/internet-mobile/internet-everywhere",
				"Eshop");
		rules.put(
				"^http?://www\\.mobistar\\.be/fr/contact/par-telephone.*",
				"Ecare");
		rules.put(
				"^https://www\\.mobistar\\.be/fr/user/login?destination=node%2F19761",
				"Ecare");
		rules.put(
				"^https://www\\.mobistar\\.be/fr/user/login?destination=node%2F22191",
				"Ecare");
		rules.put(
				"^https://www\\.mobistar\\.be/fr/user/login?destination=node%2F22221",
				"Ecare");
		rules.put(
				"^https://www\\.mobistar\\.be/nl/user/login?destination=node%2F19701",
				"Ecare");
		rules.put(
				"^https://www\\.mobistar\\.be/nl/user/login?destination=node%2F19931",
				"Ecare");
		rules.put(
				"http://www\\.mobistar\\.be//fr/e-services/login",
				"Ecare");
		rules.put(
				"^https://www\\.mobistar\\.be/nl/waar-kan-ik-de-lijst-met-incidenten-en-geplande-interventies-op-het-adsl-netwerk-van-mobistar-bekijk",
				"Esupport");
		rules.put(
				"^https://www\\.mobistar\\.be/nl/wat-de-factureringsperiode-en-kan-ik-deze-veranderen",
				"Esupport");
		rules.put(
				"^https?://www\\.mobistar\\.be/fr/contact.*",
				"Ecare");
		rules.put(
				"^https?://www\\.mobistar\\.be/fr/contact/service-mediation.*",
				"Ecare");
		rules.put(
				"^https?://www\\.mobistar\\.be/nl/contact.*",
				"Esupport");
		rules.put(
				"^https?://www\\.mobistar\\.be/nl/contact/ombudsdienst.*",
				"Esupport");
		rules.put(
				"^https?://www\\.mobistar\\.be/nl/ik-heb-het-nummer-van-mijn-voicemail-veranderd-en-nu-kan-ik-geen-berichten-meer-versturen-ontvangen",
				"Blog");
		rules.put(
				"^https?://www\\.mobistar\\.be/nl/ik-kan-geen-sms039en-meer-versturen-wat-nu",
				"Blog");
		rules.put(
				"^https?://www\\.mobistar\\.be/nl/opties-en-diensten/gsm/configuratie",
				"Eshop");
		rules.put(
				"^https?://.*mobistar.be/.*/user/login\\?destination\\=node.*",
				"Ecare");
		rules.put(
				"^https?://.*mobistar.be/fr/user$",
				"Esupport");
		rules.put(
				"^https?://.*mobistar.be/.*/user/[0-9]/.*",
				"Esupport");
		rules.put(
				"^https?://.*mobistar.be/.*/user/login\\?destination\\=comment.*reply.*",
				"Esupport");
		rules.put(
				"^https?://.*mobistar.be/.*/users/.*",
				"Esupport");
		rules.put(
				"^https?://e\\-services\\.mobistar\\.be*",
				"Ecare");
		rules.put(
				"^https?://www\\.mobistar\\.be/fr/$",
				"Portal");
		rules.put(
				"^https?://www\\.mobistar\\.be/nl",
				"Portal");
		rules.put(
				"^https?://www\\.mobistar\\.be/",
				"Portal");
		rules.put(
				"^https?://www\\.mobistar\\.be/(nl|fr|en)/$",
				"Portal");
		rules.put(
				"^https?://www\\.mobistar\\.be/$",
				"Portal");
		rules.put(
				"^https?://www\\.mobistar\\.be/(nl|fr)/\\?ac_src.*",
				"Portal");
		rules.put(
				"^https?://www\\.mobistar\\.be/(nl|fr)/\\?utm_source.*",
				"Portal");
		rules.put(
				"^https?://www\\.mobistar\\.be/en$",
				"Portal");
		rules.put(
				"^https?://www\\.mobistar\\.be//fr/e-services/login.*",
				"Ecare");

		Set<String> urls = rules.keySet();
		for (String match : urls) {
			if (vector.matches(match)) {
				System.out.println(rules
						.get(match) + match);
			}
		}
	}
}
