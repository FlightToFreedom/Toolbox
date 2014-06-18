package options;

import java.util.Calendar;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class MainCli {

	public static void main(String[] args) {

		// build the options container and the option itself

		Options options = new Options();

		options.addOption("t", false, "Time of now");

		options.addOption("n", true, "Name ");

		// make a parser and build the CommandLine object

		CommandLineParser parser = new BasicParser();

		CommandLine cmd = null;

		try {

			cmd = parser.parse(options, args);

		} catch (ParseException e) {

			usage(options);

			System.exit(1);

		}

		// test

		if (cmd.hasOption("t")) {

			System.out.println("Time now is: "
					+ Calendar.getInstance().get(Calendar.HOUR_OF_DAY));

		}

		// test

		if (cmd.hasOption("n")) {

			String value = cmd.getOptionValue("n");

			if (value == null) {

				usage(options);

			} else {

				System.out.println("Your name is " + value);

			}

		}

	}

	private static void usage(Options options) {

		// Use the inbuilt formatter class

		HelpFormatter formatter = new HelpFormatter();

		formatter.printHelp("CLIDemo", options);

	}

}
