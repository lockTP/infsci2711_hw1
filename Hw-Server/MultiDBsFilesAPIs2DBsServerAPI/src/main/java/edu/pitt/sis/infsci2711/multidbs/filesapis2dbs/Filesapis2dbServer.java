package edu.pitt.sis.infsci2711.multidbs.filesapis2dbs;

import edu.pitt.sis.infsci2711.multidbs.utils.JerseyJettyServer;

public class Filesapis2dbServer {

	public static void main(final String[] args) throws Exception {
		JerseyJettyServer server = new JerseyJettyServer(7654, "edu.pitt.sis.infsci2711.multidbs.filesapis2dbs.rest");
		server.start();
	}
}
