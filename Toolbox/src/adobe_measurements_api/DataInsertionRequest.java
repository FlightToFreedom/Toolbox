package adobe_measurements_api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DataInsertionRequest
{
	public static void main(String[] args) throws Exception
	{
		int max=100;
		for(int i=0; i<max;i++){

			DataInsertion di = new DataInsertion( "enrico","999999999" );
			di.set( "ipaddress", "127.0.0.1" );
			di.set( "pagename", "Yo!" );
			di.set( "channel", "hier wordt ik vroolijk van :)" );
			di.set( "evar1", "Test|Test Page|All" );

			URL url = null;
			URLConnection urlConn         = null;
			DataOutputStream printout     = null;
			BufferedReader input        = null;
			String u            = "http://daxcomscoredev.sc.omtrdc.net/b/ss/ll/6";
			String tmp             = null;

			url = new URL( u );
			urlConn = url.openConnection();
			urlConn.setDoInput( true );
			urlConn.setDoOutput( true );
			urlConn.setUseCaches( false );
			urlConn.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded" );

			printout             = new DataOutputStream(urlConn.getOutputStream());

			printout.writeBytes( di.toString() );
			printout.flush();
			printout.close();

			input         = new BufferedReader( new InputStreamReader( urlConn.getInputStream( ) ) );

			System.out.println( di );
			while( null != ( ( tmp = input.readLine() ) ) )
			{
				System.out.println( tmp );
			}
			printout.close();
			input.close();
		}
	}

}