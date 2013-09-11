/**
 * 
 */
package org.jenkinsci.plugins.deploy.weblogic.configuration;

import java.io.Serializable;

import org.jenkinsci.plugins.deploy.weblogic.data.WeblogicEnvironment;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author rchaumie
 *
 */
@XStreamAlias(value="config")
public class WeblogicDeploymentConfiguration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3951774030581418575L;
	
	@XStreamAlias(value="weblogic-targets")
	private WeblogicEnvironment[] environments;
	
	public WeblogicDeploymentConfiguration(WeblogicEnvironment... environments){
		this.environments = environments;
	}
	
	/**
	 * 
	 * @return
	 */
	public WeblogicEnvironment[] getWeblogicEnvironments() {
		return environments;
	}
}
