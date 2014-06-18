package regexp;

public class Match {

	public static void main(String[] args) {

		/**
		 * Urls to be covered: azure.microsoft.com (good),
		 * account.windowsazure.com (good), www.azure.microsoft.com(good),
		 * info.windowsazure.com(good), www.windowsazure.com (good)
		 */

		String[] urls = { "azure.microsoft.com",
				"account.windowsazure.com",
				"www.azure.microsoft.com",
				"info.windowsazure.com",
				"www.windowsazure.com" };

		String regexp = "^.*(windowsazure\\.com|azure\\.microsoft\\.com).*$";

		for (String url : urls) {
			System.out.println(url
					.matches(regexp));
		}
	}
}
