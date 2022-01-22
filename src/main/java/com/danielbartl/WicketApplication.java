package com.danielbartl;

import org.apache.wicket.csp.CSPDirective;
import org.apache.wicket.csp.CSPDirectiveSrcValue;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.file.Path;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see com.danielbartl.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{

	private static final int FIRST_LOOK_FOR_HTML_TEMPLATES_HERE = 0;

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

		// needed for the styling used by the quickstart
		getCspSettings().blocking()
				.add(CSPDirective.STYLE_SRC, CSPDirectiveSrcValue.SELF);

		// add your configuration here

		if (usesDevelopmentConfig()) {

			getResourceSettings().getResourceFinders().add(
					FIRST_LOOK_FOR_HTML_TEMPLATES_HERE,
					new Path("src/main/java"));

		}

	}
}
