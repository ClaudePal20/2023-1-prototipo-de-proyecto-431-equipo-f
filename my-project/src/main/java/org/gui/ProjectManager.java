package org.gui;

import bibliotecadecodigopmi.scrumlibrary.Project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProjectManager extends PMBOKLibraryGUI {

	private net.sf.mpxj.ProjectFile projectFile;
	private Collection<Project> projects = new ArrayList<>();

	public net.sf.mpxj.ProjectFile getProjectFile() {
		return this.projectFile;
	}

	/**
	 * 
	 * @param projects
	 */
	public void exportToXML(List<Project> projects) throws javax.xml.parsers.ParserConfigurationException, javax.xml.transform.TransformerException {
		// TODO - implement ProjectManager.exportToXML
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param filename
	 */
	public List<Project> importFromXML(String filename) throws javax.xml.parsers.ParserConfigurationException, java.io.IOException, org.xml.sax.SAXException {
		// TODO - implement ProjectManager.importFromXML
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param project
	 */
	public void eliminarProjecto(Project project) {
		// TODO - implement ProjectManager.eliminarProjecto
		throw new UnsupportedOperationException();
	}

	public List<Project> getProjects() {
		// TODO - implement ProjectManager.getProjects
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param projects
	 * @param filename
	 */
	public void exportToMPXJ(List<Project> projects, String filename) {
		// TODO - implement ProjectManager.exportToMPXJ
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param filename
	 */
	public void importFromMPXJ(String filename) {
		// TODO - implement ProjectManager.importFromMPXJ
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param projects
	 * @param projectName
	 */
	private Project findProjectByName(List<Project> projects, String projectName) {
		// TODO - implement ProjectManager.findProjectByName
		throw new UnsupportedOperationException();
	}

}