/**
 * Copyright (c) 2013 SAP
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the SAP nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SAP BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sopeco.engine.measurementenvironment.connector;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sopeco.engine.measurementenvironment.IMeasurementEnvironmentController;
import org.sopeco.engine.measurementenvironment.rmi.RmiInterlayer;

/**
 * Creates a connector to a remote MEController using RMI.
 * 
 * @author Marius Oehler
 * 
 */
public class RmiMEConnector implements IMEConnector {

	/**
	 * This is a utility class, thus using private constructor.
	 */
	RmiMEConnector() {
	}

	/** default logger */
	private static Logger logger = LoggerFactory.getLogger(RmiMEConnector.class);

	/**
	 * Connects to a remote measurement environment controller (via RMI)
	 * identified by the given URI and returns a local instance.
	 * 
	 * @param meURI
	 *            the URI of the RMI service
	 * @return a local instance of the controller
	 */
	@Override
	public IMeasurementEnvironmentController connectToMEController(URI meURI) {
		return new RmiInterlayer(meURI);
		// try {
		// LocateRegistry.getRegistry(meURI.getHost(), meURI.getPort());
		//
		// logger.debug("Looking up {}", meURI);
		//
		// IMeasurementEnvironmentController meController =
		// (IMeasurementEnvironmentController) Naming.lookup(meURI
		// .toString());
		//
		// logger.info("Received SatelliteController instance from {}", meURI);
		//
		// return meController;
		//
		// } catch (RemoteException e) {
		// logger.error("Cannot access remote controller. Error Message: '{}'",
		// e.getMessage());
		// throw new IllegalStateException("Cannot access remote controller.",
		// e);
		// } catch (MalformedURLException e) {
		// logger.error("Malformed URI. Error Message: '{}'", e.getMessage());
		// throw new IllegalStateException("Malformed URI.", e);
		// } catch (NotBoundException e) {
		// logger.error("Name not found in registry. Error Message: '{}'",
		// e.getMessage());
		// throw new IllegalStateException("Name not found in registry.", e);
		// }

	}

}