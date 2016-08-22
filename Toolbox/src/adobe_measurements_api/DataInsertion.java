package adobe_measurements_api;

import java.util.ArrayList;
import java.util.Iterator;

public class DataInsertion
{
	private String rptSuiteID             = null;
	private String visitorID             = null;
	private StringBuffer buff            = null;
	private final ArrayList<String> request    = new ArrayList<String>();

	public DataInsertion( String rsid, String vid )
	{
		this.rptSuiteID         = rsid;
		this.visitorID             = vid;
	}

	@Override
	public String toString()
	{
		buff                    = new StringBuffer();
		buff.append( "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" );
		buff.append( "<request>\n" );
		buff.append( "<sc_xml_ver>1.0</sc_xml_ver>\n" );

		if( this.rptSuiteID != null )
			buff.append( this.tagify( "reportsuiteid", this.rptSuiteID ) );

		if( this.visitorID != null )
			buff.append( this.tagify( "visitorid", this.visitorID ) );

		Iterator iter = this.request.iterator();

		while( iter.hasNext() )
		{
			buff.append( iter.next() );
		}
		buff.append( "</request>\n" );

		return buff.toString();
	}

	private String tagify( String name, String value )
	{
		return "<" + name + ">" + value + "</" + name + ">\n";
	}

	private String tagify( String name, char value )
	{
		return "<" + name + ">" + value + "</" + name + ">\n";
	}

	public void set( String tag, String value )
	{
		this.request.add( this.tagify(tag, value) );
	}

	public void set( String tag, char value )
	{
		this.request.add( this.tagify(tag, value) );
	}

}
