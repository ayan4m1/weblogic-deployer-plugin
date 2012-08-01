/**
 * 
 */
package org.jenkinsci.plugins.deploy.weblogic;

import hudson.model.BuildListener;
import hudson.model.AbstractBuild;
import hudson.model.Run.Artifact;

import java.io.IOException;

import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

/**
 * @author rchaumie
 *
 */
public interface ArtifactSelector {

	/**
	 * 
	 * @param build
	 * @param listener
	 * @param filteredResource
	 * @return
	 * @throws IOException
	 * @throws XmlPullParserException
	 * @throws InterruptedException
	 */
	public Artifact selectArtifactRecorded(AbstractBuild<?, ?> build, BuildListener listener, String filteredResource) throws IOException, XmlPullParserException, InterruptedException;
	
}
