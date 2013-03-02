/**
 * 
 */
package org.jenkinsci.plugins.deploy.weblogic.data;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author Raphael
 *
 */
public class DeploymentTask {

	/**
     * Identifies {@link WeblogicEnvironment} to be used.
     */
	private String weblogicEnvironmentTargetedName;
	
	/**
	 * Le nom de deploiement. Si null on n'utilisera le nom de l'artifact
	 */
	private String deploymentName;
	
	/**
	 * Les targets de deploiement. Par defaut AdminServer
	 */
	private String deploymentTargets = "AdminServer";
	
	/**
	 * L'artifact est une librairie
	 */
	private boolean isLibrary;
	
	/**
	 * Regex permettant de filtrer la ressource à deployer si plusieurs ressources 
	 * correspondantes sont trouvées
	 */
	private String builtResourceRegexToDeploy;
	
	/**
	 * Repertoire parent dans lequel la ressource � deployer peut etre localis�e.
	 * Utilise principalement pour les job non maven dans le cas o� la ressource
	 * � deployer ne se trouve pas dans le workspace
	 */
	private String baseResourcesGeneratedDirectory;
	
	@DataBoundConstructor
	public DeploymentTask(String weblogicEnvironmentTargetedName, String deploymentName, 
  		String deploymentTargets, boolean isLibrary, String builtResourceRegexToDeploy, String baseResourcesGeneratedDirectory) {
      this.weblogicEnvironmentTargetedName = weblogicEnvironmentTargetedName;
      this.deploymentName = deploymentName;
      this.deploymentTargets = deploymentTargets;
      this.isLibrary = isLibrary;
      this.builtResourceRegexToDeploy = builtResourceRegexToDeploy;
      this.baseResourcesGeneratedDirectory = baseResourcesGeneratedDirectory;
  }
	
	/**
	 * 
	 * @return
	 */
	public String getWeblogicEnvironmentTargetedName() {
		return weblogicEnvironmentTargetedName;
	}
	
	/**
	 * 	
	 * @return
	 */
	public String getDeploymentName() {
		return deploymentName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDeploymentTargets() {
		return deploymentTargets;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean getIsLibrary() {
		return isLibrary;
	}

	/**
	 * @return the builtResourceRegexToDeploy
	 */
	public String getBuiltResourceRegexToDeploy() {
		return builtResourceRegexToDeploy;
	}

	/**
	 * @param builtResourceRegexToDeploy the builtResourceRegexToDeploy to set
	 */
	public void setBuiltResourceRegexToDeploy(String builtResourceRegexToDeploy) {
		this.builtResourceRegexToDeploy = builtResourceRegexToDeploy;
	}
	
	/**
	 * @return the baseResourcesGeneratedDirectory
	 */
	public String getBaseResourcesGeneratedDirectory() {
		return baseResourcesGeneratedDirectory;
	}
}
